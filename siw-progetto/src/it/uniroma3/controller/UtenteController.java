Package it.uniroma3.controller;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import it.uniroma3.model.Utente;
import it.uniroma3.service.UtenteService;


@ManagedBean
@SessionScoped
public class UtenteController {

	private long id;
	private String nome;
	private String nickname;
	private String password;
	private Date dataDiNascita;
	private String ruolo;
	private Utente utente;
	private String errore;


	@EJB
	private UtenteService utenteService;

	public String convalida() {
		try {
			this.utente = utenteService.convalida(nickname,password);
			this.ruolo = utente.getRuolo();
		}
		catch (EJBException e) {
			this.setErrore("Username o password non corretti");
			return "login";
		} 

		if(this.ruolo.equals("admin"))
		{
			this.errore = null;
			return "amministratore";
		}
		else
			if(this.ruolo.equals("user"))
			{
				this.errore = null;
				return "utente";
			}

		return "login";
	}

	public Utente findByNickname() {
		return utenteService.getUtente(nickname);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public String getErrore() {
		return errore;
	}

	public void setErrore(String errore) {
		this.errore = errore;
	}

	public UtenteService getUtenteService() {
		return utenteService;
	}

	public void setUtenteService(UtenteService utenteService) {
		this.utenteService = utenteService;
	}

}