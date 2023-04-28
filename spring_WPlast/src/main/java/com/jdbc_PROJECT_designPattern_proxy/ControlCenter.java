package com.jdbc_PROJECT_designPattern_proxy;

public class ControlCenter implements AlarmNotifier {
	private String url;
	
	public ControlCenter(String url) {
		this.url = url;
	}

	@Override
	public void sendAlarm(String idSonda, double latitude, double longitude, int smokeLevel) {
		//qui abbiamo l'invocazione dell'url http://host/alarm?=idsonda=[idSonda]&lat=[latitude]&lon=[longitude]&smokelevel=[smokeLevel]
		
	}
}
