package net.display;

import javax.servlet.http.HttpServletRequest;

import net.ko.controller.KObjectController;
import net.ko.displays.KObjectDisplay;
import net.ko.http.views.KFieldControl;
import net.ko.http.views.KHtmlFieldControl;
import net.ko.http.views.KobjectHttpAbstractView;
import net.ko.kobject.KObject;
import net.ko.types.HtmlControlType;

public class AuthDisplay extends KObjectDisplay {

	@Override
	public void afterLoading(KObject ko, KobjectHttpAbstractView view, HttpServletRequest request) {
		super.afterLoading(ko, view, request);
		try {
			ko.copyFrom((KObject) request.getSession().getAttribute("compte"));
		} catch (SecurityException | IllegalArgumentException | NoSuchFieldException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	@Override
	public KFieldControl getReadOnlyControl(KObject ko, String memberName, KObjectController koc, HttpServletRequest request) {
		KHtmlFieldControl fc = (KHtmlFieldControl) super.getReadOnlyControl(ko, memberName, koc, request);
		fc.setFieldType(HtmlControlType.khcCustom);
		return fc;
	}

}
