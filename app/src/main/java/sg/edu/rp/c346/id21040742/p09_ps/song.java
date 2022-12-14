package sg.edu.rp.c346.id21040742.p09_ps;

import java.io.Serializable;

public class song implements Serializable {

    private int id;
    private String title;
    private String singers;
    private int year;
    private int rating;


    public song(int id, String title, String singers, int year, int rating) {
        this.title = title;
        this.singers = singers;
        this.year = year;
        this.rating = rating;
    }

    public int get_id() {
        return id;
    }

    public String getTitle() {

        return title;
    }
    public String getSingers() {
        return singers;
    }
    public int getYear() {
        return year;
    }
    public int getRating() {
        return rating;
    }
    public String setTitle(String toString) {

        return title;
    }
    public String setSinger(String toString) {
        return singers;
    }

    public int setYear(String toString) {
        return year;
    }

    @Override
    public String toString() {
        return "song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", singers='" + singers + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }
}
