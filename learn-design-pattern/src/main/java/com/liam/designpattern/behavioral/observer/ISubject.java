package com.liam.designpattern.behavioral.observer;

public interface ISubject {
	/*增加观察者*/  
	public void add(IObserver observer);
	
	/*删除观察者*/  
	public void del(IObserver observer);
	
	/*通知所有的观察者*/
	public void notifyObservers();
	
	/*自身的操作*/  
	public void operation();
	
}
