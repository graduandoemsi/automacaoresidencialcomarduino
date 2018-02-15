//PrincipalApp.factory('serviceForm', function($http){
PrincipalApp.factory('serviceForm', function($http, UrlBase){	

	var _salvar = function (pessoa){
		//return $http.post('http://localhost:8080/automacaoresidencial/rest/cadastro/salvar', angular.toJson(pessoa));
		
		//console.log(pessoa);
		return 	$http({
			method: "POST",
			url: UrlBase.getUrl + "cadastro/salvar",
			//url: 'http://localhost:8080/automacaoresidencial/rest/cadastro/salvar',
			//data: angular.toJson(pessoa),
			data: pessoa,
			headers : {
				'Content-Type' : ' application/json; charset=UTF-8'
				//'Content-Type' : 'application/x-www-form-urlencoded; charset=UTF-8'
			}
		});
				
	};
	
	return {
		//getAllUsers : _getAllUsers,
		//getByCodigoUser : _getByCodigoUser,
		salvar : _salvar
	};
})
