package EjercicioGrupal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.OutputBuffer;

/**
 * Servlet implementation class SesionCreada
 */
@WebServlet("/SesionCreada")
public class SesionCreada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SesionCreada() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		Usuario user = (Usuario) session.getAttribute("usuario");		

		if(user == null) {
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			
		}else {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title></title>");		
		out.println("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>");
		out.println("<script src=\"script.js\"></script>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Bienvenido" + user.getNombreReal() + "</h1>");
		out.println("<a href='Contacto'>Servlet Contacto</a>");
		out.println("<br/>");
		out.println("<a href='Login.jsp'>Cerrar Sesión</a>");	
		out.println("</body>");
		out.println("</html>");
		}

	}

}
