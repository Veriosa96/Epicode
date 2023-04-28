package com.jdbc_PROJECT_designPattern_proxy;

public interface AlarmNotifier {
	void sendAlarm(String idSonda, double latitude, double longitude, int smokeLevel);
}

