package com.Labsession;

class MovieRating 
{
	private int movieId;
	private String movieName;
	private float rating;
	
	MovieRating(int movieId,String movieName,float rating)
	{
		this.movieId=movieId;
		this.movieName=movieName;
		this.rating=rating;
		
	}
	
	public int getMovieId()
	{
		return movieId;
	} 
	public void setMovieId(int movieId)
	{
		this.movieId=movieId;
	}
	public String getMovieName()
	{
		return movieName;
	}
	public void setMovieName(String movieName)
	{
		this.movieName=movieName;
	}
	public float getRating()
	{
		return rating;
	}
	public void setRating(float rating)
	{
		this.rating=rating;
	}
	
	public String toString()
	{
		return movieId+" "+movieName+" "+rating;
	}
}

	public class MovieShow
	{
		static void getRating(MovieRating m)
		{
			if(m.getRating()>7)
			{
			System.out.println(m);
			}
		}
	
	public static void main(String[] args)
	{
		MovieRating m1=new MovieRating(101,"RRR",8.5f);
		MovieRating m2=new MovieRating(102,"OMG",6);
		MovieRating m3=new MovieRating(103,"Gadar2",7.5f);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println("----Highest Rating---");
		
		getRating(m1);
		getRating(m2);
		getRating(m3);
	}
	
}
