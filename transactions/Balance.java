package transactions;
import program.Confirmation;
public class Balance {
	public void saldo(double x) {
		Confirmation con = new Confirmation();
       if(con.authorization() == 1) {
		System.out.println("Você tem R$" + x);
	} else 
		System.out.println("Senha Incorreta");
	}
}