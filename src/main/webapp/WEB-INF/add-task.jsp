<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new tasks</title>
</head>
<h1><font color="Brown">Save your tasks here:</font> </h1>
<body>

 <div class="container" style="height:50%">
	<form:form method="post" modelAttribute="task">
        
		<fieldset class="form-group">
			<form:label path="name">Task Name</form:label>
			<form:input path="name" type="text" class="form-control"
				required="required" />
			<form:errors path="name" cssClass="text-warning" />
		</fieldset> 
	
		<fieldset class="form-group">
			<form:label path="desc">Description</form:label>
			<form:input path="desc" type="text" class="form-control"
				required="required" />
			<form:errors path="desc" cssClass="text-warning" />
		</fieldset> 

		<button type="submit" class="btn btn-success">Save</button>
	</form:form>
</div> 

</body>
</html>