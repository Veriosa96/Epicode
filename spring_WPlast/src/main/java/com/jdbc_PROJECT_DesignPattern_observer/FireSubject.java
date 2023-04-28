package com.jdbc_PROJECT_DesignPattern_observer;

public interface FireSubject {
	void register(FireObserver observer);
	void unregister(FireObserver observer);
	void notifyObservers();
}
