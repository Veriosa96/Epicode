package com.jdbc_PROJECT_designPattern_proxy;

public class RemoteControlProxy {
	private String url;
	
	public RemoteControlProxy(String url) {
		String requestUrl = url + "?idsonda=[idSonda]&lat=[latitude]&lon=[longitude]&smokelevel=" + url;
		System.out.println(requestUrl);
	}
}
