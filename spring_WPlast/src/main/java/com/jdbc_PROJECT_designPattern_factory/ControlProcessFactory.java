package com.jdbc_PROJECT_designPattern_factory;

public class ControlProcessFactory {
	public static ControlProcess createControlProcess(String type) {
		switch(type) {
		case "A":
			return new ControlProcessA();
		case "B":
			return new ControlProcessB();
		default:
			throw new IllegalArgumentException("Tipo di processo di controllo non valido");
		}
	}
}
