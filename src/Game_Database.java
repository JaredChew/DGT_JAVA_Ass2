/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ho Siang, Marissa, Jared
 */

import java.io.FileWriter;
import java.io.PrintWriter;

class Review {
    
    private int rating;
    
    private String author;
    private String review;
    private String dateReviewed;
    private String dateEdited;
    
    
    Review() {
        
        rating = 0;
        author = "";
        review = "";
        dateEdited = "";
        dateReviewed = "";
        
    }
    
    public void setAuthor(String author) {
        
        this.author = author;
        
    }
    
    public String getAuthor() {
        
        return author;
        
    }
    
    public void setReview(String review) {
        
        this.review = review;
        
    }
    
    public String getReview() {
        
        return review;
        
    }
    
    public void setRating(int rating) {
        
        this.rating = rating;
        
    }
    
    public int getRating() {
        
        return rating;
        
    }
    
    public void setDateReviewed(String dateReviewed) {
        
        this.dateReviewed = dateReviewed;
        
    }
    
    public String getDateReviewed() {
        
        return dateReviewed;
        
    }
    
    public void setDateEdited(String dateEdited) {
        
        this.dateEdited = dateEdited;
        
    }
    
    public String getDateEdited() {
        
        return dateEdited;
        
    }
    
    public void resetReview() {
        
        rating = 0;
        author = "";
        review = "";
        dateEdited = "";
        dateReviewed = "";
        
    }
    
    public void exportReview(Game_Database Inventory[], int obj, String path) throws Exception {

        PrintWriter pw;
        
        if (!System_Methods.fixedPath.equals("-")) {
            pw = new PrintWriter(new FileWriter(System_Methods.fixedPath + Inventory[obj].getTitle() + ".html"));
        }
        else {
            pw = new PrintWriter(new FileWriter(path + "/" + Inventory[obj].getTitle() + " - Review.html"));
        }
        
        pw.println("<!Doctype html>");
        pw.println("<html>");

        pw.println("<head>");
        
        pw.println("<style>");
        pw.println("table , tr , td {border: 0.1em dashed; padding: 1em;}");
        pw.println("td:hover {background-color:white;}");
        pw.println("th {font-family:Arial; text-align:right;}");
        pw.println("table {border: 2px solid black; background-color:#c9dcff;}");
        pw.println("</style>");
        
        pw.println("<title>Review: " + Inventory[obj].getTitle() + "</title>");
        
        pw.println("</head>");
        pw.println("<body>");
        
        pw.println("<table>");
        pw.println("<tr>");
        
        pw.println("<th>" + "ID:" + "</th>");
        pw.println("<td>" + Inventory[obj].getId() + "</td>");
        pw.println("</tr>");

        pw.println("<tr>");
        pw.println("<th>" + "Title:" + "</th>");
        pw.println("<td>" + Inventory[obj].getTitle() + "</td>");
        pw.println("</tr>");

        pw.println("<tr>");
        pw.println("<th>" + "Author:" + "</th>");
        pw.println("<td>" + Inventory[obj].getAuthor() + "</td>");
        pw.println("</tr>");

        pw.println("<tr>");
        pw.println("<th>" + "Review:" + "</th>");
        pw.println("<td>" + Inventory[obj].getReview() + "</td>");
        pw.println("</tr>");

        pw.println("<tr>");
        pw.println("<th>" + "Rating:" + "</th>");
        pw.println("<td>" + Inventory[obj].getRating() + "</td>");
        pw.println("</tr>");

        pw.println("<tr>");
        pw.println("<th>" + "Written on:" + "</th>");
        pw.println("<td>" + Inventory[obj].getDateReviewed() + "</td>");
        pw.println("</tr>");
        
        if(!getDateEdited().equals("")) {

            pw.println("<tr>");
            pw.println("<th>" + "Publisher:" + "</th>");
            pw.println("<td>" + Inventory[obj].getDateEdited() + "</td>");
            pw.println("</tr>");
            
        }
        
        pw.println("</tr>");
        pw.println("</table>");
        
        pw.println("</body>");
        pw.println("</html>");
        
        pw.close();
 
    }
    
}

class Game_Database extends Review{
    
    private String title;
    private String platform;
    private String developer;
    private String genre;
    private String publisher;
    private String description;
    
    private int id;
    private int releaseYear;
    private int rating;
            
    Game_Database() {
        
        super();
        
        title = "";
        platform = "";
        developer = "";
        genre = "";
        publisher = "";
        description = "";
        
        id = 0;
        releaseYear = 0;
        rating = 0;
        
    }
    
    public int getId() {
        
        return id;
        
    }
    
    public String getTitle() {
        
        return title;
        
    }
    
    public String getPlatform() {
        
        return platform;
        
    }
    
    public String getDeveloper() {
        
        return developer;
        
    }
    
    public String getGenre() {
        
         return genre;
        
    }
    
    public int getReleaseYear() {
        
        return releaseYear;
        
    }
    
    public String getPublisher() {
        
        return publisher;
        
    }
    
    public String getDescription () {
        
        return description;
        
    }
    
    public int getRating () {
        
        return rating;
        
    }

    public void setId(int id) {
        
        this.id = id;
        
    }
    
    public void setTitle(String title) {
        
        this.title = title;
        
    }
    
    public void setPlatform(String platform) {
        
        this.platform = platform;
        
    }
    
    public void setDeveloper(String developer) {
        
        this.developer = developer;
        
    }
    
    public void setGenre(String genre) {
        
        this.genre = genre;
        
    }
    
    public void setReleaseYear(int releaseYear) {
        
        this.releaseYear = releaseYear;
        
    }
    
    public void setPublisher(String publisher) {
        
        this.publisher = publisher;
        
    }
    
    public void setDescription (String description) {
        
        this.description = description;
        
    }
    
    public void setRating (int rating) {
        
        this.rating = rating;
        
    }
    
}
