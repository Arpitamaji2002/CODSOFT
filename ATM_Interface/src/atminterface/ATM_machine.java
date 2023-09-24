package atminterface;
import java.util.*;

class ATM_machine
{
	private double Balance;
	
	public ATM_machine(double initial_Bal)
	{
		this.Balance=initial_Bal;
	}
	
	public double Get_Bal()
	{
		return Balance;
	}
	
	public void Deposite_Amt(double amn)
	{
		if(amn>0)
		{
			Balance=Balance+amn;
			System.out.println();
			System.out.println("   Rs. "+amn+" is Successfully deposited...");
			System.out.println("   Your Bank Balance is : Rs. "+Balance);
		}
		else
		{
			System.out.println("   Please enter a valid account");
		}
	}
	
	public void Withdrawl(double amn)
	{
		if(amn>0 && amn<Balance)
		{
			Balance=Balance-amn;
			System.out.println();
			System.out.println("   Transection Successfully!!");
			System.out.println("   Your Bank Balance is : Rs. "+Balance);
		}
		else if(amn<0)
		{
			System.out.println();
			System.out.println("   Please enter a valid account");
		}
		else
		{
			System.out.println();
			System.out.println("   You have not Suffiient amount!!!");
			System.out.println("   Please enter valid amount");
			System.out.println("   your A/C Balance is: Rs. "+Balance);
		}
}




public class ATM 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("");
        System.out.println("  |                   ATM MACHINE                  |");
        System.out.println("");
		double initial_Bal=100000;
		ATM_machine am=new ATM_machine(initial_Bal);
		double amn;
		do
		{
			System.out.println();
			System.out.println("			WELCOME");
			System.out.println("");
			System.out.println("	 -:Please Select Any One Option:-");
			System.out.println("");
			System.out.println("   1 : Check Balance ");
			System.out.println("   2 : Diposite");
			System.out.println("   3 : Withdraw");
			System.out.println("   4 : Exit");
			System.out.print("   Please Enter Choice Which You Want to Do :");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("   Your Current balance is-> "+am.Get_Bal());
					break;
					
				case 2:	System.out.print("   Please Enter amount to Deposite: ");
						amn=sc.nextDouble();
						am.Deposite_Amt(amn);
						break;
					   
				case 3:	System.out.print("   Please Enter amount to Withdraw: ");
						amn=sc.nextDouble();
						am.Withdrawl(amn);
						break;
					   
				case 4:	
						System.out.println();
						System.out.println("                   THANK YOU FOR VISIT!                   ");
						System.exit(0);
						break;
				       
				case 5:System.out.println("   Invalid Choice!");
					   
			}
			
		}while(true);
	}
  }
}