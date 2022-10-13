package program;
import transactions.Balance;
import transactions.Deposit;
import transactions.Withdraw;
import java.util.Scanner;

public class Menu {
	public static int opc=0;
	public double opcoes(double saldoatual) {
		Scanner sc = new Scanner(System.in);
		Deposit dep = new Deposit();
		Withdraw wit = new Withdraw();
		Balance bal= new Balance();
		do {
			System.out.println("\n1- Deposito 2- Saque \n3- Saldo 0- Sair");
			System.out.print("Digite uma opção: ");
			opc=sc.nextInt();
			 switch (opc) {
			 case 0:
					System.out.println("Transação finalizada.\n");
					break;
			 
			 case 1: 
				    saldoatual= dep.deposito(saldoatual);
				    
				    break;
			 case 2: 
				 	saldoatual= wit.saque(saldoatual);
				    break;
			 case 3: 
				    bal.saldo(saldoatual);
				 	break;
			 default:
				 	System.out.println("Opção inválida!");
				 	break;
			}
		}while(opc!=0);
		return saldoatual;
	}
}