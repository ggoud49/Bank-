import java.util.Scanner;
class Bank
{
	double balance=3000;
	String withDraw(double Wamt)
	{
		if(Wamt<=balance)
		{
			balance = balance - Wamt;
			return "withdraw success";
		}
		else
		{
			return "NO funds";
		}	
	}
	String deposit(double dAmt)
	{
		if(dAmt<=0)
		{
			return "Deposit failed - not a valid amount";
		}
		else
		{
			balance =balance + dAmt;
			return  dAmt+" amount deposit success";
		}
	}
	double checkBalance()
	{
		return balance;
	}
	public static void main(String [] args)
	{
		Bank obj =new Bank();
		Scanner sc =new Scanner(System.in);
		boolean b = true;
		System.out.println();
		while(b)
		{
			System.out.println("*WELCOME TO BATCH 221 Bank*");
			System.out.println();
			System.out.println("   enter 1 for withdraw");
			System.out.println("   enter 2 for deposit");
			System.out.println("   enter 3 for checkBal");
			System.out.println("   enter 4 for exit");
			System.out.println();
			System.out.println("");
			int n = sc.nextInt();
			switch(n)
			{
				case 1 : 	System.out.println("enter amount to withdraw");
						System.out.println(obj.withDraw(sc.nextDouble()));
						System.out.println();
				break;
				case 2 :    	System.out.println("enter amount to deposit");
						System.out.println(obj.deposit(sc.nextDouble()));
						System.out.println();
				break;
				case 3 :	System.out.println("your current balance is  : "+obj.checkBalance());
				break;
				case 4 :	System.out.println("*Thank you*");
						System.out.println();
						b = false; 
				break;
				default :	System.out.println("**invalid option select the correct option accorrding to the given list ************");
						System.out.println();
			}
		}
	}

}
