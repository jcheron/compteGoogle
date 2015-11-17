package net.models;

import net.ko.kobject.KListObject;
import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;
import net.ko.persistence.annotation.UniqueConstraint;

/**
 * Classe KCompte
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "compte", uniqueConstraints = { @UniqueConstraint(columnNames = { "mail" }) })
public class KCompte extends KObject {
	private String identite;
	private String mail;
	private KListObject<KDossier> dossiers;
	private KListObject<KFavoris> favoriss;
	private KListObject<KSiteweb_has_compte> siteweb_has_comptes;

	public KCompte() {
		super();
		// hasMany(KSiteweb_has_compte.class);hasMany(KFavoris.class);hasMany(KDossier.class);
	}

	/**
	 * return the value of identite
	 * 
	 * @return identite
	 */
	public String getIdentite() {
		return this.identite;
	}

	/**
	 * return the value of mail
	 * 
	 * @return mail
	 */
	public String getMail() {
		return this.mail;
	}

	/**
	 * return the value of dossiers
	 * 
	 * @return dossiers
	 */
	public KListObject<KDossier> getDossiers() {
		return this.dossiers;
	}

	/**
	 * return the value of favoriss
	 * 
	 * @return favoriss
	 */
	public KListObject<KFavoris> getFavoriss() {
		return this.favoriss;
	}

	/**
	 * return the value of siteweb_has_comptes
	 * 
	 * @return siteweb_has_comptes
	 */
	public KListObject<KSiteweb_has_compte> getSiteweb_has_comptes() {
		return this.siteweb_has_comptes;
	}

	/**
	 * set the value of identite
	 * 
	 * @param aIdentite
	 */
	public void setIdentite(String aIdentite) {
		this.identite = aIdentite;
	}

	/**
	 * set the value of mail
	 * 
	 * @param aMail
	 */
	public void setMail(String aMail) {
		this.mail = aMail;
	}

	/**
	 * set the value of dossiers
	 * 
	 * @param aDossiers
	 */
	public void setDossiers(KListObject<KDossier> aDossiers) {
		this.dossiers = aDossiers;
	}

	/**
	 * set the value of favoriss
	 * 
	 * @param aFavoriss
	 */
	public void setFavoriss(KListObject<KFavoris> aFavoriss) {
		this.favoriss = aFavoriss;
	}

	/**
	 * set the value of siteweb_has_comptes
	 * 
	 * @param aSiteweb_has_comptes
	 */
	public void setSiteweb_has_comptes(KListObject<KSiteweb_has_compte> aSiteweb_has_comptes) {
		this.siteweb_has_comptes = aSiteweb_has_comptes;
	}

	@Override
	public String toString() {
		return identite + " (" + mail + ")";
	}
}