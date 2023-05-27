package com.codingdojo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.web.models.Dog;

/**
 * Servlet implementation class Dogs
 */
@WebServlet("/dog")
public class Dogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Procesar la solicitud
	        String name = request.getParameter("name");
	        String breed = request.getParameter("breed");
	        int weight = Integer.parseInt(request.getParameter("weight"));
	        // Crear el modelo
	        Dog dog = new Dog(name, breed,weight);
	        //Establecer el modelo para la vista
	       request.setAttribute("dog", dog);
	        // Permita que la vista maneje la solicitud 
	        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/dog.jsp");
	        view.forward(request, response);
	    }

}
