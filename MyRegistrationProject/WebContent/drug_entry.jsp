<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Drug Details</title>
</head>
<body>
<center>
	<table>
			<tr>
				<h1>Drug Entry</h1>
			</tr>
		</table>
		<form action="DrugStoreController" method="post">
			<table>
				<tr>
					<td><b>Drug Name:</b></td>
					<td><input type="text" name="dname" placeholder="Enter Drug Name"></td>
				</tr>
				<tr>
					<td><b>In Stock:</b></td>
					<td><input type="text" name="stock" placeholder="Number of drugs in stock"></td>
				</tr>
				
				<tr>
					<td><b>Expiry Date1:</b></td>
					<td><input type="date" name="edate1" placeholder="eg. mm/YYYY"></td>
				</tr>
				<tr>
					<td><b>Expiry Date2:</b></td>
					<td><input type="date" name="edate2" placeholder="eg. mm/YYYY"></td>
				</tr>
				
				
				<tr>
					<td><input type="submit" name="submit" value="Submit"></td>
					<!--<td><a href="login.jsp"><b>Back</b></a></td> --->
					
				</tr>
				
				
			</table>
		</form>
	</center>
</body>
</html>