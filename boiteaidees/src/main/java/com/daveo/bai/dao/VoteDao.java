package com.daveo.bai.dao;

import java.util.List;

import com.daveo.bai.model.Vote;

/**
 * Interface VoteDao.
 */
public interface VoteDao {

	/**
	 * Ajouter Vote.
	 *
	 * @param vote l'Vote
	 */
	public void ajouterVote(Vote vote);
	
	/**
	 * Mettre a jour Vote.
	 *
	 * @param vote l'Vote
	 */
	public void mettreAJourVote(Vote vote);
	
	/**
	 * Selectionner Vote.
	 *
	 * @param vote l'Vote
	 * @return Vote
	 */
	public Vote selectionnerVote(Vote vote);
	
	/**
	 * Selectionner toutes les Votes.
	 * @return 
	 *
	 */
	public List<Vote> selectionnerVotes();
	
	/**
	 * Trouver Vote.
	 *
	 * @param idVote l'id Vote
	 * @return Vote
	 */
	public Vote trouverVote(Integer idVote);
	
	/**
	 * Supprimer Vote.
	 *
	 * @param vote le Vote
	 */
	public void supprimerVote(Vote vote);
	
	/**
	 * Retourner le vote correspondant à une idée
	 * @param idIdee l'id de l'idée
	 * @return le vote
	 */
	public Vote getVoteParIdIdee(Integer idIdee);
}
