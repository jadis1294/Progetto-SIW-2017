package it.uniroma3.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Utente {
	
	@Column (nullable = false)
	private String nome;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String nickname;
	@Column (nullable = false)
	private String password;
	@Temporal(TemporalType.DATE)
	private Date DataDiNascita;
	
	private String ruolo;
	
	
	public Utente(){
		
	}
	
	public Utente(String nome, String nickname, String password, Date dataDiNascita,String ruolo) {
		this.nome = nome;
		this.nickname = nickname;
		this.password = password;
		DataDiNascita = dataDiNascita;
		this.ruolo=ruolo;
	}
	
	public Date getDataDiNascita() {
		return DataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		DataDiNascita = dataDiNascita;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNickname() {
		return nickname;
	}
	public String getPassword() {
		return password;
	}
}