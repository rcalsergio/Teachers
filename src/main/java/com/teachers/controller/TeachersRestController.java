package com.teachers.controller;

import java.net.URI;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.teachers.model.Teacher;
import com.teachers.service.IServiceTeacher;

@RequestMapping("/")
@RestController
public class TeachersRestController {

	@Autowired
	private IServiceTeacher serviceTeacher;


	@GetMapping("/")
	public ResponseEntity<Object> hello(){
		return ResponseEntity.status(HttpStatus.FOUND)
		        .location(URI.create("/teachers"))
		        .build();
	}
	
	//PreCondición:  Se recibirá una petición GET a /teachers
	//Acción: --
	//PostCondición: Se devolverá un json con todos los profesores
	//Truco: Desde el servicio podemos llamar a una función que ya nos devuelve todos los profesores
	@GetMapping("/teachers")
	public List<Teacher> listar(){
		//TO DO
		return null;
	}

	//PreCondición:  Se recibirá una petición DELETE a /teachers/{id}.
	//Acción: Borrar el profesor con el id correspondiente
	//PostCondición: El profesor ya no existe en /teachers. Se devolverá un String: "OK" o un error que empiece por "ERROR: " con una descipción
	//Truco: Desde el servicio podemos llamar a una función que ya nos borra el item con el id correspondiente
	@DeleteMapping("/teachers/{id}")
	public String delete(@PathVariable Long id){
		//TO DO
		return null;
	}

	//PreCondición:  Se recibirá una petición POST a /teachers y se enviarán los datos del nuevo profesor ("fistName", "lastName", "course")
	//Acción: Se añade un nuevo profesor al repositorio.
	//PostCondición: El profesor aparece en /teachers. Se devolverá un String: "OK" o un error que empiece por "ERROR: " con una descipción
	//Truco: Usar ParseJsonToMap(body) para pasar el JSON que recibimos a map <String, Object>
	@PostMapping("/teachers")
	public String create(@RequestBody String body) {
		//TO DO
		return null;
	}
	
	//PreCondición:  Se recibirá una petición PUT a /teachers y se enviarán los datos del profesor ("fistName", "lastName", "course")
	//Acción: Se actualiza un nuevo profesor al repositorio.
	//PostCondición: El profesor aparece actualizado en /teachers. Se devolverá un String: "OK" o un error que empiece por "ERROR: " con una descipción
	//Truco: Usar ParseJsonToMap(body) para pasar el JSON que recibimos a map <String, Object>.
	//Truco2: El método save del servicio también actualiza el item si se le pasa el ID.
	@PutMapping("/teachers/{id}")
	public String update(@PathVariable Long id, @RequestBody String body) {
		//TO DO
		return null;
	}
	

	public Map < String, Object > ParseJsonToMap(String json) {
		JsonParser springParser = JsonParserFactory.getJsonParser();
		Map < String, Object > map = springParser.parseMap(json);
		return map;
	}	

}
