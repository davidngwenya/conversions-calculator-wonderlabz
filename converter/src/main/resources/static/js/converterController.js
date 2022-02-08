var app = angular.module('converterApp', []);

app.controller('converterCtrl', function($scope, $http){

    $scope.submitCelsius = function(){
       if($scope.celsius){
        $http.get("http://localhost:8080/conversions/ctok?celsius=" + $scope.celsius)
            .then(function success(response){
            $scope.kelvinOutput = response.data;
            $scope.temperatureOutput = "Your equivalent temperature in Kelvin is:" + "" + $scope.kelvinOutput;
            $scope.celsius="";});
        }
    }

    $scope.submitKelvin = function(){
           if($scope.kelvin){
            $http.get("http://localhost:8080/conversions/ktoc?kelvin=" + $scope.kelvin)
                .then(function success(response){
                $scope.celsiusOutput = response.data;
                $scope.temperatureOutput = "Your equivalent temperature in Celsius is:" + "" + $scope.celsiusOutput;
                $scope.kelvin=""});
            }
    }

    $scope.submitKilometres = function(){
            if($scope.kilometres){
            $http.get("http://localhost:8080/conversions/ktom?kilometres=" + $scope.kilometres)
                .then(function success(response){
                $scope.milesOutput = response.data;
                $scope.distanceOutput = "Your equivalent distance in Miles is:" + "" + $scope.milesOutput;
                $scope.kilometres="";});
            }
    }

    $scope.submitMiles = function(){
           if($scope.miles){
           $http.get("http://localhost:8080/conversions/mtok?miles=" + $scope.miles)
               .then(function success(response){
               $scope.kilometresOutput = response.data;
               $scope.distanceOutput = "Your equivalent distance in Kilometres is:" + "" + $scope.kilometresOutput;
               $scope.miles="";});
           }
    }


    $scope.conversions = [];

    $scope.getHistory = function(){
        $http.get("http://localhost:8080/conversions/history")
            .then(function (response){
            $scope.conversions = response.data});

        var d = document.getElementById("displayTable");
        var c = document.getElementById("history");
        if((d.style.display == "none") || (c.value == 'Show Conversion History')){
            d.style.display ="block";
            c.value = "Close Conversion History";
            displayTable.hidden = false;
        } else {
            d.style.display = "none";
            c.value = "Show Conversion History"
        }
    }

    function success(response){
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

    /*function refreshPageData(){
        $http.get("http://localhost:8080/");
    }*/


});

