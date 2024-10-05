package com.demo.open_close;

public interface NotificationService {
	// we can't change the class but we can extend it
	//This principle states that “software entities (classes, modules, functions, etc.) 
	//should be open for extension,but closed for modification” 
	//which means you should be able to extend a class behavior, without modifying it.
	public void sendOTP(String medium);
	public void sendTransactionNotification(String medium);
}
