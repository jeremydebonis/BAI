package com.daveo.bai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daveo.bai.model.Utilisateur;
import com.daveo.bai.service.UtilisateurService;

@RestController
@RequestMapping(value="/utilisateur")
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService utilisateurService;
		
	@RequestMapping(value="/liste", method=RequestMethod.GET)
	public List<Utilisateur> listeUtilisateurs() {
		return utilisateurService.selectionnerUtilisateurs();
	}

//	@RequestMapping(value="/ajouter", method=RequestMethod.GET)
//	public ModelAndView ajouterUtilisateurPage() {
//		ModelAndView modelAndView = new ModelAndView("ajoutUtilisateurForm");
//		modelAndView.addObject("utilisateur", new Utilisateur());
//		return modelAndView;
//	}
//	
//	@RequestMapping(value="/ajouter", method=RequestMethod.POST)
//	public ModelAndView ajouterIdee(@ModelAttribute Utilisateur utilisateur) {
//		
//		ModelAndView modelAndView = new ModelAndView("home");
//		utilisateurService.ajouterUtilisateur(utilisateur);
//		
//		String message = "L'utilisateur a été parfaitement ajoutée.";
//		modelAndView.addObject("message", message);
//		
//		return modelAndView;
//	}
//	
//	
//	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
//	public ModelAndView editTeamPage(@PathVariable Integer id) {
//		ModelAndView modelAndView = new ModelAndView("edit-team-form");
////		Team team = ideeService.getTeam(id);
////		modelAndView.addObject("team",team);
//		return modelAndView;
//	}
//	
//	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
//	public ModelAndView mettreAJourIdee(@ModelAttribute Idee idee, @PathVariable Integer id) {
//		
//		ModelAndView modelAndView = new ModelAndView("home");
////		
////		ideeService.updateTeam(team);
////		
////		String message = "Team was successfully edited.";
////		modelAndView.addObject("message", message);
//		
//		return modelAndView;
//	}
//	
//	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
//	public ModelAndView deleteTeam(@PathVariable Integer id) {
//		ModelAndView modelAndView = new ModelAndView("home");
////		ideeService.dele(id);
////		String message = "Team was successfully deleted.";
////		modelAndView.addObject("message", message);
//		return modelAndView;
//	}

}
