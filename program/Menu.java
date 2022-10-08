package program;
import transactions.Balance;
import transactions.Deposit;
import transactions.Withdraw;
import java.util.Scanner;
import static program.Machine.login;
import static program.Machine.senha;

public class Menu {
	public static int opc=0;
	public double opcoes(double saldoatual) {
		Scanner sc = new Scanner(System.in);
		Deposit dep = new Deposit();
		Withdraw saq = new Withdraw();
		Balance bal= new Balance();
		do {
			System.out.println("\n1- Deposito 2- Saque \n3- Saldo 0- Sair");
			System.out.print("Digite uma opção: ");
			opc=sc.nextInt();
			 if (opc==0) {
					System.out.println("Transação finalizada.\n");
					break;
				}
			System.out.print("Confirme a senha: ");
			senha=sc.nextInt();
			if(opc==1 ) {
				if(login == 2 && senha == 654321) {
				saldoatual=dep.deposito(saldoatual);
				} else if(login == 3 && senha == 987654) {
					saldoatual=dep.deposito(saldoatual);
				}else if(login == 4 && senha == 246529) {
					saldoatual=dep.deposito(saldoatual);
				}else if(login == 5 && senha == 811690) {
					saldoatual=dep.deposito(saldoatual);
				}else if(login == 6 && senha == 230922) {
					saldoatual=dep.deposito(saldoatual);
				}else 
					System.out.println("Senha Incorreta.");
				
			}else if(opc==2) {
				if(login == 2 && senha == 654321) {
					saldoatual=saq.saque(saldoatual);
				}else if(login == 3 && senha == 987654) {
					saldoatual=saq.saque(saldoatual);
				}else if(login == 4 && senha == 246529) {
					saldoatual=saq.saque(saldoatual);
				}else if(login == 5 && senha == 811690) {
					saldoatual=saq.saque(saldoatual);
				}else if(login == 6 && senha == 230922) {
					saldoatual=saq.saque(saldoatual);
				}else 
					System.out.println("Senha Incorreta.");
				
			}else if (opc==3) {
				if(login == 2 && senha == 654321) {
					bal.saldo(saldoatual);
				}else if(login == 3 && senha == 987654) {	
					bal.saldo(saldoatual);
				}else if(login == 4 && senha == 246529) {
					bal.saldo(saldoatual);
				}else if(login == 5 && senha == 811690) {
					bal.saldo(saldoatual);
				}else if(login == 6 && senha == 230922) {
					bal.saldo(saldoatual);
				}	else 
					System.out.println("Senha Incorreta.");			
			}else {
				System.out.println("Opção inválida!");
			}
		}while(opc!=0);
		return saldoatual;
	}
}