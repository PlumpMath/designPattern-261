package com.liam.learn.chain;

//有点像递归； 自己包含自己，操作完后，拿到自己再操作，然后重复递归；重点代码应该在于operation()里面，逻辑上要写明什么时候调用下个operation，什么时候就主动停止调用。
//这个类只是阐述下意思，真正要用的话，是要集继承abstract类的，请看exactChain
public class Handler {
	
	private Handler handler;

	private String name;
	
	public Handler(String name){
		this.name = name;
	}
	
	public void operation(){
		System.out.println(name +" chain deail...");
		
		if(getHandler() != null){
			getHandler().operation();
		}
		
	}
	
	
	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	
}
