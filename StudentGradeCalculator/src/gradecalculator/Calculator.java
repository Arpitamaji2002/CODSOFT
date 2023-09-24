package gradecalculator;
import java.util.Scanner;

public class Calculator 
{
		public static void Calculate(int be, int en, int ph, int ch, int ma, int bio)
		{
			System.out.println();
			int total=be+en+ph+ch+ma+bio;
			System.out.println("Student Total Marks : "+total);//Calculate the Total marks

			
			
			float avg=total/6;
			System.out.println("Avg is: "+avg);//calculate Average marks
			
			//Calculate Average-per
			int per=(int) ((avg)/100*100);
			System.out.println("Student Avg percentage is : "+per+"%");
			
			//Grade Calculation
			if(per >= 90)
			{
				System.out.println("Outstanding!!");
				System.out.println("Your Grade: O");
			}
			else if(per < 90 && per >= 80)
			{
				System.out.println("Excellent!!");
				System.out.println("Your Grade: E");
			}
			else if(per < 80 && per >= 70)
			{
				System.out.println("Very Good!");
				System.out.println("Your Grade: A");
			}
			else if(per < 70 && per >= 60)
			{
				System.out.println("Good");
				System.out.println("Your Grade: B");
			}
			else if(per < 60 && per >= 50)
			{
				System.out.println("Fair");
				System.out.println("Your Grade: C");
			}
			else if(per < 50 && per >= 40)
			{
				System.out.println("Below Average");
				System.out.println("Your Grade: D");
			}
			else 
			{
				System.out.println("Failed!");
				System.out.println("Your Grade: F");
			}
		}
		
		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.println();
			System.out.println();
			System.out.print("Enter Student Name: ");
			String Name=s.nextLine();
			
			System.out.print("Enter Student Roll Number: ");
			int roll=s.nextInt();
			
			System.out.print("Enter Student Reg. Number: ");
			int reg=s.nextInt();
			
			System.out.print("Enter Student Class: ");
			String cla=s.next();
			
			System.out.print("Enter Student Section: ");
			String sc=s.next();
			
			System.out.print("Enter the markes of Bengali: ");
			int Beng=s.nextInt();
			
			System.out.print("Enter the markes of English: ");
			int Eng=s.nextInt();
			
			System.out.print("Enter the markes of Physics: ");
			int Phy=s.nextInt();
			
			System.out.print("Enter the markes of Chemistry: ");
			int Chem=s.nextInt();
			
			System.out.print("Enter the markes of Math: ");
			int Math=s.nextInt();
			
			System.out.print("Enter the markes of Biology: ");
			int Bio=s.nextInt();
			System.out.println();
			
			
			//print the all details 
			System.out.println();
			System.out.println();
			System.out.println("Student Name : "+Name);
			System.out.println("Student Roll-Number : "+roll);
			System.out.println("Student Registration Number : "+reg);
			System.out.println("Student Class : "+cla);
			System.out.println("Student Section : "+sc);
			
			
			System.out.println();
			Calculate(Beng,Eng,Phy,Chem,Math,Bio);//To calculate total,average and average percentage
		}

}
