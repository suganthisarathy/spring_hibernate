<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Example</title>
 

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<style>
#margin1 {
       margin: 15px;
       left: 260px;
}

#margin2 {
       margin: 15px;
       left: 160px;
}

#margin3 {
       margin: 15px;
       left: 10px;
}

#margin4 {
       margin: 15px;
       left: -100px;
}

#margin5 {
       margin: 15px;
       left: -100px;
}


.footer
{
  position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color:#D7DBDD;
       height: 200px;
       color: black;
       text-align: center;
}

.fa {
       padding: 5px;
       font-size: 20px;
       width: 30px;
       text-align: center;
       text-decoration: none;
       margin: 5px 2px;
       border-radius: 50%;
}

.fa:hover {
       opacity: 0.7;
}

.fa-facebook {
       background: #3B5998;
       color: white;
}

.fa-twitter {
       background: #55ACEE;
       color: white;
}

.fa-google {
       background: #dd4b39;
       color: white;
}

</style>
</head>
<body>
<jsp:include page="header.jsp"/>
<!--  <br><h2 style="text-align:center">Your cart is empty</h2><br>
<div class="container-fluid">
<div class="row">
<div class="col-sm-1"></div>
<div class="col-sm-9">
  <img src="images/vadinew.jpg" ></div>
  <div class="col-sm-2"></div></div></div>-->
  <br/>
  <div class="container text-center">
    
		<div class="row">
			<div class="col-sm-4">
				<div class="thumbnail" style="width: 85%; height: 650px">
					<img src="images/car1.jpg"  alt="Image" style="float:left" width="350" >
					<p>Current Project</p>
					<form action="/olx_resale/buynow"><button type="submit" class="btn btn-primary">Buy Now</button></form>
				</div>
			</div>
			
		</div>
	</div>
<div class="footer"    >

 <div class="jumbotron" style="background-color: #D7DBDD ; color: black">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 VL">
					<p>
						POPULAR SEARCHES<small><br> Mobile<br> Cars<br>
							Bikes</small>
					</p>

				</div>
				<div class="col-lg-3 VL">
					<p>
						TRENDING<small><br> Mobile<br> Cars<br>
							Bikes</small>
					</p>
				</div>
				<div class="col-lg-3 VL">
					<p>
						ABOUT US<small><br> About OLX Group<br> Careers<br>Contact
							Us</small>
					</p>
				</div>
				<div class="col-lg-3 VL">
					<p>
						OLX<small><br> Legal and Privacy information<br>Site
							Map<br>Help</small>
					</p>
				</div>

			</div>
		</div>

	</div>
</div>
</body>
</html>