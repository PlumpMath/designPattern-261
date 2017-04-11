package com.liam.designpattern.behavioral.chain.exactChain;

public class Manager extends ExactHandler {

	@Override
	public boolean handleRequest(LeaveRequest leaveRequest) {

		if("正当理由".equals(leaveRequest.getReason())){
			System.out.println("Manager handle...");
			return true;
		}
		return false;
	}

}
