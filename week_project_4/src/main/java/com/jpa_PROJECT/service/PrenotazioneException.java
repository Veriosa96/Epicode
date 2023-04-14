package com.jpa_PROJECT.service;

public class PrenotazioneException extends RuntimeException{
	public PrenotazioneException(String message) {
		super(message);
	}
	
	public PrenotazioneException(String message, Throwable cause) {
		super(message, cause);
	}
}
