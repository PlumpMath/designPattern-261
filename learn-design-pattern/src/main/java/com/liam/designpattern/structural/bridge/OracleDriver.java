package com.liam.designpattern.structural.bridge;

public class OracleDriver implements Driver {

	@Override
	public String getConnection() {
		return "Oracle Connection";
	}

}
