package net.models;

import net.ko.kobject.KListObject;
import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Id;
import net.ko.persistence.annotation.Table;

/**
 * Classe KSiteweb
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "siteweb")
public class KSiteweb extends KObject {
	private String titre;
	@Id
	private String url;
	private KListObject<KFavoris> favoriss;
	private KListObject<KSiteweb_has_compte> siteweb_has_comptes;

	public KSiteweb() {
		super();
		// hasMany(KSiteweb_has_compte.class);hasMany(KFavoris.class);
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
	 * return the value of url
	 * 
	 * @return url
	 */
	public String getUrl() {
		return this.url;
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
	 * set the value of titre
	 * 
	 * @param aTitre
	 */
	public void setTitre(String aTitre) {
		this.titre = aTitre;
	}

	/**
	 * set the value of url
	 * 
	 * @param aUrl
	 */
	public void setUrl(String aUrl) {
		this.url = aUrl;
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
		String result = url;
		if (titre != null)
			result = titre + " (" + result + ")";
		return result;
	}
}