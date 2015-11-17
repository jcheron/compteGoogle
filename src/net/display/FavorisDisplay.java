package net.display;

import javax.servlet.http.HttpServletRequest;

import net.ko.controller.KObjectController;
import net.ko.displays.KObjectDisplay;
import net.ko.framework.Ko;
import net.ko.http.views.KFieldControl;
import net.ko.http.views.KHtmlFieldControl;
import net.ko.http.views.KPageList;
import net.ko.kobject.KListObject;
import net.ko.kobject.KObject;
import net.ko.types.HtmlControlType;
import net.models.KCompte;
import net.models.KDossier;

public class FavorisDisplay extends KObjectDisplay {

	@Override
	public void beforeLoading(Class<? extends KObject> clazz, KPageList list, HttpServletRequest request) {
		Ko.setTempConstraintDeph(3);
		super.beforeLoading(clazz, list, request);
		list.setWhere("idCompte=" + getCompte(request).getId());
	}

	@Override
	public void afterLoading(KListObject<? extends KObject> kl, KPageList list, HttpServletRequest request) {
		Ko.restoreConstraintDeph();
		super.afterLoading(kl, list, request);
	}

	@Override
	public KFieldControl getControl(KObject ko, String memberName, KObjectController koc, HttpServletRequest request) {
		KHtmlFieldControl fc = (KHtmlFieldControl) super.getControl(ko, memberName, koc, request);
		KCompte compte = getCompte(request);
		if ("idCompte".equals(memberName)) {
			fc.setValue(compte.getId() + "");
			fc.setCaption("");
			fc.setFieldType(HtmlControlType.khcReadOnlyList);
		} else if ("idDossier".equals(memberName)) {
			KListObject<KDossier> dossiers = (KListObject<KDossier>) fc.getListObject();
			fc.setListObject(dossiers.select("idCompte=" + compte.getId()));
		}
		return fc;
	}

	private KCompte getCompte(HttpServletRequest request) {
		return (KCompte) request.getSession().getAttribute("compte");

	}

}
