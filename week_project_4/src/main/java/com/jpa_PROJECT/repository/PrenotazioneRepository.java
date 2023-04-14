package com.jpa_PROJECT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jpa_RPOJECT.entities.Date;
import com.jpa_RPOJECT.entities.Postazione;
import com.jpa_RPOJECT.entities.Prenotazione;
import com.jpa_RPOJECT.entities.Utente;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
	Prenotazione findByUtenteAndDataPrenotazione(Utente utente, Date dataPrenotazione);
	Prenotazione findByPostazioneAndDataPrenotazione(Postazione postazione, Date dataPrenotazione);
}
