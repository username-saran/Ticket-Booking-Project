package com.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Book
 */
@WebServlet("/book")
public class Book extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Book() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		int amt = Integer.parseInt(request.getParameter("id"));
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "     <meta charset=\"UTF-8\">\r\n"
				+ "     <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "     <title>Book</title>\r\n"
				+ "     <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n"
				+ "     <style>\r\n"
				+ "          body{\r\n"
				+ "               background-image: linear-gradient(rgb(1, 59, 95),rgb(12, 222, 184));\r\n"
				+ "               background-repeat: no-repeat;\r\n"
				+ "               background-attachment: fixed;\r\n"
				+ "          }\r\n"
				+ "          .container{\r\n"
				+ "               background-color: white;\r\n"
				+ "               margin-top: 90px;\r\n"
				+ "               width: 70%;\r\n"
				+ "               border-radius: 20px;\r\n"
				+ "               padding: 30px;\r\n"
				+ "          }\r\n"
				+ "     </style>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "     <div class=\"container-fluid\">\r\n"
				+ "          <div class=\"row\">\r\n"
				+ "               <div class=\"col\" align=\"center\" style=\"background-color: white;\">\r\n"
				+ "                    <h1>Online Ticket Booking System</h1><sub><h6>Easy ur work</h6></sub>\r\n"
				+ "               </div>\r\n"
				+ "          </div>\r\n"
				+ "     </div>\r\n"
			
				+ "     <div class=\"container\">\r\n"
				+ "          <h2 align=\"center\" style=\"margin-bottom: 30px;\">P A Y M E N T</h2>\r\n"
				+ "          <div class=\"row\">\r\n"
				+ "               <div class=\"col\">\r\n"
				+ "                    <form action=\"pay\" method=\"post\">\r\n"
				+ "                         <table class=\"table table-borderless\">\r\n"
				+ "                              <tr>\r\n"
				+ "                                   <td colspan=\"2\">\r\n"
				+ "                                        <h4 align=\"center\">\r\n"
				+ "                                             Total Amount to Pay: $"+amt+"\r\n"
				+ "                                        </h4>\r\n"
				+ "                                   </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                              <tr>\r\n"
				+ "                                   <td>\r\n"
				+ "                                        Select Payment:\r\n"
				+ "                                   </td>\r\n"
				+ "                                   <td>\r\n"
				+ "                                        <input type=\"radio\" name=\"Payment\" id=\"credit\" value=\"credit\">Credit Card\r\n"
				+ "                                        <br>\r\n"
				+ "                                        <input type=\"radio\" name=\"Payment\" id=\"debit\" value=\"debit\">Debit Card\r\n"
				+ "                                        <br>\r\n"
				+ "                                        <input type=\"radio\" name=\"Payment\" id=\"UPI\" value=\"UPI\">UPI\r\n"
				+ "                                        <br>\r\n"
				+ "                                   </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                              <tr align='center'>\r\n"
				+ "                                   <td>\r\n"
				+ "                                        <input type=\"submit\" value=\"Pay\" class=\"btn btn-primary\">\r\n"
				+ "                                   </td>\r\n"
				+ "                                   <td>\r\n"
				+ "                                        <a href=\"select.html\" class=\"btn btn-info\">Back</a>\r\n"
				+ "                                   </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                         </table>\r\n"
				+ "                    </form>\r\n"
				+ "               </div>\r\n"
				+ "          </div>\r\n"
				+ "     </div>\r\n"
				+ "\r\n"
				+ "     <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		
	}

}
