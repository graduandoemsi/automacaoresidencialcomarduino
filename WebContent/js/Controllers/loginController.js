PrincipalApp.controller('loginController',['$scope', '$http', function($scope, $http) {
	
	$scope.user = {};
	$scope.submit = function(){
		console.log($scope.user);
		
	};
	$scope.message = "Esta é a página de logar-se!!";
	
	}
	
]);