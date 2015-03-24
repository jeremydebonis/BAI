package com.daveo.bai.service;

import java.util.List;

import com.daveo.bai.model.Idee;

public interface IdeeService {
	/**
	 * Ajouter idee.
	 *
	 * @param idee le idee
	 */
	public void ajouterIdee(Idee idee);
	
	/**
	 * Mettre a jour idee.
	 *
	 * @param idee le idee
	 */
	public void mettreAJourIdee(Idee idee);
	
	/**
	 * Selectionner idee.
	 *
	 * @param idee le idee
	 * @throws Exception 
	 */
	public void selectionnerIdee(Idee idee) throws Exception;
	
	/**
	 * Selectionner toutes les idees.
	 * @return 
	 *
	 */
	public List<Idee> selectionnerIdees();

	/**
	 * Trouver idee.
	 *
	 * @param idIdee le id idee
	 */
	public void trouverIdee(Integer idIdee);
	
	/**
	 * Supprimer idee.
	 *
	 * @param idIdee le id idee
	 */
	public void supprimerIdee(Integer idIdee);

}
