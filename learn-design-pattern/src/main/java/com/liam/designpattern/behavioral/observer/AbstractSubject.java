package com.liam.learn.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements ISubject {

	private List<IObserver> observers = new ArrayList<IObserver>();
	
	@Override
	public void add(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void del(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(IObserver o : observers){
			o.update();
		}
	}

	//没有实现operation方法；目的是放到子类去具体实现
}
