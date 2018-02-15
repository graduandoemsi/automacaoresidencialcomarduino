// configure our routes
PrincipalApp.config(['$routeProvider', function($routeProvider) {

	$routeProvider

	// route for the home page
	.when('/', {
		templateUrl : 'html/home.html',
		controller : 'homeController'
	})

	.when('/home', {
		templateUrl : 'html/home.html',
		controller : 'homeController'
	})

	// route for the about page
	.when('/sobre', {
		templateUrl : 'html/sobre.html',
		controller : 'sobreController'
	})

	// route for the contact page
	.when('/contato', {
		templateUrl : 'html/contato.html',
		controller : 'contatoController'
	})
	
	.when('/login', {
		templateUrl : 'html/login.html',
		controller : 'loginController'
	})

	// route for the login page

	.when('/servico', {
		templateUrl : 'html/servico.html',
		controller : 'sobreController'
	})
	
	.when('/sala', {
		templateUrl : 'html/sala.html',
		controller : 'salaController'
	})
	
	.when('/cadastro', {
		templateUrl : 'html/cadastro.html',
		controller : 'cadastroController'
	})
	
	.otherwise({redirectTo:'/'});
}]);
	
