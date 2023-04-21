package spring_WP_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_WP_model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, String> {
	
}
