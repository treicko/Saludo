package Saludo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SaludoServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		out.println("<h1> Hello word desde servlet </h1>");
		String nombre = request.getParameter("nombre");
		Saludo saludo = new Saludo();
		String bienvenida = saludo.Saludar("Bienvenido: ", nombre);
		out.println("<br><br><h1>"+bienvenida+"</h1>");
		out.close();
	}
}