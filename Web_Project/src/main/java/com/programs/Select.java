package com.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Select
 */
@WebServlet("/select")
public class Select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Select() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String movieName = request.getParameter("movie");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String type = request.getParameter("type");
		int seats = Integer.parseInt( request.getParameter("seats"));
		int amot = 0;
		if(type.equals("Gold"))
		{
			amot=seats*1000;
		}
		else if(type.equals("Elite"))
		{
			amot=seats*500;
		}
		else if(type.equals("Normal"))
		{
			amot=seats*200;
		}
		String amt = ""+amot;
		HttpSession session = request.getSession();
		session.setAttribute("moviName", movieName);
		session.setAttribute("date", date);
		session.setAttribute("time", time);
		session.setAttribute("type", type);
		session.setAttribute("seats", seats);
		session.setAttribute("Amount", amt);
		out.print("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "     <meta charset=\"UTF-8\">\r\n"
				+ "     <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "     <title>Select</title>\r\n"
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
				+ "                    <h1 style='font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;'>Online Ticket Booking System</h1><sub><h6>Easy ur work</h6></sub>\r\n"
				+ "               </div>\r\n"
				+ "          </div>\r\n"
				+ "     </div>\r\n"
				+ "     <div class=\"container\">\r\n"
				+ "          <h2 align=\"center\" style=\"margin-bottom: 30px;\">D E T A I L S</h2>\r\n"
				+ "          <div class=\"row\">\r\n"
				+ "               <div class=\"col\" align=\"center\">\r\n"
				+ "                    <form action=\"check\" method=\"post\">\r\n"
				+ "                         <table class=\"table table-borderless\">\r\n"
				+ "                              <tr>\r\n"
				+ "                                   <td>Movie Name: </td>\r\n"
				+ "                                   <td>"+movieName+"</td>\r\n"
				+ "                              </tr>\r\n"
				+ "                              <tr>\r\n"
				+ "                                   <td>Date: </td>\r\n"
				+ "                                   <td>"+date+"</td>\r\n"
				+ "                              </tr>\r\n"
				+ "                              <tr>\r\n"
				+ "                                   <td>Time: </td>\r\n"
				+ "                                   <td>"+time+"</td>\r\n"
				+ "                              </tr>\r\n"
				+ "                              <tr>\r\n"
				+ "                                   <td>Type: </td>\r\n"
				+ "                                   <td>"+type+"</td>\r\n"
				+ "                              </tr>\r\n"
				+ "                              <tr>\r\n"
				+ "                                   <td>Seats: </td>\r\n"
				+ "                                   <td>"+seats+"</td>\r\n"
				+ "                              </tr>\r\n"
				+ "                              <tr>\r\n"
				+ "                                 <td colspan=\"2\" align=\"center\">\r\n"
				+ "                                   <div class=\"row\">\r\n"
				+ "                                        <div class=\"col\">\r\n"
				+ "                                             <a href='book?id="+amt+"' class=\"btn btn-info\">Book</a>\r\n"
				+ "                                        </div>\r\n"
				+ "                                        <div class=\"col\">\r\n"
				+ "                                             <a href=\"select.html\" class=\"btn btn-info\">Back</a>\r\n"
				+ "                                        </div>\r\n"
				+ "                                   </div>\r\n"
				+ "                                 </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                         </table>\r\n"
				+ "                    </form>\r\n"
				+ "               </div>\r\n"
				+ "          </div>\r\n"
				+ "     </div>\r\n"
				+ "     <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

}
