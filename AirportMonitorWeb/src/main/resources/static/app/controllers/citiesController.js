app.controller('citiesController', function($scope,citiesService) {
    $scope.cities = citiesService.query();
});