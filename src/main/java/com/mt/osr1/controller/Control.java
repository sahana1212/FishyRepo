package com.mt.osr1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mt.osr1.entity.Actor;
import com.mt.osr1.entity.Genre;
import com.mt.osr1.entity.Movie;
import com.mt.osr1.exception.MovieException;
import com.mt.osr1.service.ActorService;
import com.mt.osr1.service.GenreService;
import com.mt.osr1.service.MovieService;
import com.mt.osr1.serviceimpl.ActorServiceImpl;
import com.mt.osr1.serviceimpl.GenreServiceImpl;
import com.mt.osr1.serviceimpl.MovieServiceImpl;

	
	@Controller
	public class Control {
		@RequestMapping("/calladdgenre")
		public ModelAndView callGenreDetails() {
			System.out.println("hiiii");
			Genre genre=new Genre();
			return new ModelAndView("GenreForm","command",genre);
		}
		
		@RequestMapping(value="/addgenre", method=RequestMethod.POST)
		public ModelAndView addEmployee(@ModelAttribute("genre") Genre genre) throws MovieException
		{
			System.out.println(genre);
			GenreService obj1=new GenreServiceImpl();
			obj1.addGenre(genre);
			return new ModelAndView("redirect:/");
			
		}
		
		@RequestMapping("/calldisplaygenre")
		public ModelAndView callEmployeeDisplay()
		{
			Genre genre=new Genre();
			return new ModelAndView("DisplayPageGenre", "command", genre);
		}
		
		@RequestMapping(value="/displaygenre", method=RequestMethod.GET)
		public ModelAndView displayEmployeeDetails(@ModelAttribute("employee") Genre genre) throws MovieException
		{
			System.out.println(genre);
			GenreService obj2= new GenreServiceImpl();
			List<Genre> emplist= new ArrayList<Genre>();
			emplist=obj2.displayAllGenres();
			System.out.println(emplist);
			return new ModelAndView("GenreDisplay","list",emplist);
			
		}
		
		
		@RequestMapping("/calladdactor")
		public ModelAndView callActorDetails() {
			//System.out.println("hiiiiiiiiiiiiiiii");
			Actor actor=new Actor();
			return new ModelAndView("ActorForm","command",actor);
		}
		
		@RequestMapping(value="/addactor", method=RequestMethod.POST)
		public ModelAndView addActor(@ModelAttribute("actor") Actor actor) throws MovieException
		{
			System.out.println(actor);
			ActorService obj1=new ActorServiceImpl();
			obj1.addActor(actor);
			return new ModelAndView("redirect:/");
			
		}
		
		@RequestMapping("/calldisplayactor")
		public ModelAndView callActorDisplay()
		{
			Actor actor=new Actor();
			return new ModelAndView("DisplayPageActor", "command", actor);
		}
		
		@RequestMapping(value="/displayactor", method=RequestMethod.GET)
		public ModelAndView displayEmployeeDetails(@ModelAttribute("actor") Actor actor) throws MovieException
		{
			System.out.println(actor);
			ActorService obj2= new ActorServiceImpl();
			List<Actor> emplist= new ArrayList<Actor>();
			emplist=obj2.displayAllActor();
			System.out.println(emplist);
			return new ModelAndView("ActorDisplay","list",emplist);
			
		}
		

		@RequestMapping("/calladdmovie")
		public ModelAndView callMovieDetails() {
			//System.out.println("hiiiiiiiiiiiiiiii");
			Movie movie=new Movie();
			return new ModelAndView("MovieForm","command",movie);
		}
		
		@RequestMapping(value="/addmovie", method=RequestMethod.POST)
		public ModelAndView addMovie(@ModelAttribute("movie") Movie movie) throws MovieException
		{
			System.out.println(movie);
			MovieService obj1=new MovieServiceImpl();
			obj1.addMovie(movie);
			return new ModelAndView("redirect:/");
			
		}
		
		@RequestMapping("/calldisplaymovie")
		public ModelAndView callMovieDisplay()
		{
			Movie movie = new Movie();
			return new ModelAndView("DisplayPageMovie", "command", movie);
		}
		
		@RequestMapping(value="/displaymovie", method=RequestMethod.GET)
		public ModelAndView displayMovieDetails(@ModelAttribute("movie") Movie movie) throws MovieException
		{
			System.out.println(movie);
			MovieService obj2= new MovieServiceImpl();
			List<Movie> emplist= new ArrayList<Movie>();
			emplist=obj2.displayAllMovies();
			System.out.println(emplist);
			return new ModelAndView("MovieDisplay","list",emplist);
			
		}
		

		@RequestMapping("/calldisplaymoviegenre")
		public ModelAndView callMovieDisplayGenre()
		{
			Movie movie = new Movie();
			return new ModelAndView("DisplayPageMovieGenre", "command", movie);
		}
		
		@RequestMapping(value="/displaymoviegenre", method=RequestMethod.GET)
		public ModelAndView displayMovieDetailsByGenre(@ModelAttribute("movie") Movie movie) throws MovieException
		{
			System.out.println(movie);
			MovieService obj2= new MovieServiceImpl();
			List<Movie> emplist= new ArrayList<Movie>();
			emplist=obj2.displayMoviesByGenre(movie.getGenre().getGid());
			System.out.println(emplist);
			return new ModelAndView("MovieGenreDisplay","list",emplist);
			
		}
		
		@RequestMapping("/calldisplaymovieboxoffice")
		public ModelAndView callMovieDisplayboxoffice()
		{
			Movie movie = new Movie();
			return new ModelAndView("DisplayPageMovieBox", "command", movie);
		}
		
		@RequestMapping(value="/displaymoviegenrebox", method=RequestMethod.GET)
		public ModelAndView displayMovieDetailsByBox(@ModelAttribute("movie") Movie movie) throws MovieException
		{
			System.out.println(movie);
			MovieService obj2= new MovieServiceImpl();
			List<Movie> emplist= new ArrayList<Movie>();
			emplist= obj2.displayMoviesByBoxoffice();
			System.out.println(emplist);
			return new ModelAndView("MovieGenreDisplay","list",emplist);
			
		}
		
		@RequestMapping("/callupdate")
		public ModelAndView callMovieupdate() {
			//System.out.println("hiiiiiiiiiiiiiiii");
			Movie movie=new Movie();
			return new ModelAndView("UpdateForm","command",movie);
		}
		
		@RequestMapping(value="/updatemovie", method=RequestMethod.POST)
		public ModelAndView updateMovie(@ModelAttribute("movie") Movie movie) throws MovieException
		{
			System.out.println(movie);
			int id= movie.getMid();
			int boxoffice = movie.getBoxoffice();
			MovieService obj1=new MovieServiceImpl();
			obj1.updateMovie(id, boxoffice);
			return new ModelAndView("redirect:/");
			
		}

		

}
