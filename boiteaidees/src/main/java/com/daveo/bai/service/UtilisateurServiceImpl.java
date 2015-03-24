package com.daveo.bai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daveo.bai.dao.UtilisateurDao;
import com.daveo.bai.model.Utilisateur;

@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurDao utilisateurDao;
	
	@Override
	public void ajouterUtilisateur(Utilisateur utilisateur) {
		utilisateurDao.ajouterUtilisateur(utilisateur);

	}

	@Override
	public void mettreAJourUtilisateur(Utilisateur utilisateur) {
		utilisateurDao.mettreAJourUtilisateur(utilisateur);

	}

	@Override
	public void selectionnerUtilisateur(Utilisateur utilisateur) throws Exception {
		utilisateurDao.selectionnerUtilisateur(utilisateur);

	}

	@Override
	public void trouverUtilisateur(Integer idUtilisateur) {
		utilisateurDao.trouverUtilisateur(idUtilisateur);

	}

	@Override
	public void supprimerUtilisateur(Integer idUtilisateur) {
		utilisateurDao.supprimerUtilisateur(idUtilisateur);

	}

}
