/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class Booking extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Booking</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Booking at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!halaman booking>\n"
                    + "<!DOCTYPE HTML>\n"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <meta charset=\"utf-8\">\n"
                    + "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                    + "        <title>Aria Rooms and Swimming Pool</title>\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"
                    + "        <meta name=\"description\" content=\"\" />\n"
                    + "        <meta name=\"keywords\" content=\"\" />\n"
                    + "        <meta name=\"author\" content=\"\" />\n"
                    + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"//fonts.googleapis.com/css?family=|Roboto+Sans:400,700|Playfair+Display:400,700\">\n"
                    + "\n"
                    + "        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"css/animate.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"css/aos.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"css/fancybox.min.css\">\n"
                    + "\n"
                    + "        <link rel=\"stylesheet\" href=\"fonts/ionicons/css/ionicons.min.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"fonts/fontawesome/css/font-awesome.min.css\">\n"
                    + "\n"
                    + "        <!-- Theme Style -->\n"
                    + "        <link rel=\"stylesheet\" href=\"css/style.css\">\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "\n"
                    + "        <header class=\"site-header js-site-header\">\n"
                    + "            <div class=\"container-fluid\">\n"
                    + "                <div class=\"row align-items-center\">\n"
                    + "                    <div class=\"col-6 col-lg-4 site-logo\" data-aos=\"fade\"><a href=\"index.html\">Aria Rooms & Swimming Pool</a></div>\n"
                    + "                    <div class=\"col-6 col-lg-8\">\n"
                    + "\n"
                    + "\n"
                    + "                        <div class=\"site-menu-toggle js-site-menu-toggle\"  data-aos=\"fade\">\n"
                    + "                            <span></span>\n"
                    + "                            <span></span>\n"
                    + "                            <span></span>\n"
                    + "                        </div>\n"
                    + "                        <!-- END menu-toggle -->\n"
                    + "\n"
                    + "                        <div class=\"site-navbar js-site-navbar\">\n"
                    + "                            <nav role=\"navigation\">\n"
                    + "                                <div class=\"container\">\n"
                    + "                                    <div class=\"row full-height align-items-center\">\n"
                    + "                                        <div class=\"col-md-6 mx-auto\">\n"
                    + "                                            <ul class=\"list-unstyled menu\">\n"
                    + "                                                <li><a href=\"profil.html\">Profil</a></li>\n"
                    + "                                                <li><a href=\"halut.html\">Halaman Utama</a></li>\n"
                    + "                                                <li><a href=\"kamar.html\">Kamar</a></li>                      \n"
                    + "                                                <li class=\"active\"><a href=\"booking.html\">Booking</a></li>\n"
                    + "                                                <li><a href=\"pembayaran.html\">Pembayaran</a></li>\n"
                    + "                                                <li><a href=\"login.html\">Logout</a></li>\n"
                    + "                                            </ul>\n"
                    + "                                        </div>\n"
                    + "                                    </div>\n"
                    + "                                </div>\n"
                    + "                            </nav>\n"
                    + "                        </div>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "        </header>\n"
                    + "        <!-- END head -->\n"
                    + "\n"
                    + "        <section class=\"site-hero inner-page overlay\" style=\"background-image: url(images/hero_4.jpg)\" data-stellar-background-ratio=\"0.5\">\n"
                    + "            <div class=\"container\">\n"
                    + "                <div class=\"row site-hero-inner justify-content-center align-items-center\">\n"
                    + "                    <div class=\"col-md-10 text-center\" data-aos=\"fade\">\n"
                    + "                        <h1 class=\"heading mb-3\">Silahkan Booking</h1>\n"
                    + "                        <ul class=\"custom-breadcrumbs mb-4\">\n"
                    + "                        </ul>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "\n"
                    + "            <a class=\"mouse smoothscroll\" href=\"#next\">\n"
                    + "                <div class=\"mouse-icon\">\n"
                    + "                    <span class=\"mouse-wheel\"></span>\n"
                    + "                </div>\n"
                    + "            </a>\n"
                    + "        </section>\n"
                    + "        <!-- END section -->\n"
                    + "\n"
                    + "        <section class=\"section contact-section\" id=\"next\">\n"
                    + "            <div class=\"container\">\n"
                    + "                <div class=\"row\">\n"
                    + "                    <div class=\"col-md-7\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n"
                    + "\n"
                    + "                        <form action=\"#\" method=\"post\" class=\"bg-white p-md-5 p-4 mb-5 border\">\n"
                    + "                            <div class=\"row\">\n"
                    + "                                <div class=\"col-md-6 form-group\">\n"
                    + "                                    <label class=\"text-black font-weight-bold\" for=\"name\">Nama</label>\n"
                    + "                                    <input type=\"text\" id=\"name\" class=\"form-control \">\n"
                    + "                                </div>\n"
                    + "                                <div class=\"col-md-6 form-group\">\n"
                    + "                                    <label class=\"text-black font-weight-bold\" for=\"phone\">Telepon</label>\n"
                    + "                                    <input type=\"text\" id=\"phone\" class=\"form-control \">\n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "\n"
                    + "                            <div class=\"row\">\n"
                    + "                                <div class=\"col-md-12 form-group\">\n"
                    + "                                    <label class=\"text-black font-weight-bold\" for=\"email\">Email</label>\n"
                    + "                                    <input type=\"email\" id=\"email\" class=\"form-control \">\n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "\n"
                    + "                            <div class=\"row\">\n"
                    + "                                <div class=\"col-md-6 form-group\">\n"
                    + "                                    <label class=\"text-black font-weight-bold\" for=\"checkin_date\">Check In</label>\n"
                    + "                                    <input type=\"text\" id=\"checkin_date\" class=\"form-control\">\n"
                    + "                                </div>\n"
                    + "                                <div class=\"col-md-6 form-group\">\n"
                    + "                                    <label class=\"text-black font-weight-bold\" for=\"checkout_date\">Check Out</label>\n"
                    + "                                    <input type=\"text\" id=\"checkout_date\" class=\"form-control\">\n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "\n"
                    + "                            <div class=\"row\">\n"
                    + "                                <div class=\"col-md-6 form-group\">\n"
                    + "                                    <label for=\"adults\" class=\"font-weight-bold text-black\">Dewasa</label>\n"
                    + "                                    <div class=\"field-icon-wrap\">\n"
                    + "                                        <div class=\"icon\"><span class=\"ion-ios-arrow-down\"></span></div>\n"
                    + "                                        <select name=\"\" id=\"adults\" class=\"form-control\">\n"
                    + "                                            <option value=\"\">1</option>\n"
                    + "                                            <option value=\"\">2</option>\n"
                    + "                                            <option value=\"\">3</option>\n"
                    + "                                            <option value=\"\">4+</option>\n"
                    + "                                        </select>\n"
                    + "                                    </div>\n"
                    + "                                </div>\n"
                    + "                                <div class=\"col-md-6 form-group\">\n"
                    + "                                    <label for=\"children\" class=\"font-weight-bold text-black\">Anak-anak</label>\n"
                    + "                                    <div class=\"field-icon-wrap\">\n"
                    + "                                        <div class=\"icon\"><span class=\"ion-ios-arrow-down\"></span></div>\n"
                    + "                                        <select name=\"\" id=\"children\" class=\"form-control\">\n"
                    + "                                            <option value=\"\">1</option>\n"
                    + "                                            <option value=\"\">2</option>\n"
                    + "                                            <option value=\"\">3</option>\n"
                    + "                                            <option value=\"\">4+</option>\n"
                    + "                                        </select>\n"
                    + "                                    </div>\n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "                            <div class=\"row mb-4\">\n"
                    + "                                <div class=\"col-md-12 form-group\">\n"
                    + "                                    <label class=\"text-black font-weight-bold\" for=\"message\">Catatan</label>\n"
                    + "                                    <textarea name=\"message\" id=\"message\" class=\"form-control \" cols=\"30\" rows=\"8\"></textarea>\n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "                            <div class=\"row\">\n"
                    + "                                <div class=\"col-md-6 form-group\">\n"
                    + "                                    <input type=\"submit\" value=\"Reserve Now\" class=\"btn btn-primary text-white py-3 px-5 font-weight-bold\">\n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "                        </form>\n"
                    + "\n"
                    + "                    </div>\n"
                    + "                    <div class=\"col-md-5\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n"
                    + "                        <div class=\"row\">\n"
                    + "                            <div class=\"col-md-10 ml-auto contact-info\">\n"
                    + "                                <p><span class=\"d-block\">Alamat:</span> <span class=\"text-black\"> Jalan Stadion Nomor 331, Tajem, Maguwoharjo, Depok, Sleman, Yogyakarta</span></p>\n"
                    + "                                <p><span class=\"d-block\">Nomor Telepon:</span> <span class=\"text-black\"> (0274) 433 2059</span></p>\n"
                    + "                                <p><span class=\"d-block\">Email:</span> <span class=\"text-black\"> ariarooms@gmail.com</span></p>\n"
                    + "                            </div>\n"
                    + "                        </div>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "        </section>\n"
                    + "        <script src=\"js/jquery-3.3.1.min.js\"></script>\n"
                    + "        <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n"
                    + "        <script src=\"js/popper.min.js\"></script>\n"
                    + "        <script src=\"js/bootstrap.min.js\"></script>\n"
                    + "        <script src=\"js/owl.carousel.min.js\"></script>\n"
                    + "        <script src=\"js/jquery.stellar.min.js\"></script>\n"
                    + "        <script src=\"js/jquery.fancybox.min.js\"></script>\n"
                    + "        <script src=\"js/aos.js\"></script>\n"
                    + "        <script src=\"js/bootstrap-datepicker.js\"></script> \n"
                    + "        <script src=\"js/jquery.timepicker.min.js\"></script> \n"
                    + "        <script src=\"js/main.js\"></script>\n"
                    + "    </body>\n"
                    + "</html>");
        } catch (Exception ex) {

        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
