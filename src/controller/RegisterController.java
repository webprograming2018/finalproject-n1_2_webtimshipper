package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import dao.impl.UserDAOImpl;
import model.User;

@WebServlet(name = "registerServlet", value = "/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;

	public RegisterController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		userDAO = new UserDAOImpl();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String roleId = request.getParameter("role");
		String lat = request.getParameter("lat");
		String lng = request.getParameter("lng");

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setAddress(address);
		user.setRoleId(Integer.parseInt(roleId));
		user.setLat(Float.parseFloat(lat));
		user.setLng(Float.parseFloat(lng));

		userDAO.register(user);

		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);

	}

}
