app.factory('citiesService', function ($resource) {
    return $resource('city');
});