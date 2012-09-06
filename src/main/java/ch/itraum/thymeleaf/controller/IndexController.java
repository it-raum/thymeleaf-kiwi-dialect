package ch.itraum.thymeleaf.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.itraum.thymeleaf.model.FormBean;

@Controller
public class IndexController
{
	@RequestMapping(value = "/form",method = RequestMethod.GET)
	public String showIndex(Model model)
	{
		model.addAttribute(new FormBean());
		
		return "index";
	}
	
	@RequestMapping(value = "/form",method = RequestMethod.POST)
	public String processIndex(@Valid FormBean formBean,BindingResult bindingResult,Model model)
	{
		if(bindingResult.hasErrors())
		{
			return "index";
		}
		
		return "index";
	}
}
