package ch.heigvd.movies.data;

import ch.heigvd.movies.interfaces.IActorsData;

public class Actor implements IActorsData 
{	
	public String firstName, lastName;
	public int id;
	
	public Actor()
	{}	
	
	public Actor(int id, String firstName, String lastName)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String getFirstName() 
	{ return firstName; }

	@Override
	public String getLastName() 
	{ return lastName; }

	@Override
	public int getID() 
	{ return id;}
}
