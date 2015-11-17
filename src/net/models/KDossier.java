package net.models;

import net.ko.kobject.KListObject;
import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;

/**
 * Classe KDossier
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "dossier")
public class KDossier extends KObject {
	private int idCompte;
	private Integer idParent;
	private String nom;
	private KCompte compte;
	private KDossier parent;
	private KListObject<KDossier> dossiers;
	private KDossier dossier;
	private KListObject<KFavoris> favoriss;

	public KDossier() {
		super();
		// hasMany(KFavoris.class);belongsTo(KDossier.class);hasMany(KDossier.class);
		belongsTo(KCompte.class);
		belongsTo("parent", KDossier.class, "idParent", "dossier", "id");
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
	 * return the value of idParent
	 * 
	 * @return idParent
	 */
	public int getIdParent() {
		return this.idParent;
	}

	/**
	 * return the value of nom
	 * 
	 * @return nom
	 */
	public String getNom() {
		return this.nom;
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
	 * return the value of dossiers
	 * 
	 * @return dossiers
	 */
	public KListObject<KDossier> getDossiers() {
		return this.dossiers;
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
	 * return the value of favoriss
	 * 
	 * @return favoriss
	 */
	public KListObject<KFavoris> getFavoriss() {
		return this.favoriss;
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
	 * set the value of idParent
	 * 
	 * @param aIdParent
	 */
	public void setIdParent(int aIdParent) {
		this.idParent = aIdParent;
	}

	/**
	 * set the value of nom
	 * 
	 * @param aNom
	 */
	public void setNom(String aNom) {
		this.nom = aNom;
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
	 * set the value of dossiers
	 * 
	 * @param aDossiers
	 */
	public void setDossiers(KListObject<KDossier> aDossiers) {
		this.dossiers = aDossiers;
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
	 * set the value of favoriss
	 * 
	 * @param aFavoriss
	 */
	public void setFavoriss(KListObject<KFavoris> aFavoriss) {
		this.favoriss = aFavoriss;
	}

	@Override
	public String toString() {
		String result = nom;
		if (parent != null)
			result = parent + "/" + result;
		return result;
	}

	public KDossier getParent() {
		return parent;
	}

	public void setParent(KDossier parent) {
		this.parent = parent;
	}
}