app.factory('airportsService', function ($resource) {
    return $resource('airport');
});