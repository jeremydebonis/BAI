package com.daveo.bai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daveo.bai.model.Idee;
import com.daveo.bai.model.Utilisateur;
import com.daveo.bai.service.IdeeService;

@Controller
@RequestMapping(value="/idee")
public class IdeeController {
	
	@Autowired
	private IdeeService ideeService;
	
	@RequestMapping(value="/ajouter", method=RequestMethod.GET)
	public ModelAndView ajouterUtilisateurPage() {
		ModelAndView modelAndView = new ModelAndView("ajoutIdeeForm");
		modelAndView.addObject("idee", new Idee());
		return modelAndView;
	}
	
	@RequestMapping(value="/ajouter", method=RequestMethod.POST)
	public ModelAndView ajouterIdee(@ModelAttribute Idee idee) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		ideeService.ajouterIdee(idee);
		
		String message = "L'idée a été parfaitement ajoutée.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfTeams() {
		ModelAndView modelAndView = new ModelAndView("listeIdees");
		
		List<Idee> idees = ideeService.selectionnerIdees();
		modelAndView.addObject("idees", idees);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editTeamPage(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("edit-team-form");
//		Team team = ideeService.getTeam(id);
//		modelAndView.addObject("team",team);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public ModelAndView mettreAJourIdee(@ModelAttribute Idee idee, @PathVariable Integer id) {
		
		ModelAndView modelAndView = new ModelAndView("home");
//		
//		ideeService.updateTeam(team);
//		
//		String message = "Team was successfully edited.";
//		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteTeam(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
//		ideeService.dele(id);
//		String message = "Team was successfully deleted.";
//		modelAndView.addObject("message", message);
		return modelAndView;
	}

}
