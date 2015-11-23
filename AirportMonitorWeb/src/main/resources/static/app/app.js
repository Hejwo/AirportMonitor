var app = angular.module('airportMonitorApp', ['ngRoute', 'ngResource' ]);
app.config(function ($routeProvider) {

    $routeProvider.when("/cities", {
        controller: "citiesController",
        templateUrl: "/app/views/cities.html"
    });

    $routeProvider.when("/airports", {
        controller: "airportsController",
        templateUrl: "/app/views/airports.html"
    });

    $routeProvider.when("/about", {
        controller: "aboutController",
        templateUrl: "/app/views/about.html"
    });

    $routeProvider.otherwise({ redirectTo: "/about" });

});