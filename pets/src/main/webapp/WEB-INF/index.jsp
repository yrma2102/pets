<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/pets/dog">
  <fieldset>
    <legend >Make a dog !!!</legend>
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br><br>
    <label for="breed">Breed:</label>
    <input type="text" id="breed" name="breed"><br><br>
    <label for="weight">Weight (lb):</label>
    <input type="number" id="weight" name="weight"><br><br>
    <input type="submit" value="Submit">
  </fieldset>
</form>
<br><br>
<form action="/pets/cat">
  <fieldset>
    <legend >Make a Cat !!!</legend>
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br><br>
    <label for="breed">Breed:</label>
    <input type="text" id="breed" name="breed"><br><br>
    <label for="weight">Weight (lb):</label>
    <input type="number" id="weight" name="weight"><br><br>
    <input type="submit" value="Submit">
  </fieldset>
</form>
</body>
</html>