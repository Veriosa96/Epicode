package com.jdbc_PROJECT_JUnit;

import java.util.ArrayList;
import java.util.List;
import com.jdbc_PROJECT_DesignPattern_observer.SensorObserver;
import com.jdbc_PROJECT_DesignPattern_observer.SmokeSensor;

public class ControlUnit implements SensorObserver {
	private List<SmokeSensor> sensors = new ArrayList<>();
	
	public void addSensor(SmokeSensor sensor) {
		sensor.add(sensor);
	}

	@Override
	public void update(int smokeLevel) {
		if(smokeLevel > 5) {
			notifyAlarm(smokeLevel);
		}
	}	
	
	public void notifyAlarm(int smokeLevel) {
		//invochiamo l'URL per notificare l'allarme
		String url = "http://host/alarm?idsonda=[idSonda]&lat=[latitude]&lon=[longitude]&smokelevel=" + smokeLevel;
		System.out.println(url);
	}

	@Override
	public void add(SensorObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(SensorObserver observer) {
		// TODO Auto-generated method stub
		
	}
}
