package com.liam.learn.chain.exactChain;

/**
 * 在公司里，如果你的请假时间小于0.5天，那么只需要向项目经理打声招呼就OK了。

	如果超过了0.5天，但是还小于2天，那么就要去找人事部处理，当然，这就要扣工资了。

	如果超过了2天，你就需要去找总经理了，工资当然也玩完了。
 * 
 *
 */
public class LeaveRequest {
	private int day;
	private String reason;
	
	public LeaveRequest(int day, String reason) {
		super();
		this.day = day;
		this.reason = reason;
	}
	
	
	public LeaveRequest() {
	}


	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
