package it.uniroma3.service;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import it.uniroma3.model.Utente;


@Stateless
public class UtenteService {

	@PersistenceContext(unitName = "progetto-unit")
	private EntityManager em;

	public Utente convalida(String nickname, String pwd) {
		Query q = em.createQuery("SELECT u FROM Utente u WHERE u.nickname='"+ nickname+ "' AND u.password='"+pwd+"'");
		Utente u = (Utente)q.getSingleResult();
		return u;
	}

	public Utente getUtente(String nickname) {
		Query q = em.createQuery("SELECT u FROM Utente u WHERE u.nickname='"+ nickname + "'");
		Utente u = (Utente)q.getSingleResult();
		return u;
	}



}
