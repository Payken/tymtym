/**
 * Created by fdarmoch on 2016-04-21.
 */
// script.js

// create the module and name it scotchApp
var scotchApp = angular.module('scotchApp', []);



// script.js

// create the module and name it scotchApp
// also include ngRoute for all our routing needs
var scotchApp = angular.module('scotchApp', ['ngRoute']);

// configure our routes
scotchApp.config(function($routeProvider) {
    $routeProvider


        .when('/', {
            templateUrl : 'pages/home.html',
            controller  : 'mainController'
        })


        .when('/add', {
            templateUrl : 'pages/add.html',
            controller  : 'addController'
        })

        .when('/del', {
            templateUrl : 'pages/del.html',
            controller  : 'delController'
        })


        .when('/labels', {
            templateUrl : 'pages/labels.html',
            controller  : 'labelsController'
        })


        .when('/parameters', {
            templateUrl : 'pages/parameters.html',
            controller  : 'parametersController'
        })
    .when('/stats', {
        templateUrl : 'pages/stats.html',
        controller  : 'statsController'
    })
    .when('/addvalue', {
        templateUrl : 'pages/addvalue.html',
        controller  : 'addvalueController'
    });
});

// create the controller and inject Angular's $scope
scotchApp.controller('mainController', function($scope,$http) {
    // create a message to display in our view
    $scope.init = function () {
        $http.post('getclass').then( function (response) {
            $scope.class = response.data;
            console.log(response.data);

        });

    }
    $scope.init();

    $scope.processForm = function() {

        $http.get('getlog').then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
        });
    };
});

scotchApp.controller('addController', function($scope,$http) {

    $scope.processForm = function() {
        $scope.ppp= {
            name: $scope.setName
        }
        $http.post('add',$scope.ppp).then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
            alert("odpowiedz");
        });
    };

});

scotchApp.controller('addvalueController', function($scope,$http) {
    $scope.getSets = function() {

        $http.post('getsets').then( function (response) {
            $scope.params = response.data;
            console.log(response.data);

        });
    };
    $scope.init = function () {
        $http.post('getsets').then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
            $scope.sets=response.data;
        });
    }

    $scope.init();

    $scope.processForm = function() {
        $scope.ppp= {
            name: $scope.setName,
            value: $scope.setValue
        }
        $http.post('addValue',$scope.ppp).then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
            alert("odpowiedz");
        });
    };


});

scotchApp.controller('contactController', function($scope) {
    $scope.message = '.';
});

scotchApp.controller('delController', function($scope,$http) {
    $scope.init = function () {
        $http.post('getsets').then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
            $scope.sets=response.data;
        });
    }

    $scope.init();

    $scope.processForm = function() {
        $scope.ppp= {
            name: $scope.setName,
        }
        $http.post('delSet',$scope.ppp).then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
            alert("odpowiedz");
        });
    };
});

scotchApp.controller('statsController', function($scope,$http) {
    $scope.init = function () {
        $http.post('getsets').then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
            $scope.sets=response.data;
        });
        $http.post('getlabels').then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
            $scope.labels=response.data;
        });

    }

    $scope.init();

    $scope.processForm = function() {
        $scope.ppp= {
            name: $scope.setName,
            name2: $scope.setName2,
        }
        $http.post('getstats',$scope.ppp).then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
            alert("odpowiedz");
            $scope.stats=response.data;
        });
    };
});

scotchApp.controller('labelsController', function($scope,$http) {
    $scope.init = function () {
        $http.post('getlabels').then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
            $scope.labels=response.data;
        });

    }

    $scope.init();

    $scope.processForm = function() {
        $scope.ppp= {
            srednia: $scope.average,
            mediana: $scope.median,
            korelacja: $scope.corellation,
            korelacjaz: $scope.corellationwith,
            wprowadzWartosc: $scope.insertvalue,
            nazwaZbioru: $scope.name,
        }
        $http.post('setlabels',$scope.ppp).then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
            alert("odpowiedz");

        });
    };
});

scotchApp.controller('parametersController', function($scope,$http) {
       $scope.processForm = function() {
        $scope.ppp= {
        fileformat: $scope.fileformat,
        background: $scope.background,
        labels: $scope.labels,
        correlation: $scope.correlation

        }
        $http.post('setparams',$scope.ppp).then( function (response) {
            $scope.params = response.data;
            console.log(response.data);
            alert("odpowiedz");
$scope.init();
        });
    };
});