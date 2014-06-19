package ch.heigvd.movies.interfaces;


public class RepositoryFactory 
{
	static IMovieRepository repository = null;
		
	public static IMovieRepository getRepository()
	{
		if (repository == null)
		{
			Class<?> repositoryClass = null;
			try 
			{
				repositoryClass = Class.forName(
						"ch.heigvd.movies.data.sample.MoviesRepository");

				repository = (IMovieRepository)repositoryClass.newInstance();
				
			} 
			catch (Exception e) 
			{				
				e.printStackTrace();
			}		
		}
		
		return repository;		
	}
}
