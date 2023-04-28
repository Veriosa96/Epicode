package com.jdbc_PROJECT_designPattern_proxy;

public class ControlCenterProxy implements AlarmNotifier {
	private ControlCenter controlCenter;
	
	
	public ControlCenterProxy(String url) {
		this.controlCenter= new ControlCenter(url);
	}
	
	public void setUrl(String url) {
		this.controlCenter = new ControlCenter(url);
	}

	@Override
	public void sendAlarm(String idSonda, double latitude, double longitude, int smokeLevel) {
		controlCenter.sendAlarm(idSonda, latitude, longitude, smokeLevel);
		
	}
}
