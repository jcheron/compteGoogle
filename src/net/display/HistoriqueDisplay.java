package net.display;

import javax.servlet.http.HttpServletRequest;

import net.ko.controller.KObjectController;
import net.ko.displays.KObjectDisplay;
import net.ko.http.views.KFieldControl;
import net.ko.http.views.KHtmlFieldControl;
import net.ko.http.views.KPageList;
import net.ko.kobject.KObject;
import net.ko.types.HtmlControlType;
import net.models.KCompte;

public class HistoriqueDisplay extends KObjectDisplay {
	@Override
	public KFieldControl getControl(KObject ko, String memberName, KObjectController koc, HttpServletRequest request) {
		KHtmlFieldControl fc = (KHtmlFieldControl) super.getControl(ko, memberName, koc, request);
		if ("idCompte".equals(memberName)) {
			KCompte compte = getCompte(request);
			fc.setValue(compte.getId() + "");
			fc.setFieldType(HtmlControlType.khcHidden);
		} else if ("dateHeureConsult".equals(memberName)) {
			fc.setReadonly(true);
		}
		return fc;
	}

	private KCompte getCompte(HttpServletRequest request) {
		return (KCompte) request.getSession().getAttribute("compte");

	}

	@Override
	public void beforeLoading(Class<? extends KObject> clazz, KPageList list, HttpServletRequest request) {
		list.setWhere("idCompte=" + getCompte(request).getId());
		super.beforeLoading(clazz, list, request);
	}
}
