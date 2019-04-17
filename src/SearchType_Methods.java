/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ho Siang, Marissa, Jared
 */

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

 class SearchType_Methods {
     
    static private int games;
    static private int display;
    static private int counter;
    
    static private GridBagLayout gridBagLO = new GridBagLayout();
    
    static private GridBagConstraints gridBagConstraints = new GridBagConstraints();
    
    public static void search_listAll(JFrame Frame, Game_Database Inventory[]) {
        
        JLabel Title_Label;
        
        JPanel Main_Panel = new JPanel(gridBagLO,true);
        JPanel Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel Body_Panel = new JPanel(new GridLayout(5, 2, 0, 0));

        JPanel Search_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField SearchInput = new JTextField(20);
        JButton Search_Button = new JButton("Search Title");

        JButton Next_Button = new JButton("           Next           ");
        JButton Return_Button = new JButton("            Return            ");
        JButton Previous_Button = new JButton("       Previous       ");
        
        System.out.println("Initialising Search Menu: List All");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Search Menu: List All");
        
        games = 0;
        display = 0;
        counter = 0;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //
        
        Title_Label = new JLabel("List of all recorded games");
        Header_Panel.add(Title_Label);
        
        // ----------------------------------------------------- //
        
        for(int i = 0 ; i < Inventory.length; i++) {
            
            if (Inventory[i].getId() != 0) {
                
                games++;
                
            }

        }
        
        JLabel Results_Label[] = new JLabel[games];
        
        {   //Temperory lazy scope
            
            int j = 0;

            for(int i = 0 ; i < Inventory.length; i++) {

                if (Inventory[i].getId() != 0) {

                    Results_Label[j] = new JLabel((j + 1) + ") " + Inventory[i].getId() + " - " + Inventory[i].getTitle());
                    j++;

                }

            }
        
        }   //End of temperory lazy scope
        
        if(games < 10) {
            
            for(int i = 0 ; i < games; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        else {
        
            for(int i = 0 ; i < 10; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        // ----------------------------------------------------- //
        
        Search_Panel.add(SearchInput);
        Search_Panel.add(Search_Button);
        
        // ----------------------------------------------------- //
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon kduGameLogo = new ImageIcon("./picture/Search_file_symbol.png");
        Image image = kduGameLogo.getImage();
        Image newimg = image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        kduGameLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(kduGameLogo);
        jp_Picture1.add(lb1);
        
        // ----------------------------------------------------- //
        
        Main_Panel.add(Header_Panel);
        Main_Panel.add(Body_Panel);
        Main_Panel.add(jp_Picture1);
        Main_Panel.add(Search_Panel);
        Main_Panel.add(Next_Button);
        Main_Panel.add(Return_Button);
        Main_Panel.add(Previous_Button);
        
        Header_Panel.setBackground(new Color(70,177,255));
        Body_Panel.setBackground(new Color(165,188,255));
        jp_Picture1.setBackground(new Color(183,255,252));
        Search_Panel.setBackground(new Color(183,255,252));
        Next_Button.setBackground(new Color(131,135,181));
        Return_Button.setBackground(new Color(131,135,181));
        Previous_Button.setBackground(new Color(131,135,181));
        Main_Panel.setBackground(new Color(183,255,252));
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.insets = new Insets(0,0,10,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(Body_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,30,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(Search_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,5,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Next_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Previous_Button, gridBagConstraints);
        
        if (games < 10) {
            
            Next_Button.setEnabled(false);
            
        }
        
        if(counter <= 10) {
            
            Previous_Button.setEnabled(false);
            
        }
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+--- Search Menu: List All ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- Search Menu: List All ---+");
        
        // ----------------------------------------------------- //
        
        Search_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Search button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Search button clicked");

                int counter = 0, obj = 0;
                    
                for ( ; obj < Inventory.length; obj++) {

                    if(SearchInput.getText().equals(Inventory[obj].getTitle()) && Inventory[obj].getId() != 0) {

                        break;

                    }

                    counter++;

                }

                if(counter != 100) {

                    System.out.println("Switching to View Menu for game ID " + Inventory[obj].getId());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for game ID " + Inventory[obj].getId());
                    
                    Main_Panel.setVisible(false);
                    Main_Methods.view(Frame, Inventory, obj);

                }

                else {

                    System.out.println("No search results");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");

                    JOptionPane.showMessageDialog(Frame, "No search results");
                        
                }
                    
            }

        });
        
        Next_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Next button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Next button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "next");

            }

        });
        
        Previous_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Previous button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Previous button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "previous");

            }

        });
        
        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Returning to Main Menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to Main Menu");
                
                Main_Panel.setVisible(false);
                Main_Methods.search(Frame, Inventory);

            }

        });
            
    }
    
    public static void search_rating(JFrame Frame, Game_Database Inventory[], int rating) {
        
        JLabel Title_Label;
        
        JPanel Main_Panel = new JPanel(gridBagLO,true);
        JPanel Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel Body_Panel = new JPanel(new GridLayout(5, 2, 0, 0));

        JPanel Search_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField SearchInput = new JTextField(20);
        JButton Search_Button = new JButton("Search Title");

        JButton Next_Button = new JButton("           Next           ");
        JButton Return_Button = new JButton("            Return            ");
        JButton Previous_Button = new JButton("       Previous       ");
        
        System.out.println("Initialising Search Menu: Rating");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Search Menu: Rating");
        
        games = 0;
        display = 0;
        counter = 0;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //
        
        Title_Label = new JLabel("Games under " + rating + " category");
        Header_Panel.add(Title_Label);
        
        // ----------------------------------------------------- //
        
        for(int i = 0 ; i < Inventory.length; i++) {
            
            if (rating == Inventory[i].getRating()) {
                
                games++;
                
            }

        }
        
        JLabel Results_Label[] = new JLabel[games];
        
        {   //Temperory lazy scope
            
            int j = 0;

            for(int i = 0 ; i < Inventory.length; i++) {

                if (rating == Inventory[i].getRating()) {

                    Results_Label[j] = new JLabel((j + 1) + ") " + Inventory[i].getId() + " - " + Inventory[i].getTitle());
                    j++;

                }

            }
        
        }   //End of temperory lazy scope
        
        if(games < 10) {
            
            for(int i = 0 ; i < games; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        else {
        
            for(int i = 0 ; i < 10; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        // ----------------------------------------------------- //
        
        Search_Panel.add(SearchInput);
        Search_Panel.add(Search_Button);
        
        // ----------------------------------------------------- //
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon kduGameLogo = new ImageIcon("./picture/Search_file_symbol.png");
        Image image = kduGameLogo.getImage();
        Image newimg = image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        kduGameLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(kduGameLogo);
        jp_Picture1.add(lb1);
        
        // ----------------------------------------------------- //
        
        Main_Panel.add(Header_Panel);
        Main_Panel.add(Body_Panel);
        Main_Panel.add(jp_Picture1);
        Main_Panel.add(Search_Panel);
        Main_Panel.add(Next_Button);
        Main_Panel.add(Return_Button);
        Main_Panel.add(Previous_Button);
        
        Header_Panel.setBackground(new Color(70,177,255));
        Body_Panel.setBackground(new Color(165,188,255));
        jp_Picture1.setBackground(new Color(183,255,252));
        Search_Panel.setBackground(new Color(183,255,252));
        Next_Button.setBackground(new Color(131,135,181));
        Return_Button.setBackground(new Color(131,135,181));
        Previous_Button.setBackground(new Color(131,135,181));
        Main_Panel.setBackground(new Color(183,255,252));
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.insets = new Insets(0,0,10,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(Body_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,30,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(Search_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,5,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Next_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Previous_Button, gridBagConstraints);
        
        if (games < 10) {
            
            Next_Button.setEnabled(false);
            
        }
        
        if(counter <= 10) {
            
            Previous_Button.setEnabled(false);
            
        }
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+--- Search Menu: Rating ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- Search Menu: Rating ---+");
        
        // ----------------------------------------------------- //
        
        Search_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Search button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Search button clicked");

                int counter = 0, obj = 0;
                    
                for ( ; obj < Inventory.length; obj++) {

                    if(SearchInput.getText().equals(Inventory[obj].getTitle()) && Inventory[obj].getId() != 0) {

                        break;

                    }

                    counter++;

                }

                if(counter != 100) {

                    System.out.println("Switching to View Menu for game ID " + Inventory[obj].getId());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for game ID " + Inventory[obj].getId());
                    
                    Main_Panel.setVisible(false);
                    Main_Methods.view(Frame, Inventory, obj);

                }

                else {

                    System.out.println("No search results");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");

                    JOptionPane.showMessageDialog(Frame, "No search results");
                        
                }
                    
            }

        });
        
        Next_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Next button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Next button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "next");

            }

        });
        
        Previous_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Previous button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Previous button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "previous");

            }

        });
        
        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Returning to Main Menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to Main Menu");
                
                Main_Panel.setVisible(false);
                Main_Methods.search(Frame, Inventory);

            }

        });
        
    }
    
    public static void search_developer(JFrame Frame, Game_Database Inventory[], String developer) {
        
        JLabel Title_Label;
        
        JPanel Main_Panel = new JPanel(gridBagLO,true);
        JPanel Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel Body_Panel = new JPanel(new GridLayout(5, 2, 0, 0));

        JPanel Search_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField SearchInput = new JTextField(20);
        JButton Search_Button = new JButton("Search Title");

        
        JButton Next_Button = new JButton("           Next           ");
        JButton Return_Button = new JButton("            Return            ");
        JButton Previous_Button = new JButton("       Previous       ");
        
        System.out.println("Initialising Search Menu: Developer");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Search Menu: Developer");

        games = 0;
        display = 0;
        counter = 0;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //
        
        Title_Label = new JLabel("Games under " + developer + " category");
        Header_Panel.add(Title_Label);

        // ----------------------------------------------------- //
        
        for(int i = 0 ; i < Inventory.length; i++) {
            
            if (developer.equals(Inventory[i].getDeveloper())) {
                
                games++;
                
            }

        }
        
        JLabel Results_Label[] = new JLabel[games];
        
        {   //Temperory lazy scope
            
            int j = 0;

            for(int i = 0 ; i < Inventory.length; i++) {

                if (developer.equals(Inventory[i].getDeveloper())) {

                    Results_Label[j] = new JLabel((j + 1) + ") " + Inventory[i].getId() + " - " + Inventory[i].getTitle());
                    j++;

                }

            }
        
        }   //End of temperory lazy scope
        
        if(games < 10) {
            
            for(int i = 0 ; i < games; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        else {
        
            for(int i = 0 ; i < 10; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        // ----------------------------------------------------- //
        
        Search_Panel.add(SearchInput);
        Search_Panel.add(Search_Button);
        
        // ----------------------------------------------------- //
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon kduGameLogo = new ImageIcon("./picture/Search_file_symbol.png");
        Image image = kduGameLogo.getImage();
        Image newimg = image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        kduGameLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(kduGameLogo);
        jp_Picture1.add(lb1);
        
        // ----------------------------------------------------- //
        
        Main_Panel.add(Header_Panel);
        Main_Panel.add(Body_Panel);
        Main_Panel.add(jp_Picture1);
        Main_Panel.add(Search_Panel);
        Main_Panel.add(Next_Button);
        Main_Panel.add(Return_Button);
        Main_Panel.add(Previous_Button);
        
        Header_Panel.setBackground(new Color(70,177,255));
        Body_Panel.setBackground(new Color(165,188,255));
        jp_Picture1.setBackground(new Color(183,255,252));
        Search_Panel.setBackground(new Color(183,255,252));
        Next_Button.setBackground(new Color(131,135,181));
        Return_Button.setBackground(new Color(131,135,181));
        Previous_Button.setBackground(new Color(131,135,181));
        Main_Panel.setBackground(new Color(183,255,252));
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.insets = new Insets(0,0,10,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(Body_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,30,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(Search_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,5,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Next_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Previous_Button, gridBagConstraints);
        
        // ----------------------------------------------------- //
        
        if (games < 10) {
            
            Next_Button.setEnabled(false);
            
        }
        
        if(counter <= 10) {
            
            Previous_Button.setEnabled(false);
            
        }
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+--- Search Menu: Developer ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- Search Menu: Developer ---+");
        
        // ----------------------------------------------------- //
        
        Search_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                int counter = 0, obj = 0;
                    
                for ( ; obj < Inventory.length; obj++) {
                
                    System.out.println("Search button clicked");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Search button clicked");

                    if(SearchInput.getText().equals(Inventory[obj].getTitle()) && Inventory[obj].getId() != 0) {

                        break;

                    }

                    counter++;

                }

                if(counter != 100) {

                    System.out.println("Switching to View Menu for game ID " + Inventory[obj].getId());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for game ID " + Inventory[obj].getId());
                    
                    Main_Panel.setVisible(false);
                    Main_Methods.view(Frame, Inventory, obj);

                }

                else {

                    System.out.println("No search results");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");

                    JOptionPane.showMessageDialog(Frame, "No search results");
                        
                }
                    
            }

        });
        
        Next_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Next button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Next button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "next");

            }

        });
        
        Previous_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Previous button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Previous button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "previous");

            }

        });
        
        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Returning to Main Menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to Main Menu");
                
                Main_Panel.setVisible(false);
                Main_Methods.search(Frame, Inventory);

            }

        });
        
    }
    
    public static void search_publisher(JFrame Frame, Game_Database Inventory[], String publisher) {
        
        JLabel Title_Label;
        
        JPanel Main_Panel = new JPanel(gridBagLO,true);
        JPanel Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel Body_Panel = new JPanel(new GridLayout(5, 2, 0, 0));

        JPanel Search_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField SearchInput = new JTextField(20);
        JButton Search_Button = new JButton("Search Title");

        JButton Next_Button = new JButton("           Next           ");
        JButton Return_Button = new JButton("            Return            ");
        JButton Previous_Button = new JButton("       Previous       ");
        
        System.out.println("Initialising Search Menu: Publisher");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Search Menu: Publisher");
        
        games = 0;
        display = 0;
        counter = 0;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //
        
        Title_Label = new JLabel("Games under " + publisher + " category");
        Header_Panel.add(Title_Label);
        
        // ----------------------------------------------------- //
        
        for(int i = 0 ; i < Inventory.length; i++) {
            
            if (publisher.equals(Inventory[i].getPublisher())) {
                
                games++;
                
            }

        }
        
        JLabel Results_Label[] = new JLabel[games];
        
        {   //Temperory lazy scope
            
            int j = 0;

            for(int i = 0 ; i < Inventory.length; i++) {

                if (publisher.equals(Inventory[i].getPublisher())) {

                    Results_Label[j] = new JLabel((j + 1) + ") " + Inventory[i].getId() + " - " + Inventory[i].getTitle());
                    j++;

                }

            }
        
        }   //End of temperory lazy scope
        
        if(games < 10) {
            
            for(int i = 0 ; i < games; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        else {
        
            for(int i = 0 ; i < 10; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        // ----------------------------------------------------- //
        
        Search_Panel.add(SearchInput);
        Search_Panel.add(Search_Button);
        
        // ----------------------------------------------------- //
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon kduGameLogo = new ImageIcon("./picture/Search_file_symbol.png");
        Image image = kduGameLogo.getImage();
        Image newimg = image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        kduGameLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(kduGameLogo);
        jp_Picture1.add(lb1);
        
        // ----------------------------------------------------- //
        
        Main_Panel.add(Header_Panel);
        Main_Panel.add(Body_Panel);
        Main_Panel.add(jp_Picture1);
        Main_Panel.add(Search_Panel);
        Main_Panel.add(Next_Button);
        Main_Panel.add(Return_Button);
        Main_Panel.add(Previous_Button);
        
        Header_Panel.setBackground(new Color(70,177,255));
        Body_Panel.setBackground(new Color(165,188,255));
        jp_Picture1.setBackground(new Color(183,255,252));
        Search_Panel.setBackground(new Color(183,255,252));
        Next_Button.setBackground(new Color(131,135,181));
        Return_Button.setBackground(new Color(131,135,181));
        Previous_Button.setBackground(new Color(131,135,181));
        Main_Panel.setBackground(new Color(183,255,252));
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.insets = new Insets(0,0,10,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(Body_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,30,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(Search_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,5,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Next_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Previous_Button, gridBagConstraints);
        
        if (games < 10) {
            
            Next_Button.setEnabled(false);
            
        }
        
        if(counter <= 10) {
            
            Previous_Button.setEnabled(false);
            
        }
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+--- Search Menu: Publisher ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- Search Menu: Publisher ---+");
        
        // ----------------------------------------------------- //
        
        Search_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Search button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Search button clicked");

                int counter = 0, obj = 0;
                    
                for ( ; obj < Inventory.length; obj++) {

                    if(SearchInput.getText().equals(Inventory[obj].getTitle()) && Inventory[obj].getId() != 0) {

                        break;

                    }

                    counter++;

                }

                if(counter != 100) {

                    System.out.println("Switching to View Menu for game ID " + Inventory[obj].getId());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for game ID " + Inventory[obj].getId());
                    
                    Main_Panel.setVisible(false);
                    Main_Methods.view(Frame, Inventory, obj);

                }

                else {

                    System.out.println("No search results");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");

                    JOptionPane.showMessageDialog(Frame, "No search results");
                        
                }
                    
            }

        });
        
        Next_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Next button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Next button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "next");

            }

        });
        
        Previous_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Previous button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Previous button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "previous");

            }

        });
        
        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Returning to Main Menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + "Returning to Main Menu");
                
                Main_Panel.setVisible(false);
                Main_Methods.search(Frame, Inventory);

            }

        });
        
    }
    
    public static void search_platform(JFrame Frame, Game_Database Inventory[], String platform) {
        
        JLabel Title_Label;
        
        JPanel Main_Panel = new JPanel(gridBagLO,true);
        JPanel Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel Body_Panel = new JPanel(new GridLayout(5, 2, 0, 0));

        JPanel Search_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField SearchInput = new JTextField(20);
        JButton Search_Button = new JButton("Search Title");

        JButton Next_Button = new JButton("           Next           ");
        JButton Return_Button = new JButton("            Return            ");
        JButton Previous_Button = new JButton("       Previous       ");
        
        System.out.println("Initialising Search Menu: Platform");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Search Menu: Platform");
        
        games = 0;
        display = 0;
        counter = 0;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //
        
        Title_Label = new JLabel("Games under " + platform + " category");
        Header_Panel.add(Title_Label);
        
        // ----------------------------------------------------- //
        
        for(int i = 0 ; i < Inventory.length; i++) {
            
            if (platform.equals(Inventory[i].getPlatform())) {
                
                games++;
                
            }

        }
        
        JLabel Results_Label[] = new JLabel[games];
        
        {   //Temperory lazy scope
            
            int j = 0;

            for(int i = 0 ; i < Inventory.length; i++) {

                if (platform.equals(Inventory[i].getPlatform())) {

                    Results_Label[j] = new JLabel((j + 1) + ") " + Inventory[i].getId() + " - " + Inventory[i].getTitle());
                    j++;

                }

            }
        
        }   //End of temperory lazy scope
        
        if(games < 10) {
            
            for(int i = 0 ; i < games; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        else {
        
            for(int i = 0 ; i < 10; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        // ----------------------------------------------------- //
        
        Search_Panel.add(SearchInput);
        Search_Panel.add(Search_Button);
        
        // ----------------------------------------------------- //
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon kduGameLogo = new ImageIcon("./picture/Search_file_symbol.png");
        Image image = kduGameLogo.getImage();
        Image newimg = image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        kduGameLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(kduGameLogo);
        jp_Picture1.add(lb1);
        
        // ----------------------------------------------------- //
        
        Main_Panel.add(Header_Panel);
        Main_Panel.add(Body_Panel);
        Main_Panel.add(jp_Picture1);
        Main_Panel.add(Search_Panel);
        Main_Panel.add(Next_Button);
        Main_Panel.add(Return_Button);
        Main_Panel.add(Previous_Button);
        
        Header_Panel.setBackground(new Color(70,177,255));
        Body_Panel.setBackground(new Color(165,188,255));
        jp_Picture1.setBackground(new Color(183,255,252));
        Search_Panel.setBackground(new Color(183,255,252));
        Next_Button.setBackground(new Color(131,135,181));
        Return_Button.setBackground(new Color(131,135,181));
        Previous_Button.setBackground(new Color(131,135,181));
        Main_Panel.setBackground(new Color(183,255,252));
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.insets = new Insets(0,0,10,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(Body_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,30,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(Search_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,5,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Next_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Previous_Button, gridBagConstraints);
        
        if (games < 10) {
            
            Next_Button.setEnabled(false);
            
        }
        
        if(counter <= 10) {
            
            Previous_Button.setEnabled(false);
            
        }
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+--- Search Menu: Platform ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- Search Menu: Platform ---+");
        
        // ----------------------------------------------------- //
        
        Search_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Search button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Search button clicked");

                int counter = 0, obj = 0;
                    
                for ( ; obj < Inventory.length; obj++) {

                    if(SearchInput.getText().equals(Inventory[obj].getTitle()) && Inventory[obj].getId() != 0) {

                        break;

                    }

                    counter++;

                }

                if(counter != 100) {

                    System.out.println("Switching to View Menu for game ID " + Inventory[obj].getId());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for game ID " + Inventory[obj].getId());
                    
                    Main_Panel.setVisible(false);
                    Main_Methods.view(Frame, Inventory, obj);

                }

                else {

                    System.out.println("No search results");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");

                    JOptionPane.showMessageDialog(Frame, "No search results");
                        
                }
                    
            }

        });
        
        Next_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Next button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Next button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "next");

            }

        });
        
        Previous_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Previous button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + "Previous button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "previous");

            }

        });
        
        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Returning to Main Menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to Main Menu");
                
                Main_Panel.setVisible(false);
                Main_Methods.search(Frame, Inventory);

            }

        });
        
    }
    
    public static void search_releaseYear(JFrame Frame, Game_Database Inventory[], int releaseYear) {
        
        JLabel Title_Label;
        
        JPanel Main_Panel = new JPanel(gridBagLO,true);
        JPanel Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel Body_Panel = new JPanel(new GridLayout(5, 2, 0, 0));

        JPanel Search_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField SearchInput = new JTextField(20);
        JButton Search_Button = new JButton("Search Title");

        JButton Next_Button = new JButton("           Next           ");
        JButton Return_Button = new JButton("            Return            ");
        JButton Previous_Button = new JButton("       Previous       ");
        
        System.out.println("Initialising Search Menu: Release Year");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Search Menu: Release Year");
        
        games = 0;
        display = 0;
        counter = 0;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //
        
        Title_Label = new JLabel("Games under " + releaseYear + " category");
        Header_Panel.add(Title_Label);
        
        // ----------------------------------------------------- //
         
         
        for(int i = 0 ; i < Inventory.length; i++) {
            
            if (releaseYear == Inventory[i].getReleaseYear()) {
                
                games++;
                
            }

        }
        
        JLabel Results_Label[] = new JLabel[games];
        
        {   //Temperory lazy scope
            
            int j = 0;

            for(int i = 0 ; i < Inventory.length; i++) {

                if (releaseYear == Inventory[i].getReleaseYear()) {

                    Results_Label[j] = new JLabel((j + 1) + ") " + Inventory[i].getId() + " - " + Inventory[i].getTitle());
                    j++;

                }

            }
        
        }   //End of temperory lazy scope
        
        if(games < 10) {
            
            for(int i = 0 ; i < games; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        else {
        
            for(int i = 0 ; i < 10; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        // ----------------------------------------------------- //
        
        Search_Panel.add(SearchInput);
        Search_Panel.add(Search_Button);
        
        // ----------------------------------------------------- //
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon kduGameLogo = new ImageIcon("./picture/Search_file_symbol.png");
        Image image = kduGameLogo.getImage();
        Image newimg = image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        kduGameLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(kduGameLogo);
        jp_Picture1.add(lb1);
        
        // ----------------------------------------------------- //
        
        Main_Panel.add(Header_Panel);
        Main_Panel.add(Body_Panel);
        Main_Panel.add(jp_Picture1);
        Main_Panel.add(Search_Panel);
        Main_Panel.add(Next_Button);
        Main_Panel.add(Return_Button);
        Main_Panel.add(Previous_Button);
        
        Header_Panel.setBackground(new Color(70,177,255));
        Body_Panel.setBackground(new Color(165,188,255));
        jp_Picture1.setBackground(new Color(183,255,252));
        Search_Panel.setBackground(new Color(183,255,252));
        Next_Button.setBackground(new Color(131,135,181));
        Return_Button.setBackground(new Color(131,135,181));
        Previous_Button.setBackground(new Color(131,135,181));
        Main_Panel.setBackground(new Color(183,255,252));
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.insets = new Insets(0,0,10,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(Body_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,30,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(Search_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,5,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Next_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Previous_Button, gridBagConstraints);
        
        if (games < 10) {
            
            Next_Button.setEnabled(false);
            
        }
        
        if(counter <= 10) {
            
            Previous_Button.setEnabled(false);
            
        }
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+--- Search Menu: Release Year ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- Search Menu: Release Year ---+");
        
        // ----------------------------------------------------- //
         
        Search_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Search button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Search button clicked");

                int counter = 0, obj = 0;
                    
                for ( ; obj < Inventory.length; obj++) {

                    if(SearchInput.getText().equals(Inventory[obj].getTitle()) && Inventory[obj].getId() != 0) {

                        break;

                    }

                    counter++;

                }

                if(counter != 100) {

                    System.out.println("Switching to View Menu for game ID " + Inventory[obj].getId());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for game ID " + Inventory[obj].getId());
                    
                    Main_Panel.setVisible(false);
                    Main_Methods.view(Frame, Inventory, obj);

                }

                else {

                    System.out.println("No search results");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");
                    
                    JOptionPane.showMessageDialog(Frame, "No search results");
                        
                }
                    
            }

        });
        
        Next_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Next button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Next button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "next");

            }

        });
        
        Previous_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Previous button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Previous button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "previous");

            }

        });
        
        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Returning to Main Menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to Main Menu");
                
                Main_Panel.setVisible(false);
                Main_Methods.search(Frame, Inventory);

            }

        });
        
    }
    
    public static void search_genre(JFrame Frame, Game_Database Inventory[], String genre) {
        
        JLabel Title_Label;
        
        JPanel Main_Panel = new JPanel(gridBagLO,true);
        JPanel Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel Body_Panel = new JPanel(new GridLayout(5, 2, 0, 0));

        JPanel Search_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField SearchInput = new JTextField(20);
        JButton Search_Button = new JButton("Search Title");

        JButton Next_Button = new JButton("           Next           ");
        JButton Return_Button = new JButton("            Return            ");
        JButton Previous_Button = new JButton("       Previous       ");
        
        System.out.println("Initialising Search Menu: Genre");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Search Menu: Genre");
        
        games = 0;
        display = 0;
        counter = 0;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //
        
        Title_Label = new JLabel("Games under " + genre + " category");
        Header_Panel.add(Title_Label);
        
        // ----------------------------------------------------- //
        
        for(int i = 0 ; i < Inventory.length; i++) {
            
            if (genre.equals(Inventory[i].getGenre())) {
                
                games++;
                
            }

        }
        
        JLabel Results_Label[] = new JLabel[games];
        
        {   //Temperory lazy scope
            
            int j = 0;

            for(int i = 0 ; i < Inventory.length; i++) {

                if (genre.equals(Inventory[i].getGenre())) {

                    Results_Label[j] = new JLabel((j + 1) + ") " + Inventory[i].getId() + " - " + Inventory[i].getTitle());
                    j++;

                }

            }
        
        }   //End of temperory lazy scope
        
        if(games < 10) {
            
            for(int i = 0 ; i < games; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        else {
        
            for(int i = 0 ; i < 10; i++) {

                Body_Panel.add(Results_Label[counter]);
                display++;
                counter++;

            }
            
        }
        
        // ----------------------------------------------------- //
        
        Search_Panel.add(SearchInput);
        Search_Panel.add(Search_Button);
        
        // ----------------------------------------------------- //
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon kduGameLogo = new ImageIcon("./picture/Search_file_symbol.png");
        Image image = kduGameLogo.getImage();
        Image newimg = image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        kduGameLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(kduGameLogo);
        jp_Picture1.add(lb1);
        
        // ----------------------------------------------------- //
        
        Main_Panel.add(Header_Panel);
        Main_Panel.add(Body_Panel);
        Main_Panel.add(jp_Picture1);
        Main_Panel.add(Search_Panel);
        Main_Panel.add(Next_Button);
        Main_Panel.add(Return_Button);
        Main_Panel.add(Previous_Button);
        
        Header_Panel.setBackground(new Color(70,177,255));
        Body_Panel.setBackground(new Color(165,188,255));
        jp_Picture1.setBackground(new Color(183,255,252));
        Search_Panel.setBackground(new Color(183,255,252));
        Next_Button.setBackground(new Color(131,135,181));
        Return_Button.setBackground(new Color(131,135,181));
        Previous_Button.setBackground(new Color(131,135,181));
        Main_Panel.setBackground(new Color(183,255,252));
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.insets = new Insets(0,0,10,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(Body_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,30,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,20,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(Search_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,5,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Next_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Previous_Button, gridBagConstraints);
        
        if (games < 10) {
            
            Next_Button.setEnabled(false);
            
        }
        
        if(counter <= 10) {
            
            Previous_Button.setEnabled(false);
            
        }
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+--- Search Menu: Genre ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- Search Menu: Genre ---+");
        
        // ----------------------------------------------------- //
        
        Search_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Search button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Search button clicked");

                int counter = 0, obj = 0;
                    
                for ( ; obj < Inventory.length; obj++) {

                    if(SearchInput.getText().equals(Inventory[obj].getTitle()) && Inventory[obj].getId() != 0) {

                        break;

                    }

                    counter++;

                }

                if(counter != 100) {

                    System.out.println("Switching to View Menu for game ID " + Inventory[obj].getId());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for game ID " + Inventory[obj].getId());
                    
                    Main_Panel.setVisible(false);
                    Main_Methods.view(Frame, Inventory, obj);

                }

                else {

                    System.out.println("No search results");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");

                    JOptionPane.showMessageDialog(Frame, "No search results");
                        
                }
                    
            }

        });
        
        Next_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Next button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Next button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "next");

            }

        });
        
        Previous_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Previous button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Previous button clicked");
                
                next_previous(Frame, Inventory, Results_Label, Body_Panel, Next_Button, Previous_Button, "previous");

            }

        });
        
        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Returning to Main Menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to Main Menu");
                
                Main_Panel.setVisible(false);
                Main_Methods.search(Frame, Inventory);

            }

        });
        
    }
    
    public static void next_previous(JFrame Frame, Game_Database Inventory[], JLabel Results_Label[], JPanel Body_Panel, JButton Next_Button, JButton Previous_Button, String nextPrevious) {
        
        int limit = 0;
        
        display = 0;
        
        if (nextPrevious.equals("next")) {
        
            Body_Panel.removeAll();
            
            for( ; counter < games; counter++) {

                if (limit < 10) {
                    Body_Panel.add(Results_Label[counter]);
                    display++;
                    limit++;
                }
                else {
                    break;
                }
                
            }
            
            Body_Panel.updateUI();
            
        }
        
        else if (nextPrevious.equals("previous")) {
            
            counter -= 20;
            
            if(counter < 0) {
                counter = 0;
            }
            
            Body_Panel.removeAll();
            
            for( ; counter < games; counter++) {

                if (limit < 10) {
                    Body_Panel.add(Results_Label[counter]);
                    limit++;
                }
                else {
                    break;
                }
                
            }
            
            Body_Panel.updateUI();
            
        }
        
        if (games < 10) {
            Next_Button.setEnabled(false);
        }
        else if (display <=10 && counter >= games - display) {
            Next_Button.setEnabled(false);
        }
        else {
            Next_Button.setEnabled(true);
        }
        
        if(counter == 10) {
            Previous_Button.setEnabled(false);
        }
        else {
            Previous_Button.setEnabled(true);
        }
        
        System.out.print(counter);
        
    }
    
}
