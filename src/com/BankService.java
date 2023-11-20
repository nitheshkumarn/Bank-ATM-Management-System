package com;

public class BankService implements Bank {
	private int balance;

	BankService(int balance)
	{
		this.balance=balance;
	}
	@Override
	public void deposit(int amount)
	{
		System.out.println("Depositing Rs."+amount);
		balance=balance+amount; //balance += amount;
		System.out.println("amount deposited successfully");
		System.out.println("Available Balance: Rs."+balance);
	}

	@Override
	public void withdraw(int amount) throws InsufficientBalanceException
	{
		if(amount<=balance)
		{
			System.out.println("withdrawing Rs."+amount);
			balance = balance - amount; //balance -= amount;
			System.out.println("amount withdrawn successfully");
			System.out.println("Available Balance: Rs."+balance);

		}
		else if(amount>balance)
		{
			throw new InsufficientBalanceException("insufficient balance!");
		}

	}

	@Override
	public int checkBalance()
	{
		return balance;
	}
}
