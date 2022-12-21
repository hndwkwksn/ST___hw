package app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/index.jsp"})
public class TopServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		log.info(new Object(){}.getClass().getEnclosingClass().getName() + " : "  + new Object(){}.getClass().getEnclosingMethod().getName());
		request.getRequestDispatcher("/top.jsp").forward(request, response);
	}
}
