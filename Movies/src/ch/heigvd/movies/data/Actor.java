package ch.heigvd.movies.data;

import ch.heigvd.movies.interfaces.IActorsData;

public class Actor implements IActorsData 
{	
	public String firstName, lastName;
	
	public Actor()
	{}	
	
	public Actor(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String getFirstName() 
	{ return firstName; }

	@Override
	public String getLastName() 
	{ return lastName; }
}
