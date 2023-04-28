package com.jdbc_PROJECT_DesignPattern_observer;

public class ControlProcess implements FireObserver {
	private String id;
	private FireSensor fireSensor;
	
	public ControlProcess(String id, FireSensor fireSensor) {
		this.id = id;
		this.fireSensor = fireSensor;
		this.fireSensor.register(this);
	}

	public void handleFireDetection () {
		//logica per la gestione dell'allarme
	}

	@Override
	public void update(FireSubject subject) {
		if (subject == fireSensor) {
			handleFireDetection();
		}
		
	}
	
}
