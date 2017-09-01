package ch.praesentation.model;

import javax.persistence.*;

@Entity
public class Content {

    private int id;
    private double price;
    private String produktContent;
    private String title;
    private String utitle;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }


    public Content(){
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduktContent() {
        return produktContent;
    }

    public void setProduktContent(String produktContent) {
        this.produktContent = produktContent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUtitle() {
        return utitle;
    }

    public void setUtitle(String utitle) {
        this.utitle = utitle;
    }





}
