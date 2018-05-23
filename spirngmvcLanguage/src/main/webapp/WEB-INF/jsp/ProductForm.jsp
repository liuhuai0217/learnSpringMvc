<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title><spring:message code="page.productform.title"/></title>
</head>
<body>
<div id="global">
	Current local:${page.Context.response.locale }
	</br>
	accept-language header:${header["accept-language"]}
</div>
<div>
<form:form modelAttribute="product" action="product_save" method="post">
	<fieldset>
		<legend><spring:message code="form.name"/></legend>
		<p>
			<label for="name"><spring:message code="label.productname" text="default text"/></label>
			<form:input path="name" id="name" cssErrorClass="error"/>
			<form:errors path="name" cssClass="error"/>
		</p>
	</fieldset>
</form:form>
	<form action="product_save" method="post" >
		<fieldset>
			<legend>Add a product</legend>
			<label for="name">Product Name:</label>
			<input type="text" id="name" name="name" value="" tabindex="1">
			<label for="description">Description:</label>
			<input type="text" id="description" name="description"  tabindex="2">
			<label for="price">Price:</label>
			<input type="text" id="price" name="price"  tabindex="3">
			<label for="productionDate">productionDate:</label>
			<input type="text" id="productionDate" name="productionDate"  tabindex="4">
			<div id="button">
				<label for="dummy"></label>
				<input id="reset" type="reset" tabindex="4">
				<input type="submit" tabindex="5" value="Add Product">
			</div>
		</fieldset>
	</form>
</div>
</body>
</html>
