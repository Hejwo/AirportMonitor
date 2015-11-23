app.controller('airportsController', function($scope,airportsService) {
    $scope.airports = airportsService.query();
});