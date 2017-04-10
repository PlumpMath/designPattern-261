package com.liam.learn.observer;

public class Subject extends AbstractSubject {

	//先做自己的操作，然后再通知Observers
	@Override
	public void operation() {
		//自己的操作
		System.out.println("Subject has done a lot of tasks.....");

		//通知observers
		notifyObservers();
	}

}
