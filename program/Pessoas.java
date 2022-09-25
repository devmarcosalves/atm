package program;
public class Pessoas {
	public double saldo2=0;
	public double saldo3=0;
	public double saldo4=0;
	public double saldo5=0;
	public double saldo6=0;
	Menu objMenu = new Menu();
	public void user2(){
		objMenu.opcoes(saldo2);
	}
	public void user3(){
			objMenu.opcoes(saldo3);
		}
	public void user4(){
		objMenu.opcoes(saldo4);
	}
	public void user5(){
		objMenu.opcoes(saldo5);
	}
	public void user6(){
		objMenu.opcoes(saldo6);
	}
}