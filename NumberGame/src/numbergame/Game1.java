package numbergame;
import java.util.*;
public class Game1 
{

	public static void main(String[] args) 
	{
		Random R_number= new Random();
	    int rightGuess=R_number.nextInt(100);
	    int atmp=0;
	    Scanner s=new Scanner(System.in);
	    System.out.println("");
        System.out.println("                  WELCOME_TO_NUMBER_GAME                     ");
        System.out.println("");
	    System.out.println("  Guess a number between 1 to 100 " );
	    System.out.println("  You will have only 10 turns!" );
	    System.out.println("  ALL THE BEST!");
        System.out.println("" );
        System.out.println("  Start...." );
	    
	    int Userguess;
	    int i=0;
	    boolean w=false;
	    while(w==false) 
	    {
	      System.out.print("  User guess: ");
	      Userguess=s.nextInt();
	      atmp++;
	      if(Userguess==rightGuess)
	      {
		     w=true;
		  }
		  else if(i>8)
		  {
		     System.out.println("");
			 System.out.println(" |          SORRY..You loose!! The correct answer was: "+rightGuess+"      |");
			 System.out.println(" |          	          Please Try Again....               |");
			 return;
		  }
		  else if(Userguess<rightGuess)
		  {
		     i++;
		     System.out.println("  Your Guess is too low! Turns left: "+(10-i));
		  }
		  else if(Userguess>rightGuess)
		  {
		     i++;
		     System.out.println("  Your Guess is too high! Turns left: "+(10-i));
		  }
	      
		}
		    System.out.println("");
		    System.out.println("                  Congratulations You win!!!....             ");
		    System.out.println("                   Right Guess number was "+rightGuess+"                           ");
		    System.out.println("            You can guess the correct number on attempt "+atmp+" .          ");
		    System.out.println("                  Your score is: "+((11-atmp)*10)+" out of 100                     ");
		    System.out.println("                         End The Game                         ");
		}
}


