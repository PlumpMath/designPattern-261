package com.liam.designpattern.behavioral.observer;

public class Observer1 implements IObserver {

	@Override
	public void update() {
		System.out.println("Observer1 has known...");
	}

}
