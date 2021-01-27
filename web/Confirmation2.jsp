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
            Confirmation de saisie
        </div>
        <div class="card-body">

            <div class="form-group">
                <label class="control-label">ID :</label>
                <label>${module.id}</label>
                <span></span>
            </div>
            <div class="form-group">
                <label class="control-label">Nom :</label>
                <label>${module.nom}</label>
                <span></span>
            </div>
            <div class="form-group">
                <label class="control-label">Nombre de cours :</label>
                <label>${module.nbCours}</label>                    <span></span>
            </div>
            <div class="form-group">
                <label class="control-label">Nombre d'heures :</label>
                <label>${module.nbHeures}</label>                    <span></span>
            </div>
            <div class="form-group">
                <label class="control-label">ID de l'enseignant :</label>
                <label>${module.profId}</label>                    <span></span>
            </div>

            <p></p>
        </div>
    </div>

</div>
</body>
</html>
