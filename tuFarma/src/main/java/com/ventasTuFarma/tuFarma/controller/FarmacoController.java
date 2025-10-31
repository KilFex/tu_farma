package com.ventasTuFarma.tuFarma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ventasTuFarma.tuFarma.model.Farmaco;
import com.ventasTuFarma.tuFarma.service.FarmacoService;

@Controller
@RequestMapping("/farmacos")
public class FarmacoController {
	
	@Autowired
	private FarmacoService farmacoService;
	
	@GetMapping
	public String listarFarmaco(Model model) {
		
		model.addAttribute("farmacos", farmacoService.obtenerFarmacos());
		
		model.addAttribute("farmacoInsertar", new Farmaco());
		
	return "farmacos.html";
	}
	
	@PostMapping("/guardar")
	public String guardarFarmaco(@ModelAttribute("farmacoInsertar")Farmaco farmaco, RedirectAttributes redirectAttrs) {
		
		farmacoService.guardar(farmaco);
		redirectAttrs.addFlashAttribute("guardadoExsitoso","El farmaco fue guardado correctamente");
		return "redirect:/farmacos";
	}
	
	@GetMapping("/editar/{id}")
	public String editarFarmaco(@org.springframework.web.bind.annotation.PathVariable Long id, Model model) {
	    Farmaco farmaco = farmacoService.obtenerPorId(id);

	    
	    if (farmaco == null) {
	        return "redirect:/farmacos";
	    }

	    
	    model.addAttribute("farmacos", farmacoService.obtenerFarmacos());
	    model.addAttribute("farmacoInsertar", farmaco); 
	    return "farmacos.html";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminarFarmaco(@org.springframework.web.bind.annotation.PathVariable Long id, RedirectAttributes redirectAttrs) {
	    farmacoService.eliminar(id);
	    redirectAttrs.addFlashAttribute("guardadoExitoso", "Fármaco eliminado correctamente");
	    return "redirect:/farmacos";
	}

	

}
