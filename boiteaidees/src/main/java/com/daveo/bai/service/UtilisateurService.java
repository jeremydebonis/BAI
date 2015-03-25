package com.daveo.bai.service;

import java.util.List;

import com.daveo.bai.model.Utilisateur;

public interface UtilisateurService {

	/**
	 * Ajouter Utilisateur.
	 *
	 * @param Utilisateur
	 *            l'Utilisateur
	 */
	public void ajouterUtilisateur(Utilisateur utilisateur);

	/**
	 * Mettre a jour Utilisateur.
	 *
	 * @param Utilisateur
	 *            l'Utilisateur
	 */
	public void mettreAJourUtilisateur(Utilisateur utilisateur);

	/**
	 * Selectionner Utilisateur.
	 *
	 * @param Utilisateur
	 *            l'Utilisateur
	 * @throws Exception 
	 */
	public void selectionnerUtilisateur(Utilisateur utilisateur) throws Exception;

	/**
	 * Trouver Utilisateur.
	 *
	 * @param idUtilisateur
	 *            l'id Utilisateur
	 */
	public void trouverUtilisateur(Integer idUtilisateur);

	/**
	 * Supprimer Utilisateur.
	 *
	 * @param idUtilisateur
	 *            l'id Utilisateur
	 */
	public void supprimerUtilisateur(Integer idUtilisateur);

	/**
	 * Selectionner l'ensemble des Utilisateurs.
	 *
	 * @return List<Utilisateur>
	 */
	public List<Utilisateur> selectionnerUtilisateurs() ;

}
