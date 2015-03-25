<!DOCTYPE html>
<html>

<head>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
</head>

<body>

<div ng-app="myApp" ng-controller="customersCtrl"> 

<ul>
  <li ng-repeat="utilisateur in utilisateurs">
    {{ utilisateur.gMailAccount + ', ' + utilisateur.pseudo }}
  </li>
</ul>

</div>

<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
    $http.get("http://localhost:8888/utilisateur/liste")
    .success(function(response) {$scope.utilisateurs = response;});
});
</script>


</body>
</html>