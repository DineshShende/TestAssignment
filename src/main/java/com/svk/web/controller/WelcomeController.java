package com.svk.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.svk.web.services.PersonServiceImpl;
import com.svk.web.type.Person;




@Controller
public class WelcomeController {
			
		@Autowired
		private PersonServiceImpl personService;
	
			/*@RequestMapping(value="/hello",method = RequestMethod.GET)
			public String welcome(Model model){
				
				model.addAttribute("title", "Welcome to Our site");
				return "welcome";
			}
			
			@RequestMapping(value="/add",method = RequestMethod.POST)
			public String addPerson(@ModelAttribute("person")Person person,Model model){
				
				personService.addPerson(person.getId(), person.getName(), person.getCity());
				Collection<PersonPersistence> col=personService.getAllPersons();
		
				model.addAttribute("msg","you are in success ");
				model.addAttribute("personlist",col);
				return "success";
			}*/
			
			@RequestMapping(value = "/persons", method = RequestMethod.GET)
		    public String listPersons(Model model) {
		        model.addAttribute("person", new Person());
		        model.addAttribute("listPersons", this.personService.getAllPersons());
		        return "person";
		    }
			
			@RequestMapping(value= "/person/add", method = RequestMethod.POST)
		    public String addPerson(@ModelAttribute("person") Person p){
		         
				this.personService.addPerson(p.getId(), p.getName(), p.getCity());
		         
		        return "redirect:/persons";
		         
		    }
		     
		    @RequestMapping("/remove/{id}")
		    public String removePerson(@PathVariable("id") int id){
		         
		        this.personService.deletePerson(id);
		        return "redirect:/persons";
		    }
		  
		    @RequestMapping("/edit/{id}")
		    public String editPerson(@PathVariable("id") int id, Model model){
		        model.addAttribute("person", this.personService.getPersonById(id));
		        model.addAttribute("listPersons", this.personService.getAllPersons());
		        return "person";
		    }
			
}
