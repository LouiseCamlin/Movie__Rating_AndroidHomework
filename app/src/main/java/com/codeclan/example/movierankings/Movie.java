package com.codeclan.example.movierankings;

/**
 * Created by Louise on 22/05/2017.
 */

public class Movie {

    private String name;
    private String genre;
    private int ranking;


    public Movie(String name, String genre, int ranking){
        this.name = name;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString(){
        return "Title: " + this.name + ", Genre: " + this.genre + ", Rank: " + this.ranking;
    }


}
