package it.uniroma3.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import it.uniroma3.model.Opera;

@Stateless
public class OperaService {

	@PersistenceContext(unitName = "progetto-unit")
	private EntityManager em;

	public Opera createOpera(Opera opera) {
		em.persist(opera);
		return opera;
		
	}

	public List<Opera> getAllOpere() {
		CriteriaQuery<Opera> cq = em.getCriteriaBuilder().createQuery(Opera.class);
		cq.select(cq.from(Opera.class));
		List<Opera> opere = em.createQuery(cq).getResultList();
		return opere;

	}

	
	public Opera getOneOpera(long id) {
		Opera opera = em.find(Opera.class, id);
		return opera;
	}

	
	public Opera getOneOpera(String nome){
			Query query=em.createQuery("SELECT o FROM Opera o WHERE o.nome = :c", Opera.class);
			query.setParameter("c", nome);
			return (Opera) query.getSingleResult();
		}
	
	
	public void deleteOneOpera(Opera opera){
		
	}
	
	public void deleteAll(){
		
	}


}
