package com.daveo.bai.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * La Classe Utilisateur.
 */
@Entity
@Table(name = "user")
public class Utilisateur implements Serializable {

	/**
	 * Le numero de serie
	 */
	private static final long serialVersionUID = 5989139091239033978L;

	/** Le id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_USER")
	private Integer id;

	/** La date creation. */

	@Column(name = "DATE_CREA")
	private Date dateCreation;

	/** Le g mail account. */

	@Column(name = "GMAIL_ACCOUNT")
	private String gMailAccount;

	/** Le pseudo. */

	@Column(name = "PSEUDO")
	private String pseudo;

	/** Le avatar. */

	@Column(name = "AVATAR")
	private String avatar;

	/** Le date derniere connexion. */

	@Column(name = "DERNIER_CO")
	private Date dateDerniereConnexion;

	/**
	 * Retourne id.
	 *
	 * @return the id
	 */
	@GenericGenerator(name = "generator", strategy = "foreign", 
			parameters = @Parameter(name = "property", value = "vote"))
	public Integer getId() {
		return id;
	}

	/**
	 * Modifie id.
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Retourne date creation.
	 *
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Modifie date creation.
	 *
	 * @param dateCreation
	 *            the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * Retourne g mail account.
	 *
	 * @return the gMailAccount
	 */
	public String getgMailAccount() {
		return gMailAccount;
	}

	/**
	 * Modifie g mail account.
	 *
	 * @param gMailAccount
	 *            the gMailAccount to set
	 */
	public void setgMailAccount(String gMailAccount) {
		this.gMailAccount = gMailAccount;
	}

	/**
	 * Retourne pseudo.
	 *
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * Modifie pseudo.
	 *
	 * @param pseudo
	 *            the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * Retourne avatar.
	 *
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * Modifie avatar.
	 *
	 * @param avatar
	 *            the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * Retourne date derniere connexion.
	 *
	 * @return the dateDerniereConnexion
	 */
	public Date getDateDerniereConnexion() {
		return dateDerniereConnexion;
	}

	/**
	 * Modifie date derniere connexion.
	 *
	 * @param dateDerniereConnexion
	 *            the dateDerniereConnexion to set
	 */
	public void setDateDerniereConnexion(Date dateDerniereConnexion) {
		this.dateDerniereConnexion = dateDerniereConnexion;
	}
}
