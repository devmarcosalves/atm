package program;
import java.util.Scanner;
import static program.Machine.nota2; import static program.Machine.nota10;
import static program.Machine.nota20; import static program.Machine.nota50;

public class Users {
	public double saldo2=0; public double saldo3=0;
	public double saldo4=0; public double saldo5=0; public double saldo6=0;
	Menu objMenu = new Menu();
	public void user2(){
		saldo2 = objMenu.opcoes(saldo2);
	}
	public void user3(){
		saldo3 = objMenu.opcoes(saldo3);
	}
	public void user4(){
		saldo4 = objMenu.opcoes(saldo4);
	}
	public void user5(){
		saldo5 = objMenu.opcoes(saldo5);
	}
	public void user6(){
		saldo6 = objMenu.opcoes(saldo6);
	}
	public void adm() {
		Scanner sc = new Scanner(System.in);
		int aux=1;
		int nota;
		int quantnota;
		do {
			System.out.println("\n0. Sair 1. Escolher uma nota para repor");
			System.out.println("2. Repor todas as notas automaticamente \n3. Exibir a quantidade de notas");
			System.out.print("Escolha uma opção: ");
			aux = sc.nextInt();
			if (aux == 0) {
				break;
			}else if(aux == 1) {
				System.out.println("2 - 10 - 20 - 50");
				System.out.print("Informe a nota que deseja repor: ");
				nota = sc.nextInt();
				System.out.print("Quantas notas irá repor? ");
				quantnota  = sc.nextInt();
				switch(nota) {
				case 2:
					if(quantnota + nota2 > 20) {
						System.out.println("Você excedeu a quantatidade máxima de notas!");
						break;
					}
					nota2 = nota2 + quantnota;
					System.out.println("Reposição concluída com sucesso!");
					break;
				case 10:
					if(quantnota + nota10 > 20) {
						System.out.println("Você excedeu a quantatidade máxima de notas!");
						break;
					}
					nota10 = nota10 + quantnota;
					System.out.println("Reposição concluída com sucesso!");
					break;
				case 20:
					if(quantnota + nota20 > 20) {
						System.out.println("Você excedeu a quantatidade máxima de notas!");
						break;
					}
					nota20 = nota20 + quantnota;
					System.out.println("Reposição concluída com sucesso!");
					break;
				case 50:
					if(quantnota + nota50 > 20) {
						System.out.println("Você excedeu a quantatidade máxima de notas!");
						break;
					}
					nota50 = nota50 + quantnota;
					System.out.println("Reposição concluída com sucesso!");
					break;
				default:
					System.out.println("Nota não identificada!");
					break;
				}
			}else if (aux == 2) {
				nota2 = 20; nota10 = 20; nota20 = 20; nota50 = 20;
				System.out.println("Reposição concluída com sucesso!");
			}else if(aux == 3) {
				System.out.println("\nAinda tem " + nota2 + " notas de 2 reais");
				System.out.println("Ainda tem " + nota10 + " notas de 10 reais");
				System.out.println("Ainda tem " + nota20 + " notas de 20 reais");
				System.out.println("Ainda tem " + nota50 + " notas de 50 reais");
			}else {
				System.out.println("Opção inválida!");
			}
		}while(aux!=0);
		System.out.print("\n");
	}
}