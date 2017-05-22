package com.codeclan.example.movierankings;

/**
 * Created by Louise on 22/05/2017.
 */

public class Ranking {

    private Movie[] movies;

    public Ranking(){
        this.movies = new Movie[10];

    }

    public void addMovie(Movie movie){
        int movieRankingIndex = movie.getRanking() - 1;
        movies[movieRankingIndex] = movie;
    }


    public Movie getMovieByRanking(int ranking) {
        int index = ranking -1;
        return this.movies[index];
    }



}

