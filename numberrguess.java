import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		int r=1;
		while(r==1)
		{
			System.out.println("Enter the mode 1.for Easy mode (25 chances) 2.for Hard mode(10 chances)");
			int mode=scan.nextInt();
			
			int randno=rand.nextInt(100);
			int high=randno+10;
			int low=randno-10;
			
			if(mode==1)
		{
			 findrandno(high,low,25,randno,scan);
		}
		else if(mode==2)
		{
			findrandno(high,low,10,randno,scan);
		}
		else
		{
			System.out.println("Invalid mode......");
           }
          System.out.println("Do you want to continue if yes press 1 otherwise 0....");
          r=scan.nextInt();
		}
		scan.close();
	}
	static void  findrandno(int h,int l,int chance,int randnum,Scanner scan)
	{
		System.out.println("Enter the number that you are guessing.....");
		int num=scan.nextInt();
		while(chance>0)
		{
			
		if(num==randnum)
		  {
		  	 System.out.println("Super!!..Your guess is correct.......");
		  	 break;
		  }
		  if(num<l)
		  {
		  	 
		    System.out.println("It is too low.....");
		  }
		  else if(num>h)
		  {
		  	System.out.println("It is too high....");
		  }
		  else if(num<randnum)
		  {
		  System.out.println("It is low...");
		  }
		  else
		  {
		  	System.out.println("it is high.....");
		  }
		  chance--;
		  System.out.println("Remainig chances :   "+chance);
		  if(chance==0)
		  {
		  	System.out.println("Your chances id lost...try again...");
		  	break;
		  }
		  System.out.println("Enter the number that you are guessing.....");
		  num=scan.nextInt();
		}
	}
}
