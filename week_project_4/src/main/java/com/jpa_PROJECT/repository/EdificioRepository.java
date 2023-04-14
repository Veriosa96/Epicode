package com.jpa_PROJECT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa_RPOJECT.entities.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
	Edificio findByNome(String name);
}
