package net.display;

import javax.servlet.http.HttpServletRequest;

import net.ko.controller.KObjectController;
import net.ko.displays.KObjectDisplay;
import net.ko.http.views.KFieldControl;
import net.ko.http.views.KHtmlFieldControl;
import net.ko.kobject.KListObject;
import net.ko.kobject.KObject;
import net.ko.types.HtmlControlType;
import net.models.KCompte;
import net.models.KDossier;

public class DossierDisplay extends KObjectDisplay {

	@Override
	public KFieldControl getControl(KObject ko, String memberName, KObjectController koc, HttpServletRequest request) {
		KHtmlFieldControl fc = (KHtmlFieldControl) super.getControl(ko, memberName, koc, request);
		KCompte compte = getCompte(request);
		if ("idCompte".equals(memberName)) {
			fc.setValue(compte.getId() + "");
			fc.setFieldType(HtmlControlType.khcHidden);
		} else if ("idParent".equals(memberName)) {
			KListObject<KDossier> dossiers = (KListObject<KDossier>) fc.getListObject();
			fc.setListObject(dossiers.select("idCompte=" + compte.getId()));
		}
		return fc;
	}

	private KCompte getCompte(HttpServletRequest request) {
		return (KCompte) request.getSession().getAttribute("compte");

	}
}
