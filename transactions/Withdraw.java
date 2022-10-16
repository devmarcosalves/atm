package transactions;
import java.util.Scanner;
import static program.Machine.nota2; import static program.Machine.nota10;
import static program.Machine.nota20; import static program.Machine.nota50;
import program.Confirmation;

public class Withdraw {
	public double valorsaque;
	public double saque(double x) {
		if(x==0) {
			System.out.println("Você não possui saldo na conta!");
			return x;
		}
		int cont50=0, cont20=0, cont10=0, cont2=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quanto deseja sacar: ");
		valorsaque = sc.nextInt();
		Confirmation con = new Confirmation();
		if(con.authorization()==1) {
		if(valorsaque > x) {
			System.out.println("Saldo Insuficiente! Você tem R$" + x);
			return x;
		}
		if(valorsaque > (nota50 * 50) + (nota20 * 20) + (nota10 * 10) + (nota2 * 2)) {
			System.out.println("Desculpa, não temos notas suficiente para esse valor.");
			return x;
		}
		if(valorsaque < 0) {
			System.out.println("Não é possível sacar valor negativo.");
			return x;
		}
		x = x - valorsaque;
		do {
			if(valorsaque>=50 && nota50>0) {
				valorsaque-=50;
				nota50--; 
				cont50++;
			}else if (valorsaque>=20 && nota20>0) {
				valorsaque-=20;
				nota20--;
				cont20++;
			}else if(valorsaque>=10 && nota10>0) {
				valorsaque=valorsaque-10;
				nota10--;
				cont10++;
			}else if (valorsaque>=2 && nota2>0) {
				valorsaque=valorsaque-2;
				nota2--;
				cont2++;
			}else if(valorsaque==1) {
				System.out.println("Não é possível sacar 1 real, iremos repor ao saldo na conta.");
				 x = x + 1;
				break;
			}
		}while(valorsaque>0);
		if(cont50>0) {
			System.out.println(cont50+" nota(s) de R$50,00");
		}
		if(cont20>0) {
			System.out.println(cont20+" nota(s) de R$20,00");
		}
		if(cont10>0) {
			System.out.println(cont10+" nota(s) de R$10,00");
		}
		if(cont2>0) {
			System.out.println(cont2+" nota(s) de R$2,00");
		}
		}else
			System.out.println("Senha Incorreta");
     	return x;
	}
}