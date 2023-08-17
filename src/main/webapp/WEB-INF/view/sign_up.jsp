<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style type="text/css">
body {
	background-color: lavender;
	font-family: Arial, sans-serif;
}

.container {
	max-width: 600px;
	margin: 0 auto;
	padding: 20px;
}

h1 {
	text-align: center;
}

form {
	margin-top: 20px;
}

table {
	margin: auto;
	border: 2px solid black;
	border-collapse: collapse;
	width: 100%;
}

td {
	padding: 8px;
}

input[type="text"],
input[type="password"],
input[type="email"],
input[type="submit"] {
	width: 100%;
	padding: 8px;
	border: 1px solid #ccc;
	border-radius: 4px;
}

input[type="submit"] {
	background-color: powderblue;
	cursor: pointer;
}

.error-message {
	color: red;
	font-style: italic;
}

.checkbox-container {
	display: flex;
	align-items: center;
}

.checkbox-label {
	margin-left: 8px;
}

#liveTime {
	margin-top: 20px;
	font-weight: bold;
	text-align: center;
}

</style>
</head>

<body>
	<div class="container">
		<h1>Registration Form</h1>

		<form action="save" method="post">

			<table>
				<tr>
					<td>Organization Name:</td>
					<td><input type="text" name="organizationName"></td>
					<td class="error-message">${error1}</td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="firstName"></td>
					<td class="error-message">${error2}</td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lastName"></td>
					<td class="error-message">${error3}</td>
				</tr>
				<tr>
					<td>User Name:</td>
					<td><input type="text" name="userName"></td>
					<td class="error-message">${error4}</td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
					<td class="error-message">${error5}</td>
				</tr>
				<tr>
					<td>Re-Type Password:</td>
					<td><input type="password" name="PasswordConform"></td>
					<td class="error-message">${error6}</td>
				</tr>
				<tr>
					<td>My Security Question:</td>
					<td><input type="text" name="securityQuestion"></td>
					<td class="error-message">${error7}</td>
				</tr>
				<tr>
					<td>Enter Security Answer:</td>
					<td><input type="text" name="securityAnswer"></td>
					<td class="error-message">${error8}</td>
				</tr>
				<tr>
					<td>Primary Email:</td>
					<td><input type="email" name="primaryEmail"></td>
					<td class="error-message">${error9}</td>
				</tr>
				<tr>
					<td>Secondary Email:</td>
					<td><input type="email" name="secondaryEmail"></td>
				</tr>
				<tr>
					<td colspan="3" class="checkbox-container">
						<input type="checkbox" required>
						<label class="checkbox-label">I have accepted the <strong style="color: blue;">Terms and Conditions</strong></label>
					</td>
				</tr>
				<tr>
					<td colspan="3"><input type="submit" value="SIGN ME UP"></td>
				</tr>
			</table>
		</form>

		<div id="liveTime"></div>
	</div>

	<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/moment.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/moment-timezone/0.5.33/moment-timezone-with-data.min.js"></script>
	<script>
	function updateLiveTime() {
	    var now = moment();
	    var timezone = moment.tz.guess();
	    var liveTime = now.tz(timezone).format("dddd, MMMM Do YYYY, h:mm:ss A z");
	    document.getElementById("liveTime").innerHTML = liveTime;
	    setTimeout(updateLiveTime, 1000);
	}

	updateLiveTime();
	</script>
</body>
</html>