package Serialize;

import java.io.Serializable;

public class MovieDataSerialize implements Serializable
{
	private static final long serialversionUID = 1L;
	private String movieName;
	private String movieDirector;
	MovieDataSerialize(String movieName, String movieDirector){
		this.movieDirector = movieDirector;
		this.movieName = movieName;
	}
	
	@Override
	public String toString() {
		return "The movie : " + movieName + " is directed by : " + movieDirector;
		}

}
