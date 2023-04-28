package com.jdbc_PROJECT_JUnit;

import org.junit.Before;
import org.mockito.Mockito;
import org.junit.Test;
import com.jdbc_PROJECT_DesignPattern_observer.SensorObserver;
import com.jdbc_PROJECT_DesignPattern_observer.SmokeSensor;
import com.jdbc_PROJECT_designPattern_proxy.RemoteControl;

public class SmokeSensorTest {
	private ControlUnit controlUnit;
	private RemoteControl remoteControl;
	
	@Before
	public void setUp() {
		controlUnit = new ControlUnit();
		remoteControl = Mockito.mock(RemoteControl.class);
	}
	
	@Test
	public void testAlarmTriggered() {
		SmokeSensor sensor = new SmokeSensor();
		controlUnit.addSensor(sensor);
		sensor.setSmokeLevel(6);
		Mockito.verify(remoteControl).notifyAlarm(6);
	}
	
	@Test
	public void testAlarmNotTriggered() {
		SmokeSensor sensor = new SmokeSensor();
		controlUnit.addSensor(sensor);
		sensor.setSmokeLevel(4);
		Mockito.verifyZeroInteraction(remoteControl);
	}
}
