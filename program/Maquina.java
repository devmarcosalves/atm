package program;

import program.Menu;
import java.util.Scanner;

public class Maquina {
	public static int nota2=20;
	public static int nota10=20;
	public static int nota20=20;
	public static int nota50=20;
public static int login;
public static int senha;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoas pes = new Pessoas();
		System.out.println("\t\tCAIXA ELETRÔNICO");
		System.out.print("\nLogin (Letra Maiúscula): ");
		login = sc.nextInt();
		System.out.print("Senha: ");
		senha = sc.nextInt();
		if(login == 2 && senha == 654321) {
			pes.user2();
		}else if(login == 3 && senha == 987654) {
			pes.user3();
		}else if(login == 4 && senha == 246529) {
			pes.user4();
		}else if(login == 5 && senha == 811690) {
			pes.user5();
		}else if(login == 6 && senha == 230922) {
			pes.user6();
		}else if (login == 1 && senha == 123456) {
			int aux=1;
			int nota;
			int quantnota;
			do {
				System.out.println("Ainda tem " + nota2 + " notas de 2 reais");
				System.out.println("Ainda tem " + nota10 + " notas de 10 reais");
				System.out.println("Ainda tem " + nota20 + " notas de 20 reais");
				System.out.println("Ainda tem " + nota50 + " notas de 50 reais");
				
				System.out.print("Digite 1 para repor notas ou 0 para Sair: ");
				aux = sc.nextInt();
				if(aux == 1) {
					System.out.println("2 - 10 - 20 - 50");
					System.out.print("Informe a nota que deseja repor: ");
					nota = sc.nextInt();
					System.out.print("Informe quantas notas irá repor: ");
					quantnota  = sc.nextInt();
					switch(nota) {
					case 2:
						if(quantnota + nota2 > 20) {
							System.out.println("Você excedeu a quantatidade de notas!");
							break;
						}
						nota2 = nota2 + quantnota;
						break;
					case 10:
						if(quantnota + nota10 > 20) {
							System.out.println("Você excedeu a quantatidade de notas!");
							break;
						}
						nota10 = nota10 + quantnota;
						break;
					case 20:
						if(quantnota + nota20 > 20) {
							System.out.println("Você excedeu a quantatidade de notas!");
							break;
						}
						nota20 = nota20 + quantnota;
						break;
					case 50:
						if(quantnota + nota50 > 20) {
							System.out.println("Você excedeu a quantatidade de notas!");
							break;
						}
						nota50 = nota50 + quantnota;
						break;
						default:
							System.out.println("Nota não identificada");
					}
				}
			}while(aux!=0);
			System.out.println("Programa encerrado, até breve");
		}
	}
}