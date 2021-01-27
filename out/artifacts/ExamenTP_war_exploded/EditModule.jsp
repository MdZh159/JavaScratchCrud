<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modules</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
<%@include file="Header.jsp" %>
<p>

</p>
<div class="container col-md-8 col-md-offset-2 col-xs-12">
    <div class="card">
        <div class="card-header">
            Edition d'un module
        </div>
        <div class="card-body">
            <form action="UpdateModule.do" method="post">
                <div class="form-group">
                    <label class="control-label">ID</label>
                    <input type="text" name="id" value="${module.id}" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Nom</label>
                    <input type="text" name="nom" value="${module.nom}" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Nombre de cours</label>
                    <input type="text" name="nbCours" value="${module.nbCours}" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Nombre des heures</label>
                    <input type="text" name="nbHeures" value="${module.nbHeures}" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">ID de l'enseignant</label>
                    <input type="text" name="profId" value="${module.profId}" class="form-control">
                    <span></span>
                </div>
                <p></p>
                <div>
                    <button type="submit" class="btn btn-primary">Modifier</button>
                </div>
            </form>
        </div>
    </div>

</div>
</body>
</html>
