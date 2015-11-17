package net.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ko.dao.IGenericDao;
import net.ko.framework.KoHttp;
import net.ko.http.objects.KRequest;
import net.ko.ksql.KParameterizedInstruction;
import net.ko.mapping.IMappingControl;
import net.models.KCompte;

public class ConnectionController implements IMappingControl {

	@Override
	public boolean isValid(HttpServletRequest request, HttpServletResponse response) {
		if (KRequest.isPost(request) && KRequest.keyExists("identite", request)) {
			KParameterizedInstruction sql = new KParameterizedInstruction("`", "identite='" + KRequest.GETPOST("identite", request) + "' and mail='" + KRequest.GETPOST("mail", request) + "'");
			IGenericDao<KCompte> dao = KoHttp.getDao(KCompte.class);
			KCompte compte = dao.read(new KCompte(), sql);
			if (compte == null) {
				compte = new KCompte();
				compte.setIdentite(KRequest.GETPOST("identite", request));
				compte.setMail(KRequest.GETPOST("mail", request));
				dao.create(compte);
			}
			request.getSession().setAttribute("compte", compte);
		}
		return true;
	}

	@Override
	public void onInvalidControl(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean beforeProcessAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return true;
	}

}
