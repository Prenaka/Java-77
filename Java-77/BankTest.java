import java.util.Scanner;

class BankTest 
{
	public static void main(String[] args) 
	{
		Bank bank = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("Which bank [1-SBI | 2-ICICI]: ");
		int opt = sc.nextInt();
		
		if(opt == 1)
			bank = new SBI();
		else if(opt == 2)
			bank = new ICICI();
		else {
			System.out.println("Invalid Bank... Try Again");
			return;
		}
		
		bank.deposit(1000);
		bank.withdraw(1000);
		
		System.out.println("Bank = "+ (bank instanceof Bank));
		System.out.println("SBI = "+ (bank instanceof SBI));
		System.out.println("ICICI = "+ (bank instanceof ICICI));
	}
}
