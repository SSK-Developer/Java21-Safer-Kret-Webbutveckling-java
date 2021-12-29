package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

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

		// deklarerar en printwriter
		PrintWriter out = response.getWriter();

		// getting city and country parameters from index.jsp form, and storing them in
		// string variables.
		String cityStr = request.getParameter("city").toUpperCase();
		String countryStr = request.getParameter("country").toUpperCase();

		// Instancing weatherbean class and entering values in the constructor.
		WeatherBean wBean = new WeatherBean(cityStr, countryStr);
		GetTheWeather.getWeather(wBean);

		// Set name, value, time and then add the cookies
		Cookie ckCity = new Cookie("City", wBean.getCityStr());
		ckCity.setMaxAge(60 * 60 * 24 * 365);
		response.addCookie(ckCity);

		Cookie ckCountry = new Cookie("Country", wBean.getCountryStr());
		ckCountry.setMaxAge(60 * 60 * 24 * 365);
		response.addCookie(ckCountry);

		Cookie ckClouds = new Cookie("Clouds", URLEncoder.encode(wBean.getCloudsStr(), "UTF-8"));
		ckClouds.setMaxAge(60 * 60 * 24 * 365);
		response.addCookie(ckClouds);

		Cookie ckDate = new Cookie("Date", String.valueOf(wBean.getDateStr()));
		ckDate.setMaxAge(60 * 60 * 24 * 365);
		response.addCookie(ckDate);

		Cookie ckTemperature = new Cookie("Temperature", String.valueOf(wBean.getTemperatureCelsius()));
		ckTemperature.setMaxAge(60 * 60 * 24 * 365);
		response.addCookie(ckTemperature);

		//
		request.setAttribute("wBean", wBean);

		// redirecting user to ShowWeather.jsp
		RequestDispatcher rd = request.getRequestDispatcher("ShowWeather.jsp");
		rd.forward(request, response);

	}
}