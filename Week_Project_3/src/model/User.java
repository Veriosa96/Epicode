package model;
import java.io.Serializable;
import javax.persistence.*;


@Entity	
@Table(name = "user")
public class User implements Serializable {
	@Id //tramite questo noi andiamo a decide quale colonna deve avere la chiave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int idUser;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	@Column(name = "data di nascita")
	private String data_nascita;
	@Column(name = "numero di tessera")
	private int numeroTessera;
	
	
	
	public int getId() {
		return idUser;
	}
	public void setId(int idUser) {
		this.idUser = idUser;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getData_nascita() {
		return data_nascita;
	}
	public void setData_nascita(String data_nascita) {
		this.data_nascita = data_nascita;
	}
	public int getNumeroTessera() {
		return numeroTessera;
	}
	public void setNumeroTessera(int numeroTessera) {
		this.numeroTessera = numeroTessera;
	}
	@Override
	public String toString() {
		return "User [id=" + idUser + ", nome=" + nome + ", cognome=" + cognome + ", data_nascita=" + data_nascita
				+ ", numeroTessera=" + numeroTessera + "]";
	}
	
	
}
