/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2021-10-29 07:05:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/board/../includes/header.jsp", Long.valueOf(1635490514768L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>SB Admin 2 - Tables</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom fonts for this template -->\r\n");
      out.write("    <link href=\"/resources/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link\r\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("        rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"/resources/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this page -->\r\n");
      out.write("    <link href=\"/resources/vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"/resources/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/upload.css\">\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"/resources/vendor/jquery/jquery.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- modal창 start -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hiddn=\"true\">\r\n");
      out.write("    	<div class=\"modal-dialog\">\r\n");
      out.write("    		<div class=\"modal-content\">\r\n");
      out.write("    			<div class=\"modal-header\">\r\n");
      out.write("    				<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("    				<h4 class=\"modal-title\" id=\"myModalLabel\">Reply Modal</h4>\r\n");
      out.write("    			</div>\r\n");
      out.write("    			<div class=\"modal-body\">\r\n");
      out.write("    				<div class=\"form-group\">\r\n");
      out.write("    					<label>Reply</label>\r\n");
      out.write("    					<input class=\"form-control\" name=\"reply\" value=\"New Reply!!!\">\r\n");
      out.write("    				</div>\r\n");
      out.write("    				<div class=\"form-group\">\r\n");
      out.write("    					<label>Replyer</label>\r\n");
      out.write("    					<input class=\"form-control\" name=\"replyer\" value=\"replyer\">\r\n");
      out.write("    				</div>\r\n");
      out.write("    				<div class=\"form-group\">\r\n");
      out.write("    					<label>Reply Date</label>\r\n");
      out.write("    					<input class=\"form-control\" name=\"replyDate\" value=\"\">\r\n");
      out.write("    				</div>\r\n");
      out.write("    			</div><!--  class=\"modal-body\" 끝 -->\r\n");
      out.write("    			<div class=\"modal-footer\">\r\n");
      out.write("    				<button id=\"modalModBtn\" type=\"button\" class=\"btn btn-warning\">Modify</button>\r\n");
      out.write("    				<button id=\"modalRemoveBtn\" type=\"button\" class=\"btn btn-danger\">Remove</button>\r\n");
      out.write("    				<button id=\"modalRegisterBtn\" type=\"button\" class=\"btn btn-primary\">Register</button>\r\n");
      out.write("    				<button id=\"modalCloseBtn\" type=\"button\" class=\"btn btn-default\">Close</button>\r\n");
      out.write("    			</div>\r\n");
      out.write("    		</div><!--  class=\"modal-content\" 끝 -->\r\n");
      out.write("    	</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- modal창 end -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/resources/js/reply.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/resources/js/list.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/resources/js/register.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/resources/js/read.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("    <!-- Page Wrapper -->\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Sidebar -->\r\n");
      out.write("        <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar - Brand -->\r\n");
      out.write("            <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\r\n");
      out.write("                <div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("                    <i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"sidebar-brand-text mx-3\">SB Admin <sup>2</sup></div>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Dashboard -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"index.html\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-tachometer-alt\"></i>\r\n");
      out.write("                    <span>Dashboard</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Heading -->\r\n");
      out.write("            <div class=\"sidebar-heading\">\r\n");
      out.write("                Interface\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"\r\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("                    <span>Components</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                        <h6 class=\"collapse-header\">Custom Components:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"buttons.html\">Buttons</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"cards.html\">Cards</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Utilities Collapse Menu -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\r\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-wrench\"></i>\r\n");
      out.write("                    <span>Utilities</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\r\n");
      out.write("                    data-parent=\"#accordionSidebar\">\r\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                        <h6 class=\"collapse-header\">Custom Utilities:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-color.html\">Colors</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-border.html\">Borders</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-animation.html\">Animations</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-other.html\">Other</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Heading -->\r\n");
      out.write("            <div class=\"sidebar-heading\">\r\n");
      out.write("                Addons\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\"\r\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapsePages\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-folder\"></i>\r\n");
      out.write("                    <span>Pages</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                        <h6 class=\"collapse-header\">Login Screens:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"login.html\">Login</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"register.html\">Register</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"forgot-password.html\">Forgot Password</a>\r\n");
      out.write("                        <div class=\"collapse-divider\"></div>\r\n");
      out.write("                        <h6 class=\"collapse-header\">Other Pages:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"404.html\">404 Page</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"blank.html\">Blank Page</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Charts -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"charts.html\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\r\n");
      out.write("                    <span>Charts</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Tables -->\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"tables.html\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-table\"></i>\r\n");
      out.write("                    <span>Tables</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("            <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("                <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- End of Sidebar -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Content Wrapper -->\r\n");
      out.write("        <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Main Content -->\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Topbar -->\r\n");
      out.write("                <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("                    <form class=\"form-inline\">\r\n");
      out.write("                        <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Topbar Search -->\r\n");
      out.write("                    <form\r\n");
      out.write("                        class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\"\r\n");
      out.write("                                aria-label=\"Search\" aria-describedby=\"basic-addon2\">\r\n");
      out.write("                            <div class=\"input-group-append\">\r\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                                    <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Topbar Navbar -->\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->\r\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow d-sm-none\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\"\r\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fas fa-search fa-fw\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown - Messages -->\r\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\"\r\n");
      out.write("                                aria-labelledby=\"searchDropdown\">\r\n");
      out.write("                                <form class=\"form-inline mr-auto w-100 navbar-search\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control bg-light border-0 small\"\r\n");
      out.write("                                            placeholder=\"Search for...\" aria-label=\"Search\"\r\n");
      out.write("                                            aria-describedby=\"basic-addon2\">\r\n");
      out.write("                                        <div class=\"input-group-append\">\r\n");
      out.write("                                            <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                                                <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav Item - Alerts -->\r\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\"\r\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fas fa-bell fa-fw\"></i>\r\n");
      out.write("                                <!-- Counter - Alerts -->\r\n");
      out.write("                                <span class=\"badge badge-danger badge-counter\">3+</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown - Alerts -->\r\n");
      out.write("                            <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("                                aria-labelledby=\"alertsDropdown\">\r\n");
      out.write("                                <h6 class=\"dropdown-header\">\r\n");
      out.write("                                    Alerts Center\r\n");
      out.write("                                </h6>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"mr-3\">\r\n");
      out.write("                                        <div class=\"icon-circle bg-primary\">\r\n");
      out.write("                                            <i class=\"fas fa-file-alt text-white\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">December 12, 2019</div>\r\n");
      out.write("                                        <span class=\"font-weight-bold\">A new monthly report is ready to download!</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"mr-3\">\r\n");
      out.write("                                        <div class=\"icon-circle bg-success\">\r\n");
      out.write("                                            <i class=\"fas fa-donate text-white\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">December 7, 2019</div>\r\n");
      out.write("                                        $290.29 has been deposited into your account!\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"mr-3\">\r\n");
      out.write("                                        <div class=\"icon-circle bg-warning\">\r\n");
      out.write("                                            <i class=\"fas fa-exclamation-triangle text-white\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">December 2, 2019</div>\r\n");
      out.write("                                        Spending Alert: We've noticed unusually high spending for your account.\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show All Alerts</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav Item - Messages -->\r\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\"\r\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fas fa-envelope fa-fw\"></i>\r\n");
      out.write("                                <!-- Counter - Messages -->\r\n");
      out.write("                                <span class=\"badge badge-danger badge-counter\">7</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown - Messages -->\r\n");
      out.write("                            <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("                                aria-labelledby=\"messagesDropdown\">\r\n");
      out.write("                                <h6 class=\"dropdown-header\">\r\n");
      out.write("                                    Message Center\r\n");
      out.write("                                </h6>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"img/undraw_profile_1.svg\"\r\n");
      out.write("                                            alt=\"...\">\r\n");
      out.write("                                        <div class=\"status-indicator bg-success\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"font-weight-bold\">\r\n");
      out.write("                                        <div class=\"text-truncate\">Hi there! I am wondering if you can help me with a\r\n");
      out.write("                                            problem I've been having.</div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">Emily Fowler · 58m</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"img/undraw_profile_2.svg\"\r\n");
      out.write("                                            alt=\"...\">\r\n");
      out.write("                                        <div class=\"status-indicator\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"text-truncate\">I have the photos that you ordered last month, how\r\n");
      out.write("                                            would you like them sent to you?</div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">Jae Chun · 1d</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"img/undraw_profile_3.svg\"\r\n");
      out.write("                                            alt=\"...\">\r\n");
      out.write("                                        <div class=\"status-indicator bg-warning\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"text-truncate\">Last month's report looks great, I am very happy with\r\n");
      out.write("                                            the progress so far, keep up the good work!</div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">Morgan Alvarez · 2d</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"https://source.unsplash.com/Mv9hjnEUHR4/60x60\"\r\n");
      out.write("                                            alt=\"...\">\r\n");
      out.write("                                        <div class=\"status-indicator bg-success\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"text-truncate\">Am I a good boy? The reason I ask is because someone\r\n");
      out.write("                                            told me that people say this to all dogs, even if they aren't good...</div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">Chicken the Dog · 2w</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Read More Messages</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"topbar-divider d-none d-sm-block\"></div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav Item - User Information -->\r\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\r\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Douglas McGee</span>\r\n");
      out.write("                                <img class=\"img-profile rounded-circle\"\r\n");
      out.write("                                    src=\"img/undraw_profile.svg\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown - User Information -->\r\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("                                aria-labelledby=\"userDropdown\">\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                    <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                    Profile\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                    <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                    Settings\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                    <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                    Activity Log\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\r\n");
      out.write("                                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                    Logout\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </nav>\r\n");
      out.write("                <!-- End of Topbar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("<h1 class=\"h3 mb-2 text-gray-800\">Register</h1>\r\n");
      out.write("<form role=\"form\" action=\"register\" method=\"post\">\r\n");
      out.write("	<table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\" border=\"1\">\r\n");
      out.write("		<tr><td>제목</td><td><input class=\"form-control\" type=\"text\" name=\"title\"></td></tr>\r\n");
      out.write("		<tr><td>내용</td><td><textarea class=\"form-control\" rows=\"20\" cols=\"30\" name=\"content\"></textarea></td></tr>\r\n");
      out.write("		<tr><td>작성자</td><td><input class=\"form-control\" type=\"text\" name=\"writer\"></td></tr>\r\n");
      out.write("		<tr><td colspan=\"2\"><button class=\"btn btn btn-primary\" type=\"submit\">글쓰기</button></td></tr>\r\n");
      out.write("	</table>\r\n");
      out.write("</form>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("	<div class=\"col-lg-12\">\r\n");
      out.write("		<div class=\"panel panel-default\">\r\n");
      out.write("			<div class=\"panel-heading\">File Attach</div>\r\n");
      out.write("			<div class=\"panel-body\">\r\n");
      out.write("				<div class=\"form-group uploadDiv\">\r\n");
      out.write("					<input type=\"file\" name=\"uploadFile\" multiple>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"uploadResult\">\r\n");
      out.write("					<ul>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
