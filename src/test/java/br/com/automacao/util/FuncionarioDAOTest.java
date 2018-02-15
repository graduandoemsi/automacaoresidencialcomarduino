package br.com.automacao.util;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.olrs.automacaoresidencial.dao.EnderecoDAO;
import br.com.olrs.automacaoresidencial.dao.FuncionarioDAO;
import br.com.olrs.automacaoresidencial.dao.LoginDAO;
import br.com.olrs.automacaoresidencial.dao.PessoaDAO;
import br.com.olrs.automacaoresidencial.model.Endereco;
import br.com.olrs.automacaoresidencial.model.Funcionario;
import br.com.olrs.automacaoresidencial.model.Login;
import br.com.olrs.automacaoresidencial.model.Pessoa;

public class FuncionarioDAOTest {

	@Test
	//@Ignore
	public void salvar() {
		
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(2L);
		
		LoginDAO loginDAO = new LoginDAO();
		Login login = loginDAO.buscar(2L);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setEndereco(endereco);
		funcionario.setLogin(login);
		funcionario.setPessoa(pessoa);
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.salvar(funcionario);
		
		
	}
	
	@Test
	@Ignore
	public void listar() {
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		List<Funcionario> resultado = funcionarioDAO.listar();
		
		System.out.println("Total des registros encontrados: " + resultado.size());
		for(Funcionario funcionario : resultado) {
			
			System.out.println(funcionario.getCodigo() + " - " + funcionario.getEndereco().getCidade().getNome() + " - " + funcionario.getLogin().getLogin());
		}
	}
	
	
	@Test
	@Ignore
	public void buscar() {
		
		Long codigo = 3L;
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		if(funcionario == null) {
			System.out.println("Registro não encontrado");
			
		}else {
			System.out.println("Registro encontrado");
			System.out.println("Código -> " + funcionario.getCodigo() + " - " + funcionario.getPessoa().getNome());
		}
	}
	
	
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
	
}
