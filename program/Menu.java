package program;
import transactions.Balance;
import transactions.Deposit;
import transactions.Withdraw;
import java.util.Scanner;

public class Menu {
	public static int opc=0;
	public double opcoes(double x) {
		Scanner sc = new Scanner(System.in);
		Deposit dep = new Deposit();
		Withdraw saq = new Withdraw();
		Balance bal= new Balance();
		do {
			System.out.println("1- Deposito 2- Saque \n3- Saldo 0-Sair");
			opc=sc.nextInt();
			if(opc==1) {
				System.out.println("Insira o valor do depósito: ");
				dep.depuser = sc.nextDouble();
				dep.deposito(x);
			}else if(opc==2) {
				System.out.println("Insira o valor do saque:");
				saq.valorsaque= sc.nextDouble();
				saq.saque(x);
			}else if (opc==3) {
				bal.saldo(x);
			}else if (opc==0) {
				System.out.println("Transação finalizada.");
			}				
		}while(opc!=0);
		return x;
	}
}