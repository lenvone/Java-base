package com.adam.base.practice.Movie;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/23
 */
public class Ticket {

        private Movie movie;

        private int count;

        public Ticket() {
        }

        public Ticket(Movie movie, int count) {
            this.movie = movie;
            this.count = count;
        }

        public Movie getMovie() {
            return movie;
        }

        public void setMovie(Movie movie) {
            this.movie = movie;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String info() {
            return this.movie.getName() + "\t" + this.movie.getDate() + " \t " + this.count;
        }
    }

