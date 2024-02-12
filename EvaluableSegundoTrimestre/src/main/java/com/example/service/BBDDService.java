package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.BBDDRepository;

@Service
public class BBDDService {
	
	@Autowired
	protected BBDDRepository repositorioBBDD;
 
	/**
	 * El service que crea la conexion para el resto del proyecto
	 *
	 * @author Junco
	 * @see BBDDRepository#llamarBaseDatos(), BBDDController#llamarBaseDatos()
	 */
 
	public void llamarBaseDatos() {
		repositorioBBDD.llamarBaseDatos();
 
	}
 
	/**
	 * El service de creacion de tablas
	 *
	 * @author Patricia
	 * @see BBDDRepository#crearTablas(), BBDDController#llamarBaseDatos()
	 */
 
	public void crearTablas() {
		repositorioBBDD.crearTablas();
 
	}
}
