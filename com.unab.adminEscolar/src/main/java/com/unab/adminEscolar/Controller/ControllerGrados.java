package com.unab.adminEscolar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.unab.adminEscolar.DAO.Grados_AcademicosDAO;
import com.unab.adminEscolar.DAO.MateriasDAO;
import com.unab.adminEscolar.Entidades.Grados_Academicos;

@Controller
public class ControllerGrados {

	@Autowired
	private Grados_AcademicosDAO gradosdao;
	@Autowired
	private MateriasDAO materiasdao;
	
	@GetMapping("/principal")
	public String Inicio(Model m) {
		var grados = gradosdao.findAll();
		var materias = materiasdao.findAll();
		m.addAttribute("Grados", grados);
		m.addAttribute("materias", materias);
		return "principal";
	}
	
	@GetMapping("/agregar")
	public String add(Grados_Academicos grados) {
		return "agregarGrado";
	}
	
	@PostMapping("/guardar")
	public String guardar(Grados_Academicos grados) {
		
		gradosdao.save(grados);
		return "redirect:/principal";
	}
	
	@GetMapping("/editar/{idgradoacademico}")
	public String Editar(Grados_Academicos grados, Model m) {
		grados = gradosdao.findById(grados.getIdGradoAcademico()).orElse(null);
		m.addAttribute("grados", grados);
		return "agregarGrado";
	}
	
	/*@GetMapping("/eliminar/{idgradoacademico}")
	public String eliminar(Grados_Academicos grados) {
		
		gradosdao.delete(grados);
		return "redirect:/principal";
	}*/
}
