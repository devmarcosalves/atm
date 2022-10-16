package program;
import java.util.Scanner;
public class Machine {
	public static int nota2=20; public static int nota10=20; public static int nota20=20; public static int nota50=20;
	public static int login; public static int senha;
	
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		Users use = new Users();
		do {
			System.out.println("\t\tCAIXA ELETRÔNICO");
			System.out.print("\nLogin (0 - sair): ");
			login = sc.nextInt();
			if(login!=0) {
				System.out.print("Senha: ");
				senha = sc.nextInt();
				if(login == 2 && senha == 654321) {
					use.user2();
				}else if(login == 3 && senha == 987654) {
					use.user3();
				}else if(login == 4 && senha == 246529) {
					use.user4();
				}else if(login == 5 && senha == 811690) {
					use.user5();
				}else if(login == 6 && senha == 230922) {
					use.user6();
				}else if (login == 1 && senha == 123456) {
					use.adm();
				}else {
					System.out.println("Usuário ou senha inválida!\n");
				}
			}
		}while(login!=0);
		System.out.println("Programa encerrado, até breve!");
	}
}