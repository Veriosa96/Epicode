package model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name ="prestito")
public class Prestito implements Serializable {
	@Id
	@Column(name = "elemento prestato")
	private String elementoPrestato;
	@Column(name ="data inizio prestito")
	private String dataInizioPrestito;
	@Column(name = "data restituzione prevista")
	private String dataRestituzionePrevista;
	@Column(name = "data restituzione effettiva")
	private String dataRestituzioneEffettiva;
	
	
	
	public String getElementoPrestato() {
		return elementoPrestato;
	}
	public void setElementoPrestato(String elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}
	public String getDataInizioPrestito() {
		return dataInizioPrestito;
	}
	public void setDataInizioPrestito(String dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}
	public String getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}
	public void setDataRestituzionePrevista(String dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}
	public String getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}
	public void setDataRestituzioneEffettiva(String dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}
	@Override
	public String toString() {
		return "Prestito [elementoPrestato=" + elementoPrestato + ", dataInizioPrestito=" + dataInizioPrestito
				+ ", dataRestituzionePrevista=" + dataRestituzionePrevista + ", dataRestituzioneEffettiva="
				+ dataRestituzioneEffettiva + "]";
	}
	
	
}
