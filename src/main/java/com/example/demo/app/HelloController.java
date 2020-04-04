package com.example.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Player;
import com.example.demo.service.PlayerService;

@Controller
@RequestMapping("/players")
public class HelloController {

	@Autowired
	private PlayerService playerService;
	
	@GetMapping
	public String index(Player player, Model model) {
		model.addAttribute("players", playerService.findAll());
		model.addAttribute("player", player);
		return "players/index";
	}
	

	    @GetMapping("/edit/{id}")
	    public String edit(@PathVariable Long id, Model model) {
	        model.addAttribute("player", playerService.findOne(id));
	        return "players/edit";
	    }

//	    @GetMapping("{id}")
//	    public String show(@PathVariable Long id, Model model) {
//	        model.addAttribute("player", playerService.findOne(id));
//	        return "players/show";
//	    }

	    @PostMapping
	    public String create(@ModelAttribute @Validated Player player,BindingResult result, Model model) {

	    	if(!result.hasErrors()) {
		        playerService.save(player);     
		        return "redirect:/players";
			}else {
				model.addAttribute("players", playerService.findAll());
				return "players/index";
			}

	    }

	    @PostMapping("/edit/{id}")
	    public String update(@PathVariable Long id, @ModelAttribute Player player) {
	        player.setId(id);
	        playerService.update(player);
	        return "redirect:/players";
	    }

	    @GetMapping("/delete/{id}")
	    public String destroy(@PathVariable Long id) {
	        playerService.delete(id);
	        return "redirect:/players";
	    }
}
