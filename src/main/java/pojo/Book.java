package pojo;

public class Book implements Comparable<Book>{
    public int id;
    public String author;
    public String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int yearPublished;

    @Override
    public int compareTo(Book otherBook) {
        String currTitle = this.getTitle();
        String otherTitle = otherBook.getTitle();
        return currTitle.compareTo(otherTitle);
    }
}
