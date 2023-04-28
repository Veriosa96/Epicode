package com.jdbc_PROJECT_DesignPattern_observer;

public interface SensorSubject {
	void attach(SensorObserver observer);
	void detach(SensorObserver observer);
	void notifyObserver(int smokeLevel);
}
