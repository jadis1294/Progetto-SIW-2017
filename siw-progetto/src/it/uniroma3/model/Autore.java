package it.uniroma3.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Autore {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable=false)
	private String nome;

	private String cognome;

	private String nazionalità;

	@Column(nullable=false)
	private Date dataNascita;

	private Date dataMorte;


	public Autore(){

	}

	public Autore(String nome, String cognome, String nazionalità, Date dataNascita, Date dataMorte) {

		this.nome = nome;
		this.cognome = cognome;
		this.nazionalità = nazionalità;
		this.dataNascita = dataNascita;
		this.dataMorte = dataMorte;
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
	public String getNazionalità() {
		return nazionalità;
	}
	public void setNazionalità(String nazionalità) {
		this.nazionalità = nazionalità;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public Date getDataMorte() {
		return dataMorte;
	}
	public void setDataMorte(Date dataMorte) {
		this.dataMorte = dataMorte;
	}
	public Long getId() {
		return id;
	}
}