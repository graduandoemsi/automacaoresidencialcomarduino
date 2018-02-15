package br.com.olrs.automacaoresidencial.resources;

import java.io.Reader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.olrs.automacaoresidencial.dao.ClienteDAO;
import br.com.olrs.automacaoresidencial.dao.EnderecoDAO;
import br.com.olrs.automacaoresidencial.dao.LoginDAO;
import br.com.olrs.automacaoresidencial.dao.PessoaDAO;
import br.com.olrs.automacaoresidencial.model.Cidade;
import br.com.olrs.automacaoresidencial.model.Cliente;
import br.com.olrs.automacaoresidencial.model.Endereco;
import br.com.olrs.automacaoresidencial.model.Estado;
import br.com.olrs.automacaoresidencial.model.Login;
import br.com.olrs.automacaoresidencial.model.Pessoa;

@Path("cadastro")
public class PessoaResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String ListarTodos() {	
		
		Gson gson = new Gson();
		
		//LoginService loginService = new LoginService();
		//String nome = loginService.getDefaultLogin().getLogin();
		
		LoginDAO loginDAO = new LoginDAO();
		List<Login> resultado = loginDAO.listar();
		
		System.out.println("Total des registros encontrados: " + resultado.size());
		for(Login login : resultado) {
			
			System.out.println(login.getLogin() + " - " + login.getSenha() + " - " + login.getCodigo());
		}
		
		String json = gson.toJson(resultado);
		
		return json;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public String listarPorCodigo(@PathParam("id") Long id) {	
		
		Gson gson = new Gson();
		
		LoginDAO loginDAO = new LoginDAO();
		Login login = loginDAO.buscar(id);
		
		String json = gson.toJson(login);
		
		System.out.println("Login: " + json);
		
		return json;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("salvar")
	public Response salvar(String pessoaRest) throws ParseException{
		
		try {
			
			Gson gson = new Gson();

			Pessoa pessoa = gson.fromJson(pessoaRest, Pessoa.class);

			System.out.println("Nome :" + pessoa.getNome());
			System.out.println("CPF :" + pessoa.getCpf());
			System.out.println("RG :" + pessoa.getRg());
			System.out.println("Email :" + pessoa.getEmail());
			System.out.println("Telefone :" + pessoa.getTelefone());
			System.out.println("Celular :" + pessoa.getCelular());

			PessoaDAO pessoaDAO = new PessoaDAO();
			pessoaDAO.salvar(pessoa);
			
			System.out.println("Pessoa salva com sucesso!");
			
		} catch (Exception e) {
			
			System.out.println("Não foi possível salvar!" + e);
		}

		
		return Response.status(Response.Status.OK).build();
	}
}
