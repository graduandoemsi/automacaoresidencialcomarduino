//PrincipalApp.controller('cadastroController',['serviceForm', function($scope, serviceForm){
PrincipalApp.controller('cadastroController', function($scope, serviceForm){
	$scope.title="Dados Pessoais";
	
	$scope.salvar = function(pessoa){
		
		serviceForm.salvar(pessoa)
		
			.success(function (data, status, headers, config){
					
				$scope.mensagem = "Registro salvo com sucesso!";
				//console.log(data);
					
			}).error(function(data, status, headers, config){
				
				switch (status){
					case 401: {
						$scope.mensagem = "É necessário identificação!";
						break;
					}
					case 500: {
						$scope.mensagem = "Erro!";
						break;
					}
				}
					
				console.log(data, status);
			});
	};
	
});