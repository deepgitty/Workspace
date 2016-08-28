<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/theme/default.css">
<title>Bol - Registration</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div id="content">
		<div id="signUpForm">
			<h1 id="joinHeader">Sign Up to Bol Network</h1>
			<div>
				<span id="signupNumber">1</span> <span id="info">Your basic
					info</span>
				<form method=POST>
					<div class="signup">
						<div>
							<label data-text="First name" for="firstName">First Name:</label>
							<input type="text" name="firstName">
						</div>
						<div>
							<label data-text="Last name" for="lastName">Last Name:</label> <input
								type="text" name="lastName">
						</div>
						<div>
							<label data-text="Preferred ID" for="email">E-Mail:</label> <input
								type="text" name="email">
						</div>
						<div>
							<label data-text="Password" for="password">Password:</label> <input
								type="password" name="password">
						</div>
						<div>
							<label data-text="Confirm password" for="cnf_pwd">Confirm
								Password:</label> <input type="password" name="cnf_pwd">
						</div>
						<div>
							<input type="submit" value="signup">
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>