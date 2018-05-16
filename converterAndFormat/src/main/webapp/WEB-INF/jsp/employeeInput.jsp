<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Employee</title>
<style type="text/css">@@IMPORT url("<c:url
value="../css/main.css"/>");</style>
</head>
<body>
<div id = "global">
	<form:form modelAttribute="employee"  action="/employee_save" method="post">
		<fieldset>
			<legend>Add Employee</legend>
			<form:hidden path="id"/>
			<p>
				<label for="firstName">First Name:</label>
				<form:input path="firstName" tabindex="1"/>
			</p>
			<p>
				<label for="lastName">Last Name:</label>
				<form:input path="lastName" tabindex="2"/>
			</p>
			<p>
				<form:errors path="brithDate" cssClass="error"></form:errors>
			</p>
			<p>
				<label for="brithDate">BrithDate:</label>
				<form:input path="brithDate" tabindex="3"/>
			</p>
			<p id="button">
				<input id="reset" type="reset" tabindex="4">
				<input id="submit" type="submit" tabindex="5" value="Add Employee">
			</p>
		</fieldset>
	</form:form>
</div>
</body>
</html>