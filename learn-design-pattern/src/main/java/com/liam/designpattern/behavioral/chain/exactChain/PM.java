package com.liam.learn.chain.exactChain;


public class PM extends ExactHandler {
	
	@Override
	public boolean handleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getDay() <= 1){
			System.out.println("pm handle...");
			return true;
		}
		return this.handler.handleRequest(leaveRequest);
	}

}
