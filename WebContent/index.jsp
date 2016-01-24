<%@page pageEncoding="utf-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript" src="resources/js/jquery.js"></script>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>pioneer</title>
    <link id="bs-css" href="resources/css/bootstrap-cerulean.min.css" rel="stylesheet">
	<link href="resources/css/charisma-app.css" rel="stylesheet">
    <link href='resources/bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>
    <link href='resources/bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>
    <link href='resources/bower_components/chosen/chosen.min.css' rel='stylesheet'>
    <link href='resources/bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>
    <link href='resources/bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>
    <link href='resources/bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>
    <link href='resources/css/jquery.noty.css' rel='stylesheet'>
    <link href='resources/css/noty_theme_default.css' rel='stylesheet'>
    <link href='resources/css/elfinder.min.css' rel='stylesheet'>
    <link href='resources/css/elfinder.theme.css' rel='stylesheet'>
    <link href='resources/css/jquery.iphone.toggle.css' rel='stylesheet'>
    <link href='resources/css/uploadify.css' rel='stylesheet'>
    <link href='resources/css/animate.min.css' rel='stylesheet'>

    <!-- jQuery -->
    <script src="resources/bower_components/jquery/jquery.min.js"></script>

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <link rel="shortcut icon" href="resources/img/favicon.ico">
</head>

<body>
<div class="ch-container">
    <div class="row">
        
    <div class="row">
        <div class="col-md-12 center login-header">
            <h2>pioneer</h2>
        </div>
        <!--/span-->
    </div><!--/row-->

    <div class="row">
        <div class="well col-md-5 center login-box">
            <div class="alert alert-info">
               	<font color="#FF4500" bold>${user.message }</font>
               	 请输入用户和密码以登录。
            </div>
            <form class="form-horizontal" action="login.action" method="post">
                <fieldset>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user red"></i></span>
                        <input type="text" class="form-control" 
                        	name="username" value="1">
                    </div>
                    <div class="clearfix"></div><br>

                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock red"></i></span>
                        <input type="text" class="form-control"
                        	name="password" value="1">
                    </div>
                    <div class="clearfix"></div>

                    <div class="input-prepend">
                        <a href="">找回密码？</a>
                        <a href="">尝试玩一下？</a>
                    </div>
                    <div class="clearfix"></div>

                    <p class="center col-md-5">
                        <button type="submit" class="btn btn-primary">登录</button>
                    </p>
                </fieldset>
            </form>
        </div>
    </div>
</div>
</div>

<script src="resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="resources/js/jquery.cookie.js"></script>
<script src='resources/bower_components/moment/min/moment.min.js'></script>
<script src='resources/bower_components/fullcalendar/dist/fullcalendar.min.js'></script>
<script src="resources/js/jquery.dataTables.min.js"></script>
<script src="resources/bower_components/chosen/chosen.jquery.min.js"></script>
<script src="resources/bower_components/colorbox/jquery.colorbox-min.js"></script>
<script src="resources/js/jquery.noty.js"></script>
<script src="resources/bower_components/responsive-tables/responsive-tables.js"></script>
<script src="resources/bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
<script src="resources/js/jquery.raty.min.js"></script>
<script src="resources/js/jquery.iphone.toggle.js"></script>
<script src="resources/js/jquery.autogrow-textarea.js"></script>
<script src="resources/js/jquery.uploadify-3.1.min.js"></script>
<script src="resources/js/jquery.history.js"></script>
<script src="resources/js/charisma.js"></script>
</body>
</html>
