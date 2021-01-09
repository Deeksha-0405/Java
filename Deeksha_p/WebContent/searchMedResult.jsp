<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
* {
	margin: 0;
	padding: 0;
}
body {
	font-family: 'Poppins', sans-serif;
	background: linear-gradient(rgba(0, 0, 0, 0.8), rgba(0, 0, 0, 0.8)), url(https://imgscf.slidemembers.com/docs/1/1/244/pharmacy_pharmacist_multipurpose_presentation_keynote_template_243482.jpg);

}
.btn{
  width: 100%;
  background: none;
  border: 2px solid #4caf50;
  color: white;
  padding: 5px;
  font-size: 18px;
  cursor: pointer;
  margin: 12px 0;
}

.about{
color: white;
font-family: "Lucida Console", "Courier New", monospace;
font-size: 20px;

}
.about h3{
font-family: "Bold";
font-size: 25px;
}

header {
	height: 100vh;
	-webkit-background-size: cover;
	background-size: cover;
	background-position: center center;
	position: relative;
}
.nav-area {
	float: right;
	list-style: none;
	margin-top: 30px;
}
.nav-area li {
	display: inline-block;
}
.nav-area li a {
	color: #fff;
	text-decoration: none;
	padding: 5px 20px;
	font-family: poppins;
	font-size: 16px;
	text-transform: uppercase;
}
.nav-area li a:hover {
	background: #fff;
	color: #333;
}

.welcome-text {
	position: absolute;
	width: 600px;
	height: 300px;
	margin: 20% 30%;
	text-align: center;
}
.welcome-text h1 {
	text-align: center;
	color: #fff;
	text-transform: uppercase;
	font-size: 60px;
}
.welcome-text h1 span {
	color: #00fecb;
}
.welcome-text a {
	border: 1px solid #fff;
	padding: 10px 25px;
	text-decoration: none;
	text-transform: uppercase;
	font-size: 14px;
	margin-top: 20px;
	display: inline-block;
	color: #fff;
}
.welcome-text a:hover {
	background: #fff;
	color: #333;
}
/*resposive*/

@media (max-width:600px) {
	.wrapper {
		width: 100%;
	}
	.logo {
		float: none;
		width: 50%;
		text-align: center;
		margin: auto;
	}
	img {
		width: ;
	}
	.nav-area {
		float: none;
		margin-top: 0;
	}
	.nav-area li a {
		padding: 5px;
		font-size: 11px;
	}
	.nav-area {
		text-align: center;
	}
	.welcome-text {
		width: 100%;
		height: auto;
		margin: 30% 0;
	}
	.welcome-text h1 {
		font-size: 30px;
	}
}
</style>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String s = (String)request.getAttribute("medicine");
String medicine[] = s.split(",");
%>
<body>
<%--
<table>
<tr>
<td>Employee Id:</td>
<td><input type="text" name="user_id" value="<%=medicine[0] %>" /></td>
</tr>

<tr>
<td>product Id:</td>
<td><input type="text" name="user_id" value="<%=medicine.getProduct_id() %>" /></td>
</tr>


<tr>
<td>Product Name:</td>
<td><input type="text" name="product_name" value="<%=medicine.getProduct_name() %>" /></td>
</tr>


<tr>
<td>price :</td>
<td><input type="text" name="price" value="<%=medicine.getPrice() %>"/></td>
</tr>

<tr>
<td>Quantity :</td>
<td><input type="text" name="quantity" value="<%=medicine.getQuantity() %>"/></td>
</tr>

</table>
--%>

<header>
<ul class="nav-area">
<li><a href="Home.jsp">Home</a></li>
<li><a href="login.jsp">Sign In</a></li>
<li><a href="About.jsp">About</a></li>
<li><a href="Contact.jsp">Contact</a></li>
</ul>
<br><br><br><br><br><br>

<table border="2">
<tr>
		<th>Product Id</th>
		<th>Product name</th>
		<th>Price</th>
		</tr>
<tr><%if(medicine!= null){ %>
	<td><%= medicine[0]%></td>
	<td><%= medicine[1]%></td>
	<td><%= medicine[2]%></td>
	<%} %>
	</tr>

</table>
</header>
</body>
</html>