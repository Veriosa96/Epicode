package com.jpa_PROJECT.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa_RPOJECT.entities.Postazione;
import com.jpa_RPOJECT.entities.TipoPostazione;
import jakarta.persistence.Entity;

@Entity
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
	List<Postazione>findByTipoAndEdificioCitta(TipoPostazione tipo, String city);
	List<Postazione>findByEdificioCitta(String city);
	Postazione findByCodiceUnivoco(String codiceUnivoco);
}
