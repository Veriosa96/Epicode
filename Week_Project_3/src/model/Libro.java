package model;
import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="libro")
public class Libro implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codice_isbn")
	private long idLibro;
	@Column(nullable=false)
	private String titolo;
	@Column(nullable = false)
	private String autore;
	@Column(nullable = false)
	private String genere;
	@Column(nullable=false)
	private String anno_pubblicazione;
	@Column(nullable=false, unique = true)
	private int numero_pagine;
	
	
	
	public long getId() {
		return idLibro;
	}
	public void setId(long idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getanno_pubblicazione() {
		return anno_pubblicazione;
	}
	public void setLastname(String anno_pubblicazione) {
		this.anno_pubblicazione = anno_pubblicazione;
	}
	public int getnumero_pagine() {
		return numero_pagine;
	}
	public void setEmail(int numero_pagine) {
		this.numero_pagine = numero_pagine;
	}
	
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	@Override
	public String toString() {
		return "Libro [id=" + idLibro + ", titolo=" + titolo + ", Autore=" + autore + ", Genere=" + genere
				+ ", anno_pubblicazione=" + anno_pubblicazione + ", numero_pagine=" + numero_pagine + "]";
	}
	
	
	
}