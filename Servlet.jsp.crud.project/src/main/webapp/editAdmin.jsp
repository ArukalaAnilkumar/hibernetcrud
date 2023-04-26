<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
#title-div {
	width: 100%;
	min-height: 50px;
	text-align: center;
	line-height: 50px;
	background-color: gray;
}

#main-div {
	width: 100%;
	min-height: 50px;
}

#left-div {
	width: 20%;
	min-height: 500px;
	float: left;
	background-color: orange;
	text-align: center;
}

#middle-div {
	width: 60%;
	min-height: 500px;
	text-size: 20px;
	padding-top: 100px;
	background-color: pink;
	text-align: center;
	float: left;
}

#right-div {
	width: 20%;
	min-height: 500px;
	float: right;
	background-color: orange;
	text-align: center;
}
</style>
</head>
<body>


	<form action="getadminbyid" method="post">

		<div id="title-div">
			<h3>Edit Admin Data</h3>
		</div>

		<div id="main-div">

			<div id="left-div">
				<h1>Left</h1>
			</div>



			<div id="middle-div">
				Id :<input type="text" name="getid"><br>
				<br> <input type="submit" value="edit">

			</div>


			<div id="right-div"><h1>Right</h1></div>
		</div>
	</form>

</body>
</html>