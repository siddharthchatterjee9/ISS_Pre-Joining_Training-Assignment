package corejava.oops;

// class definition
public class Movie {
    // instance variables
    String title, genre, star;
    int year;
    double earnings;

    //method name - toString
    //method return type of - String
    public String toString() {
        String output = "";
        output += "Title: " + title + "\n";
        output += "Genre: " + genre + "\n";
        output += "Star: " + star + "\n";
        output += "Year of Release: " + year + "\n";
        output += "Total earnings (Cr): " + earnings + "\n";
        return output;
    }

    // default constructor
    public Movie() {
        title = "default - Taare Zameen Par";
        genre = "default - Drama";
        star =  "default - Aamir Khan";
        year = 2007;
        earnings = 85.88;
    }

    // parametrized constructor
    public Movie(String _title, String _genre, String _star, int _year, double _earnings) {
        title = _title;
        genre = _genre;
        star = _star;
        year = _year;
        earnings = _earnings;
    }

    //getters
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public String getStar() {
        return star;
    }
    public int getYear() {
        return year;
    }
    public double getEarnings() {
        return earnings;
    }

    //setters
    public void setTitle(String _title) {
        title = _title;
    }
    public void setGenre(String _genre) {
        genre = _genre;
    }
    public void setStar(String _star) {
        star = _star;
    }
    public void setYear(int _year) {
        year = _year;
    }
    public void setEarnings(double _earnings) {
        earnings = _earnings;
    }
}
