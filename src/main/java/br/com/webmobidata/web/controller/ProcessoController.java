package br.com.webmobidata.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProcessoController {

	@RequestMapping(value = "/processo", method = RequestMethod.GET)
	public String processo(){
		return "processo";
	}
}
