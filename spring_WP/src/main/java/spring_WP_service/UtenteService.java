package spring_WP_service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_WP_model.Utente;
import spring_WP_repository.UtenteRepository;

@Service
public class UtenteService {
	@Autowired
	private UtenteRepository utenteRepository;
	public Utente save(Utente utente) {
		return utenteRepository.save(utente);
	}
	
	public void deleteById(String username) {
		utenteRepository.deleteById(username);
	}
	
	public Optional<Utente> findById (String username){
		return utenteRepository.findById(username);
	}
	
	public List<Utente> findAll (){
		return utenteRepository.findAll();
	}
}
