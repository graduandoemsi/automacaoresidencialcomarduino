package br.com.automacao.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.olrs.automacaoresidencial.dao.ClienteDAO;
import br.com.olrs.automacaoresidencial.dao.EnderecoDAO;
import br.com.olrs.automacaoresidencial.dao.LoginDAO;
import br.com.olrs.automacaoresidencial.dao.PessoaDAO;
import br.com.olrs.automacaoresidencial.model.Cliente;
import br.com.olrs.automacaoresidencial.model.Endereco;
import br.com.olrs.automacaoresidencial.model.Login;
import br.com.olrs.automacaoresidencial.model.Pessoa;

public class ClienteDAOTest {
	@Test
	//@Ignore
	//ParseException -> para não tratar o erro caso digitemos errado a data...
	public void salvar() throws ParseException {
	
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);
		
		LoginDAO loginDAO = new LoginDAO();
		Login login = loginDAO.buscar(2L);
		
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(2L);
		
		Cliente cliente = new Cliente();
		
		cliente.setAtivado(true);
		//data pelo sistema
		//cliente.setDataCadastro(new Date());
		//formatando a data para o formato brasileiro
		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("05/02/2018"));
		cliente.setPessoa(pessoa);
		cliente.setLogin(login);
		cliente.setEndereco(endereco);
		
		
		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);
		
		System.out.println("Cliente salvo com sucesso!");
	}
	
	@Test
	@Ignore
	public void listar() {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultado = clienteDAO.listar();
		
		System.out.println("Total des registros encontrados: " + resultado.size());
		for(Cliente cliente : resultado) {
			
			System.out.println(cliente.getCodigo() + " - " + cliente.getEndereco().getCidade().getNome() + " - " + cliente.getLogin().getLogin());
		}
	}
	
	
	
	@Test
	@Ignore
	public void buscar() {
		
		Long codigo = 3L;
		
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		if(cliente == null) {
			System.out.println("Registro não encontrado");
			
		}else {
			System.out.println("Registro encontrado");
			System.out.println("Código -> " + cliente.getCodigo() + " - " + cliente.getPessoa().getNome());
		}
	}
	
	/*
	
	@Test
	@Ignore
	public void deletar() {
		
		Long codigo = 6L;
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		
		if(funcionario == null) {
			System.out.println("Registro não encontrado");
			
		}else {
			funcionarioDAO.deletar(funcionario);
			System.out.println("Registro removido");
			System.out.println(funcionario.getCodigo() + " - " + funcionario.getPessoa().getNome());
		}
		
	}
	*/
}
