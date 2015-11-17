package net.models;

import java.util.Calendar;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Id;
import net.ko.persistence.annotation.Table;

/**
 * Classe KSiteweb_has_compte
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "siteweb_has_compte")
public class KSiteweb_has_compte extends KObject {
	@Id
	private java.sql.Timestamp dateHeureConsult;
	@Id
	private int idCompte;
	@Id
	private String siteWebUrl;
	private KCompte compte;
	private KSiteweb siteweb;

	public KSiteweb_has_compte() {
		super();

		dateHeureConsult = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		belongsTo("siteweb", KSiteweb.class, "siteWebUrl", "siteweb", "url");
		belongsTo(KCompte.class);
	}

	/**
	 * return the value of dateHeureConsult
	 * 
	 * @return dateHeureConsult
	 */
	public java.sql.Timestamp getDateHeureConsult() {
		return this.dateHeureConsult;
	}

	/**
	 * return the value of idCompte
	 * 
	 * @return idCompte
	 */
	public int getIdCompte() {
		return this.idCompte;
	}

	/**
	 * return the value of siteWebUrl
	 * 
	 * @return siteWebUrl
	 */
	public String getSiteWebUrl() {
		return this.siteWebUrl;
	}

	/**
	 * return the value of compte
	 * 
	 * @return compte
	 */
	public KCompte getCompte() {
		return this.compte;
	}

	/**
	 * return the value of siteweb
	 * 
	 * @return siteweb
	 */
	public KSiteweb getSiteweb() {
		return this.siteweb;
	}

	/**
	 * set the value of dateHeureConsult
	 * 
	 * @param aDateHeureConsult
	 */
	public void setDateHeureConsult(java.sql.Timestamp aDateHeureConsult) {
		this.dateHeureConsult = aDateHeureConsult;
	}

	/**
	 * set the value of idCompte
	 * 
	 * @param aIdCompte
	 */
	public void setIdCompte(int aIdCompte) {
		this.idCompte = aIdCompte;
	}

	/**
	 * set the value of siteWebUrl
	 * 
	 * @param aSiteWebUrl
	 */
	public void setSiteWebUrl(String aSiteWebUrl) {
		this.siteWebUrl = aSiteWebUrl;
	}

	/**
	 * set the value of compte
	 * 
	 * @param aCompte
	 */
	public void setCompte(KCompte aCompte) {
		this.compte = aCompte;
	}

	/**
	 * set the value of siteweb
	 * 
	 * @param aSiteweb
	 */
	public void setSiteweb(KSiteweb aSiteweb) {
		this.siteweb = aSiteweb;
	}

	@Override
	public String toString() {
		return compte + "-" + siteWebUrl + " " + dateHeureConsult;
	}
}