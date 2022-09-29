package fr.eni.filmotheque.ihm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.filmotheque.bo.Film;

@Controller
@RequestMapping("/accueil")
public class MainController {
	

	
	@RequestMapping
	public String main() {
		System.out.println("blabla");
		return "accueil";
	}
	

}
