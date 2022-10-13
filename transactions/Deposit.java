package transactions;
import java.util.Scanner;
import program.Confirmation;
public class Deposit {
	public double depuser;
	public double deposito(double x) {
		Confirmation con= new Confirmation();
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quanto deseja depositar: ");
		depuser = sc.nextInt();
		if(con.authorization() == 1) {
			x = x + depuser;
			System.out.println("Depósito realizado com sucesso.");
		}else {
			System.out.println("Senha Incorreta.");
	}
		return x;
	} 
		
}