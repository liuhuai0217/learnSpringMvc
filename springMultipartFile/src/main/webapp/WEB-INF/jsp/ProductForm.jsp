<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>product</title>
</head>
<body>
<div id="global">
<form:form modelAttribute="product" action="product_save" method="post" enctype="multipart/form-data">
	<fieldset>
		<legend>add a product</legend>
		<p>
			<label for="name">Product Name</label>
			<form:input path="name" id="name" cssErrorClass="error"/>
			<form:errors path="name" cssClass="error"/>
		</p>
		<p>
			<label for="description">Product Descripton</label>
			<form:input path="description" id="description" />
		</p>
		<p>
			<label for="price">Product Price</label>
			<form:input path="price" id="price"/>
		</p>
		<p>
			<label for="images">Product Images</label>
			<input type="file" name="images[0]">
		</p>
		<p id="button">
			<input id="reset" type="reset" tabindex="4">
			<input id="submit" type="submit" tabindex="5" value="ADD"> 
		</p>
	</fieldset>
</form:form>
</div>
</body>
</html>
