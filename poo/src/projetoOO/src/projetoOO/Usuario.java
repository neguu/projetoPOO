package projetoOO;

import java.util.Scanner;
import java.util.ArrayList;

public class Usuario {
	public String nome;
	public String login;
	protected int idade;
	protected String senha;

	public String sexo;

	public void usuario(String nome, String login, int idade, String senha, String localização, String sexo) {
		this.nome = nome;
		this.login = login;
		this.idade = idade;
		this.senha = senha;
		this.sexo = sexo;

	}

	public void fazerAmizade() {

	}

	public int verificar_Idade(int idade) {
		return 5;
	}

	public String cadastrar() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
		System.out.println("Digite os dados: " + "\nNome ");
		String nome = leitor.next();
		System.out.println("Login desejado ");
		String login = leitor.next();
		System.out.println("idade");
		int idade = leitor.nextInt();

		System.out.println("digite sua Senha de acesso");
		String senha = leitor.next();
		System.out.println("digite seu sexo");
		String sexo = leitor.next();

		Usuario usuario = new Usuario();

		usuario.setNome(nome);
		usuario.setLogin(login);
		;
		usuario.setIdade(idade);
		usuario.setSenha(senha);
		usuario.setSenha(sexo);
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario);
		System.out.println(
				usuario.getNome() + "\n" + usuario.getLogin() + "\n" + usuario.getIdade() + "\n" + usuario.getSexo());

		return usuario.toString();
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", login=" + login + ", idade=" + idade + ", senha=" + senha + ",  sexo=" + sexo + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setIdade(int idade) {

		this.idade = idade;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void desfazerAmizade() {

	}

	public void configuraçãoPrivacidade() {

	}

	public String getNomeUsuario() {
		return this.nome;
	}

	public String getLogin() {
		return login;
	}

	public int getIdade() {
		return idade;
	}

	public String getSenha() {
		return this.senha;
	}

}
