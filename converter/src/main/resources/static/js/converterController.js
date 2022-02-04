var app = angular.module('converterApp', []);

app.controller("converterCtrl", function($scope, $http){
    $scope.submitTemperature = function(){
        if($scope.kelvin){
            $http.get("http://localhost:8080/conversions/ktoc?kelvin=$scope.kelvin")
                .then(function (response){
                    $scope.response = response.data},
                    function error(response){
                    $scope.postResultMessage = "Error with status:" + response.statusText;});
            $scope.form.lbText = $scope.response;
        }
        else {
            if($scope.celsius){
                $http.get("http://localhost:8080/conversions/ctok?celsius=$scope.celsius").then(function (response){
                    $scope.response = response.data}, function error(response){
                    $scope.postResultMessage = "Error with status:" + response.statusText;});
                    $scope.lbText = $scope.response;
            }
        }

    }

    $scope.conversions = [];

    $scope.getHistory = function(){
        $http.get("http://localhost:8080/conversions/history").then(function success(response){
                $scope.conversions = response.data}, function error(response){
                $scope.postResultMessage = "Error with status:" + response.statusText;});
        }


});

