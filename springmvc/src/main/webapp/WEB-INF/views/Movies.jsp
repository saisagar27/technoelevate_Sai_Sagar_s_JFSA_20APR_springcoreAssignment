<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String s=(String)request.getAttribute("mname"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to The Movies Page!!!!</h1>
<h3>The movie that you chose is = <%= s %></h3>
<img alt="" src="https://cdn.pixabay.com/photo/2019/04/24/21/55/cinema-4153289__340.jpg">
<p>A film, also called a movie, motion picture or moving picture, is a work of visual art used to simulate experiences that communicate ideas, stories, perceptions, feelings, beauty, or atmosphere through the use of moving images. These images are generally accompanied by sound, and more rarely, other sensory stimulations.[1] The word "cinema", short for cinematography, is often used to refer to filmmaking and the film industry, and to the art form that is the result of it.

The moving images of a film are created by photographing actual scenes with a motion-picture camera, by photographing drawings or miniature models using traditional animation techniques, by means of CGI and computer animation, or by a combination of some or all of these techniques, and other visual effects</p>


</body>
</html>