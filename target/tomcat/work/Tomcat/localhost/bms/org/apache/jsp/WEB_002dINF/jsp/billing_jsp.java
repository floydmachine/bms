/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-02-06 07:30:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class billing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>Login | E-Shopper</title>\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/price-range.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head><!--/head-->\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<header id=\"header\"><!--header-->\r\n");
      out.write("\t\t<div class=\"header_top\"><!--header_top-->\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"contactinfo\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-phone\"></i> +2 95 01 88 821</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-envelope\"></i> info@domain.com</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"shop-menu pull-right\" style=\"background-color:inherit;\" >\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-user\"></i> Account</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/billing\"><i class=\"fa fa-crosshairs\"></i> Checkout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/cart\"><i class=\"fa fa-shopping-cart\"></i> Cart</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login\"><i class=\"fa fa-lock\"></i> Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/header_top-->\r\n");
      out.write("\t\t\t<div class=\"header-bottom\"><!--header-bottom-->\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"mainmenu pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav collapse navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"search_box pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/header-bottom-->\r\n");
      out.write("\t</header><!--/header-->\r\n");
      out.write("\r\n");
      out.write("\t<section id=\"cart_items\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"breadcrumbs\">\r\n");
      out.write("\t\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t  <li><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t\t  <li class=\"active\">Check out</li>\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\t\t\t</div><!--/breadcrums-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"step-one\">\r\n");
      out.write("\t\t\t\t<h2 class=\"heading\">Step1</h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"register-req\">\r\n");
      out.write("\t\t\t\t<p>Please use Register And Checkout to easily get access to your order history, or use Checkout as Guest</p>\r\n");
      out.write("\t\t\t</div><!--/register-req-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"shopper-informations\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-5 clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bill-to\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>Bill To</p>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-one\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <div class=\"form-two\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Your Address</h4>\r\n");
      out.write("                                        <div  id=\"locationField\" class=\"controls\">\r\n");
      out.write("                                           <input type=\"text\" placeholder=\"CompSany Address\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                              \r\n");
      out.write("                                        <div class=\"controls\">\r\n");
      out.write("                                            <input type=\"text\"  placeholder=\"Street Number\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                                \r\n");
      out.write("                                        <div class=\"controls\">\r\n");
      out.write("                                            <input type=\"text\"  placeholder=\"Route\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"controls\">\r\n");
      out.write("                                             <input type=\"text\" placeholder=\"Locality\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"controls\">\r\n");
      out.write("                                             <input type=\"text\" placeholder=\"Region\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                               \r\n");
      out.write("                                        <div class=\"controls\">\r\n");
      out.write("                                             <input type=\"text\"  placeholder=\"Postal Code\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                                \r\n");
      out.write("                                        <div class=\"controls\">\r\n");
      out.write("                                             <input type=\"text\" placeholder=\"Country\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\t\r\n");
      out.write("                                               \t\r\n");
      out.write("                                  </div>\t\t\t\r\n");
      out.write("\t\t\t\t\t\t -->\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"order-message\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>Shipping Order</p>\r\n");
      out.write("\t\t\t\t\t\t\t<textarea id=\"information\" name=\"information\" placeholder=\"Notes about your order, Special Notes for Delivery\" rows=\"16\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("<!-- \r\n");
      out.write("\t\t\t<div class=\"payment-options\">\r\n");
      out.write("\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t<label><input type=\"checkbox\"> Direct Bank Transfer</label>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t<label><input type=\"checkbox\"> Check Payment</label>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t<label><input type=\"checkbox\"> Paypal</label>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div> -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section> <!--/#cart_items-->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<footer id=\"footer\"><!--Footer-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"footer-widget\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Service</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Online Help</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Order Status</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Change Location</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">FAQâs</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Quock Shop</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">T-Shirt</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Mens</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Womens</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Gift Cards</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Shoes</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Policies</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Terms of Use</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Privecy Policy</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Refund Policy</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Billing System</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Ticket System</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>About Shopper</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Company Information</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Careers</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Store Location</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Affillate Program</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Copyright</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3 col-sm-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>About Shopper</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" class=\"searchform\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Your email address\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\"><i class=\"fa fa-arrow-circle-o-right\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Get the most recent updates from <br />our site and be updated your self...</p>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"footer-bottom\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<p class=\"pull-left\">Copyright Â© 2013 E-SHOPPER Inc. All rights reserved.</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"pull-right\">Designed by <span><a target=\"_blank\" href=\"http://www.themeum.com\">Themeum</a></span></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</footer><!--/Footer-->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/price-range.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/billing.jsp(62,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/billing.jsp(62,9) '${menulist}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${menulist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/billing.jsp(62,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("menu");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    \t\t\t\t<li>\r\n");
          out.write("                        \t\t\t\t<a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.mname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("                    \t\t\t\t</li>\r\n");
          out.write("                  \t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/jsp/billing.jsp(107,9) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/shipit", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/billing.jsp(107,9) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("POST");
    // /WEB-INF/jsp/billing.jsp(107,9) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setCommandName("bill");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<!-- \t<input name=\"email\" type=\"text\" placeholder=\"Email*\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input name=\"phoneno\" type=\"text\" placeholder=\"Phone Number\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input name=\"firstname\" type=\"text\" placeholder=\"First Name\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input name=\"lastname\" type=\"text\" placeholder=\"Last Name *\"> -->\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"address\" placeholder=\"Company Address\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"streetno\" placeholder=\"Street Number\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"pzcode\" placeholder=\"Postal Code\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"country\" placeholder=\"Country\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"state\" placeholder=\"State\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Confirm Order\" class=\"btn btn-warning\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t ");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
