package fr.eni.movielibrary.ihm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.eni.movielibrary.bll.MovieServiceMock;
import fr.eni.movielibrary.bo.Movie;

@Controller("movieBean")
public class MovieController {

	@Autowired
	private MovieServiceMock movieServiceMock;
	
	public List<Movie> showAllMovies() {
		return movieServiceMock.getAllMovies();
	}

	public Movie findMovie(int i) {
		return movieServiceMock.getMovieById(i);
	}
	
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

}
