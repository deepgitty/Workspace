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
	<div class="content">
		<div>Join Bol Network</div>
		<div>
			<form method=POST>
				<div class="signup">
					<div>
						<label data-text="First name">First name</label> <input
							type="text" name="firstName">
					</div>
					<div>
						<label data-text="Last name">Last name</label> <input type="text"
							name="lastName">
					</div>
					<div>
						<label data-text="Preferred ID">User id</label> <input type="text"
							name="uuid">
					</div>
					<div>
						<label data-text="Password">Password</label> <input
							type="password" name="password">
					</div>
					<div>
						<label data-text="Confirm password">Confirm password</label> <input
							type="password" name="cnf_pwd">
					</div>
					<div>
						<input type="submit" value="signup">
					</div>
				</div>
			</form>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>