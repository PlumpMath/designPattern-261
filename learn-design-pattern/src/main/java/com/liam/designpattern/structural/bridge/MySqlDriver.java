package com.liam.learn.bridge;

public class MySqlDriver implements Driver {

	@Override
	public String getConnection() {
		return "MySql Connection";
	}

}
