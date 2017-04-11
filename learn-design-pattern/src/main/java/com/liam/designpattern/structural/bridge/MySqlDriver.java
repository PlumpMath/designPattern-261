package com.liam.designpattern.structural.bridge;

public class MySqlDriver implements Driver {

	@Override
	public String getConnection() {
		return "MySql Connection";
	}

}
