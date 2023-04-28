package com.jdbc_PROJECT_JUnit;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import com.jdbc_PROJECT_DesignPattern_observer.FireSensor;


public class FireSensorTest {
	@Test
	public void testDetectFire() {
		FireSensor fireSensor = new FireSensor();
		fireSensor.detectFire();
		assertTrue(fireSensor.isFireDetected());
	}
}
