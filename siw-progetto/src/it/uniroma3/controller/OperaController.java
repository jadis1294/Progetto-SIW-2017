package it.uniroma3.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;


import it.uniroma3.model.Autore;

import it.uniroma3.model.Opera;
import it.uniroma3.service.OperaService;

@ManagedBean
public class OperaController {


	@ManagedProperty(value="#{param.id}")
	private Long id;

	private String titolo;
	private Integer annoCreazione;
	private String tecnica;
	private Integer altezza;
	private Integer lunghezza;

	private Opera opera;
	private Autore autore;

	private List<Opera> opere;

	@EJB
	private OperaService operaService;

	
	public String createOpera(){
		Opera o = new Opera(titolo,annoCreazione,tecnica,altezza,lunghezza);
				this.opera = operaService.createOpera(o);
		return "opera"; 
	}
	
	public String listaOpere(){
		this.opere= operaService.getAllOpere();
		return "opere";
	}
	
	public String findOpera(Long id){
		this.opera = operaService.getOneOpera(id);
		return "opera";
	}
	
	
	
	
	//getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getAnnoCreazione() {
		return annoCreazione;
	}

	public void setAnnoCreazione(Integer annoCreazione) {
		this.annoCreazione = annoCreazione;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public Integer getAltezza() {
		return altezza;
	}

	public void setAltezza(Integer altezza) {
		this.altezza = altezza;
	}

	public Integer getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(Integer lunghezza) {
		this.lunghezza = lunghezza;
	}

	public Opera getOpera() {
		return opera;
	}

	public void setOpera(Opera opera) {
		this.opera = opera;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public List<Opera> getOpere() {
		return opere;
	}

	public void setOpere(List<Opera> opere) {
		this.opere = opere;
	}

	public OperaService getOperaService() {
		return operaService;
	}

	public void setOperaService(OperaService operaService) {
		this.operaService = operaService;
	}
	
	
}

