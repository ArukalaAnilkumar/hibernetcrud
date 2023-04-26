<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.jsp.sevlet.dto.Admin"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
*{
box-sizing: border-box;
}
table {
	border-collapse: collapse
}

th {
	backgroundcolor: yellow
}

body{
background: rgb(0,128,0,0.3);
}

#title-div {
	width: 100%;
	min-height: 50px;
	text-align: center;
	line-height: 50px;
	background-color: gray;
}
#table{
margin-top: 150px;
}

</style>


</head>
<body>




	<div id="title-div">
		<h3>Display Admin Data</h3>
	</div>

	<div id="table">
	<center>
				<%
				List<Admin> list = (List<Admin>) request.getAttribute("list");
				%>

				<table border="2px">
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Phone</th>
						<th>Email</th>
						<th>Password</th>
					</tr>

					<%
					for (Admin admin : list) {
					%>
					<tr>
						<td><%=admin.getId()%></td>
						<td><%=admin.getName()%></td>
						<td><%=admin.getPhone()%></td>
						<td><%=admin.getEmail()%></td>
						<td><%=admin.getPassword()%></td>
					</tr>
					<%
					}
					%>

		
	</center>
	</div>
	<%-- <center>

<% List<Admin> list =(List<Admin>)request.getAttribute("list");%>

<table border="2px">
<tr>
<th>Id</th>
<th>Name</th>
<th>Phone</th>
<th>Email</th>
<th>Password</th>
</tr>

<%
for(Admin admin :list){
%>
<tr>
<td><%=admin.getId() %></td>
<td><%=admin.getName() %></td>
<td><%=admin.getPhone() %></td>
<td><%=admin.getEmail() %></td>
<td><%=admin.getPassword()%></td>
</tr>
<%}
%>

</center>  --%>
</body>
</html>