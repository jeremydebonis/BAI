package com.daveo.bai.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daveo.bai.model.Idee;

@Repository
public class IdeeDaoImpl implements IdeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void ajouterIdee(Idee idee) {
		getCurrentSession().save(idee);

	}

	@Override
	public void mettreAJourIdee(Idee idee) {
		getCurrentSession().update(idee);

	}

	@Override
	public Idee selectionnerIdee(Idee idee) throws Exception {
		if (idee.getIdIdee() != null) {
			return (Idee) getCurrentSession().get(Idee.class, idee.getIdIdee());
		}
		throw new Exception("L'identifiant de l'objet idee n'existe pas");
	}

	@Override
	public void trouverIdee(Integer idIdee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerIdee(Integer idIdee) {
		getCurrentSession().delete(idIdee);

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Idee> selectionnerIdees() {
		return getCurrentSession().createQuery("from Idee").list();
		
	}

}
