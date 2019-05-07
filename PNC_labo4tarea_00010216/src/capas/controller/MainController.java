package capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	public ModelAndView form(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("main"); // regresa a pagina principal y muestra errores
		}else {
		mav.setViewName("result");
		mav.addObject("message", "Product was inserted successfully");
		}
		return mav;
	}
	
}
