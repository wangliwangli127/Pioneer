<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <title>Visual Admin Dashboard - Maps</title>
    <meta name="description" content="">
    <meta name="author" content="templatemo">
    
    <link href='http://fonts.useso.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
    <link href="../css/font-awesome.min.css" rel="stylesheet">
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../jqvmap/jqvmap.css" media="screen" rel="stylesheet" type="text/css" /> 
    <link href="../css/templatemo-style.css" rel="stylesheet">
    
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

  </head>
  <body>  
    <!-- Left column -->
    <div class="templatemo-flex-row">
      <!--Left column-->
        <#include "adminleft.ftl">
        <script type="text/javascript">
          document.getElementById("id4").className="active"; 
        </script>
      <!--end -->

      <!-- Main content --> 
      <div class="templatemo-content col-1 light-gray-bg">
        <div class="templatemo-top-nav-container">
          <div class="row">
            <nav class="templatemo-top-nav col-lg-12 col-md-12">
              <ul class="text-uppercase">
                <li><a href="" class="active">Admin panel</a></li>
                <li><a href="">Dashboard</a></li>
                <li><a href="">Overview</a></li>
                <li><a href="login.html">Sign in form</a></li>
              </ul>  
            </nav> 
          </div>
        </div>
        <div class="templatemo-content-container">
          <div class="templatemo-content-widget white-bg">
            <h2 class="margin-bottom-10">Geo Charts</h2>
            <p class="margin-bottom-0">Credit goes to <a href="http://jqvmap.com" target="_parent">JQVMap</a>.</p>              
          </div>
          <div class="templatemo-flex-row flex-content-row">
            <div class="col-1">              
              <div class="panel panel-default margin-10">
                <div class="panel-heading"><h2>World</h2></div>
                <div class="panel-body">
                  <div id="vmap_world" class="vmap"></div>
                </div>                
              </div>
            </div> 
            <div class="col-1">              
              <div class="panel panel-default margin-10">
                <div class="panel-heading"><h2>Africa</h2></div>
                <div class="panel-body">
                  <div id="vmap_africa" class="vmap"></div>
                </div>                
              </div>
            </div>                                 
          </div>   
          <div class="templatemo-flex-row flex-content-row">
            <div class="col-1">              
              <div class="panel panel-default margin-10">
                <div class="panel-heading"><h2>Asia</h2></div>
                <div class="panel-body">
                  <div id="vmap_asia" class="vmap"></div>
                </div>                
              </div>
            </div> 
            <div class="col-1">              
              <div class="panel panel-default margin-10">
                <div class="panel-heading"><h2>Australia</h2></div>
                <div class="panel-body">
                  <div id="vmap_australia" class="vmap"></div>
                </div>                
              </div>
            </div>                                 
          </div>    
          <div class="templatemo-flex-row flex-content-row">
            <div class="col-1">              
              <div class="panel panel-default margin-10">
                <div class="panel-heading"><h2>Europe</h2></div>
                <div class="panel-body">
                  <div id="vmap_europe" class="vmap"></div>
                </div>                
              </div>
            </div> 
            <div class="col-1">              
              <div class="panel panel-default margin-10">
                <div class="panel-heading"><h2>United States of America</h2></div>
                <div class="panel-body">
                  <div id="vmap_usa" class="vmap"></div>
                </div>                
              </div>
            </div>                                 
          </div>    
          <div class="templatemo-flex-row flex-content-row">
            <div class="col-1">              
              <div class="panel panel-default margin-10">
                <div class="panel-heading"><h2>North America</h2></div>
                <div class="panel-body">
                  <div id="vmap_northamerica" class="vmap"></div>
                </div>                
              </div>
            </div> 
            <div class="col-1">              
              <div class="panel panel-default margin-10">
                <div class="panel-heading"><h2>South America</h2></div>
                <div class="panel-body">
                  <div id="vmap_southamerica" class="vmap"></div>
                </div>                
              </div>
            </div>                                 
          </div>    
          <!--footer-->
            <#include "footer.ftl">            
          <!--end-->         
        </div>
      </div>
    </div>
    
    <!-- JS -->
    <script type="text/javascript" src="../js/jquery-1.11.2.min.js"></script>      <!-- jQuery -->
    <script type="text/javascript" src="../js/jquery-migrate-1.2.1.min.js"></script> <!--  jQuery Migrate Plugin -->
    <script type="text/javascript" src="../js/templatemo-script.js"></script>      <!-- Templatemo Script -->
    <script type="text/javascript" src="../jqvmap/jquery.vmap.js"></script>
    <script type="text/javascript" src="../jqvmap/maps/jquery.vmap.world.js"></script>
    <script type="text/javascript" src="../jqvmap/data/jquery.vmap.sampledata.js"></script>
    <script src="../jqvmap/maps/continents/jquery.vmap.africa.js" type="text/javascript"></script>
    <script src="../jqvmap/maps/continents/jquery.vmap.asia.js" type="text/javascript"></script>
    <script src="../jqvmap/maps/continents/jquery.vmap.australia.js" type="text/javascript"></script>
    <script src="../jqvmap/maps/continents/jquery.vmap.europe.js" type="text/javascript"></script>
    <script src="../jqvmap/maps/continents/jquery.vmap.north-america.js" type="text/javascript"></script>
    <script src="../jqvmap/maps/continents/jquery.vmap.south-america.js" type="text/javascript"></script>
    <script src="../jqvmap/maps/jquery.vmap.usa.js" type="text/javascript"></script>
    <script type="text/javascript">
      
      function drawMaps(){
        $('#vmap_world').vectorMap({
          map: 'world_en',
          backgroundColor: '#ffffff',
          color: '#333',
          hoverOpacity: 0.7,
          selectedColor: '#666666',
          enableZoom: true,
          showTooltip: true,
          values: sample_data,
          scaleColors: ['#C8EEFF', '#006491'],
          normalizeFunction: 'polynomial'
        });
        $('#vmap_africa').vectorMap({
          map: 'africa_en',
          backgroundColor: '#ffffff',
          color: '#333333',
          hoverOpacity: 0.7,
          selectedColor: '#666666',
          enableZoom: true,
          showTooltip: true,
          values: sample_data,
          scaleColors: ['#C8EEFF', '#006491'],
          normalizeFunction: 'polynomial'
        }); 
        $('#vmap_asia').vectorMap({
          map: 'asia_en',
          backgroundColor: '#ffffff',
          color: '#333333',
          hoverOpacity: 0.7,
          selectedColor: '#666666',
          enableZoom: true,
          showTooltip: true,
          values: sample_data,
          scaleColors: ['#C8EEFF', '#006491'],
          normalizeFunction: 'polynomial'
        });
        $('#vmap_australia').vectorMap({
          map: 'australia_en',
          backgroundColor: '#ffffff',
          color: '#333333',
          hoverOpacity: 0.7,
          selectedColor: '#666666',
          enableZoom: true,
          showTooltip: true,
          values: sample_data,
          scaleColors: ['#C8EEFF', '#006491'],
          normalizeFunction: 'polynomial'
        });
        $('#vmap_europe').vectorMap({
          map: 'europe_en',
          backgroundColor: '#ffffff',
          color: '#333333',
          hoverOpacity: 0.7,
          selectedColor: '#666666',
          enableZoom: true,
          showTooltip: true,
          values: sample_data,
          scaleColors: ['#C8EEFF', '#006491'],
          normalizeFunction: 'polynomial'
        });
        $('#vmap_northamerica').vectorMap({
          map: 'north-america_en',
          backgroundColor: '#ffffff',
          color: '#333333',
          hoverOpacity: 0.7,
          selectedColor: '#666666',
          enableZoom: true,
          showTooltip: true,
          values: sample_data,
          scaleColors: ['#C8EEFF', '#006491'],
          normalizeFunction: 'polynomial'
        });
        $('#vmap_southamerica').vectorMap({
          map: 'south-america_en',
          backgroundColor: '#ffffff',
          color: '#333333',
          hoverOpacity: 0.7,
          selectedColor: '#666666',
          enableZoom: true,
          showTooltip: true,
          values: sample_data,
          scaleColors: ['#C8EEFF', '#006491'],
          normalizeFunction: 'polynomial'
        });
        $('#vmap_usa').vectorMap({
          map: 'usa_en',
          enableZoom: true,
          showTooltip: true,
          selectedRegion: 'MO'
        });  
      } // end function drawMaps

      $(document).ready(function() {

        if($.browser.mozilla) {
          //refresh page on browser resize
          // http://www.sitepoint.com/jquery-refresh-page-browser-resize/
          $(window).bind('resize', function(e)
          {
            if (window.RT) clearTimeout(window.RT);
            window.RT = setTimeout(function()
            {
              this.location.reload(false); /* false to get page from cache */
            }, 200);
          });      
        } else {
          $(window).resize(function(){
            drawMaps();
          });  
        }
        
        drawMaps();

      });
    </script>
  </body>
</html>