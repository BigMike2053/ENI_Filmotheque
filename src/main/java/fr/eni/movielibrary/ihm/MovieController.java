package fr.eni.movielibrary.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.movielibrary.bll.MovieServiceMock;
import fr.eni.movielibrary.bo.Movie;

@Controller
public class MovieController {

	@Autowired
	private MovieServiceMock movieServiceMock;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("movies", movieServiceMock.getAllMovies());
		return "home";
	}
	
	@GetMapping("/movie/{id}")
	public String detailMovie(Model model, @PathVariable("id") int id) {
		model.addAttribute("movie", movieServiceMock.getMovieById(id));
		return "detailMovie";
	}
	
	@GetMapping("/movie/edit/{id}")
	public String editMovie(Model model, @PathVariable("id") int id) {
		model.addAttribute("movie", movieServiceMock.getMovieById(id));
		return "editMovie";
	}
	
	@PostMapping("movie")
	public String movieSubmit(@ModelAttribute("formMovie") Movie movie) {
				
		return "redirect:/";
	}
	
}
