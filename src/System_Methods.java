/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ho Siang, Marissa, Jared
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

class System_Methods {
    
    static String fixedPath = "-";
    
    public static void exportAll(Game_Database Inventory[], String path) throws Exception {
        
        int counter = 0;

        PrintWriter pw;
        
        if (!fixedPath.equals("-")) {
            pw = new PrintWriter(new FileWriter(fixedPath + "Inventory.html"));
        }
        else {
            pw = new PrintWriter(new FileWriter(path + "/Inventory.html"));
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
        
        pw.println("<title>Game Inventory</title>");
        
        pw.println("</head>");
        pw.println("<body>");
        
        pw.println("<table>");
        
        for(int i = 0; i < Inventory.length; i++){
            
            if(Inventory[i].getId() != 0) {

                if(counter == 0) {
                    pw.println("<tr>");
                }

                pw.println("<td>");

                pw.println("<table>");
                
                pw.println("<tr>");
                pw.println("<th>" + "ID:" + "</th>");
                pw.println("<td>" + Inventory[i].getId() + "</td>");
                pw.println("</tr>");

                pw.println("<tr>");
                pw.println("<th>" + "Title:" + "</th>");
                pw.println("<td>" + Inventory[i].getTitle() + "</td>");
                pw.println("</tr>");

                pw.println("<tr>");
                pw.println("<th>" + "Platform:" + "</th>");
                pw.println("<td>" + Inventory[i].getPlatform() + "</td>");
                pw.println("</tr>");

                pw.println("<tr>");
                pw.println("<th>" + "Developer:" + "</th>");
                pw.println("<td>" + Inventory[i].getDeveloper() + "</td>");
                pw.println("</tr>");

                pw.println("<tr>");
                pw.println("<th>" + "Genre:" + "</th>");
                pw.println("<td>" + Inventory[i].getGenre() + "</td>");
                pw.println("</tr>");

                pw.println("<tr>");
                pw.println("<th>" + "Release Year:" + "</th>");
                pw.println("<td>" + Inventory[i].getReleaseYear() + "</td>");
                pw.println("</tr>");

                pw.println("<tr>");
                pw.println("<th>" + "Publisher:" + "</th>");
                pw.println("<td>" + Inventory[i].getPublisher() + "</td>");
                pw.println("</tr>");

                pw.println("<tr>");
                pw.println("<th>" + "Description:" + "</th>");
                pw.println("<td>" + Inventory[i].getDescription() + "</td>");
                pw.println("</tr>");

                pw.println("</table>");

                pw.println("</td>");

                if(counter == 2) {
                    
                    pw.println("</tr>");
                    counter = -1;
  
                }
                
                counter++;

            }
            
        }
        
        pw.println("</table>");
        
        pw.println("</body>");
        pw.println("</html>");
        
        pw.close();
        
        //pw = null;
 
    }
    
    public static void export(Game_Database Inventory[], int obj, String path) throws Exception {

        PrintWriter pw;
        
        if (!fixedPath.equals("-")) {
            pw = new PrintWriter(new FileWriter(fixedPath + Inventory[obj].getTitle() + ".html"));
        }
        else {
            pw = new PrintWriter(new FileWriter(path + "/" + Inventory[obj].getTitle() + ".html"));
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
        
        pw.println("<title>" + Inventory[obj].getTitle() + "</title>");
        
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
        pw.println("<th>" + "Platform:" + "</th>");
        pw.println("<td>" + Inventory[obj].getPlatform() + "</td>");
        pw.println("</tr>");

        pw.println("<tr>");
        pw.println("<th>" + "Developer:" + "</th>");
        pw.println("<td>" + Inventory[obj].getDeveloper() + "</td>");
        pw.println("</tr>");

        pw.println("<tr>");
        pw.println("<td>" + "Genre:" + "</td>");
        pw.println("<td>" + Inventory[obj].getGenre() + "</td>");
        pw.println("</tr>");

        pw.println("<tr>");
        pw.println("<th>" + "Release Year:" + "</th>");
        pw.println("<td>" + Inventory[obj].getReleaseYear() + "</td>");
        pw.println("</tr>");

        pw.println("<tr>");
        pw.println("<th>" + "Publisher:" + "</th>");
        pw.println("<td>" + Inventory[obj].getPublisher() + "</td>");
        pw.println("</tr>");

        pw.println("<tr>");
        pw.println("<th>" + "Description:" + "</th>");
        pw.println("<td>" + Inventory[obj].getDescription() + "</td>");
        pw.println("</tr>");
        
        pw.println("</tr>");
        pw.println("</table>");
        
        pw.println("</body>");
        pw.println("</html>");
        
        pw.close();
        
        //pw = null;
 
    }
    
    public static int idNumberGenerator(Game_Database Inventory[]) {
        
        Random rng = new Random();

        int id, counter = 0; 
        
        while(true) {
            
            id =  rng.nextInt() % 10000;

            if(id > 0 && id < 10000) {

                for(int i = 0; i < 100; i++) {

                    if(id != Inventory[i].getId()){           
                        counter++;
                    }
                    else {
                        break;
                    }

                }
                
                if(counter == 100) { 
                    
                    //rng = null;
                    return id; 
                    
                }

            }
        
        }
        
    }
    
    public static void rebuild(Game_Database Inventory[]) {
        
        Game_Database Reconstruct[] = new Game_Database[100];
        
        for(int i = 0; i < Game_Inventory.CAPACITY; i++) {
            
            Reconstruct[i].setId(Inventory[i].getId()); 
            Reconstruct[i].setTitle(Inventory[i].getTitle());
            Reconstruct[i].setPlatform(Inventory[i].getPlatform());
            Reconstruct[i].setDeveloper(Inventory[i].getDeveloper());
            Reconstruct[i].setGenre(Inventory[i].getGenre());
            Reconstruct[i].setReleaseYear(Inventory[i].getReleaseYear());
            Reconstruct[i].setPublisher(Inventory[i].getPublisher());
            Reconstruct[i].setDescription(Inventory[i].getDescription());
            Reconstruct[i].setRating(Inventory[i].getRating());
            
            Reconstruct[i].setAuthor(Inventory[i].getAuthor());
            Reconstruct[i].setReview(Inventory[i].getReview());
            Reconstruct[i].setRating(Inventory[i].getRating());
            Reconstruct[i].setDateReviewed(Inventory[i].getDateReviewed());
            Reconstruct[i].setDateEdited(Inventory[i].getDateEdited());
            
        }
        
        for(int i = 0; i < Game_Inventory.CAPACITY; i++) {
            
            if(Reconstruct[i].getId() != 0) {
                
                Inventory[i].setId(Reconstruct[i].getId());
                Inventory[i].setTitle(Reconstruct[i].getTitle());
                Inventory[i].setPlatform(Reconstruct[i].getPlatform());
                Inventory[i].setDeveloper(Reconstruct[i].getDeveloper());
                Inventory[i].setGenre(Reconstruct[i].getGenre());
                Inventory[i].setReleaseYear(Reconstruct[i].getReleaseYear());
                Inventory[i].setPublisher(Reconstruct[i].getPublisher());
                Inventory[i].setDescription(Reconstruct[i].getDescription());
                Inventory[i].setRating(Reconstruct[i].getRating());
               
                Inventory[i].setAuthor(Reconstruct[i].getAuthor());
                Inventory[i].setReview(Reconstruct[i].getReview());
                Inventory[i].setRating(Reconstruct[i].getRating());
                Inventory[i].setDateReviewed(Reconstruct[i].getDateReviewed());
                Inventory[i].setDateEdited(Reconstruct[i].getDateEdited());
                
            }
            
        }
        
        for(int i = 0; i < Game_Inventory.CAPACITY; i++) {
            
            Reconstruct[i] = null;
            
        }
        
    }
    
    public static void writeData(Game_Database Inventory[]) {

        PrintWriter pw;
        
        while(true) {
        
            try {

                for(int i = 0; i < Inventory.length; i++) {

                    if(Inventory[i].getId() != 0) {

                        pw = new PrintWriter(new FileWriter("src/data/" + Inventory[i].getId() + ".hjm"));

                        pw.println();
                        pw.println(Inventory[i].getId());
                        pw.println();
                        pw.println(Inventory[i].getTitle());
                        pw.println();
                        pw.println(Inventory[i].getPlatform());
                        pw.println();
                        pw.println(Inventory[i].getDeveloper());
                        pw.println();
                        pw.println(Inventory[i].getGenre());
                        pw.println();
                        pw.println(Inventory[i].getReleaseYear());
                        pw.println();
                        pw.println(Inventory[i].getPublisher());
                        pw.println();
                        pw.println(Inventory[i].getDescription());
                        pw.println();
                        pw.println(Inventory[i].getRating());
                        
                        pw.println();
                        pw.println(Inventory[i].getAuthor());
                        pw.println();
                        pw.println(Inventory[i].getReview());
                        pw.println();
                        pw.println(Inventory[i].getRating());
                        pw.println();
                        pw.println(Inventory[i].getDateReviewed());
                        pw.println();
                        pw.println(Inventory[i].getDateEdited());

                        pw.close();

                        //pw = null;

                    }

                }
                
                break;

            } catch (IOException errorLog) {

                //System.out.println("Error, unable to write data");
                //Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Error, unable to open write data");

            }
        
        }
            
    }
    
    public static void delete(Game_Database Inventory[], int id) {
        
        for(int i = 0; i < Inventory.length; i++) {
            
            if (Inventory[i].getId() == id) {
                
                Inventory[i].setTitle("");
                Inventory[i].setPlatform("");
                Inventory[i].setDeveloper("");
                Inventory[i].setGenre("");;
                Inventory[i].setPublisher("");
                Inventory[i].setDescription("");
                Inventory[i].setId(0);
                Inventory[i].setReleaseYear(0);
                Inventory[i].setRating(0);
                
                Inventory[i].setAuthor("");
                Inventory[i].setReview("");
                Inventory[i].setRating(0);
                Inventory[i].setDateReviewed("");
                Inventory[i].setDateEdited("");
                
            }
            
        }
        
    }

    public static void loadData(Game_Database Inventory[]) {
        
        BufferedReader br;
        
        int obj = -1;

        for(int i = 1; i < 10000; i++) {

            try {
                
                br = new BufferedReader(new FileReader("src/data/" + i + ".hjm"));
                
                obj++;
                
                if (obj == 100) {
                    
                    br.close();
                    return;
                    
                }
                
                int counter = 1;

                while(br.readLine() != null) {

                    switch (counter) {

                        case 1:

                            Inventory[obj].setId(Integer.parseInt(br.readLine()));
                            counter++;
                            break;

                        case 2:

                            Inventory[obj].setTitle(br.readLine());
                            counter++;
                            break;

                        case 3:

                            Inventory[obj].setPlatform(br.readLine());
                            counter++;
                            break;

                        case 4:

                            Inventory[obj].setDeveloper(br.readLine());
                            counter++;
                            break;

                        case 5:

                            Inventory[obj].setGenre(br.readLine());
                            counter++;
                            break;

                        case 6:

                            Inventory[obj].setReleaseYear(Integer.parseInt(br.readLine()));
                            counter++;
                            break;

                        case 7:

                            Inventory[obj].setPublisher(br.readLine());
                            counter++;
                            break;


                        case 8:

                            Inventory[obj].setDescription(br.readLine());
                            counter++;
                            break;
                            
                        case 9:

                            Inventory[obj].setAuthor(br.readLine());
                            counter++;
                            break;

                        case 10:

                            Inventory[obj].setReview(br.readLine());
                            counter++;
                            break;
                        
                        case 11:

                            Inventory[obj].setRating(Integer.parseInt(br.readLine()));
                            counter++;
                            break;
                        
                        case 12:

                            Inventory[obj].setDateReviewed(br.readLine());
                            counter++;
                            break;
                        
                        case 13:

                            Inventory[obj].setDateEdited(br.readLine());
                            counter++;
                            break;

                    }

                }

                br.close();

            } catch (IOException | NumberFormatException errorLog) {
                
                //System.out.println("Error, unable to open file and load its data");
                //Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Error, unable to open file and load its data");
                
            }

        }
  
    }
    
    public static void setFixedPath(String setPath) {
        
        fixedPath = setPath;
            
    }
    
    public static void resetInventory(Game_Database Inventory[]) {
        
        File dataFile;
        
        for(int i = 0; i < Inventory.length; i++) {
            
            if (Inventory[i].getId() != 0) {
                
                Inventory[i].setTitle("");
                Inventory[i].setPlatform("");
                Inventory[i].setDeveloper("");
                Inventory[i].setGenre("");;
                Inventory[i].setPublisher("");
                Inventory[i].setDescription("");
                Inventory[i].setId(0);
                Inventory[i].setReleaseYear(0);
                Inventory[i].setRating(0);
                
            }
            
        }
        
        for (int i = 0; i < 10000; i++) {
                
            try {

                dataFile = new File("src/data/" + i + ".hjm");
                
                dataFile.delete();

            } catch (Exception error) {
                //
            }
            
        }
        
    }
    
}

class Logger {
    
    static public String log = "";
    
    static Calendar cal = Calendar.getInstance();
    static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    static public void addLog(String input) {
        log += input + "\n";
    }
    
    static public void exportLog() {
        
        try {
            
            PrintWriter pw = new PrintWriter(new FileWriter("src/log.txt"));
            pw.print(log);
            pw.close();
            
        } catch (IOException errorLog) {
            //
        }
    
    }
    
}
