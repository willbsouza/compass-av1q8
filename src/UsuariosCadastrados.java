public class UsuariosCadastrados {
	
	public static Boolean validarUsuario(String usuario, String senha) {
		
		String[] usuariosCadastrados = {"pedrovbl", "antonio_2011", "maria927",
				"aline-melo", "carlos1997", "tiago_lopes", "jaqueline-287",
				"beatriz52", "danilo.silva", "vanessa.souza"};
		String[] senhasCadastradas = {"Pe18dro_", "Toinho123", "M@ria1999", 
				"Melo@line", "Carlo$25", "Tiaguinho20", "j@ckj@ck",
				"biii@1993", "D@n98ilo", "souzaV@nessa"};
		
		for(int i = 0; i < usuariosCadastrados.length; i++) {
			if(usuario.equalsIgnoreCase(usuariosCadastrados[i])  && senha.equals(senhasCadastradas[i])) {
				return true;
			}
		}
		return false;
	}
}
