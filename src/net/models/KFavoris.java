package net.models;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;

/**
 * Classe KFavoris
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "favoris")
public class KFavoris extends KObject {
	private int idCompte;
	private Integer idDossier;
	private String siteWebUrl;
	private String titre;
	private KCompte compte;
	private KDossier dossier;
	private KSiteweb siteweb;

	public KFavoris() {
		super();
		belongsTo("siteweb", KSiteweb.class, "siteWebUrl", "siteweb", "url");
		belongsTo(KDossier.class);
		belongsTo(KCompte.class);
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
	 * return the value of idDossier
	 * 
	 * @return idDossier
	 */
	public int getIdDossier() {
		return this.idDossier;
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
	 * return the value of titre
	 * 
	 * @return titre
	 */
	public String getTitre() {
		return this.titre;
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
	 * return the value of dossier
	 * 
	 * @return dossier
	 */
	public KDossier getDossier() {
		return this.dossier;
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
	 * set the value of idCompte
	 * 
	 * @param aIdCompte
	 */
	public void setIdCompte(int aIdCompte) {
		this.idCompte = aIdCompte;
	}

	/**
	 * set the value of idDossier
	 * 
	 * @param aIdDossier
	 */
	public void setIdDossier(int aIdDossier) {
		this.idDossier = aIdDossier;
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
	 * set the value of titre
	 * 
	 * @param aTitre
	 */
	public void setTitre(String aTitre) {
		this.titre = aTitre;
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
	 * set the value of dossier
	 * 
	 * @param aDossier
	 */
	public void setDossier(KDossier aDossier) {
		this.dossier = aDossier;
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
		return " [idDossier] = " + idDossier + " [idCompte] = " + idCompte + " [titre] = " + titre + " [siteWebUrl] = " + siteWebUrl;
	}
}