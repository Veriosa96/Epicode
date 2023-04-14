package com.jpa_RPOJECT.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String username;
	
	private String nomeCompleto;
	
	@Column(unique = true)
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Utente(Long id, String username, String nomeCompleto, String email) {
		super();
		this.id = id;
		this.username = username;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
	}
	
	
}
