package program;
import java.util.Scanner;
import static program.Machine.senha;

public class Confirmation {
	public int confsenha;
	public int authorization() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Confirme a senha: ");
		confsenha=sc.nextInt();
		if(senha == confsenha) {
			return 1;
		}else 
		return 0;
	}
}