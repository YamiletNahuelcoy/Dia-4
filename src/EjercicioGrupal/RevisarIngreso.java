package EjercicioGrupal;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RevisarIngreso
 */
@WebServlet("/RevisarIngreso")
public class RevisarIngreso extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RevisarIngreso() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		String nombre = (String) request.getParameter("nombre");
		String passlogin = (String) request.getParameter("passlogin");
		HttpSession session = request.getSession();// iniciando la sesión
		session.setAttribute("nombresesion", nombre);
		request.setAttribute("datonombre", nombre);
		
		if (nombre.equals("admin") && passlogin.equals("1234")) {

			request.getRequestDispatcher("SesionCreada.jsp").forward(request, response);

		} else {
			request.getRequestDispatcher("Login.jsp").forward(request, response);

		}

	}

}
