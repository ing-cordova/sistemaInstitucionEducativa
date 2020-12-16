package com.unab.adminEscolar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.unab.adminEscolar.DAO.GradosDAO;
import com.unab.adminEscolar.DAO.MateriasDAO;
import com.unab.adminEscolar.Entidades.Grado;

@Controller
public class ControllerGrados {

	@Autowired
	private GradosDAO gradosdao;
	@Autowired
	private MateriasDAO materiasdao;
	
	@GetMapping("/principal")
	public String Inicio(Model m) {
		var grado = gradosdao.findAll();
		var materias = materiasdao.findAll();
		m.addAttribute("grado", grado);
		m.addAttribute("materias", materias);
		return "principal";
	}
	
	@GetMapping("/agregar")
	public String add(Grado grado) {
		return "agregarGrado";
	}
	
	@PostMapping("/guardar")
	public String guardar(Grado grado) {
		
		gradosdao.save(grado);
		return "redirect:/principal";
	}
	
	@GetMapping("/editar/{idGradoAcademico}")
	public String Editar(Grado grado, Model m) {
		grado = gradosdao.findById(grado.getIdGradoAcademico()).orElse(null);
		m.addAttribute("grado", grado);
		return "agregarGrado";
	}
	
	@GetMapping("/eliminar/{idGradoAcademico}")
	public String eliminar(Grado grado) {		
		gradosdao.delete(grado);
		return "redirect:/principal";
	}
}
