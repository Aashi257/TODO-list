<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lists tasks</title>
</head>
<h1><font color="Blue">My Task List</font> </h1>
<body>
	
	<div class="container" style="height:50%">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th></th>
				</tr>
			</thead>
			 <tbody>
				<c:forEach items="${taskObj}" var="todo">
					<tr>
						<td>${todo.name}</td>
						<td>${todo.desc}</td>
					</tr>
				</c:forEach>
			</tbody> 
		</table>
		<div>
			<a type="button" class="btn btn-success" href="add-task">Add a Task</a>
		</div>
	</div>
</body>
</html>