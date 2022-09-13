package com.comparable;

import java.util.Arrays;

public class empolyee implements Comparable<empolyee> {
	private final String BANK = "SBI BANK";
	private static String BRANCH = "PALAKONDA";
	private double Accountnumber;
	private String AccountHolder;
	private double AccountBalance;

	static void change() {
		BRANCH = "VISHAKA";
	}

	protected empolyee(double Accountnumber, String accountHolder, double accountBalance) {
		this.Accountnumber = Accountnumber;
		AccountHolder = accountHolder;
		AccountBalance = accountBalance;
	}

	public void diplaydata() {
		
		System.out.println("BRANCH          :" + BRANCH);
		System.out.println("BANK            :" + BANK);
		System.out.println("ACCOUNTNUMBER   :" + Accountnumber);
		System.out.println("ACCOUNTHOLDER   :" + AccountHolder);
		System.out.println("ACCOUNTBALANCE  :" + AccountBalance);
		System.out.println("............COMPARABLE STRING................");
		System.out.println("..........SEQUENCE ORDER SORTING.......");
	}

	public String getAccountHolder() {
		return AccountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}

	

	

	@Override
	public int compareTo(empolyee o) {
		// TODO Auto-generated method stub
		return  (int) (this.Accountnumber-o.Accountnumber);
		
		// Accountnumber -o.Accountnumber means printing serial numbers
		
	
	}

		
	}

	

