package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;
import javafx.scene.control.Alert;

public final class FormaPago_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Usuario</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"favicon.ico\"/>\n");
      out.write("        <link href=\"assets/css/cssForm.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css\">       \n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/customHome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <center><div class=\"col-md-12\">\n");
      out.write("                <br>\n");
      out.write("                <h2 class=\"letra\" style=\"font-style: 'center'\">Registro Usuarios</h2>\n");
      out.write("            </div></center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("                    <br><br><br><br><br><br><br><br>\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"Home2.jsp\"><img src=\"assets/img/Logo.PNG\" width=\"365\" height=\"175\" alt=\"Feria Virtual\"/></a>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-1\">\n");
      out.write("                    <div class=\"lineVert\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"column is-5\">\n");
      out.write("                    <article class=\"message is-info\">\n");
      out.write("                        <div class=\"message-header \">\n");
      out.write("                            <h5>Registro Usuario</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"message-body field\">\n");
      out.write("                            <form action=\"ServletUsuario\" method=\"post\">\n");
      out.write("                                <div class=\"columns\">\n");
      out.write("                                    <div class=\"column\">\n");
      out.write("                                        <label for=\"nombre\" class=\"label\">Numero De Cuenta:</label>\n");
      out.write("                                        <div class=\"control has-icons-left\">\n");
      out.write("                                            <input type=\"text\" class=\"input\" name=\"numRut\" maxlength=\"9\" oninput=\"this.value=this.value.replace(/[^0-9]/g,'');\" required  >\n");
      out.write("                                            <span class=\"icon is-small is-left\">\n");
      out.write("                                                <i class=\"fa fa-user\"></i>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"column\">\n");
      out.write("                                        <label for=\"nombre\" class=\"label\">Rut Cuenta:</label>\n");
      out.write("                                        <div class=\"control has-icons-left\">\n");
      out.write("                                            <input type=\"text\" class=\"input\" name=\"numDv\" maxlength=\"8\" oninput=\"this.value=this.value.replace(/[^0-9]/g,'');\" required>\n");
      out.write("                                            <span class=\"icon is-small is-left\">\n");
      out.write("                                                <i class=\"fa fa-user\"></i>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"columns\">\n");
      out.write("                                    <div class=\"column\">\n");
      out.write("                                        <label for=\"usuario\" class=\"label\">Entidad Financiera: </label>\n");
      out.write("                                        <div class=\"control has-icons-left\">\n");
      out.write("                                            <input type=\"text\" name=\"txtNombre\" class=\"input\">\n");
      out.write("                                            <span class=\"icon is-small is-left\">\n");
      out.write("                                                <i class=\"fa fa-user\"></i>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"column\">\n");
      out.write("                                        <label for=\"usuario\" class=\"label\">Tipo De Cuenta: </label>\n");
      out.write("                                        <div class=\"control has-icons-left\">\n");
      out.write("                                            <input type=\"text\" name=\"txtApellido\" class=\"input\">\n");
      out.write("                                            <span class=\"icon is-small is-left\">\n");
      out.write("                                                <i class=\"fa fa-user\"></i>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"columns\">\n");
      out.write("                                    <div class=\"column\">\n");
      out.write("                                        <label for=\"usuario\" class=\"label\">Rut Persona: </label>\n");
      out.write("                                        <div class=\"control has-icons-left\">\n");
      out.write("                                            <input type=\"email\" name=\"txtEmail\" class=\"input\">\n");
      out.write("                                            <span class=\"icon is-small is-left\">\n");
      out.write("                                                <i class=\"fa fa-user\"></i>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"submit\" class=\"button is-info\" id=\"save\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </article>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
