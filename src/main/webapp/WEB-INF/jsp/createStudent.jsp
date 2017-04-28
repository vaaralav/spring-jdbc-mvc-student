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
        <h2>Software Architecture, Design Pattern in Spring</h2>
        <h3>By <a href="https://github.com/vaaralav/">Ville Vaarala</a></h3>
    </div>
</header>
<main id="root" class="container">
    <h1>${pageTitle}</h1>

    <div class="content">
        <form id="create-student" method="POST" action="/api/student">
            <label for="student-name">
                Name:
               <input id="student-name" name="name" type="text"/>
            </label>
            <label for="student-gpax">
                GPAX:
                <input id="student-gpax" name="gpax" type="number"/>
            </label>
            <label for="student-ambition">
                Ambition:
                <input id="student-ambition" name="ambition" type="text"/>
            </label>

            <input type="submit" class="btn btn-primary" value="Save"/>

        </form>
    </div>
</main>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<script src="/assets/student.js"></script>
</body>
</html>