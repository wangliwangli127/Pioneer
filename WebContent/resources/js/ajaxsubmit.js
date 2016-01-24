/*
 * author: zhangzunwei
 *@date:20090429
 *@description:使用方法
 *jQuery.ajaxFormSubmit({
 * formId:'', //传入form的Id
 * url:'',传入你的url
 * uploadFiles:false,//是否上传文件.若<form>中没有<input type="file">请将此值设置为false.
 * dataType:'json',//数据类型.xml,script,json,html
 * secureuri:false,//为了以后扩展,暂时没有用
 * success:function (data, status){//成功回调函数.data:返回的数据相当于responseXML或responseText;
 *    
 * },
 * error:function (data, status, e){//失败时回调函数,返回错误信息时,e.name:错误信息名称,e.message:错误详细信息.
 *
 * }
 *});
 */
jQuery
		.extend({
			ajaxFormSubmit : function(s) {
				jQuery("input[type=button]").attr("disabled", 'disabled');// disabled
																			// button
				var id = new Date().getTime();
				var frameId = 'jUploadFrame' + id;
				if (window.ActiveXObject) {
					var io_iframe = document.createElement('<iframe id="'
							+ frameId + '" name="' + frameId + '" />');
					if (typeof uri == 'boolean') {
						io_iframe.src = 'javascript:false';
					} else if (typeof uri == 'string') {
						io_iframe.src = uri;
					}
					io_iframe.style.position = 'absolute';
					io_iframe.style.top = '-1000px';
					io_iframe.style.left = '-1000px';
					document.body.appendChild(io_iframe);
				} else {
					var io_iframe = document.createElement('iframe');
					io_iframe.id = frameId;
					io_iframe.name = frameId;
					io_iframe.style.position = 'absolute';
					io_iframe.style.top = '-1000px';
					io_iframe.style.left = '-1000px';
					document.body.appendChild(io_iframe);
				}

				s = jQuery.extend({}, jQuery.ajaxSettings, s);
				// Watch for a new set of requests
				if (s.global && !jQuery.active++) {
					jQuery.event.trigger("ajaxStart");
				}
				var requestDone = false;
				// Create the request object
				var xml = {}
				if (s.global)
					jQuery.event.trigger("ajaxSend", [ xml, s ]);
				// Wait for a response to come back
				var uploadCallback = function(isTimeout) {
					var io = document.getElementById(frameId);
					try {
						if (io.contentWindow) {
							xml.responseText = io.contentWindow.document.body ? io.contentWindow.document.body.innerHTML
									: null;
							xml.responseXML = io.contentWindow.document.XMLDocument ? io.contentWindow.document.XMLDocument
									: io.contentWindow.document;

						} else if (io.contentDocument) {
							xml.responseText = io.contentDocument.document.body ? io.contentDocument.document.body.innerHTML
									: null;
							xml.responseXML = io.contentDocument.document.XMLDocument ? io.contentDocument.document.XMLDocument
									: io.contentDocument.document;
						}
					} catch (e) {
						jQuery("input[type=button]").attr("disabled", '');// enabled
																			// button
						// jQuery.handleError(s, xml, null, e);
					}
					if (xml || isTimeout == "timeout") {
						requestDone = true;
						var status;
						try {
							status = isTimeout != "timeout" ? "success"
									: "error";
							// Make sure that the request was successful or
							// notmodified
							if (status != "error") {
								// process the data (runs the xml through
								// httpData regardless of callback)
								var data = jQuery.uploadHttpData(xml,
										s.dataType);
								// If a local callback was specified, fire it
								// and pass it the data
								if (s.success) {
									jQuery("input[type=button]").attr(
											"disabled", '');// enabled button
									s.success(data, status);
								}
								// Fire the global callback
								if (s.global)
									jQuery.event.trigger("ajaxSuccess", [ xml,
											s ]);
							} else {
								// jQuery.handleError(s, xml, status);
								jQuery("input[type=button]").attr("disabled",
										'');// enabled button
							}

						} catch (e) {
							status = "error";
							jQuery("input[type=button]").attr("disabled", '');// enabled
																				// button
							// jQuery.handleError(s, xml, status, e);
						}

						// The request was completed
						if (s.global)
							jQuery.event.trigger("ajaxComplete", [ xml, s ]);

						// Handle the global AJAX counter
						if (s.global && !--jQuery.active)
							jQuery.event.trigger("ajaxStop");

						// Process result
						if (s.complete) {
							jQuery("input[type=button]").attr("disabled", '');// enabled
																				// button
							s.complete(xml, status);
						}

						jQuery(io).unbind()

						setTimeout(function() {
							try {
								jQuery(io).remove();
							} catch (e) {
								jQuery("input[type=button]").attr("disabled",
										'');// enabled button
								// jQuery.handleError(s, xml, null, e);
							}
						}, 100)
						xml = null
					}
				}

				// Timeout checker
				if (s.timeout > 0) {
					setTimeout(function() {
						// Check to see if the request is still happening
						if (!requestDone)
							uploadCallback("timeout");
					}, s.timeout);
				}
				try {
					// var io = jQuery('#' + frameId);
					var form = jQuery('#' + s.formId);
					jQuery(form).attr('action', s.url);
					jQuery(form).attr('method', 'POST');
					jQuery(form).attr('target', frameId);
					if (s.uploadFiles) {
						jQuery(form).attr('enctype', 'multipart/form-data');
						jQuery(form).attr('encoding', 'multipart/form-data');
					} else {
						jQuery(form).attr('enctype',
								'application/x-www-form-urlencoded');
						jQuery(form).attr('encoding',
								'application/x-www-form-urlencoded');
					}
					jQuery(form)[0].submit();

				} catch (e) {
					jQuery("input[type=button]").attr("disabled", '');// enabled
																		// button
					// jQuery.handleError(s, xml, null, e);
				}
				if (window.attachEvent) {
					document.getElementById(frameId).attachEvent('onload',
							uploadCallback);
					// jQuery(frameId).get(0).attachEvent('onload',
					// uploadCallback);
				} else {
					document.getElementById(frameId).addEventListener('load',
							uploadCallback, false);
					// jQuery(frameId).get(0).addEventListener('load',
					// uploadCallback, false);
				}
				return {
					abort : function() {
					}
				};
			},
			uploadHttpData : function(r, type) {
				var data = !type;
				data = type == "xml" || data ? r.responseXML : r.responseText;
				// If the type is "script", eval it in global context
				if (type == "script")
					jQuery.globalEval(data);
				// Get the JavaScript object, if JSON is used.
				if (type == "json")
					eval("data = " + data);
				// evaluate scripts within html
				if (type == "html")
					jQuery("<div>").html(data).evalScripts();
				// alert(jQuery('param',
				// data).each(function(){alert(jQuery(this).attr('value'));}));
				return data;
			}
		});