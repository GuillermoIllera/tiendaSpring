package es.springshop.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class pageController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Inicio");
		return "index";
	}
}
