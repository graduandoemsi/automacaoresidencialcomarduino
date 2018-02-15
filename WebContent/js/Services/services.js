PrincipalApp.factory('serviceForm', function($http, UrlBase){	

	var _salvar = function (pessoa){
		
		//console.log(pessoa);
		return 	$http({
			method: "POST",
			url: UrlBase.getUrl + "cadastro/salvar",
			//data: angular.toJson(pessoa),
			data: pessoa,
			headers : {
				'Content-Type' : ' application/json; charset=UTF-8'
			}
		});
				
	};
	
	return {
		//getAllUsers : _getAllUsers,
		//getByCodigoUser : _getByCodigoUser,
		salvar : _salvar
	};
})
