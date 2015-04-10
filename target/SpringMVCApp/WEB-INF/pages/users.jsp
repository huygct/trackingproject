<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html ng-app="myapp">
    <head>
        <meta charset="utf-8">
        <title>Spring MVC Application</title>

        <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <%--<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js"></script>--%>
        <script src="/resources/js/lib/angular/angular.js"></script>
    </head>

    <body ng-controller="MyController">
        <div ng-repeat="n in users">
            {{n}}
        </div>

        <button style="margin-left:100px;" class="btn btn-danger" ng-click="removeUser()">Remove All Cars</button>
    </body>

    <script>
        angular.module('myapp', [])
                .controller('MyController', function($scope, $http)
                {
                    $scope.users = [];
                    $scope.fetchUserList = function() {
                        $http.get('userList').success(function(userList){
                            $scope.users = userList;
//                            console.log(userList);
                        });
                    };

                    $scope.addNewCar = function(newCar) {
                        $http.post('cars/addCar/' + newCar).success(function() {
                            $scope.fetchUserList();
                        });
                        $scope.carName = '';
                    };

                    $scope.removeUser = function() {
                        console.log("aaaaaaaaaaaaaaa")
                        $http.delete('removeUser').success(function() {
                            $scope.fetchUserList();
                        });

                    };

                    $scope.fetchUserList();
                });
    </script>
</html>