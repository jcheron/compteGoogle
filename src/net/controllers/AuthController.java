package net.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ko.http.objects.KRequest;
import net.ko.mapping.IMappingControl;

public class AuthController implements IMappingControl {

	@Override
	public boolean isValid(HttpServletRequest request, HttpServletResponse response) {
		if (request.getServletPath().contains("disconnect"))
			request.getSession().invalidate();
		return request.getSession().getAttribute("compte") != null;
	}

	@Override
	public void onInvalidControl(HttpServletRequest request, HttpServletResponse response) {
		try {
			KRequest.forward("/connection.do", request, response);
		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean beforeProcessAction(HttpServletRequest request, HttpServletResponse response) {
		return true;
	}

}
