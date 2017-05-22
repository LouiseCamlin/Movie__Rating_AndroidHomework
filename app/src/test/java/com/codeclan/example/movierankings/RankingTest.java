package com.codeclan.example.movierankings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Louise on 22/05/2017.
 */
public class RankingTest {

    Movie movie;
    Ranking ranking;


    @Before
    public void before(){
        ranking = new Ranking();
        movie = new Movie("Pulp Fiction", "Crime", 7);
        ranking.addMovie(movie);

    }


    @Test
    public void canGetMovieByRank(){
        assertEquals(movie, ranking.getMovieByRanking(7));
    }




}