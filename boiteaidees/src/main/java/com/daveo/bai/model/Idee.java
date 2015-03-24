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
 * La classe Idee.
 */
@Entity
@Table(name = "idee")
public class Idee implements Serializable {

	/**
	 * Le Numero de serie
	 */
	private static final long serialVersionUID = -2700818225168586553L;

	/** Le id post. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_POST")
	private Integer idIdee;

	/** Le texte. */

	@Column(name = "TEXTE")
	private String texte;

	/** La date crea. */

	@Column(name = "DATE_CREA")
	private Date dateCrea;

	/**
	 * Accede a id idee.
	 *
	 * @return id idee
	 */
	@GenericGenerator(name = "generator", strategy = "foreign", 
			parameters = @Parameter(name = "property", value = "vote"))
	public Integer getIdIdee() {
		return idIdee;
	}

	/**
	 * Modifie id idee.
	 *
	 * @param idIdee
	 *            le nouveau id idee
	 */
	public void setIdIdee(Integer idIdee) {
		this.idIdee = idIdee;
	}

	/**
	 * Accede a texte.
	 *
	 * @return the texte
	 */
	public String getTexte() {
		return texte;
	}

	/**
	 * Modifie texte.
	 *
	 * @param texte
	 *            the texte to set
	 */
	public void setTexte(String texte) {
		this.texte = texte;
	}

	/**
	 * Accede a date crea.
	 *
	 * @return the dateCrea
	 */
	public Date getDateCrea() {
		return dateCrea;
	}

	/**
	 * Modifie date crea.
	 *
	 * @param dateCrea
	 *            the dateCrea to set
	 */
	public void setDateCrea(Date dateCrea) {
		this.dateCrea = dateCrea;
	}
}
