package rafal.ksiegarnia.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private int id;
    private int isdn;
    private String name;
    private String author;

    public Book() {
    }

    public Book(int id, int isdn, String name, String author) {
        this.id = id;
        this.isdn = isdn;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsdn() {
        return isdn;
    }

    public void setIsdn(int isdn) {
        this.isdn = isdn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isdn=" + isdn +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
