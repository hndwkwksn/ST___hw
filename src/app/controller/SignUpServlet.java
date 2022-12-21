package app.controller;

import java.io.IOException;
import java.util.List;

import javax.security.sasl.SaslException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

@WebServlet(urlPatterns = {"/signup"})
public class SignUpServlet extends HttpServlet {
	public SignUpServlet() {
//		InitApplication application = InitApplication.getInstance();
//		application.Init();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("signup.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		User user = getUser(request);
		new UserService().insert(user);
		response.sendRedirect("./");
	}

	private User getUser(HttpServletRequest request) throws IOException, SaslException {
		User user = new User();
		user.setName(request.getParameter("name"));
		user.setAccount(request.getParameter("account"));
		user.setPassword(request.getParameter("password"));
		user.setEmail(request.getParameter("email"));
		user.setDescription(request.getParameter("discription"));
		return user;
	}
}
