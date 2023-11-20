package com;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args)
	{
		System.out.println("Welcome to AXIS bank");
		System.out.println("---------");
		Scanner scan=new Scanner(System.in);

		Bank bank=new BankService(5000);

		while(true)
		{
			System.out.println("1.Deposit amount\n2.Withdraw\n3.checkBalance:");
			System.out.println("4.EXIT\nEnter the choice");
			int choice=scan.nextInt();


			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount to be deposited");
				int amountToDeposit=scan.nextInt();
				bank.deposit(amountToDeposit);  //bank.deposit(scan.nextInt());
				break;

			case 2:
				System.out.println("Enter the amount to be withdrawn");

				int amountToWithdraw=scan.nextInt();
				
				try {
					bank.withdraw(amountToWithdraw);//bank.deposit(scan.nextInt());
				}catch(InsufficientBalanceException e) {
					System.out.println(e.getMessage());
				}
				
				break;

			case 3:
				System.out.println("Available Balance: Rs."+bank.checkBalance());
				break;

			case 4:
				System.out.println("Thank you,Visit again");
				System.exit(0);

			default:
				System.out.println("invalid choice");
			}
			System.out.println("---------------");

		}
	}
}
