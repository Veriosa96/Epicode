package com.jpa_RPOJECT.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name = "postazione_id")
	private Postazione postazione;
	
	
	@Temporal(TemporalType.DATE)
	private Date dataPrenotazione;


	public Utente getUtente() {
		return utente;
	}


	public void setUtente(Utente utente) {
		this.utente = utente;
	}


	public Postazione getPostazione() {
		return postazione;
	}


	public void setPostazione(Postazione postazione) {
		this.postazione = postazione;
	}


	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}


	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}


	public Prenotazione(Long id, Utente utente, Postazione postazione, Date dataPrenotazione) {
		super();
		this.id = id;
		this.utente = utente;
		this.postazione = postazione;
		this.dataPrenotazione = dataPrenotazione;
	}
	
	
	
}
