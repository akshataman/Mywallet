package com.cg.pl;
import com.cg.bean.*;
public class MyWallet {
	
	 public static void main(String[] args) {
		 Account ob=new Account(100,1111111,"King",10000.00);
		 System.out.println(ob);
		 double b1=ob.withdraw(2000.00);
		 System.out.println(b1);
		 
		 SavingAccount ob1=new SavingAccount(101,2222222,"Raja",25000.00);
		 ob1.setInterest();
		 System.out.println(ob1);
		 b1=ob1.withdraw(24500.00);
		 System.out.println(b1);
	 }

}
