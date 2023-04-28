package com.jdbc_PROJECT_DesignPattern_observer;

import java.util.ArrayList;
import java.util.List;

public class SmokeSensor implements SensorSubject {
	private List<SensorObserver> observers = new ArrayList<>();
	private int smokeLevel;
	
	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
		notifyObserver(smokeLevel);
	}

	@Override
	public void attach(SensorObserver observer) {
		observer.add(observer);
		
	}

	@Override
	public void detach(SensorObserver observer) {
		observer.remove(observer);
		
	}

	@Override
	public void notifyObserver(int smokeLevel) {
		for (SensorObserver observer : observers) {
			observer.update(smokeLevel);
		}
		
	}

	public void add(SmokeSensor sensor) {
				
	}
}
