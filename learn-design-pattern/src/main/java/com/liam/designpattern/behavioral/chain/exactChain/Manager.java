package com.liam.learn.chain.exactChain;

public class Manager extends ExactHandler {

	@Override
	public boolean handleRequest(LeaveRequest leaveRequest) {
		System.out.println("Manager handle...");
		if("正当理由".equals(leaveRequest.getReason())){
			return true;
		}
		return false;
	}

}
