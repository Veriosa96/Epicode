package com.jdbc_PROJECT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jdbc_PROJECT_DesignPattern_observer.SmokeSensor;
import com.jdbc_PROJECT_JUnit.ControlUnit;
import com.jdbc_PROJECT_designPattern_factory.RemoteControlFactory;
import com.jdbc_PROJECT_designPattern_proxy.RemoteControl;
import com.jdbc_PROJECT_designPattern_proxy.RemoteControlProxy;

@SpringBootApplication
public class SpringWPlastApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWPlastApplication.class, args);
		//creiamo i sensori di fumo
		SmokeSensor sensor1 = new SmokeSensor();
		SmokeSensor sensor2 = new SmokeSensor();
		SmokeSensor sensor3 = new SmokeSensor();
		
		ControlUnit controlUnit = new ControlUnit();
		controlUnit.addSensor(1);
		controlUnit.addSensor(2);
		controlUnit.addSensor(3);
		
		//creiamo un controllo remoto per i metodi factory
		RemoteControlProxy remoteControl = RemoteControlFactory.createRemoteControl("http://host/alarm");
		
		sensor1.attach(remoteControl);
		sensor2.attach(remoteControl);
		sensor3.attach(remoteControl);
		
		sensor1.setSmokeLevel(3);
	    sensor2.setSmokeLevel(7);
	    sensor3.setSmokeLevel(4);
	}
}
