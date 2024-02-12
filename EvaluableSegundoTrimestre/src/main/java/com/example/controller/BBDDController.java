package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.BBDDService;

@Controller

public class BBDDController {
	
	@Autowired
	protected BBDDService conexionServices;
 
	/**
	 * Para crear la conexion a base de datos
	 *
	 * @author Junco
	 * @see BBDDService#llamarBaseDatos()
	 */
 
	@ResponseBody
	@GetMapping("/llamarBaseDatos")
	public void llamarBaseDatos() {
		conexionServices.llamarBaseDatos();
 
	}
 
	/**
	 * Para crear las tablas de nuestra base de datos trabajofintrimestre
	 *
	 * @author Patricia
	 * @see BBDDService#crearTablas(), BBDDRepository#crearTablas()
	 */
 
	@ResponseBody
	@GetMapping("/crearTablas")
	public void crearTablas() {
		conexionServices.crearTablas();
 
	}
	
}
