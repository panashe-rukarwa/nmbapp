package com.example.NMBapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.NMBapp.domain.Account;
import com.example.NMBapp.domain.Customer;
import com.example.NMBapp.service.NmbService;

@Controller
public class NmbController {
	@Autowired
	private NmbService service;
	
	@GetMapping("/")
	public String viewHomePage(Model model){
	    List<Customer>listcustomer = service.listAll();
	    model.addAttribute("listcustomer", listcustomer);
	    List<Account>listaccount = service.listAllAcc();
	    model.addAttribute("listaccount", listaccount);
	    System.out.println("Get/");
	    return "index";
	}

	@GetMapping("/new")
	public String add(Model model){
	    model.addAttribute("customer", new Customer());
	    return "new";
	}

	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer std){
	    service.save(std);
	    return "redirect:/";
	} 


	@RequestMapping("/edit/{id}")
	public ModelAndView showEditCustomerPage(@PathVariable(name="id")int id){
	    ModelAndView mav = new ModelAndView("new");
	    Customer std = service.get(id);
	    mav.addObject("customer", std);
	    return mav;
	} 

	@RequestMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable(name="id")int id){
	    service.delete(id);
	    return "redirect:/";
	} 


	@GetMapping("/newaccount")
	public String addAcc(Model model){
	    model.addAttribute("account", new Account());
	    return "newAccount";
	}

	@RequestMapping(value="/saveAcc", method=RequestMethod.POST)
	public String saveAccount(@ModelAttribute("account") Account std){
	    service.save(std);
	    return "redirect:/";
	} 


	@RequestMapping("/editAcc/{id}")
	public ModelAndView showEditAccountPage(@PathVariable(name="id")int id){
	    ModelAndView mav = new ModelAndView("NewAccount");
	    Customer std = service.get(id);
	    mav.addObject("account", std);
	    return mav;
	} 

	@RequestMapping("/deleteAcc/{id}")
	public String deleteAccount(@PathVariable(name="id")int id){
	    service.delete(id);
	    return "redirect:/";
	} 

}
