package com.liam.designpattern.behavioral.chain.exactChain;

public class HR extends ExactHandler {

	@Override
	public boolean handleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getDay() > 1 && leaveRequest.getDay() <= 2){
			System.out.println("HR handle...");
			return true;
		}
		return this.handler.handleRequest(leaveRequest);
	}

}
