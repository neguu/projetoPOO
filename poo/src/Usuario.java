import java.util.Scanner;
import java.util.ArrayList;

public class Usuario {
	public String nome;
	public String login;
	protected int idade;
	protected String senha;
	protected String localização;
	protected char sexo;

	public void fazerAmizade() {

	}

	public int verificar_Idade(int idade) {
		return 5;
	}

	public String cadastrar() {
		Scanner l = new Scanner(System.in);
		System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
		System.out.println("Digite os dados: " + "\nNome ");
		String nome = l.next();
		System.out.println("Login desejado ");
		String login = l.next();
		System.out.println("idade");
		int idade = l.nextInt();
		System.out.println("Senha de acesso");
		String senha = l.next();
		
		Usuario usuario = new Usuario();
		
		
		usuario.setNome(nome);
		usuario.setLogin(login);
;		usuario.setIdade(idade);
		usuario.setSenha(senha);
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario);
		System.out.println(usuario.getNome() + "\n" + usuario.getLogin() + "\n" + usuario.getIdade());
		
		return usuario.toString();
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", login=" + login + ", idade=" + idade + ", senha=" + senha + ", localização="
				+ localização + ", sexo=" + sexo + "]";
	}

	public String getNome() {
		return nome;
	}
	
	
	
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

	public String getLocalização() {
		return localização;
	}
	
	
	

	public void setLocalização(String localização) {
		this.localização = localização;
	}
	
	
	

	public char getSexo() {
		return sexo;
	}
	
	
	

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	

	public void setLogin(String login) {
		this.login = login;
	}
	
	
	

	public void setIdade(int idade) {
		
		this.idade = idade;
	}
	
	
	public void setSenha(String senha){
		this.senha=senha;
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
	
	
	
	
	public String getSenha(){
		return this.senha;
	}
	
	
	
	
}




