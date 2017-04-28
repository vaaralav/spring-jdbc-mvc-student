<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
    <title>${pageTitle} - Software Architecture, Design Patterin in Spring</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <link rel="stylesheet" href="/assets/style.css"/>
</head>
<body>
<header class="page-header">
    <div class="container">
        <h2 class="page-title"><a href="/">Software Architecture, Design Pattern in Spring</a></h2>
        <h3>By <a href="https://github.com/vaaralav/">Ville Vaarala</a></h3>
    </div>
</header>
<main id="root" class="container">
    <h1>${pageTitle}</h1>

    <div class="row content">
        <div class="btn-group" role="group" aria-label="...">
            <a class="btn btn-default btn-lg" href="/create-student">Add Student <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
            </a>
            <a class="btn btn-default btn-lg" href="/students">View Students <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span></a>
        </div>
    </div>
</main>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<script src="/assets/student.js"></script>
</body>
</html>