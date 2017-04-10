package com.liam.learn.chain.exactChain;

//要来处理请假请求的人都要继承这个抽象类
public abstract class ExactHandler {
	protected ExactHandler handler;
	
	public abstract boolean handleRequest(LeaveRequest leaveRequest);
	
	public ExactHandler getHandler() {
		return handler;
	}

	public void setHandler(ExactHandler handler) {
		this.handler = handler;
	}

	public ExactHandler() {
	}
}
