<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
* {
	box-sizing: border-box;
}

#title-div {
	width: 100%;
	min-height: 50px;
	background-color: orange;
}

#title-div h3 {
	width: 100%;
	line-height: 50px;
	text-align: center;
}

#main-div {
	width: 100%;
	min-height: 500px;
	
}

#left-div {
	width: 20%;
	min-height: 700px;
	float: left;
	text-align: center;
	 background-color: gray; 
	border-right-style:solid;
	border-width: 4px;
}

#middle-div {
	width: 60%;
	min-height: 500px;
	float: left;
	text-align: center;
/* 	margin-top: 10px; */
}

#right-div {
	width: 20%;
	min-height: 700px;
	background-color: gray; 
	float: left;
	text-align: center;
	border-left-style:solid;
	border-width: 4px;
}

#left-div-tech {
	width: 100%;
	min-height: 20px; 
	background-color : green; 
	position : relative;
	display:inline-block;
	position: relative;
/* 	background-color: green; */
	border: 2px solid green;
	border-radius: 20px;
}

#left-div-list ul li {
	display: none;
}

#left-div-tech:hover  #left-div-list ul li {
	text-decoration: none;
	list-style: none;
	padding: 10px;
	display: block;
}

#middle-div-list {
	width: 100%;
	min-height: 50px;
	
}

#middle-div-list ul {
	display: flex;
	list-style: none;
	
}

#middle-div-list ul li {
	padding-left: 100px;
	margin-top: 30px;
}

#middle-div-list ul li a {
	text-decoration: none;
	text-align: center;
/* 	background-color: fuchsia; */
	padding: 20px 20px;
	border: 2px solid green;
	border-radius: 10px;
}
#middle-div-list ul li :hover {
background-color: orange;
color: black;
}

#right-div-tech {
	width: 100%;
	min-height: 20px; 
	background-color : green; 
	position : relative;
	display: inline-block;
	position: relative;
	background-color: green;
	border: 2px solid green;
	border-radius: 20px;
}

#right-div-list ul li {
	display: none;
}

#right-div-tech:hover  #right-div-list ul li {
	text-decoration: none;
	list-style: none;
	padding: 10px;
	display: block;
} 


</style>
</head>
<body>
	<div id="title-div">
		<h3>Hibernet crud operation</h3>
	</div>
	<div id="main-div">

		<div id="left-div">

			<div id="left-div-tech">

				<h1>TECHNICAl skills</h1>


				<div id="left-div-list">
					<ul>
						<li><a>Hibernet</a></li>
						<li><a>Servlet</a></li>
						<li><a>Jsp </a></li>
						<li><a>Html</a></li>
						<li><a>Css</a></li>
					</ul>
				</div>

			</div>
		</div>

		<div id="middle-div">
			<h1>OPERATION</h1>

			<div id="middle-div-list">
				<ul>
					<li><a href="editAdmin.jsp"> Edit</a></li>
					<li><a href="displayservlet"> Display</a></li>
					<li><a href="savedata.jsp">Saved Data </a></li>
					<li><a href="deleteid.jsp"> Delete</a></li>
				</ul>
			</div>

		</div>

		<div id="right-div">
			
			<div id="right-div-tech">
			
			<h1>DESIGN by</h1>

			<div id="right-div-list">
				<ul>
					<li><a>A Anil kumar</a></li>
					<li><a>B-tech Ece</a></li>
					<li><a>Diploma Ece</a></li>
					<li><a>Phone : 7095075648</a></li>
				</ul>
			</div>
			
			</div>
		</div>

	</div>
	
	<!-- 
	<footer class="footer">
	     
	     <div class="container">
	     
	     <div class="row">
	     
	         <div class="footer-col">
	            <h4>company</h4>
	            
	            <ul>
	            <li><a href="#">about us</a></li>
	              <li><a href="#">our services</a></li>
	                <li><a href="#">privacy policy</a></li>
	                  <li><a href="#">affiliate program</a></li>
	            </ul>
	         </div>
	         
	         <div class="footer-col">
	            <h4> get help</h4>
	            
	            <ul>
	            <li><a href="#">FAQ</a></li>
	              <li><a href="#">shipping</a></li>
	                <li><a href="#">returns</a></li>
	                  <li><a href="#">order status</a></li>
	                    <li><a href="#">payment options</a></li>
	            </ul>
	         </div>
	         <div class="footer-col">
	            <h4>online shop</h4>
	            
	            <ul>
	            <li><a href="#">watch</a></li>
	              <li><a href="#">bag</a></li>
	                <li><a href="#">shoes</a></li>
	                  <li><a href="#">dress</a></li>
	            </ul>
	         </div>
	         
	         <div class="footer-col">
	            <h4>follow us</h4>
	            
	            <ul>
	            <li><a href="#"></a></li>
	            </ul>
	         </div>
	         
	         
	     </div>
	     </div>
	
	</footer> -->
	
</body>
</html>

