package br.com.webmobidata.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.webmobidata.web.model.Usuario;

@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Model model){
		model.addAttribute("usuario", new Usuario());
		return "login";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String processLogin(Model model, Usuario usuario){
		if( null != usuario && usuario.getUsername().equals("teste@gmail.com") && usuario.getPassword().equals("12345")){
			model.addAttribute("usuario", usuario);
			return "processo";
		}
		return "login";
	}
}
