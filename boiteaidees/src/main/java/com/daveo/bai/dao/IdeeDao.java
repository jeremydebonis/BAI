package com.daveo.bai.dao;

import java.util.List;

import com.daveo.bai.model.Idee;

/**
 * le Interface IdeeDao.
 */
public interface IdeeDao {

	/**
	 * Ajouter idee.
	 *
	 * @param idee l'idee
	 */
	public void ajouterIdee(Idee idee);
	
	/**
	 * Mettre a jour idee.
	 *
	 * @param idee l'idee
	 */
	public void mettreAJourIdee(Idee idee);
	
	/**
	 * Selectionner idee.
	 *
	 * @param idee l'idee
	 * @return 
	 * @throws Exception 
	 */
	public Idee selectionnerIdee(Idee idee) throws Exception;
	
	/**
	 * Selectionner toutes les idees.
	 * @return 
	 *
	 */
	public List<Idee> selectionnerIdees();
	
	/**
	 * Trouver idee.
	 *
	 * @param idIdee l'id idee
	 */
	public void trouverIdee(Integer idIdee);
	
	/**
	 * Supprimer idee.
	 *
	 * @param idIdee l'id idee
	 */
	public void supprimerIdee(Integer idIdee);
}
