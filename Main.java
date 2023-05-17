package atmProject;

import java.util.Scanner;

public class Main {
  public static void main(String[]args) {
	  AtmOperationInterf op=new AtmOperationImple();
	  int atmNumber=12345;
	  int atmPin=123;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Welcome To ATM Machine");
	  System.out.println("enter atm number: ");
	  int number=sc.nextInt();
	  System.out.println("enter pin: ");
	  int pin=sc.nextInt();
	  if((atmNumber==number) && (atmPin==pin)){
		  while(true) {
			  System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit");
			  System.out.println("Enter Your Choice: ");
			  int ch=sc.nextInt();
			  if(ch==1) {
				 op.viewBalance(); 
			  }
			  else if(ch==2) {
				  System.out.println("enter amount to withdraw");
		
				  double withdrawAmount=sc.nextDouble();
				  op.withdrawAmount(withdrawAmount);
			  }
			  else if(ch==3) {
				  System.out.println("enter amount to deposit: ");
				  double depositAmount=sc.nextDouble();
				  op.depositAmount(depositAmount);
				  
				  }
			  else if(ch==4) {
				  op.viewMiniStatement();
			  }
			  else if(ch==5) {
				  System.out.println("collect your ATM Card....\nThank you for using ATM Machine!!");
				  System.exit(0);
			  }
			  else {
				  System.out.println("Plaese enter correct choice");
			  }
		  }
//		  System.out.println("Validation Done");
//		  
	  }
	  else {
		  System.out.println("Incorrect Atm Number or Pin");
		  System.exit(0);
	  }
	  }
}
