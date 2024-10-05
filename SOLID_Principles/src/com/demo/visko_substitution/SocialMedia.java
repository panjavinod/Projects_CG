package com.demo.visko_substitution;

public abstract class SocialMedia {
	// This principle states that “Derived or child classes must be substitutable 
	// for their base or parent classes”
    public abstract  void chatWithFriend();
    
    public abstract void publishPost(Object post);
    
    public abstract  void sendPhotosAndVideos();
    
    public abstract  void groupVideoCall(String... users);
}
