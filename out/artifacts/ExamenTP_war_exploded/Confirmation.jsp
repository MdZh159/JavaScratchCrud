<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Etudiants</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
<%@include file="Header.jsp" %>
<div class="container col-md-8 col-md-offset-2 col-xs-12">
    <div class="card">
        <div class="card-header">
            Confirmation de saisie
        </div>
        <div class="card-body">

                <div class="form-group">
                    <label class="control-label">CNI :</label>
                    <label>${enseignant.cni}</label>
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Nom :</label>
                    <label>${enseignant.nom}</label>
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Prénom :</label>
                    <label>${enseignant.prenom}</label>                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Age :</label>
                    <label>${enseignant.age}</label>                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Adresse :</label>
                    <label>${enseignant.adresse}</label>                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Ville :</label>
                    <label>${enseignant.ville}</label>                    <span></span>
                </div>

                <div class="form-group">
                    <label class="control-label">Sexe :</label>
                    <label>${enseignant.sexe}</label>                    <span></span>
                </div>
            <div class="form-group">
                <label class="control-label">Photo :</label>
                <label>${enseignant.photo}</label>                    <span></span>
            </div>
                <p></p>
        </div>
    </div>

</div>
</body>
</html>
