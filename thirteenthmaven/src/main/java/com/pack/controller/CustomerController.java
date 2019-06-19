package com.pack.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.model.Customer;

@Controller
public class CustomerController {
  @RequestMapping(value="/cust/save",method=RequestMethod.GET)
  public String saveCustomerPage(ModelMap model)
  {
	  model.addAttribute("customer",new Customer());
	  return "custSave";
  }
  @RequestMapping(value="/cust/save.do",method=RequestMethod.POST)
  public String saveCustomerAction(@Valid Customer customer,BindingResult bindingResult,Model model)
  {
	  if(bindingResult.hasErrors())
	  {
		  return "custSave";
	  }
	  model.addAttribute("customer",customer);
	  return "custSaveSuccess";
  }
  
}
