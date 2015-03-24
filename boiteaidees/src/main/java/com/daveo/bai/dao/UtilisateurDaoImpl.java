package com.daveo.bai.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daveo.bai.model.Utilisateur;

@Repository
public class UtilisateurDaoImpl implements UtilisateurDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void ajouterUtilisateur(Utilisateur utilisateur) {
		getCurrentSession().save(utilisateur);

	}

	@Override
	public void mettreAJourUtilisateur(Utilisateur utilisateur) {
		getCurrentSession().update(utilisateur);

	}

	@Override
	public Utilisateur selectionnerUtilisateur(Utilisateur utilisateur) throws Exception {
		// TODO ajouter exception
		if (utilisateur.getId() != null) {
			return (Utilisateur) getCurrentSession().get(Utilisateur.class, utilisateur.getId());
		}
		throw new Exception ("L'id de l'utilisateur recherché est vide");

	}

	@Override
	public Utilisateur trouverUtilisateur(Integer idUtilisateur) {
		// TODO ajouter exception
		return (Utilisateur) getCurrentSession().get(Utilisateur.class, idUtilisateur);

	}

	@Override
	public void supprimerUtilisateur(Integer idUtilisateur) {
		getCurrentSession().delete(idUtilisateur);

	}

}
