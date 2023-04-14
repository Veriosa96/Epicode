package com.jpa_PROJECT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jpa_PROJECT.repository.PostazioneRepository;
import com.jpa_RPOJECT.entities.Postazione;
import com.jpa_RPOJECT.entities.TipoPostazione;
import com.jpa_RPOJECT.entities.Utente;

@Service
public class PrenotazioneService {
	@Autowired
	private PostazioneRepository postazioneRepository;
	
	
	//Metodo per cercare le postazioni disponibili in base al tipo e alla città
	public List<Postazione>cercarePostazioniDisponibili(TipoPostazione tipo, String city) {
		return postazioneRepository.findByTipoAndEdificioCitta(tipo, city);
	}
	
	//Metodo per effettuare una prenotazione di una postazione
	public void effettuarePrenotazione(Postazione postazione, Utente utente) {
		if(postazione.getOccupata()) {
		throw new PrenotazioneException("Postazione già occupata per la data selezionata");	
		}
		postazione.setOccupata(true);
		postazione.setUtente(utente);
		postazioneRepository.save(postazione);
	}
	
	//Metodo per annullare una prenotazione di una postazione
	public void annullarePrenotazione(Postazione postazione) {
		if(!postazione.getOccupata()) {
			throw new PrenotazioneException("La postazione non è stata prenotata");
		}
		postazione.setOccupata(false);
		postazione.setUtente(null);
		postazioneRepository.save(postazione);
	}
}
