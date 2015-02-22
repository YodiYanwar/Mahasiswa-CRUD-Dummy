angular.module('mahasiswa', ['ngRoute', 'mahasiswa.controller'])

    .config(['$routeProvider', function($routeProvider){
      $routeProvider
        .when('/', {
          templateUrl : 'pages/home.html'
        })
        .when('/mahasiswa', {
          templateUrl : 'pages/mahasiswa.html',
          controller  : 'MhsController'
        })
    }])
;
