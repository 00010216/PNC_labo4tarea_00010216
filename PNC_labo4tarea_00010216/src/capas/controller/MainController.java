package capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import capas.domain.Product;


@Controller
public class MainController {

	//Central controller
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Product product = new Product();
		mav.setViewName("main");
		//mav.addObject("message","Hi");
		mav.addObject("product",product);// primer parametro hacer referencia al model attribute
		return mav;
	}
	
	//Controlador que recibe el usuario
	@RequestMapping("/formData")
	@ResponseBody
	public Product form(@ModelAttribute Product product) {
		return product;
	}
	
}
