var app = angular.module('converterApp', []);

app.controller('converterCtrl', function($scope, $http){



    $scope.submitTemperature = function(){
        if($scope.kelvin){
            $http.get("http://localhost:8080/conversions/ktoc?kelvin=" + $scope.kelvin)
                .then(function (response){
                    $scope.response = response.data},
                    function error(response){
                    $scope.postResultMessage = "Error with status:" + response.statusText;});
        }
        else {
            if($scope.celsius){
                //var celsiusNum = parseFloat($scope.celsius).toFixed(2);
                //var cel = $scope.celsius;
                $http.get('http://localhost:8080/conversions/ctok?celsius=' + $scope.celsius).then(function(response){
                    $scope.conversionResponse = response.data}, function error(response){
                    $scope.conversionResponse = "Error with status:" + response.statusText;});
                    //$scope.conversionResponse = "Error with status:" + response.statusText;});
                    $scope.lbText = $scope.response;
            }
        }

    }

    $scope.submitDistance = function(){
            if($scope.miles){
                $http.get("http://localhost:8080/conversions/mtok?miles=" + $scope.miles).then(success, error);
            }
            else {
                if($scope.kilometres){
                    $http.get('http://localhost:8080/conversions/ktom?kilometres=' + $scope.kilometres).then(success, error);
                }
            }

        }

    $scope.conversions = [];

    $scope.getHistory = function(){
        $http.get("http://localhost:8080/conversions/history").then(success, error);
    }

    function refreshPageData(){
        $http.get("http://localhost:8080/");
    }

    function success(response){
        refreshPageData();
        clearTempForm();
        clearDistForm();
    }

    function error(response){
        console.log(response.statusText);
    }

    function clearTempForm(){
        $scope.celsius = "";
        $scope.kelvin = "";
    }

    function clearDistForm(){
        $scope.miles = "";
        $scope.kilometres = "";
    }


});

