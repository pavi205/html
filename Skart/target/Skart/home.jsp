<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>



<title>HOME</title>
</head>
<body>


	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="home.jsp">MobileKart</a>
		</div>

		<ul class="nav navbar-nav">
			<li class="active"><a href="home.jsp">Home</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="mobiles.jsp">MOBILES<span
					class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="brand.jsp">Brands</a></li>
					<li><a href="discount.jsp">Discount</a></li>
				</ul></li>


			<li class="active"><a href="contactus.jsp">Contact Us</a></li>

		</ul>


		<ul class="nav navbar-nav navbar-right">
			<li><a href=signup.jsp><span
					class="glyphicon glyphicon-user"></span>Sign Up</a></li>
			<li><a href=login.jsp><span
					class="glyphicon glyphicon-log-in"></span>Login</a></li>
		</ul>
	</div>
	
	</nav>
	
	<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="pictures/m1.jpg" data-slide-to="0" class="active"></li>
      <li data-target="pictures/m2.jpg" data-slide-to="1"></li>
      <li data-target="pictures/m3.jpg" data-slide-to="2"></li>
      <li data-target="pictures/m4.jpg" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="pictures/m1.jpg" alt="Nokia" width="245" height="345">
        <div class="carousel-caption">
          <h3>Nokia</h3>
          
        </div>
      </div>

      <div class="item">
        <img src="pictures/m2.jpg" alt="iphone" width="245" height="345">
        <div class="carousel-caption">
          <h3>iphone</h3>
          
        </div>
      </div>
    
      <div class="item">
        <img src="pictures/m3.jpg" alt="Samsung" width="245" height="345">
        <div class="carousel-caption">
          <h3>Samsung</h3>
          
        </div>
      </div>

      <div class="item">
        <img src="pictures/m4.jpg" alt="micromax" width="245" height="345">
        <div class="carousel-caption">
          <h3>Micromax</h3>
          
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
	
	
	
	
	
	</body>
	</html>
	