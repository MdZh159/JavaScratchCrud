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
            Saisie d'un Module
        </div>
        <div class="card-body">
            <form action="SaveModule.do" method="post">
                <div class="form-group">
                    <label class="control-label">ID</label>
                    <input type="text" name="id" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Nom</label>
                    <input type="text" name="nom" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Nombre de cours</label>
                    <input type="text" name="nbrCours" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Nombre d'heures</label>
                    <input type="text" name="nbrHeures" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Id de l'enseignant</label>
                    <input type="text" name="profId" class="form-control">
                    <span></span>
                </div>
                <p></p>
                <div>
                    <button type="submit" class="btn btn-primary">Enregistrer</button>
                </div>
            </form>
        </div>
    </div>

</div>
</body>
</html>
