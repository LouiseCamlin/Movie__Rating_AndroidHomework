package com.codeclan.example.movierankings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Louise on 22/05/2017.
 */
public class MovieTest {


    Movie movie;

    @Before
    public void before(){
        movie = new Movie("The Shawshank Redemption", "Drama", 1);
    }


    @Test
    public void canGetName(){
        assertEquals("The Shawshank Redemption", movie.getName());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Drama", movie.getGenre());
    }

    @Test
    public void canGetRanking(){
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void canSetRanking(){
        movie.setRanking(2);
        int ranking = movie.getRanking();
        assertEquals(2, ranking);
    }

    @Test
    public void canPrintString(){
        assertEquals("Title: The Shawshank Redemption, Genre: Drama, Rank: 1", movie.toString());
    }


}