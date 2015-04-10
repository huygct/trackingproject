'use strict';

/**
 * CarController
 * @constructor
 */
var UserController = function($scope, $http) {
    $scope.fetchUserList = function() {
        $http.get('userlist.json').success(function(userList){
            $scope.users = userList;
        });
    };

    $scope.addNewCar = function(newCar) {
        $http.post('cars/addCar/' + newCar).success(function() {
            $scope.fetchUserList();
        });
        $scope.carName = '';
    };

    $scope.removeAllCars = function() {
        $http.delete('cars/removeUser').success(function() {
            $scope.fetchUserList();
        });

    };

    $scope.fetchUserList();
};