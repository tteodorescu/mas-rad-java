package ch.heigvd.movies.data;

import java.io.Serializable;

import ch.heigvd.movies.interfaces.*;

public class Movie implements IMovieData, Serializable
{
	public static final long serialVersionUID = -8629605358805909451L;
	public String title;
	public int year, id;
	public ActorList actors = new ActorList();

	public Movie()
	{}
	
	public Movie(int id, String title, int year, ActorList actors)
	{	
		this.id = id;		
		this.title = title;
		this.year = year;
		this.actors = actors;
	}
		
	@Override
	public String getTitle() 
	{ return title; }

	@Override
	public int getYear() 
	{ return year; }

	public ActorList getActors() 
	{ return actors; }
	
	@Override
	public String toString() 
	{ return String.format("%d %s %d", id, title, year); }

	@Override
	public int getID() 
	{ return id; }
}
