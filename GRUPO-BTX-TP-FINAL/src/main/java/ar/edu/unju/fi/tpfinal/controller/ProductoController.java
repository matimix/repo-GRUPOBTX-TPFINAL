package ar.edu.unju.fi.tpfinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.tpfinal.model.Producto;

@Controller
public class ProductoController {
	@Autowired
	private Producto producto;
	
	@GetMapping("/nuevo")
	public String getProductoPage(Model model) {
		model.addAttribute(producto);
		return "nuevo";
	}

}
