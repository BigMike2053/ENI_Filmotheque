package fr.eni.movielibrary.bll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.eni.movielibrary.bo.Genre;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Participant;
import fr.eni.movielibrary.bll.MovieService;


@Service
@Profile("dev")
public class MovieServiceMock implements MovieService {
	
	// Attributs static pour gérer les valeurs à afficher
		private static List<Movie> lstMovies;
		private static List<Genre> lstGenres;
		private static List<Participant> lstParticipants;

		private static final String[] genres = { "Animation", "Science-fiction", "Documentaire", "Action", "Comédie",
				"Drame" };

		public MovieServiceMock() {
			
			// Création de la liste des genres
			lstGenres = new ArrayList<>();
			for (int index = 0; index < genres.length; index++) {
				lstGenres.add(new Genre(index + 1, genres[index]));
			}

			// Création de la liste des participants
			lstParticipants = new ArrayList<>();
			// 2 réalisateurs dont 1 pour 2 films
			Participant stevenSpielberg = new Participant(1, "Spielberg", "Steven");
			Participant davidCronenberg = new Participant(2, "Cronenberg", "David");
			lstParticipants.add(stevenSpielberg);
			lstParticipants.add(davidCronenberg);

			// 2 acteurs par film et l'un d'eux dans 2 films
			Participant richardAttenborough = new Participant(3, "Attenborough", "Richard");
			Participant jeffGoldblum = new Participant(4, "Goldblum", "Jeff");
			List<Participant> actorsJurassicPark = new ArrayList<>();
			actorsJurassicPark.add(richardAttenborough);
			actorsJurassicPark.add(jeffGoldblum);
			lstParticipants.addAll(actorsJurassicPark);

			Participant geenaDavis = new Participant(5, "Davis", "Geena");
			List<Participant> actorsTheFly = new ArrayList<>();
			actorsTheFly.add(jeffGoldblum);
			actorsTheFly.add(geenaDavis);
			lstParticipants.add(geenaDavis);

			Participant markRylance = new Participant(6, "Rylance", "Mark");
			Participant rubyBarnhill = new Participant(7, "Barnhill", "Ruby");
			List<Participant> actorsTheBFG = new ArrayList<>();
			actorsTheBFG.add(markRylance);
			actorsTheBFG.add(rubyBarnhill);
			lstParticipants.addAll(actorsTheBFG);

			// Création de la liste de films
			// 3 films
			lstMovies = new ArrayList<>();
			Movie jurassicPark = new Movie(1, "Jurassic Park", 1993, 128,
					"Le film raconte l'histoire d'un milliardaire et son équipe de généticiens parvenant à ramener à la vie des dinosaures grâce au clonage.",
					"data:image/jpeg;base64,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uvQ9wqTpu8HY9Kdt5hs+tVh1388kMv3nBpVP9Kdn9/uc6/8AysP+ovN7pdYH6Fw/2XJLgpfO5oWMqb7PwPTBt7hsGtLh1nc8sMP2sDitRinlJr5biLJC08WNzvt859/sAXFXRW0vRGDpva2LvjJt+x5ew8SxVWWV7csi/UVMkji+R7nvdve9xe4+JOqs3UIukkkklojOEREAREQBERAQilEBAUoiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiICEREAClEQBERAEREAREQBERAEREAREQBERAEREAREQBERAQiIgJRQFKAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAKFKICEUogIClQpQBERAEREAREQBERAEREAREQBERAEREAREQBERAQiIgAUqApQBERAEREAREQBERAEREAREQBERAEREAREQBERAEUIgAUqApQBERAEREAREQBERAEREAREQBERAEREAREQBERAQilEBAUqApQGU2luAbnUbsp05eKolgyi9+Ntyshx5n1oXE7yosy1zp7OUc+N2Qqmi5AG8qlAVJUVyxlpsd6qkgc29xuNt/G11TI8u1Jv4qXyOda5JtzKjMs/p52v3ae36Ffmz8mbL1ct73HxsvtUwUz32yi+oG8bzuVsSHdmNt2/h4Kprrbn214AqMz3Hs3Ja235pZ91/jfmUxRFxsN+v2JHES7KNTrx5KsEA3D9eYBS4vfOb87G+qk8qMbK/HPNaddS3JEWmx3pGwkgDeTZVGx1LjfwUAM+OfqfxQjZW1lpzV7ddQ2Il2Xje2/ipfCQQ07za3p3Kl3MG557lBcTqTrzQj1baZ347vO/2Fc8LmGx5fw/BJYS2xO5263cqHOJ3m/ij3E7yT4lMyW4O9k+7MpQBEUlZfFOLX6QfVdb2KwQpueahQj3KSeit1+LYREUnggKVKICHSEqLoiC9xdLoiAJdEQBERALpdEQC6XREAuiIgF0uiIBdLoiAXS6IgF0REB//9k=");
			jurassicPark.setGenre(lstGenres.get(1));
			jurassicPark.setDirector(stevenSpielberg);
			jurassicPark.setListActors(actorsJurassicPark);
			lstMovies.add(jurassicPark);

			Movie theFly = new Movie(2, "The Fly", 1986, 95,
					"Il s'agit de l'adaptation cinématographique de la nouvelle éponyme de l'auteur George Langelaan.",
					"https://m.media-amazon.com/images/M/MV5BODcxMGMwOGEtMDUxMi00MzE5LTg4YTYtYjk1YjA4MzQxNTNlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg");
			theFly.setGenre(lstGenres.get(1));
			theFly.setDirector(davidCronenberg);
			theFly.setListActors(actorsTheFly);
			lstMovies.add(theFly);

			Movie theBFG = new Movie(3, "The BFG", 2016, 117,
					"Le Bon Gros Géant est un géant bien différent des autres habitants du Pays des Géants.",
					"https://candidcover.net/wp-content/uploads/9780141361321.jpg");
			theBFG.setGenre(lstGenres.get(4));
			theBFG.setDirector(stevenSpielberg);
			theBFG.setListActors(actorsTheBFG);
			lstMovies.add(theBFG);
		}

		@Override
		public List<Movie> getAllMovies() {
			return lstMovies;
		}

		@Override
		public Movie getMovieById(long id) {
			for (Movie movie : lstMovies) {
				if (movie.getId() == id) {
					return movie;
				}
			}
			return null;
		}

		@Override
		public List<Genre> getGenres() {
			return lstGenres;
		}

		@Override
		public List<Participant> getParticipants() {
			return lstParticipants;
		}

		@Override
		public Genre getGenreById(long id) {
			for (Genre genre : lstGenres) {
				if (genre.getId() == id) {
					return genre;
				}
			}
			return null;
		}

		@Override
		public Participant getParticipantById(long id) {
			for (Participant participant : lstParticipants) {
				if (participant.getId() == id) {
					return participant;
				}
			}
			return null;
		}

		@Override
		public void saveMovie(Movie movie) {
			lstMovies.add(movie);
		}

}
