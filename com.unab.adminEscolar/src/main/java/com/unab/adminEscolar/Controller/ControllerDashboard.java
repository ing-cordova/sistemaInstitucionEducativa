package com.unab.adminEscolar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.adminEscolar.DAO.GradoAcademicoDAO;

@Controller
public class ControllerDashboard {

	@Autowired
	private GradoAcademicoDAO gradosDAO;
	
	@GetMapping("/")
	public String inicio(Model m) {
		
		var grados = gradosDAO.findAll();
		m.addAttribute("grados", grados);
		return "index";
	}
}
