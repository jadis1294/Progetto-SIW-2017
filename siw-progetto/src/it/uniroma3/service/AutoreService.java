package it.uniroma3.service;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import it.uniroma3.model.Autore;



@Stateless
public class AutoreService {

	@PersistenceContext(unitName = "progetto-unit")
	private EntityManager em;

	public Autore createAutore(Autore autore) {
		em.persist(autore);
		return autore;
		
	}

	public List<Autore> getAllAutori() {
		CriteriaQuery<Autore> cq = em.getCriteriaBuilder().createQuery(Autore.class);
		cq.select(cq.from(Autore.class));
		List<Autore> opere = em.createQuery(cq).getResultList();
		return opere;

	}

	
	public Autore getOneAutore(long id) {
		Autore autore = em.find(Autore.class, id);
		return autore;
	}

	
	public Autore getOneAutore(String nome){
			Query query=em.createQuery("SELECT a FROM Autore a WHERE a.nome = :c", Autore.class);
			query.setParameter("c", nome);
			return (Autore) query.getSingleResult();
		}
	
	
	public void deleteOneAutore(Autore autore){
		
	}
	
	public void deleteAll(){
		
	}


}
