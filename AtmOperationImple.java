package atmProject;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImple implements AtmOperationInterf{
	ATM atm=new ATM();
	 Map<Double,String> ministmt=new HashMap<>();
	public void viewBalance() {
	   System.out.println("Available Balance is: "+atm.getBalance());
	}
	   public void withdrawAmount(double withdrawAmount) {
		   if(withdrawAmount<=atm.getBalance()) {
			    ministmt.put(withdrawAmount , "Amount Withdrawn");
			   System.out.println("collect the cash"+withdrawAmount);
				  atm.setBalance(atm.getBalance()-withdrawAmount);
				  viewBalance();
		   }

		   else {
			   System.out.println("Insufficient Balance!!!");
		   }	 
}
	   public void depositAmount(double depositAmount) {
		   ministmt.put(depositAmount , "Amount Deposited");
		   System.out.println(depositAmount+"Deposited Succeessfully!!");
		   atm.setBalance(atm.getBalance()+depositAmount);
		   viewBalance();
		   
		}
	   @Override
	  public void viewMiniStatement() {
		  for(Map.Entry<Double,String> m:ministmt.entrySet()) {
			 System.out.println(m.getKey()+""+m.getValue()); 
		  }
} 
}
