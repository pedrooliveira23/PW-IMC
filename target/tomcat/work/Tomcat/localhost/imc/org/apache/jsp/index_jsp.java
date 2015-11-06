/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-11-06 23:12:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<!--Import Google Icon Font-->\n");
      out.write("<link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<!--Import materialize.css-->\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"\n");
      out.write("\tmedia=\"screen,projection\" />\n");
      out.write("\n");
      out.write("<!--Let browser know website is optimized for mobile-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" charset=\"UTF-8\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<!--Import jQuery before materialize.js-->\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h1>Calculadora de IMC</h1>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<form>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tNome: <input type=\"text\" name=\"nome\">\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tAltura: <input type=\"text\" name=\"altura\">\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tPeso: <input type=\"text\" name=\"peso\">\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<input class=\"btn right\" type=\"submit\" value=\"Calcular!\" step=\"any\">\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t");

			String nome = request.getParameter("nome");
			String pamAltura = request.getParameter("altura");
			pamAltura = pamAltura == null ? "0" : pamAltura;
			double altura = Double.parseDouble(pamAltura);
			String pamPeso = request.getParameter("peso");
			pamPeso = pamPeso == null ? "0" : pamPeso;
			double peso = Double.parseDouble(pamPeso);
			Double resultado = new Double(peso / (altura*altura));
			
			if (nome == null) {
				nome = "";
			}			
			
			out.print(nome + " está ");
			
			if(resultado < 17) {
				out.print("muito abaixo do peso.");
			} else if (resultado >= 17 && resultado <= 18.49) {
				out.print("abaixo do peso.");
			} else if (resultado >= 18.50 && resultado <= 24.99) {
				out.print("com peso normal.");
			} else if (resultado >= 25 && resultado >= 29.99) {
				out.print("acima do peso.");
			} else {
				out.print("obeso.");
			}
		
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
