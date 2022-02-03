import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LoginValido {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("HH");
		
		Usuario usuario = new Usuario();	
		System.out.print("Por favor, entre com o usuário: ");
		usuario.setLogin(scan.next());
		System.out.print("\nAgora digite a sua senha: ");
		usuario.setSenha(scan.next());
		
		Integer hora = Integer.parseInt(sdf.format(new Date()));
		
		if(UsuariosCadastrados.validarUsuario(usuario.getLogin(), usuario.getSenha())){
			if(hora >= 6 && hora < 12) {
				System.out.println("Bom dia, você se logou ao nosso sistema.");
			}else if(hora >= 12 && hora < 18) {
				System.out.println("Boa tarde, você se logou ao nosso sistema");
			}else if(hora >= 18 && hora < 24) {
				System.out.println("Boa noite, você se logou ao nosso sistema");
			}else {
				System.out.println("Boa madrugada, você se logou ao nosso sistema.");
			}
		}else {
			System.out.println("Usuário e/ou senha incorretos.");
		}
	}
}
