/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-08-26 11:09:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Sign Up Here!</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bootstrap.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigation.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<main class=\"login-form\">\r\n");
      out.write("\t<div class=\"cotainer\">\r\n");
      out.write("\t\t<div class=\"row justify-content-center\">\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-header\">사용자 회원등록</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<form action=\"register.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"email_address\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"col-md-4 col-form-label text-md-right\">사용자 이름</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\" style=\"padding-bottom:0px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"user_id\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"user_id\" required autofocus oninput=\"return checkId()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"idchecktext\" style=\"text-align:center; margin-left:0px; margin-bottom:0px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"col-md-4 col-form-label text-md-right\">비밀번호</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" id=\"user_pw\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"user_pw\" oninput=\"return checkPw()\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"password_confirm\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"col-md-4 col-form-label text-md-right\">비밀번호 확인</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" id=\"user_pw_confirm\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"user_pw_confirm\" oninput=\"return checkPw()\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"pwchecktext\" style=\"text-align:center; margin-left:0px; margin-bottom:0px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"motto\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"col-md-4 col-form-label text-md-right\">자기소개</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"motto\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"user_motto\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6 offset-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\" id=\"registerbtn\" onclick=\"location:href='login.do'\">회원등록</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</main>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("/* \t#FA5858 : 빨간색\r\n");
      out.write("\t#5858FA : 파란색\r\n");
      out.write("\t#00FF40 : 녹색\r\n");
      out.write("\t#81F79F : 녹색2\r\n");
      out.write("\t#BDBDBD : 회색 */\r\n");
      out.write("\t\r\n");
      out.write("\tvar idCheck = 0;\r\n");
      out.write("\tvar pwCheck = 0;\r\n");
      out.write("\t\r\n");
      out.write("\tfunction checkId() {\r\n");
      out.write("\t\tvar inputed = $('#user_id').val();\r\n");
      out.write("\t\tconsole.log(inputed);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\tuser_id : inputed\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t// 레스트 컨트롤러 이름 적시\r\n");
      out.write("\t\t\turl : \"/remember/checkId.do\",\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tif(inputed == \"\" && data == '0') {\r\n");
      out.write("\t\t\t\t\t/* 아무튼 회원 등록 불가능 상태 */\r\n");
      out.write("\t\t\t\t\t$('#registerbtn').prop(\"disabled\", true);\r\n");
      out.write("\t\t\t\t\t$('#registerbtn').css(\"background-color\", \"#BDBDBD\");\r\n");
      out.write("\t\t\t\t\t$('#user_id').css(\"background-color\", \"#FA5858\");\r\n");
      out.write("\t\t\t\t\t$('#idchecktext').text('아이디를 입력해주세요.');\r\n");
      out.write("\t\t\t\t\t$('#idchecktext').css(\"color\", \"#FA5858\");\r\n");
      out.write("\t\t\t\t\tidCheck = 0;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse if(data == '0') {\r\n");
      out.write("\t\t\t\t\t/* 회원등록 가능 상태 */\r\n");
      out.write("\t\t\t\t\t$('#user_id').css(\"background-color\", \"\");\r\n");
      out.write("\t\t\t\t\t$('#idchecktext').text('사용 가능한 아이디입니다.');\r\n");
      out.write("\t\t\t\t\t$('#idchecktext').css(\"color\", \"#5882FA\");\r\n");
      out.write("\t\t\t\t\tidCheck = 1;\r\n");
      out.write("\t\t\t\t\tif(idCheck == 1 && pwCheck == 1) {\r\n");
      out.write("\t\t\t\t\t\t$('#registerbtn').prop(\"disabled\", false);\r\n");
      out.write("\t\t\t\t\t\t$('#registerbtn').css(\"background-color\", \"blue\");\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t} else if(data == '1') {\r\n");
      out.write("\t\t\t\t\t/* 이미 db에 아이디가 존재하는 경우 */\r\n");
      out.write("\t\t\t\t\t$('#registerbtn').prop(\"disabled\", true);\r\n");
      out.write("\t\t\t\t\t$('#registerbtn').css(\"background-color\", \"#BDBDBD\");\r\n");
      out.write("\t\t\t\t\t$('#user_id').css(\"background-color\", \"#F5A9A9\");\r\n");
      out.write("\t\t\t\t\t$('#idchecktext').text('이미 존재하는 아이디입니다.');\r\n");
      out.write("\t\t\t\t\t$('#idchecktext').css(\"color\", \"#FF5858\");\r\n");
      out.write("\t\t\t\t\tidCheck = 0;\r\n");
      out.write("\t\t\t\t} \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction checkPw() {\r\n");
      out.write("\t\tvar pwInputed = $('#user_pw').val();\r\n");
      out.write("\t\tvar check = $('#user_pw_confirm').val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(check == \"\") {\r\n");
      out.write("\t\t\t/* 비밀번호 확인 채우지 않은 경우 */\r\n");
      out.write("\t\t\t$('#registerbtn').prop(\"disabled\", true);\r\n");
      out.write("\t\t\t$('#registerbtn').css('background-color', \"#F5A9A9\");\r\n");
      out.write("\t\t\t$('#user_pw_confirm').css('background-color', '#F5A9A9');\r\n");
      out.write("\t\t\t$('#pwchecktext').text('비밀번호 확인란을 입력해주세요.');\r\n");
      out.write("\t\t\t$('#pwchecktext').css(\"color\", \"#FF0000\");\r\n");
      out.write("\t\t} else if(pwInputed == check) {\r\n");
      out.write("\t\t\tpwCheck = 1;\r\n");
      out.write("\t\t\tif(idCheck == 1 && pwCheck == 1) {\r\n");
      out.write("\t\t\t\t$('#registerbtn').prop(\"disabled\", false);\r\n");
      out.write("\t\t\t\t$('#registerbtn').css(\"background-color\", \"#5882FA\");\r\n");
      out.write("\t\t\t\t$('#user_pw_confirm').css(\"background-color\", \"#81F79F\");\r\n");
      out.write("\t\t\t\t$('#pwchecktext').text('');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else if(pwInputed != check) {\r\n");
      out.write("\t\t\tpwCheck = 0;\r\n");
      out.write("\t\t\t$('#registerbtn').prop(\"disabled\", true);\r\n");
      out.write("\t\t\t$('#registerbtn').css(\"background-color\", \"#F5A9A9\");\r\n");
      out.write("\t\t\t$('#user_pw_confirm').css(\"background-color\", \"#F5A9A9\");\r\n");
      out.write("\t\t\t$('#pwchecktext').text('비밀번호가 다릅니다.');\r\n");
      out.write("\t\t\t$('#pwchecktext').css(\"color\", \"#BDBDBD\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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