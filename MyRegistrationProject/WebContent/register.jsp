<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<center>
		<table>
			<tr>
				<h1>Registration</h1>
			</tr>
		</table>  
		<form action="RegistrationController" method="post">
		<input type="hidden" name="source" value="addCustomer" />
			<table>
				<tr>
					<td><b>Name:</b></td>
					<td><input type="text" name="name"
						placeholder="Enter Your Name"></td>
				</tr>
				<tr>
					<td><b>Age:</b></td>
					<td><input type="text" name="age"
						placeholder="Enter Your Age e.g 23"></td>
				</tr>
				<tr>
					<td><b>Sex:</b></td>
					<td><input type="radio" name="sex" value="Male">Male</td>
					<td><input type="radio" name="sex" value="Female">Female</td>
				</tr>
				<tr>
					<td><b>Phone Number:</b></td>
					<td><select>
							<option value="+91">+91</option>
					</select> <input type="text" name="number"
						placeholder="Enter your 10 digit mobile number"></td>
				</tr>
				<tr>
					<td><b>Address:</b></td>
					<td><textarea name="address" placeholder="Enter your address"></textarea></td>
				</tr>
				<tr>
					<td><b>Departments:</b></td>
					<td><input type="radio" name="dept" value="emergency">Emergency</td>
					<td><input type="radio" name="dept" value="normal">Normal</td>
				</tr>
				<tr>
					<td><b>Patient As:</b></td>
					<td><input type="radio" name="patient" id="stu" value="0"
						onclick="ShowHideDiv()">Student</td>
					<td><input type="radio" name="patient" id="emp" value="1"
						onclick="ShowHideDiv()">Employee</td>
				</tr>
				
				<tr>
					<td><b>Password:</b></td>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<td><b>ReType Password:</b></td>
					<td><input type="password" name="retype"></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="Register"></td>
					<td><a href="login.jsp"><b>Back</b></a></td>

				</tr>
				

			</table>
		</form>
	</center>
</body>
</html>
