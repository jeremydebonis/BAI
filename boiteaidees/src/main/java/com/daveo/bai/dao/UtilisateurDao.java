package com.daveo.bai.dao;

import java.util.List;

import com.daveo.bai.model.Utilisateur;

public interface UtilisateurDao {
	/**
	 * Ajouter Utilisateur.
	 *
	 * @param Utilisateur le Utilisateur
	 */
	public void ajouterUtilisateur(Utilisateur utilisateur);
	
	/**
	 * Mettre a jour Utilisateur.
	 *
	 * @param Utilisateur le Utilisateur
	 */
	public void mettreAJourUtilisateur(Utilisateur utilisateur);
	
	/**
	 * Selectionner Utilisateur.
	 *
	 * @param Utilisateur le Utilisateur
	 * @return Utilisateur
	 * @throws Exception 
	 */
	public Utilisateur selectionnerUtilisateur(Utilisateur utilisateur) throws Exception;
	
	/**
	 * Trouver Utilisateur.
	 *
	 * @param idUtilisateur le id Utilisateur
	 * @return Utilisateur
	 */
	public Utilisateur trouverUtilisateur(Integer idUtilisateur);
	
	/**
	 * Supprimer Utilisateur.
	 *
	 * @param idUtilisateur le id Utilisateur
	 */
	public void supprimerUtilisateur(Integer idUtilisateur);

	
	/**
	 * Selectionner l'ensemble des Utilisateurs.
	 *
	 * @return List<Utilisateur>
	 */
	public List<Utilisateur> selectionnerUtilisateurs() ;

}
