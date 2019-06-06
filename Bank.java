import java.util.*;
class Account
{
 int accno=0;
 double balance=0.0,rate=4.5;
 public void setaccno(int i)
 {
  accno=i;
 }
 public void getaccno()
 {
  System.out.println("Your account number is:"+accno);
 }
 public void deposit(double amount)
 { 
  balance += amount;
 }
 public double getbalance()
 {
  return balance;
 }
 public void tbal()
 {
  System.out.println("your balance is: Rs"+balance);
 }
 public void withdraw(double amount)
 {
  if(balance>=amount)
  {
   balance-=amount;
  }
  else
  {
  System.out.println("you have insufficient balance");
  }
 }
}
class Bank
{
 public static void main(String args[])
 {
  Account acc=new Account();
  Scanner in = new Scanner(System.in);
  int userchoice;
  boolean quit=false;
  do
  {
   System.out.println("\t\t1. To create new account number\n");
   System.out.println("\t\t2.deposite money\n");
   System.out.println("\t\t3.withdraw money");
   System.out.println("\t\t4.check balance");
   System.out.println("\t\t 0. to quit");
   System.out.println("\t\t enter your choice:");
   userchoice= in.nextInt();
   switch(userchoice)
   {
    case 0:
    quit = true;
    break;
    case 1:
    int no;
    System.out.println("\n enter your account number:");
    no=in.nextInt();
    acc.setaccno(no);
    System.out.println("\t\t account has been created:");
    break;
    case 2:
    double amt;
    System.out.println("please enter amount to be deposited:");
    amt=in.nextDouble();
    if(amt<=0)
    {
     System.out.println("cant deposite non positive number");
    }
    else
    {
    acc.deposit(amt);
    System.out.println("Rs"+amt+"has been deposited");
    }
   break;
   case 3:
   System.out.println("please enter amount tobe with drawn:");
   amt=in.nextDouble();
  if(amt<=0||amt>acc.getbalance())
  {
   System.out.println("withdraw cant be completed because of low balance");
   acc.getbalance();
   }
  else
  {
  acc.withdraw(amt);
  System.out.println("Rs"+amt+"has been with drawn");
  }
 break;
 case 4:
 System.out.println("\n\t\tcustomer details");
 acc.getaccno();
 acc.tbal();
 break;
 default:
 System.out.println("wrong choice");
 break;
}
System.out.println();
}while(!quit);
System.out.println("\n\t\t\t Good Bye!");
 }
}