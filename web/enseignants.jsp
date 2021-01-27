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
<div class="container col-md-10 col-md-offset-1">
    <div class="card">
        <div class="card-header">
            Recherche Enseignants
        </div>
        <div class="card-body">
            <form action="chercher.do" method="get">
                <label>Mot clé</label>
                <input type="text" name="motCle" value="${model.motCle}">
                <button type="submit" class="btn btn-primary">Chercher</button>
            </form>
            <table class="table table-striped">
                <tr>
                    <th>CNI</th>
                    <th>Nom</th>
                    <th>Prénom</th>
                    <th>Age</th>
                    <th>Adresse</th>
                    <th>Ville</th>
                    <th>Sexe</th>
                    <th>Photo</th>
                    <th></th>
                    <th></th>
                </tr>
                <c:forEach items="${model.enseignants}" var="e">
                    <tr>
                        <td>${e.cni}</td>
                        <td>${e.nom}</td>
                        <td>${e.prenom}</td>
                        <td>${e.age}</td>
                        <td>${e.adresse}</td>
                        <td>${e.ville}</td>
                        <td>${e.sexe}</td>
                        <td>${e.photo}</td>
                        <td><a onclick="return confirm('Etes vous sûre ?')" href="Supprimer.do?cni=${e.cni}">Supprimer</a></td>
                        <td><a href="Modifier.do?cni=${e.cni}">Modifier</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <div class="dropdown-divider">
        <p>

        </p>
    </div>
    <div class="card">
        <div class="card-header">
            Recherche modules
        </div>
        <div class="card-body">
            <form action="chercher.do" method="get">
                <label>Mot clé</label>
                <input type="text" name="motCle" value="${model2.motCle}">
                <button type="submit" class="btn btn-primary">Chercher</button>
            </form>
            <table class="table table-striped">
                <tr>
                    <th>ID</th>
                    <th>Nom</th>
                    <th>Nombre de cours</th>
                    <th>Nombre d'heures</th>
                    <th>ID de l'enseignant</th>
                    <th></th>
                    <th></th>
                </tr>
                <c:forEach items="${model2.modules}" var="m">
                    <tr>
                        <td>${m.id}</td>
                        <td>${m.nom}</td>
                        <td>${m.nbCours}</td>
                        <td>${m.nbHeures}</td>
                        <td>${m.profId}</td>
                        <td><a onclick="return confirm('Etes vous sûre ?')" href="Supprimer2.do?id=${m.id}" >Supprimer</a></td>
                        <td><a href="Modifier2.do?id=${m.id}">Modifier</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>

</div>
</body>
</html>
