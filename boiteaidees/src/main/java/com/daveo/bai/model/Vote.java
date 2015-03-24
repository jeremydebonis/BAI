package com.daveo.bai.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * La Classe Vote.
 */
@Entity
@Table(name = "vote")
public class Vote implements Serializable{

	/**
	 * Le numero de serie
	 */
	private static final long serialVersionUID = -2802369827470317749L;

	/** ID_VOTE. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idVote;

	/** Le id utilisateur. */
	@Column(name = "ID_USER")
	private Utilisateur idUtilisateur;

	/** Le id idee. */
	@Column(name = "ID_IDEE")
	private Idee idIdee;

	/** Le nb vote. */
	@Column(name = "NB_VOTE")
	private Integer nbVote;

	/**
	 * Retourne l'idVote.
	 *
	 * @return the idVote
	 */
	public Integer getIdVote() {
		return idVote;
	}

	/**
	 * Modifie l'id du vote.
	 *
	 * @param idVote
	 *            the idVote to set
	 */
	public void setIdVote(Integer idVote) {
		this.idVote = idVote;
	}

	/**
	 * Retourne id utilisateur.
	 *
	 * @return id utilisateur
	 */
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "vote", cascade = CascadeType.ALL)
	public Utilisateur getIdUtilisateur() {
		return idUtilisateur;
	}

	/**
	 * Modifie id utilisateur.
	 *
	 * @param idUtilisateur
	 *            le nouveau id utilisateur
	 */
	public void setIdUtilisateur(Utilisateur idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	/**
	 * Retourne id idee.
	 *
	 * @return id idee
	 */
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "vote", cascade = CascadeType.ALL)
	public Idee getIdIdee() {
		return idIdee;
	}

	/**
	 * Modifie id idee.
	 *
	 * @param idIdee
	 *            le nouveau id idee
	 */
	public void setIdIdee(Idee idIdee) {
		this.idIdee = idIdee;
	}

	/**
	 * Retourne le nombre de vote.
	 *
	 * @return the nbVote
	 */
	public Integer getNbVote() {
		return nbVote;
	}

	/**
	 * Modifie le nombre de vote.
	 *
	 * @param nbVote
	 *            the nbVote to set
	 */
	public void setNbVote(Integer nbVote) {
		this.nbVote = nbVote;
	}
}
