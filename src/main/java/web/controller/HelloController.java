package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.servise.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
//	@Autowired
//	private final CarService carService;

//	public HelloController(CarService carService) {
//		this.carService = carService;
//	}

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		//carService.gen5();
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}