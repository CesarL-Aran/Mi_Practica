package hn.uth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ArcadeDB
 */
@WebServlet("/ArcadeDB")
public class ArcadeDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArcadeDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String metodo=request.getMethod();
		/*request.getParameter("monto")*/
		if("POST".equalsIgnoreCase(metodo)){
			
			String titulo=request.getParameter("titulo");
			String arte=request.getParameter("arte");
			String desarolladora=request.getParameter("desarollador");
			String anio=request.getParameter("anio");
			String genero=request.getParameter("genero");
			String placa=request.getParameter("placa");
			
			response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().print("<!DOCTYPE html>");
			
			response.getWriter().append("<html>");
			response.getWriter().append("<head>");
			response.getWriter().append("<meta charset='UTF-8'>");
			response.getWriter().append("<title>Arcade Center</title>");
			response.getWriter().append(
				    "<link rel='stylesheet' href='" 
				    + request.getContextPath() 
				    + "/CSS/arcade.css'>"
				);
			
			response.getWriter().append("</head>");
			response.getWriter().append("<body>");
			
			response.getWriter().append("<h2>Arcade Center</h2>");
			
			response.getWriter().append("<table border=1>");
			response.getWriter().append("<caption>Info.</caption>");
			response.getWriter().append("<tr>");
			response.getWriter().append("<td>"+titulo+"</td>");
			response.getWriter().append("<td><img src='" + arte + "' alt='Arte de Juego' width=80px ></td>");
			response.getWriter().append("<td>"+anio+"</td>");
			response.getWriter().append("<td>"+desarolladora+"</td>");
			response.getWriter().append("<td>"+genero+"</td>");
			response.getWriter().append("<td>"+placa+"</td>");
			response.getWriter().append("</tr>");
			response.getWriter().print("</table>");
			
			response.getWriter().append("</body>");
			response.getWriter().append("</html>");
			
		}else {
		
			response.getWriter().append("Served at: ").append(request.getContextPath());
			response.getWriter().append("\nServlet DivisionCuentas llammado ");
			response.getWriter().append("\nUniversidad tecnologica de Honduras: ");
			response.getWriter().append("\nProgramacion Web 2");
			response.getWriter().append("\nEl metodo invocado fue:"+metodo);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
