<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enseignants</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
<%@include file="Header.jsp" %>
<p>

</p>
<div class="container col-md-8 col-md-offset-2 col-xs-12">
    <div class="card">
        <div class="card-header">
            Saisie d'un Enseignant
        </div>
        <div class="card-body">
            <form action="SaveEnseignant.do" method="post">
                <div class="form-group">
                    <label class="control-label">CNE</label>
                    <input type="text" name="cni" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Nom</label>
                    <input type="text" name="nom" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Prénom</label>
                    <input type="text" name="prenom" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Age</label>
                    <input type="text" name="age" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Adresse</label>
                    <input type="text" name="adresse" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Ville</label>
                    <input type="text" name="ville" class="form-control">
                    <span></span>
                </div>
                <div class="form-group">
                <label class="control-label">Sexe</label>
                <input type="text" name="sexe" class="form-control">
                <span></span>
                </div>
                <div class="form-group">
                    <label class="control-label">Photo</label>
                    <input type="text" name="photo" class="form-control">
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
