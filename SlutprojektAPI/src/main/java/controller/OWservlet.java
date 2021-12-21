package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GetTheWeather;
import model.WeatherBean;

/**
 * Servlet implementation class OWservlet
 */
@WebServlet("/OWservlet")
public class OWservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OWservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		
		
		PrintWriter out = response.getWriter();
		
		String cityStr = request.getParameter("city").toUpperCase();
		String countryStr = request.getParameter("country").toUpperCase();
		WeatherBean wBean = new WeatherBean(cityStr, countryStr);		
		
		//Set name, value, time and then add the cookies
		Cookie ckCity = new Cookie("City", wBean.getCityStr() );
		ckCity.setMaxAge(60*60*24*365);
		response.addCookie(ckCity);
		
		Cookie ckCountry = new Cookie("Country", wBean.getCountryStr() );
		ckCountry.setMaxAge(60*60*24*365);
		response.addCookie(ckCountry);
		
		Cookie ckClouds = new Cookie("Clouds", wBean.getCloudsStr());
		ckClouds.setMaxAge(60*60*24*365);
		response.addCookie(ckClouds);
		
		Cookie ckDate = new Cookie("Date", String.valueOf(wBean.getDateStr()));
		ckDate.setMaxAge(60*60*24*365);
		response.addCookie(ckDate);
		
		Cookie ckTemperature = new Cookie("Temperature", String.valueOf(wBean.getTemperatureKelvin()));
		ckTemperature.setMaxAge(60*60*24*365);
		response.addCookie(ckTemperature);
		
		
		GetTheWeather.getWeather(wBean);

		request.setAttribute("wBean", wBean);

		RequestDispatcher rd = request.getRequestDispatcher("ShowWeather.jsp");
		rd.forward(request, response);
		
		
		
		
		
		
		
		
		
		
		/*
		 * Cookie ckCountry = new Cookie("Country", wBean.getCountryStr());
		 * ckCountry.setMaxAge(3600); response.addCookie(ckCountry);
		 * 
		 * Cookie ckDate = new Cookie("Date", wBean.getDateStr());
		 * ckDate.setMaxAge(3600); response.addCookie(ckDate);
		 * 
		 * Cookie ckCloud = new Cookie("Clouds", wBean.getCloudsStr());
		 * ckCloud.setMaxAge(3600); response.addCookie(ckCloud);
		 */

	}
}