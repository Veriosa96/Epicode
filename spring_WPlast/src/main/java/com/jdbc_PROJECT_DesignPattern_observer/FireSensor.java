package com.jdbc_PROJECT_DesignPattern_observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FireSensor implements FireSubject {
	private static final int SMOKE_THRESHOLD = 0;
	private List<FireObserver> observers = new ArrayList<>();
	private boolean fireDetected = false;
	
	public void detectFire() {
		//in questo metodo andiamo ad implementare la logica per avere la possibilità di rilevare l'incendio 
		fireDetected = true;
		notifyObservers();
	}
	public boolean isFireDetected() {
	    // check if smoke level exceeds threshold
	    return getSmokeLevel() > SMOKE_THRESHOLD;
	}

	private int getSmokeLevel() {
		return getSmokeLevel();
	}
	@Override
	public void register(FireObserver observer) {
		observers.add(observer);
		
	}

	@Override
	public void unregister(FireObserver observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(FireObserver observer : observers) {
			observer.update(this);
		}
	}
}
