package com.liam.learn.bridge;

public class DB2Driver implements Driver {

	@Override
	public String getConnection() {
		return "DB2 connection";
	}

}
