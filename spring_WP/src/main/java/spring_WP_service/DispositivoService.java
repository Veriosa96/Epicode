package spring_WP_service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_WP_model.Dispositivo;
import spring_WP_repository.DispositivoRepository;

@Service
public class DispositivoService {
	@Autowired
	private DispositivoRepository dispositivoRepository;
	public Dispositivo save(Dispositivo dispositivo) {
		return dispositivoRepository.save(dispositivo);
	}
	
	public void deleteById(Long id) {
		dispositivoRepository.deleteById(id);
	}
	
	public Optional<Dispositivo> findById (Long id){
		return dispositivoRepository.findById(id);
	}
	
	public List<Dispositivo> findAll(){
		return dispositivoRepository.findAll();
	}
	
}
