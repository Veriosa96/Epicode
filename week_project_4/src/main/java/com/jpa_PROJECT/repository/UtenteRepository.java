package com.jpa_PROJECT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jpa_RPOJECT.entities.Utente;


@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
	Utente findByUsername(String username);
	Utente findByEmail(String email);
	
}
