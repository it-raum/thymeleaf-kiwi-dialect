package ch.itraum.thymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.itraum.thymeleaf.model.Category;
import ch.itraum.thymeleaf.model.FormBean;

@Controller
public class FormController {
	
	private final Logger logger = LoggerFactory.getLogger(FormController.class);
	
	@ModelAttribute("categoryList")
	public List<Category> populateCategorys() {
		return Arrays.asList(Category.values());
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String showForm(Model model) {
		
		model.addAttribute(new FormBean());
		
		return "form";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String processForm(@Valid FormBean formBean, BindingResult bindingResult, Model model) {
		
		logger.debug("FormBean: " + formBean);
		
		if (bindingResult.hasErrors())
		{
			return "form";
		}
		
		return "form";
	}

}
