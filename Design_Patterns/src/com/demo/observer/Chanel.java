package com.demo.observer;

import java.util.ArrayList;
import java.util.List;

public class Chanel {
 private List<Subscriber> subs=new ArrayList<Subscriber>();
 String title;
   public void subscriber(Subscriber sub) {
	      subs.add(sub); 
      }
   public void unSubscriber(Subscriber sub) {
	     subs.remove(sub); 
      }
   public void notifySubscribers() {
	   for(Subscriber sub:subs) {
		   sub.update();
	   }
   }
   public void upload(String title)
   {
		   this.title=title;
		   notifySubscribers();
	   }
}
