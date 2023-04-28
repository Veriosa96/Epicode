package com.jdbc_PROJECT_DesignPattern_observer;

public interface SensorObserver {
	void update(int msokeLevel);

	void add(SensorObserver observer);

	void remove(SensorObserver observer);
}
