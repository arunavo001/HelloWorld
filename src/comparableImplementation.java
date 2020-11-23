import java.io.*;
import java.util.*;
public class comparableImplementation
{
    public static void main(String[] args)
    {
        ArrayList<Movie> list=new ArrayList<Movie>();
        list.add(new Movie("Force Awakens",8.3,2015));
        list.add(new Movie("Star Wars",8.5,1977));
        list.add(new Movie("Empires Strikes back",8.8,1980));
        list.add(new Movie("Marvels",9.2,1973));
        Collections.sort(list);
        System.out.println("Movies after sorting: ");
        for(Movie movie:list)
        {
            System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
        }
    }
}
class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;
    public int compareTo(Movie m)
    {
        return this.year-m.year;
    }
    public Movie(String name,double rating,int year)
    {
        this.name=name;
        this.rating=rating;
        this.year=year;
    }
    public double getRating()
    {
        return rating;
    }
    public String getName()
    {
        return name;
    }
    public int getYear()
    {
        return year;
    }
}
