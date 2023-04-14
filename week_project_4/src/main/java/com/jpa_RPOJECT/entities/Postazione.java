package com.jpa_RPOJECT.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Postazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@Column(unique = true)
	private String codiceUnivoco;
	
	
	private String descrizione;
	
	
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;
	
	
	private Integer numeroMassimoOccupanti;
	
	
	@ManyToOne
	@JoinColumn(name = "edificio_id")
	private Edificio edificio;
	
	
	public String getCodiceUnivoco() {
		return codiceUnivoco;
	}
	
	
	public void setCodiceUnivoco(String codiceUnivoco) {
		this.codiceUnivoco = codiceUnivoco;
	}
	
	
	public String getDescrizione() {
		return descrizione;
	}
	
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
	public TipoPostazione getTipo() {
		return tipo;
	}
	
	
	public void setTipo(TipoPostazione tipo) {
		this.tipo = tipo;
	}
	
	
	public Integer getNumeroMassimoOccupanti() {
		return numeroMassimoOccupanti;
	}
	
	
	public void setNumeroMassimoOccupanti(Integer numeroMassimoOccupanti) {
		this.numeroMassimoOccupanti = numeroMassimoOccupanti;
	}
	
	
	public Edificio getEdificio() {
		return edificio;
	}
	
	
	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}


	public Postazione(long id, String codiceUnivoco, String descrizione, TipoPostazione tipo,
			Integer numeroMassimoOccupanti, Edificio edificio) {
		super();
		this.id = id;
		this.codiceUnivoco = codiceUnivoco;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numeroMassimoOccupanti = numeroMassimoOccupanti;
		this.edificio = edificio;
	}
	
	private boolean occupata;
	private Utente utente;
	

	//Metodo per verificare se la postazione è occupata
	public boolean getOccupata() {
		return occupata;
	}
	
	public void setOccupata(boolean occupata) {
	this.occupata = occupata;
	}
	
	//getter e setter per l'utente che ha prenotato la postazione
	public Utente getUtente() {
		return utente;
	}
	
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	
	}
