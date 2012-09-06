package ch.itraum.thymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.itraum.thymeleaf.model.UserOptionCheckBox;
import ch.itraum.thymeleaf.model.UserOptionRadio;

import ch.itraum.thymeleaf.model.TestFormBean;

@Controller
public class TestFormController
{
	@ModelAttribute("userOptionCheckBox")
	public List<UserOptionCheckBox> populateUserOptionCheckBox()
	{
		return Arrays.asList(UserOptionCheckBox.values());
	}
	
	@ModelAttribute("userOptionRadio")
	public List<UserOptionRadio> populateUserOptionRadio()
	{
		return Arrays.asList(UserOptionRadio.values());
	}
	
	@RequestMapping(value = "/testform",method = RequestMethod.GET)
	public String showForm(Model model)
	{
		model.addAttribute(new TestFormBean());
		
		return "testform";
	}
	
	@RequestMapping(value = "/testform",method = RequestMethod.POST)
	public String processForm(@Valid TestFormBean testFormBean,BindingResult bindingResult,Model model)
	{
		if(bindingResult.hasErrors())
		{
			return "testform";
		}
		
		//model.addAttribute(formBean);
		
		return "testform";
	}
}
