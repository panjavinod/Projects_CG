package com.demo.single_responsibility;

public class BankService {
	
	//This principle states that “a class should have only one reason to change” 
	//which means every class should have a single responsibility or single job or single purpose
	public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }

}
