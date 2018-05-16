<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Edit Book Form</title>
<style type="text/css">@@IMPORT url("<c:url
value="../css/main.css"/>");</style>
</head>
<body>
<div id = "global">
	<form:form modelAttribute="book"  action="/update_book" method="post">
		<fieldset>
			<legend>Edit a book</legend>
			<form:hidden path="id"/>
			<p>
				<label for="category">Category:</label>
				<form:select id="category" path="category.id" items="${categorys}" itemLabel="name" itemValue="id"/>
			</p>
			<p>
				<label for="title">Title:</label>
				<form:input id="title" path="title"/>
			</p>
			<p>
				<label for="author">Author:</label>
				<form:input id="author" path="author"/>
			</p>
			<p>
				<label for="isbn">ISBN:</label>
				<form:input id="isbn" path="isbn"/>
			</p>
			<p id="button">
				<input id="reset" type="reset" tabindex="4">
				<input id="submit" type="submit" tabindex="5" value="update_book">
			</p>
		</fieldset>
	</form:form>
</div>
</body>
</html>