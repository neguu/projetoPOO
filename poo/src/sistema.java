public class sistema{

     public static void main(String []args){
        System.out.println("Hello World");
        Usuario user = new Usuario();
        System.out.println(user.cadastrar());
        
     }
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
