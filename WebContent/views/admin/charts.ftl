<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <title>后台管理</title>
    <meta name="description" content="">
    <meta name="author" content="templatemo">
    
    <link href='http://fonts.useso.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
    <link href="../css/font-awesome.min.css" rel="stylesheet">
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/templatemo-style.css" rel="stylesheet">
    
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you viSSew the page via file:// -->
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
        	document.getElementById("id2").className="active"; 
      </script>
      <!--end left-->
      <!-- Main content --> 
      <div class="templatemo-content col-1 light-gray-bg">
        <!--header-->
          <#include "head.ftl">
        <!--end header-->
        <div class="templatemo-content-container">         
          <div class="templatemo-content-widget white-bg">
            <h2 class="margin-bottom-10">Data Visualization</h2>
            <p>Credit goes to <a href="https://google-developers.appspot.com/chart/" target="_parent">Google Charts</a></p>
            <div class="panel panel-default no-border">
              <div class="panel-heading border-radius-10">
                <h2>Gauge</h2>
              </div>
              <div class="panel-body">
                <div class="templatemo-flex-row flex-content-row margin-bottom-30">
                  <div class="col-1">
                    <div id="gauge_div" class="templatemo-chart"></div>
                    <h3 class="text-center margin-bottom-5">Computer Resources</h3>
                    <p class="text-center">Curabitur</p>              
                  </div>              
                </div>     
              </div>
            </div>            
            <div class="panel panel-default no-border">
              <div class="panel-heading border-radius-10">
                <h2>Timeline</h2>
              </div>
              <div class="panel-body">
                <div class="templatemo-flex-row flex-content-row">
                  <div class="col-1">
                    <div id="timeline_div" class="templatemo-chart"></div>
                    <h3 class="text-center margin-bottom-5">Conference Schedule</h3>
                    <p class="text-center">Lorem Ipsum</p>                
                  </div>              
                </div>
              </div> 
            </div>
            <div class="panel panel-default no-border">
              <div class="panel-heading border-radius-10">
                <h2>Area Chart</h2>
              </div>
              <div class="panel-body">
                <div class="templatemo-flex-row flex-content-row">
                  <div class="col-1">
                    <div id="area_chart_div" class="templatemo-chart"></div>
                    <h3 class="text-center margin-bottom-5">Company Performance</h3>
                    <p class="text-center">Fusce mi lacus</p>                
                  </div>              
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
    <script type="text/javascript" src="../js/templatemo-script.js"></script>      <!-- Templatemo Script -->
  </body>
</html>