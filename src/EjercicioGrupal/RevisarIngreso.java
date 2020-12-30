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
		//doGet(request, response);
		String nombre = (String)request.getParameter("txtnombre");
		int clave = Integer.parseInt(request.getParameter("passlogin"));
		if(nombre == "admin" && clave == 1234) {
			HttpSession misesion = request.getSession();
			misesion.setAttribute("datonombre", nombre);
			misesion.setAttribute("datoclave", clave);
			request.getRequestDispatcher("SesionCreada.jsp").forward(request, response);
			
		}
		else {
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			
		}
		
	}

}
