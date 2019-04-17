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
import java.util.Calendar;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Main_Methods {
    
    static private int inputYear_Check;
    
    static private GridBagLayout gridBagLO = new GridBagLayout();
    
    static private GridBagConstraints gridBagConstraints = new GridBagConstraints();
    
    public static void add(JFrame Frame, Game_Database Inventory[], int obj) {
        
        System.out.println("Initialising Add menu");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Add menu");
        
        inputYear_Check = 0;
        
        JButton Submit_Button, Cancel_Button;
        JLabel AddMenu_TitleLabel, Title_Label, Platform_Label, Developer_Label, Genre_Label, ReleaseYear_Label, Publisher_Label, Description_Label;
        JTextField Title_Input, Platform_Input, Developer_Input, Genre_Input, ReleaseYear_Input,Publisher_Input;
        JTextArea Description_Input;
        JScrollPane Description_Scroll;
        JPanel Main_Panel;
        
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout()); //FlowLayout
        
        // ----------------------------------------------------- //

        AddMenu_TitleLabel = new JLabel("+     +    +   +  + +         [   Add Inventory   ]        + +  +   +    +     +\n");
        
        // ----------------------------------------------------- //

        Title_Label = new JLabel("Title                                             :");
        Title_Input = new JTextField(20);

        Platform_Label = new JLabel("Platform                                    :");
        Platform_Input = new JTextField(20);
        
        Developer_Label = new JLabel("Developer                                 :");
        Developer_Input = new JTextField(20);
        
        Genre_Label = new JLabel("Genre                                         :");
        Genre_Input = new JTextField(20);
        
        ReleaseYear_Label = new JLabel("Release Year (1951 - " + Logger.cal.get(Calendar.YEAR) + ")  :");
        ReleaseYear_Input = new JTextField(20);
        
        Publisher_Label = new JLabel("Publisher                                   :");
        Publisher_Input = new JTextField(20);
        
        Description_Label = new JLabel("Description                               :");
        Description_Input = new JTextArea(5,20);
        Description_Scroll = new JScrollPane(Description_Input);
        
        // ----------------------------------------------------- //
        
        
        Submit_Button = new JButton("Submit");
        Cancel_Button = new JButton("Cancel");
        
        
        // ----------------------------------------------------- //

        Main_Panel = new JPanel(gridBagLO);

        Main_Panel.add(AddMenu_TitleLabel);
        Main_Panel.add(Title_Label);
        Main_Panel.add(Title_Input);
        Main_Panel.add(Platform_Label);
        Main_Panel.add(Platform_Input);
        Main_Panel.add(Developer_Label);
        Main_Panel.add(Developer_Input);
        Main_Panel.add(Genre_Label);
        Main_Panel.add(Genre_Input);
        Main_Panel.add(ReleaseYear_Label);
        Main_Panel.add(ReleaseYear_Input);
        Main_Panel.add(Publisher_Label);
        Main_Panel.add(Publisher_Input);
        Main_Panel.add(Description_Label);
        Main_Panel.add(Description_Scroll);
        Main_Panel.add(Submit_Button);
        Main_Panel.add(Cancel_Button);
        
        
        //////////////////////////////////////////////////////////////////////////
        
        AddMenu_TitleLabel.setBackground(new Color(176,214,236));
        Title_Input.setBackground(new Color(240,240,240));
        Platform_Input.setBackground(new Color(240,240,240));
        Developer_Input.setBackground(new Color(240,240,240));
        Genre_Input.setBackground(new Color(240,240,240));
        ReleaseYear_Input.setBackground(new Color(240,240,240));
        Publisher_Input.setBackground(new Color(240,240,240));
        Description_Input.setBackground(new Color(240,240,240));
        
        Submit_Button.setBackground(new Color(213,255,109));
        Cancel_Button.setBackground(new Color(213,255,109));
        
        Main_Panel.setBackground(new Color(161,222,190));
        
        //////////////////////////////////////////////////////////////////////////
        
        
        gridBagConstraints.insets = new Insets(0,0,40,0);
        
        
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(AddMenu_TitleLabel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,3,15,3);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(Title_Label, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(Title_Input, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(Platform_Label, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(Platform_Input, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(Developer_Label, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(Developer_Input, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Genre_Label, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Genre_Input, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagLO.setConstraints(ReleaseYear_Label, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagLO.setConstraints(ReleaseYear_Input, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagLO.setConstraints(Publisher_Label, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagLO.setConstraints(Publisher_Input, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagLO.setConstraints(Description_Label, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagLO.setConstraints(Description_Scroll, gridBagConstraints);
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(40,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagLO.setConstraints(Submit_Button, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagLO.setConstraints(Cancel_Button, gridBagConstraints);
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+--- Add menu ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- Add menu ---+");
        
        // ----------------------------------------------------- //

        ReleaseYear_Input.getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent de) {
                inputYear_Check++;
                inputCheck();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                
                inputYear_Check--;
                
                if(inputYear_Check < 0) {
                    inputYear_Check = 0;
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                //
            }

            public void inputCheck() {

                try {

                    Integer.parseInt(ReleaseYear_Input.getText());

                    if(inputYear_Check == 4 && (Integer.parseInt(ReleaseYear_Input.getText()) < 1951 || Integer.parseInt(ReleaseYear_Input.getText()) > Logger.cal.get(Calendar.YEAR))) {

                        throw new NumberFormatException();

                    }

                }catch (NumberFormatException error) {

                    JOptionPane.showMessageDialog(Frame, "Please input the release year between 1951 and " + Logger.cal.get(Calendar.YEAR));

                }

            }

        });
        
        // ----------------------------------------------------- //
        
        Submit_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                boolean submitChecker = true;
                String report = "", notFilled = "";
                
                for(int i = 0; i < Inventory.length; i++) {
                    
                    if (Title_Input.getText().equals(Inventory[i].getTitle())) {
                        
                        report += "Game title exist\n\n";
                        submitChecker = false;
                        break;
                        
                    }
                    
                }
                
                try {
                    
                    Integer.parseInt(ReleaseYear_Input.getText());
                    
                    if(Integer.parseInt(ReleaseYear_Input.getText()) < 1951 || Integer.parseInt(ReleaseYear_Input.getText()) > Logger.cal.get(Calendar.YEAR)) {
                        throw new NumberFormatException();
                    }
                    
                } catch (NumberFormatException error) {
                    
                    report += "Invalid Release Year input\n\n";
                    submitChecker = false;
                    
                }
                
                if(Title_Input.getText().equals("")) {
                    notFilled += "Title must not be left blank\n";
                    submitChecker = false;
                }
                if(Platform_Input.getText().equals("")) {
                    notFilled += "Platform must not be left blank\n";
                    submitChecker = false;
                }
                if(Developer_Input.getText().equals("")) {
                    notFilled += "Developer must not be left blank\n";
                    submitChecker = false;
                }
                if(Genre_Input.getText().equals("")) {
                    notFilled += "Genre must not be left blank\n";
                    submitChecker = false;
                }
                if(ReleaseYear_Input.getText().equals("")) {
                    notFilled += "Release Year must not be left blank\n";
                    submitChecker = false;
                }
                if(Publisher_Input.getText().equals("")) {
                    notFilled += "Publisher must not be left blank\n";
                    submitChecker = false;
                }
                if(Description_Input.getText().equals("")) {
                    notFilled += "Description must not be left blank\n";
                    submitChecker = false;
                }
                
                if(submitChecker) {

                    Inventory[obj].setTitle(Title_Input.getText());
                    Inventory[obj].setPlatform(Platform_Input.getText());
                    Inventory[obj].setDeveloper(Developer_Input.getText());
                    Inventory[obj].setGenre(Genre_Input.getText());
                    Inventory[obj].setReleaseYear(Integer.parseInt(ReleaseYear_Input.getText()));
                    Inventory[obj].setPublisher(Publisher_Input.getText());
                    Inventory[obj].setDescription(Description_Input.getText());
                    Inventory[obj].setId(System_Methods.idNumberGenerator(Inventory));
                    
                    System.out.println("Successfully added game (ID: " + Inventory[obj].getId() + ")");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Successfully added game (ID: " + Inventory[obj].getId() + ")");

                    UIManager.put("OptionPane.yesButtonText","Yes");
                    UIManager.put(" OptionPane.noButtonText", "No");

                    switch (JOptionPane.showConfirmDialog(Frame, "Game data saved.\n\nWould you like to view its entry?", "Assignment 2", JOptionPane.YES_NO_OPTION)) {

                        case 0:

                            System.out.println("Switching to newly added game View Menu");
                            Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to newly added game View Menu");
                            
                            Main_Panel.setVisible(false);
                            view(Frame, Inventory, obj);
                            
                            break;

                        default:

                            if (JOptionPane.showConfirmDialog(Frame, "Would you like to write a review for the game?", "Assignment 2", JOptionPane.YES_NO_OPTION) == 0) {
                                
                                System.out.println("Switching to Add-Review Menu for game");
                                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to Add-Review Menu for game");

                                Main_Panel.setVisible(false);
                                addReview(Frame, Inventory, obj);
                                
                            }
                            
                            else {
                                
                                System.out.println("Returning to Main Menu");
                                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to Main Menu");

                                Main_Panel.setVisible(false);
                                
                            }

                    }
                    
                }
                
                else {
                    
                    JOptionPane.showMessageDialog(Frame, report + notFilled);
                    
                }

            }

        });

        Cancel_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Cancelled adding new game");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Cancelled adding new game");
                
                Main_Panel.setVisible(false);

            }

        });
        
    }
    
    public static void view(JFrame Frame, Game_Database Inventory[], int obj) {
        
        System.out.println("Initialising View menu");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Edit menu");
        
        JPanel Main_Panel, Header_Panel, Content_Panel, Footer_Panel;
        JLabel Title_Label, GameTitle_Label, GamePlatform_Label, GameDeveloper_Label, GameGenre_Label, GameReleaseYear_Label, GamePublisher_Label, GameDescription_Label;
        JButton Edit_Button, Review_Button, Export_Button, Delete_Button, Return_Button;
        JTextArea Description_Input;
        JScrollPane Description_Scroll;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout()); //FlowLayout
        
        // ----------------------------------------------------- //

        Header_Panel = new JPanel(new FlowLayout());
        Title_Label = new JLabel("+---------------  Viewing Game ID: " + Inventory[obj].getId() + "  -----------------+\n");
        Header_Panel.add(Title_Label);
        
        // ----------------------------------------------------- //

        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon kduGameLogo = new ImageIcon("./picture/Game_symbol.png");
        Image image = kduGameLogo.getImage();
        Image newimg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
        kduGameLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(kduGameLogo);
        jp_Picture1.add(lb1);
        
        
        GameTitle_Label = new JLabel("Title                         :  " + Inventory[obj].getTitle());
        GamePlatform_Label = new JLabel("Platform                 :  " + Inventory[obj].getPlatform());
        GameDeveloper_Label = new JLabel("Developer              :  " + Inventory[obj].getDeveloper());
        GameGenre_Label = new JLabel("Genre                      :  " + Inventory[obj].getGenre());
        GameReleaseYear_Label = new JLabel("Release year         :  " + Inventory[obj].getReleaseYear());
        GamePublisher_Label = new JLabel("Publisher                :  " + Inventory[obj].getPublisher());
        GameDescription_Label = new JLabel("Description            :  ");
        Description_Input = new JTextArea(3,20);
        Description_Input.setText(Inventory[obj].getDescription());
        Description_Scroll = new JScrollPane(Description_Input);
        Description_Input.setEditable(false);
        
        Content_Panel = new JPanel(gridBagLO,true);
        
        Content_Panel.add(GameTitle_Label);
        Content_Panel.add(GamePlatform_Label);
        Content_Panel.add(GameDeveloper_Label);
        Content_Panel.add(GameGenre_Label);
        Content_Panel.add(GameReleaseYear_Label);
        Content_Panel.add(GamePublisher_Label);
        Content_Panel.add(GameDescription_Label);
        Content_Panel.add(Description_Scroll);
        
        gridBagConstraints.insets = new Insets(6,20,6,20);
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(GameTitle_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(GamePlatform_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(GameDeveloper_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(GameGenre_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(GameReleaseYear_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagLO.setConstraints(GamePublisher_Label, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(6,20,6,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagLO.setConstraints(GameDescription_Label, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(6,0,6,20);
        
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagLO.setConstraints(Description_Scroll, gridBagConstraints);
        

        // ----------------------------------------------------- //
        
        Delete_Button = new JButton("    Delete    ");
        Export_Button = new JButton("    Export    ");
        Edit_Button = new JButton("       Edit       ");
        
        if(Inventory[obj].getReview().equals("")) {
            Review_Button = new JButton("Add Review");
        }
        else {
            Review_Button = new JButton("View Review");
        }
        
        Return_Button = new JButton("Return to Main Menu");
        
        // ----------------------------------------------------- //

        Main_Panel = new JPanel(gridBagLO,true);
        
        Main_Panel.add(Header_Panel);
        Main_Panel.add(jp_Picture1);
        Main_Panel.add(Content_Panel);
        
        Main_Panel.add(Delete_Button);
        Main_Panel.add(Export_Button);
        Main_Panel.add(Edit_Button);
        Main_Panel.add(Review_Button);
        
        Main_Panel.add(Return_Button);
        
        Header_Panel.setBackground(new Color(55,255,197));
        jp_Picture1.setBackground(new Color(159,255,226));
        Content_Panel.setBackground(new Color(230,255,235));
        
        Delete_Button.setBackground(new Color(213,255,109));
        Export_Button.setBackground(new Color(213,255,109));
        Edit_Button.setBackground(new Color(213,255,109));
        
        Review_Button.setBackground(new Color(213,255,109));
        
        Return_Button.setBackground(new Color(213,255,109));
        
        Main_Panel.setBackground(new Color(161,222,190));
        
        
        gridBagConstraints.insets = new Insets(0,0,1,0);
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(Content_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(5,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Delete_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Export_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Edit_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Review_Button, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(8,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+--- View menu ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- View menu ---+");
        
        System.out.println("Viewing game " + Inventory[obj].getId());
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Viewsing game " + Inventory[obj].getId());
        
        // ----------------------------------------------------- //

        Edit_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                
                System.out.println("Edit button clicked\nSwitching to Edit Menu for game");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Edit button clicked\nSwitching to Edit Menu for game");
                
                Main_Panel.setVisible(false);
                edit(Frame, Inventory, obj);

            } 

        });
        
        Review_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                
                if(Inventory[obj].getReview().equals("")) {
                    
                    System.out.println("Review button clicked\nSwitching to Add-Review Menu for game");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Review button clicked\nSwitching to Add-Review Menu for game");
                    
                    Main_Panel.setVisible(false);
                    addReview(Frame, Inventory, obj);
                    
                }
                else {
                    
                    System.out.println("Review button clicked\nSwitching to View-Review Menu for game");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Review button clicked\nSwitching to View-Review Menu for game");
                    
                    Main_Panel.setVisible(false);
                    viewReview(Frame, Inventory, obj);
                    
                }

            } 

        });

        Export_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                
                System.out.println("Export button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Export button clicked");

                try {
                    
                    if(System_Methods.fixedPath.equals("-")) {
                        
                        String path;
                    
                        path = JOptionPane.showInputDialog(null, "Please input the absolute file path you wish to save to");

                        System.out.println("Exporting game data to " + path);
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Exporting game data to " + path);
                        
                        System_Methods.export(Inventory, obj, path);
                        
                    }
                    
                    else {
                        
                        System.out.println("Exporting game data to " + System_Methods.fixedPath);
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Exporting game data to " + System_Methods.fixedPath);
                        
                        System_Methods.export(Inventory, obj, System_Methods.fixedPath);
                        
                    }
                    

                } catch(Exception error) {
                    
                    JOptionPane.showMessageDialog(Frame, "Error.\nDicrectory cannot be found.");
                    
                    System.out.println("Error, dicrectory cannot be found.");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Error, dicrectory cannot be found.");
                    
                }

            } 

        });

        Delete_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                
                System.out.print("Delete button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Delete button clicked");

                UIManager.put("OptionPane.yesButtonText","Yes");
                UIManager.put("OptionPane.noButtonText", "No");

                if(JOptionPane.showConfirmDialog(Frame, "Are you sure?", "Assignment 2", JOptionPane.YES_NO_OPTION) == 0) {

                    System.out.println("Deleting game data");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Deleting game data");
                    
                    System_Methods.delete(Inventory, obj);

                    System.out.println("Rebuilding database");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Rebuilding database");
                    
                    System_Methods.rebuild(Inventory);

                }
                
                else {
                    
                    System.out.println("Cancelled");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Cancelled");
                    
                }

            } 

        });

        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){

                System.out.print("Returning to Main Menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to Main Menu");
                
                Main_Panel.setVisible(false);
                
            }

        });
        
    }
    
    private static void edit(JFrame Frame, Game_Database Inventory[], int obj) {
        
        System.out.println("Initialising Edit menu");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Edit menu");
        
        JButton Submit_Button, Cancel_Button;
        JLabel AddMenu_TitleLabel, Title_Label, Platform_Label, Developer_Label, Genre_Label, ReleaseYear_Label, Publisher_Label, Description_Label;
        JTextField Title_Input, Platform_Input, Developer_Input, Genre_Input, ReleaseYear_Input,Publisher_Input, Description_Input;
        JPanel Main_Panel, Header_Panel, Title_Panel, Platform_Panel, Developer_Panel, Genre_Panel, ReleaseYear_Panel, Publisher_Panel, Description_Panel;

        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //

        Header_Panel = new JPanel();
        AddMenu_TitleLabel = new JLabel("+---------------  Editing Game ID: " + Inventory[obj].getId() + "  -----------------+\n");
        Header_Panel.add(AddMenu_TitleLabel);
        
        // ----------------------------------------------------- //
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon kduGameLogo = new ImageIcon("./picture/Edit.png");
        Image image = kduGameLogo.getImage();
        Image newimg = image.getScaledInstance(110, 110,  java.awt.Image.SCALE_SMOOTH);
        kduGameLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(kduGameLogo);
        jp_Picture1.add(lb1);
        
        // ----------------------------------------------------- //

        Title_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT), true);
        Title_Input = new JTextField(20);
        Title_Label = new JLabel("Title                                            :");
        Title_Input.setText(Inventory[obj].getTitle());
        Title_Panel.add(Title_Label);
        Title_Panel.add(Title_Input);
        
        Platform_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT), true);
        Platform_Input = new JTextField(20);
        Platform_Label = new JLabel("Platform                                    :");
        Platform_Input.setText(Inventory[obj].getPlatform());
        Platform_Panel.add(Platform_Label);
        Platform_Panel.add(Platform_Input);
        
        Developer_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT), true);
        Developer_Input = new JTextField(20);
        Developer_Label = new JLabel("Developer                                 :");
        Developer_Input.setText(Inventory[obj].getDeveloper());
        Developer_Panel.add(Developer_Label);
        Developer_Panel.add(Developer_Input);
        
        Genre_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT), true);
        Genre_Input = new JTextField(20);
        Genre_Label = new JLabel("Genre                                         :");
        Genre_Input.setText(Inventory[obj].getGenre());
        Genre_Panel.add(Genre_Label);
        Genre_Panel.add(Genre_Input);
        
        ReleaseYear_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT), true);
        ReleaseYear_Input = new JTextField(20);
        ReleaseYear_Label = new JLabel("Release Year (1951 - " + Logger.cal.get(Calendar.YEAR) + ")  :");
        ReleaseYear_Input.setText(Integer.toString(Inventory[obj].getReleaseYear()));
        ReleaseYear_Panel.add(ReleaseYear_Label);
        ReleaseYear_Panel.add(ReleaseYear_Input);
        
        Publisher_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT), true);
        Publisher_Input = new JTextField(20);
        Publisher_Label = new JLabel("Publisher                                   :");
        Publisher_Input.setText(Inventory[obj].getPublisher());
        Publisher_Panel.add(Publisher_Label);
        Publisher_Panel.add(Publisher_Input);
        
        Description_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT), true);
        Description_Input = new JTextField(20);
        Description_Label = new JLabel("Description                               :");
        Description_Input.setText(Inventory[obj].getDescription());
        Description_Panel.add(Description_Label);
        Description_Panel.add(Description_Input);
        
        // ----------------------------------------------------- //
        
        Cancel_Button = new JButton("Cancel");
        Submit_Button = new JButton("Save");
        
        // ----------------------------------------------------- //
        
        Main_Panel = new JPanel(gridBagLO,true);

        Main_Panel.add(Header_Panel);
        
        Main_Panel.add(jp_Picture1);
        
        Main_Panel.add(Title_Panel);
        Main_Panel.add(Platform_Panel);
        Main_Panel.add(Developer_Panel);
        Main_Panel.add(Genre_Panel);
        Main_Panel.add(ReleaseYear_Panel);
        Main_Panel.add(Publisher_Panel);
        Main_Panel.add(Description_Panel);
        
        
        
        Main_Panel.add(Cancel_Button);
        Main_Panel.add(Submit_Button);
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(1,0,3,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,2,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,2,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(Title_Panel, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(Platform_Panel, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Developer_Panel, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagLO.setConstraints(Genre_Panel, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagLO.setConstraints(ReleaseYear_Panel, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagLO.setConstraints(Publisher_Panel, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagLO.setConstraints(Description_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(30,0,0,0);
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagLO.setConstraints(Cancel_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagLO.setConstraints(Submit_Button, gridBagConstraints);
        
        
        Header_Panel.setBackground(new Color(161,213,255));
        
        jp_Picture1.setBackground(new Color(174,227,232));
        Title_Panel.setBackground(new Color(174,227,232));
        Platform_Panel.setBackground(new Color(174,227,232));
        Developer_Panel.setBackground(new Color(174,227,232));
        Genre_Panel.setBackground(new Color(174,227,232));
        ReleaseYear_Panel.setBackground(new Color(174,227,232));
        Publisher_Panel.setBackground(new Color(174,227,232));
        Description_Panel.setBackground(new Color(174,227,232));
        
        Cancel_Button.setBackground(new Color(206,226,255));
        Submit_Button.setBackground(new Color(222,233,255));
        
        Main_Panel.setBackground(new Color(210,250,241));
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+--- Edit menu ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- Edit menu ---+");
        
        System.out.println("Editing game " + Inventory[obj].getId());
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Editing game " + Inventory[obj].getId());
        
        // ----------------------------------------------------- //
        
        ReleaseYear_Input.getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent de) {
                inputYear_Check++;
                inputCheck();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                
                inputYear_Check--;
                
                if(inputYear_Check < 0) {
                    inputYear_Check = 0;
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                //
            }
            
            public void inputCheck() {
               
                try {
            
                    Integer.parseInt(ReleaseYear_Input.getText());
                    
                    if(inputYear_Check == 4 && (Integer.parseInt(ReleaseYear_Input.getText()) < 1951 || Integer.parseInt(ReleaseYear_Input.getText()) > Logger.cal.get(Calendar.YEAR))) {
                        
                        throw new NumberFormatException();
                        
                    }

                }catch (NumberFormatException error) {

                    JOptionPane.showMessageDialog(Frame, "Please input the release year between 1951 and " + Logger.cal.get(Calendar.YEAR));

                }

            }
            
        });
        
        // ----------------------------------------------------- //
        
        Submit_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Submit button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Submit button clicked");
                
                boolean submitChecker = true;
                String report = "", notFilled = "";
                
                for(int i = 0; i < Inventory.length; i++) {
                    
                    if (Title_Input.getText().equals(Inventory[i].getTitle()) && !Title_Input.getText().equals(Inventory[obj].getTitle())) {
                        
                        report += "Game title exist\n\n";
                            
                        ReleaseYear_Input.setText(Inventory[obj].getTitle());
                        submitChecker = false;

                        break;
                        
                    }
                    
                }
                
                try {
                    
                    Integer.parseInt(ReleaseYear_Input.getText());
                    
                    if(Integer.parseInt(ReleaseYear_Input.getText()) < 1951 || Integer.parseInt(ReleaseYear_Input.getText()) > Logger.cal.get(Calendar.YEAR)) {
                        throw new NumberFormatException();
                    }
                    
                } catch (NumberFormatException error) {
                    
                    report += "Invalid Release Year input\n\n";
                    submitChecker = false;
                    
                }
                
                if(Title_Input.getText().equals("")) {
                    notFilled += "Title must not be left blank\n";
                    Title_Input.setText(Inventory[obj].getTitle());
                    submitChecker = false;
                }
                if(Platform_Input.getText().equals("")) {
                    notFilled += "Platform must not not be left blank";
                    Platform_Input.setText(Inventory[obj].getPlatform());
                    submitChecker = false;
                }
                if(Developer_Input.getText().equals("")) {
                    notFilled += "Developer must not be left blank\n";
                    Developer_Input.setText(Inventory[obj].getDeveloper());
                    submitChecker = false;
                }
                if(Genre_Input.getText().equals("")) {
                    notFilled += "Genre must not be left blank\n";
                    Genre_Input.setText(Inventory[obj].getGenre());
                    submitChecker = false;
                }
                if(ReleaseYear_Input.getText().equals("")) {
                    notFilled += "Release Year must not be left blank\n";
                    ReleaseYear_Input.setText(Integer.toString(Inventory[obj].getReleaseYear()));
                    submitChecker = false;
                }
                if(Publisher_Input.getText().equals("")) {
                    notFilled += "Publisher must not be left blank\n";
                    Publisher_Input.setText(Inventory[obj].getPublisher());
                    submitChecker = false;
                }
                if(Description_Input.getText().equals("")) {
                    notFilled += "Description must not be left blank\n";
                    Description_Input.setText(Inventory[obj].getDescription());
                    submitChecker = false;
                }
                
                if(submitChecker) {

                    if (!Title_Input.getText().equals(Inventory[obj].getTitle())) {
                        
                        System.out.println("Editting Game's Title from " + Inventory[obj].getTitle() + " to " + Title_Input.getText());
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Editting Game's title from " + Inventory[obj].getTitle() + " to " + Title_Input.getText());
                        
                        Inventory[obj].setTitle(Title_Input.getText());
                        
                    }   

                    if (!Platform_Input.getText().equals(Inventory[obj].getPlatform())) {
                        
                        System.out.println("Editting Game's Platform from" + Inventory[obj].getPlatform() + " to " + Platform_Input.getText());
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Editting Game's title from" + Inventory[obj].getTitle() + " to " + Platform_Input.getText());
                        
                        Inventory[obj].setPlatform(Platform_Input.getText());
                        
                    }

                    if (!Developer_Input.getText().equals(Inventory[obj].getDeveloper())) {
                        
                        System.out.println("Editting Game's Developer from" + Inventory[obj].getDeveloper() + " to " + Developer_Input.getText());
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Editting Game's title from" + Inventory[obj].getTitle() + " to " + Developer_Input.getText());
                        
                        Inventory[obj].setDeveloper(Developer_Input.getText());
                        
                    }

                    if (!Genre_Input.getText().equals(Inventory[obj].getGenre())) {
                        
                        System.out.println("Editting Game's Genre from" + Inventory[obj].getGenre() + " to " + Genre_Input.getText());   
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Editting Game's title from" + Inventory[obj].getTitle() + " to " + Genre_Input.getText());
                        
                        Inventory[obj].setGenre(Genre_Input.getText());
                        
                    }

                    if (!ReleaseYear_Input.getText().equals(Integer.toString(Inventory[obj].getReleaseYear()))) {
                        
                        System.out.println("Editting Game's Release Year from" + Inventory[obj].getReleaseYear() + " to " + ReleaseYear_Input.getText()); 
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Editting Game's title from" + Inventory[obj].getTitle() + " to " + ReleaseYear_Input.getText()); 
                        
                        Inventory[obj].setReleaseYear(Integer.parseInt(ReleaseYear_Input.getText()));
                        
                    }

                    if (!Publisher_Input.getText().equals(Inventory[obj].getPublisher())) {
                        
                        System.out.println("Editting Game's Publisher from" + Inventory[obj].getPublisher() + " to " + Publisher_Input.getText());    
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Editting Game's title from" + Inventory[obj].getTitle() + " to " + Publisher_Input.getText()); 
                        
                        Inventory[obj].setPublisher(Publisher_Input.getText());
                        
                    }

                    if (!Description_Input.getText().equals(Inventory[obj].getDescription())) {
                        
                        System.out.println("Editting Game's Description from" + Inventory[obj].getDescription() + " to " + Description_Input.getText());  
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Editting Game's title from" + Inventory[obj].getTitle() + " to " + Description_Input.getText()); 
                        
                        Inventory[obj].setDescription(Description_Input.getText());
                        
                    }

                    System.out.println("Returning to game's View Menu");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to game's View Menu");
                    
                    Main_Panel.setVisible(false);
                    view(Frame, Inventory, obj);
                    
                }
                
                else {
                    
                    JOptionPane.showMessageDialog(Frame, report + notFilled);
                    
                }

            }

        });

        Cancel_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Canceled editing");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Canceled editing");
                
                Main_Panel.setVisible(false);
                view(Frame, Inventory, obj);
            }

        });
        
    }
    
    public static void search(JFrame Frame, Game_Database Inventory[]) {
        
        System.out.println("Initialising Search Menu");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Search Menu");

        JTextField SearchInput; 
        JPanel Main_Panel, Header_Panel,Search_Panel, SearchType_Panel, Button_Panel, Footer_Panel, Id_Panel, Title_Panel, Genre_Panel, Rating_Panel, Platform_Panel, Developer_Panel, Publisher_Panel, ReleaseYear_Panel;
        JLabel SearchMenu_TitleLabel, SearchType_Label;
        JButton Search_Button, List_Button, Return_Button;
        JRadioButton Id_RadioButton, Title_RadioButton, Genre_RadioButton, Rating_RadioButton, Platform_RadioButton, Developer_RadioButton, Publisher_RadioButton, ReleaseYear_RadioButton;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout()); //FlowLayout
        
        // ----------------------------------------------------- //
        
        Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        SearchMenu_TitleLabel = new JLabel("+---------------Search-----------------+\n");
        Header_Panel.add(SearchMenu_TitleLabel);
        
        // ----------------------------------------------------- //
        
        
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon kduGameLogo = new ImageIcon("./picture/Search_symbol.png");
        Image image = kduGameLogo.getImage();
        Image newimg = image.getScaledInstance(110, 110,  java.awt.Image.SCALE_SMOOTH);
        kduGameLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(kduGameLogo);
        jp_Picture1.add(lb1);
        
        
        
        // ----------------------------------------------------- //
        
        Search_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        SearchInput = new JTextField(20);
        Search_Button = new JButton("Search");
        
        Search_Panel.add(SearchInput);
        Search_Panel.add(Search_Button);
        
        // ----------------------------------------------------- //
        
        SearchType_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        SearchType_Label = new JLabel("Search type:");
        SearchType_Panel.add(SearchType_Label);
        
        // ----------------------------------------------------- //
        
        //Not needed?
        Title_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Id_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Genre_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Rating_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Platform_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Developer_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Publisher_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ReleaseYear_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        Title_RadioButton = new JRadioButton("Title search");
        Id_RadioButton = new JRadioButton("ID search");
        Genre_RadioButton = new JRadioButton("Genre search");
        Rating_RadioButton = new JRadioButton("Rating search");
        Platform_RadioButton = new JRadioButton("Platform search");
        Developer_RadioButton = new JRadioButton("Developer search");
        Publisher_RadioButton = new JRadioButton("Publisher search");
        ReleaseYear_RadioButton = new JRadioButton("Release year search");
        
        ButtonGroup Search_RadioButton = new ButtonGroup();
 
        Search_RadioButton.add(Title_RadioButton);
        Search_RadioButton.add(Id_RadioButton);
        Search_RadioButton.add(Genre_RadioButton);
        Search_RadioButton.add(Rating_RadioButton);
        Search_RadioButton.add(Platform_RadioButton);
        Search_RadioButton.add(Developer_RadioButton);
        Search_RadioButton.add(Publisher_RadioButton);
        Search_RadioButton.add(ReleaseYear_RadioButton);

        Title_Panel.add(Title_RadioButton);
        Id_Panel.add(Id_RadioButton);
        Genre_Panel.add(Genre_RadioButton);
        Rating_Panel.add(Rating_RadioButton);
        Platform_Panel.add(Platform_RadioButton);
        Developer_Panel.add(Developer_RadioButton);
        Publisher_Panel.add(Publisher_RadioButton);
        ReleaseYear_Panel.add(ReleaseYear_RadioButton);
        
        Title_RadioButton.setSelected(true);
        
        Button_Panel = new JPanel(gridBagLO);
        
        Button_Panel.add(Title_Panel);
        Button_Panel.add(Id_Panel);
        Button_Panel.add(Genre_Panel);
        Button_Panel.add(Rating_Panel);
        Button_Panel.add(Platform_Panel);
        Button_Panel.add(Developer_Panel);
        Button_Panel.add(Publisher_Panel);
        Button_Panel.add(ReleaseYear_Panel);
        
        
        
        
        Title_RadioButton.setBackground(new Color(255,199,217));
        Id_RadioButton.setBackground(new Color(255,199,217));
        Genre_RadioButton.setBackground(new Color(255,199,217));
        Rating_RadioButton.setBackground(new Color(255,199,217));
        Platform_RadioButton.setBackground(new Color(255,199,217));
        Developer_RadioButton.setBackground(new Color(255,199,217));
        Publisher_RadioButton.setBackground(new Color(255,199,217));
        ReleaseYear_RadioButton.setBackground(new Color(255,199,217));
        
        
        
        Title_Panel.setBackground(new Color(255,199,217));
        Id_Panel.setBackground(new Color(255,199,217));
        Genre_Panel.setBackground(new Color(255,199,217));
        Rating_Panel.setBackground(new Color(255,199,217));
        Platform_Panel.setBackground(new Color(255,199,217));
        Developer_Panel.setBackground(new Color(255,199,217));
        Publisher_Panel.setBackground(new Color(255,199,217));
        ReleaseYear_Panel.setBackground(new Color(255,199,217));
        
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(25,35,3,15);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Title_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(25,15,3,32);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Id_Panel, gridBagConstraints);
        gridBagConstraints.insets = new Insets(0,32,3,15);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(Genre_Panel, gridBagConstraints);
        gridBagConstraints.insets = new Insets(0,15,3,32);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(Rating_Panel, gridBagConstraints);
        gridBagConstraints.insets = new Insets(0,32,3,15);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(Platform_Panel, gridBagConstraints);
        gridBagConstraints.insets = new Insets(0,15,3,32);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(Developer_Panel, gridBagConstraints);
        gridBagConstraints.insets = new Insets(0,32,25,15);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(Publisher_Panel, gridBagConstraints);
        gridBagConstraints.insets = new Insets(0,15,25,32);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(ReleaseYear_Panel, gridBagConstraints);
        
        // ----------------------------------------------------- //
        

        List_Button = new JButton("                    List all                    ");
        Return_Button = new JButton("Return to Main Menu");

        
        // ----------------------------------------------------- //
        
        Main_Panel = new JPanel(gridBagLO,true); //GridLayout(5, 1, 0, 0)

        Main_Panel.add(Header_Panel);
        Main_Panel.add(jp_Picture1);
        Main_Panel.add(Search_Panel);
        Main_Panel.add(SearchType_Panel);
        Main_Panel.add(Button_Panel);
        Main_Panel.add(List_Button);
        Main_Panel.add(Return_Button);
        
        
        Header_Panel.setBackground(new Color(140,162,255));
        
        jp_Picture1.setBackground(new Color(238,198,255));
        Search_Panel.setBackground(new Color(201,104,255));
        SearchType_Panel.setBackground(new Color(255,160,217));
        Button_Panel.setBackground(new Color(255,199,217));
        
        Main_Panel.setBackground(new Color(255,117,144));
        
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.insets = new Insets(0,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(Search_Panel, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(SearchType_Panel, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Button_Panel, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagLO.setConstraints(List_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+--- Search menu ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- Search menu ---+");
        
        // ----------------------------------------------------- //
        
        Search_Button.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Search button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Search button clicked");
                
                if(Title_RadioButton.isSelected()) {
                    
                    System.out.println("Title search: " + SearchInput.getText());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Title search: " + SearchInput.getText());
                    
                    int counter = 0, obj = 0;
                    
                    for ( ; obj < Inventory.length; obj++) {
                        
                        if(SearchInput.getText().equals(Inventory[obj].getTitle()) && Inventory[obj].getId() != 0) {
                            
                            break;
                            
                        }
                        
                        counter++;
                        
                    }
                    
                    if(counter != 100) {
                    
                        System.out.println("Switching to View Menu for searched game");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for searched game");
                        
                        Main_Panel.setVisible(false);
                        Main_Methods.view(Frame, Inventory, obj);
                        
                    }
                    
                    else {
                        
                        System.out.println("No search results");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");
                        
                        JOptionPane.showMessageDialog(Frame, "No search results");
                        
                    }
                    
                }
                
                else if (Id_RadioButton.isSelected()) {
                    
                    try {
                        
                        System.out.println("ID search: " + SearchInput.getText());
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " ID search: " + SearchInput.getText());
                    
                        int counter = 0, obj = 0;

                        for ( ; obj < Inventory.length; obj++) {

                            if(Inventory[obj].getId() == Integer.parseInt(SearchInput.getText()) && Inventory[obj].getId() != 0) {

                                break;

                            }

                            counter++;

                        }

                        if(counter != 100) {

                            System.out.println("Switching to View Menu for searched game");
                            Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for searched game");
                            
                            Main_Panel.setVisible(false);
                            Main_Methods.view(Frame, Inventory, obj);

                        }

                        else {

                            System.out.println("No search results");
                            Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");
                            
                            JOptionPane.showMessageDialog(Frame, "No search results");

                        }
                        
                    } catch (Exception error) {
                        
                        JOptionPane.showMessageDialog(Frame, "Please input integers for selected search type");
                        
                    }
                    
                }
                
                else if (Genre_RadioButton.isSelected()) {
                    
                    System.out.println("Genre search: " + SearchInput.getText());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Genre search: " + SearchInput.getText());
                    
                    int counter = 0;
                    
                    for (int i = 0 ; i < Inventory.length; i++) {
                        
                        if(Inventory[i].getGenre().equals(SearchInput.getText()) && Inventory[i].getId() != 0) {
                            
                            break;
                            
                        }
                        
                        counter++;
                        
                    }
                    
                    if(counter != 100) {
                    
                        System.out.println("Switching to View Menu for searched game");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for searched game");
                        
                        Main_Panel.setVisible(false);
                        SearchType_Methods.search_genre(Frame, Inventory, SearchInput.getText());
                        
                    }
                    
                    else {
                        
                        System.out.println("No search results");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");
                        
                        JOptionPane.showMessageDialog(Frame, "No search results");
                        
                    }
                    
                }
                
                else if (Rating_RadioButton.isSelected()) {
                    
                    System.out.println("Rating search: " + SearchInput.getText());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Rating search: " + SearchInput.getText());
                    
                    try {
                    
                        int counter = 0;

                        for (int i = 0 ; i < Inventory.length; i++) {

                            if(Integer.parseInt(SearchInput.getText()) == Inventory[i].getRating() && Inventory[i].getId() != 0) {

                                break;

                            }

                            counter++;

                        }

                        if(counter != 100) {

                            System.out.println("Switching to View Menu for searched game");
                            Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for searched game");
                            
                            Main_Panel.setVisible(false);
                            SearchType_Methods.search_rating(Frame, Inventory, Integer.parseInt(SearchInput.getText()));

                        }

                        else {

                            System.out.println("No search results");
                            Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");
                            
                            JOptionPane.showMessageDialog(Frame, "No search results");

                        }
                        
                    } catch (Exception error) {
                        
                        JOptionPane.showMessageDialog(Frame, "Please input integers for selected search type");
                        
                    }
                    
                }
                
                else if (Platform_RadioButton.isSelected()) {
                    
                    System.out.println("Platform search: " + SearchInput.getText());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Platform search: " + SearchInput.getText());
                    
                    int counter = 0;
                    
                    for (int i = 0 ; i < Inventory.length; i++) {
                        
                        if(Inventory[i].getPlatform().equals(SearchInput.getText()) && Inventory[i].getId() != 0) {
                            
                            break;
                            
                        }
                        
                        counter++;
                        
                    }
                    
                    if(counter != 100) {
                    

                        System.out.println("Switching to View Menu for searched game");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for searched game");
                        
                        Main_Panel.setVisible(false);
                        SearchType_Methods.search_platform(Frame, Inventory, SearchInput.getText());
                        
                    }
                    
                    else {
                        
                        System.out.println("No search results");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");
                        
                        JOptionPane.showMessageDialog(Frame, "No search results");
                        
                    }
                    
                }
                
                else if (Developer_RadioButton.isSelected()) {
                    
                    System.out.println("Developer search: " + SearchInput.getText());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Developer search: " + SearchInput.getText());
                    
                    int counter = 0;
                    
                    for (int i = 0 ; i < Inventory.length; i++) {
                        
                        if(Inventory[i].getDeveloper().equals(SearchInput.getText()) && Inventory[i].getId() != 0) {
                            
                            break;
                            
                        }
                        
                        counter++;
                        
                    }
                    
                    if(counter != 100) {
                    

                        System.out.println("Switching to View Menu for searched game");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for searched game");
                        
                        Main_Panel.setVisible(false);
                        SearchType_Methods.search_developer(Frame, Inventory, SearchInput.getText());
                        
                    }
                    
                    else {
                        
                        System.out.println("No search results");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");
                        
                        JOptionPane.showMessageDialog(Frame, "No search results");
                        
                    }
                    
                }
                
                else if (Publisher_RadioButton.isSelected()) {
                    
                    System.out.println("Publisher search: " + SearchInput.getText());
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Publisher search: " + SearchInput.getText());
                    
                    int counter = 0;
                    
                    for (int i = 0 ; i < Inventory.length; i++) {
                        
                        if(Inventory[i].getPublisher().equals(SearchInput.getText()) && Inventory[i].getId() != 0) {
                            
                            break;
                            
                        }
                        
                        counter++;
                        
                    }
                    
                    if(counter != 100) {
                    

                        System.out.println("Switching to View Menu for searched game");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for searched game");
                        
                        Main_Panel.setVisible(false);
                        SearchType_Methods.search_publisher(Frame, Inventory, SearchInput.getText());
                        
                    }
                    
                    else {
                        
                        System.out.println("No search results");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");
                        
                        JOptionPane.showMessageDialog(Frame, "No search results");
                        
                    }
                    
                }
                
                else if (ReleaseYear_RadioButton.isSelected()) {
                    
                    try {
                    
                        System.out.println("Release Year search: " + SearchInput.getText());
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Release Year search: " + SearchInput.getText());

                        int counter = 0;

                        for (int i = 0 ; i < Inventory.length; i++) {

                            if(Integer.parseInt(SearchInput.getText()) == Inventory[i].getReleaseYear() && Inventory[i].getId() != 0) {

                                break;

                            }

                            counter++;

                        }

                        if(counter != 100) {


                            System.out.println("Switching to View Menu for searched game");
                            Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to View Menu for searched game");

                            Main_Panel.setVisible(false);
                            SearchType_Methods.search_releaseYear(Frame, Inventory, Integer.parseInt(SearchInput.getText()));

                        }

                        else {

                            System.out.println("No search results");
                            Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " No search results");

                            JOptionPane.showMessageDialog(Frame, "No search results");

                        }
                        
                    }catch (Exception error) {
                        //
                    }
                    
                } 
                
            }
        
        });
        
        List_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                for(int i = 0; i < Inventory.length; i++) {
                    
                    if(Inventory[i].getId() != 0) {
                        
                        System.out.println("Switching to List All Menu");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to List All Menu");

                        Main_Panel.setVisible(false);
                        SearchType_Methods.search_listAll(Frame, Inventory);
                        
                        break;
                        
                    }
                    else if (i == Inventory.length - 1) {
                        
                        JOptionPane.showMessageDialog(Frame, "No games recorded");
                        
                        break;
                        
                    }
                    
                }
                
            }

        });
        
        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Returning to Main Menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to Main Menu");
                
                Main_Panel.setVisible(false);

            }

        });
  
    }
    
    public static void addReview(JFrame Frame, Game_Database Inventory[], int obj) {
        
        System.out.println("Initialising Add-Review Menu");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Add-Review Menu");
        
        JPanel Main_Panel, Header_Panel, Author_Panel, Review_Panel, Rating_Panel, Written_Panel, Footer_Panel;
        JTextField Author_Input, Rating_Input, Written_Input;
        JTextArea Review_Input;
        JScrollPane Review_Scroll;
        JLabel Title_Label, Author_Label, Review_Label, Rating_Label, Written_Label;
        JButton Submit_Button, Return_Button;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //
        
        Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Title_Label = new JLabel("Reviewing " + Inventory[obj].getTitle());
        Header_Panel.add(Title_Label);
        
        // ----------------------------------------------------- //
        
        Author_Label = new JLabel("Author            :  ");
        Review_Label = new JLabel("Review             :  ");
        Rating_Label = new JLabel("Rating (0 - 5)  :  ");
        Written_Label = new JLabel("Written on      :  ");
        
        //    -----------------------------------------------------   //
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon authorLogo = new ImageIcon("./picture/Author_symbol.png");
        Image image = authorLogo.getImage();
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        authorLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(authorLogo);
        jp_Picture1.add(lb1);
        
        JPanel jp_Picture2 = new JPanel();
        ImageIcon reviewLogo = new ImageIcon("./picture/Review_symbol.png");
        Image image2 = reviewLogo.getImage();
        Image newimg2 = image2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        reviewLogo = new ImageIcon(newimg2);
        JLabel lbl2 = new JLabel(reviewLogo);
        jp_Picture2.add(lbl2);
        
        JPanel jp_Picture3 = new JPanel();
        ImageIcon ratingLogo = new ImageIcon("./picture/Rating_symbol.png");
        Image image3 = ratingLogo.getImage();
        Image newimg3 = image3.getScaledInstance(170, 50,  java.awt.Image.SCALE_SMOOTH);
        ratingLogo = new ImageIcon(newimg3);
        JLabel lbl3 = new JLabel(ratingLogo);
        jp_Picture3.add(lbl3);
        
        JPanel jp_Picture4 = new JPanel();
        ImageIcon dateLogo = new ImageIcon("./picture/Date_symbol.png");
        Image image4 = dateLogo.getImage();
        Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH);
        dateLogo = new ImageIcon(newimg4);
        JLabel lbl4 = new JLabel(dateLogo);
        jp_Picture4.add(lbl4);
        
        //     ------------------------------------------------------------  //
        
        Author_Input = new JTextField(25);
        Review_Input = new JTextArea(3,25);
        Review_Scroll = new JScrollPane(Review_Input);
        
        Rating_Input = new JTextField(25);
        Written_Input = new JTextField(25);
        Written_Input.setText(Logger.dateFormat.format(Logger.cal.getTime()));
        Written_Input.setEnabled(false);
        Written_Input.setDisabledTextColor(Color.black);
        
        // ----------------------------------------------------- //
        
        Return_Button = new JButton("Cancel");
        Submit_Button = new JButton("Submit");
        
        // ----------------------------------------------------- //
        
        Main_Panel = new JPanel(gridBagLO,true);
        
        Main_Panel.add(Header_Panel);
        Main_Panel.add(jp_Picture1);
        Main_Panel.add(Author_Label);
        Main_Panel.add(Author_Input);
        Main_Panel.add(jp_Picture2);
        Main_Panel.add(Review_Label);
        Main_Panel.add(Review_Scroll);
        Main_Panel.add(jp_Picture3);
        Main_Panel.add(Rating_Label);
        Main_Panel.add(Rating_Input);
        Main_Panel.add(jp_Picture4);
        Main_Panel.add(Written_Label);
        Main_Panel.add(Written_Input);
        Main_Panel.add(Return_Button);
        Main_Panel.add(Submit_Button);
                
        Header_Panel.setBackground(new Color(240,237,34));
        jp_Picture1.setBackground(new Color(251,255,164));
        Author_Input.setBackground(new Color(235,200,106));
        jp_Picture2.setBackground(new Color(251,255,164));
        Review_Input.setBackground(new Color(235,200,106));
        jp_Picture3.setBackground(new Color(251,255,164));
        Rating_Input.setBackground(new Color(235,200,106));
        jp_Picture4.setBackground(new Color(251,255,164));
        Written_Input.setBackground(new Color(235,200,106));
        Return_Button.setBackground(new Color(230,255,153));
        Submit_Button.setBackground(new Color(206,255,118));
        Main_Panel.setBackground(new Color(251,255,164));
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.insets = new Insets(0,0,4,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(Author_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(Author_Input, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(4,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(jp_Picture2, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Review_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Review_Scroll, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(4,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagLO.setConstraints(jp_Picture3, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagLO.setConstraints(Rating_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagLO.setConstraints(Rating_Input, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(4,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagLO.setConstraints(jp_Picture4, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Written_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Written_Input, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(15,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagLO.setConstraints(Submit_Button, gridBagConstraints);
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+-- Add-Review Menu ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +-- Add-Review Menu ---+");
        
        // ----------------------------------------------------- //
        
        Rating_Input.getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent de) {
                inputYear_Check++;
                inputCheck();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                inputYear_Check--;
                
                if(inputYear_Check < 0) {
                    inputYear_Check = 0;
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                //
            }
            
            public void inputCheck() {
               
                try {
            
                    Integer.parseInt(Rating_Input.getText());
                    
                    if(inputYear_Check == 4 && (Integer.parseInt(Rating_Input.getText()) < 0 || Integer.parseInt(Rating_Input.getText()) > 5)) {
                        
                        throw new NumberFormatException();
                        
                    }

                }catch (NumberFormatException error) {

                    JOptionPane.showMessageDialog(Frame, "Please input the rating between 0 (bad) and 5 (good)");

                }

            }
            
        });
        
        // ----------------------------------------------------- //
        
        Submit_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                boolean submitChecker = true;
                String report = "", notFilled = "";
                
                try {
                    
                    Integer.parseInt(Rating_Input.getText());
                    
                    if(Integer.parseInt(Rating_Input.getText()) > 5 || Integer.parseInt(Rating_Input.getText()) < 0) {
                        throw new NumberFormatException();
                    }
                    
                } catch (NumberFormatException error) {
                    
                    report += "Invalid Rating input\n\n";
                    submitChecker = false;
                    
                }
                
                if(Author_Input.getText().equals("")) {
                    notFilled += "Rating must not be left blank\n";
                    submitChecker = false;
                }
                if(Review_Input.getText().equals("")) {
                    notFilled += "Rating must not be left blank\n";
                    submitChecker = false;
                }
                if(Rating_Input.getText().equals("")) {
                    notFilled += "Rating must not be left blank\n";
                    submitChecker = false;
                }
                
                if(submitChecker) {
                    
                    Inventory[obj].setAuthor(Author_Input.getText());
                    Inventory[obj].setReview(Review_Input.getText());
                    Inventory[obj].setRating(Integer.parseInt(Rating_Input.getText()));
                    Inventory[obj].setDateReviewed(Written_Input.getText());

                    System.out.println("Successfully added review\nSwitching to game's View Menu");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Successfully added review\nSwitching to game's View Menu");

                    Main_Panel.setVisible(false);
                    viewReview(Frame, Inventory, obj);
                    
                }
                
                else {
                    
                    JOptionPane.showMessageDialog(Frame, report + notFilled);
                    
                }

            }

        });
        
        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Cancelled adding review");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Cancelled adding review");
                
                Main_Panel.setVisible(false);
                view(Frame, Inventory, obj);

            }

        });
        
    }
    
    private static void viewReview(JFrame Frame, Game_Database Inventory[], int obj) {
        
        System.out.println("Initialising View-Review Menu");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising View-Review Menu");
        
        JPanel Main_Panel, Header_Panel, SubHeader_Panel, GameID_Panel, PreContent_Panel, Content_Panel, SubContent_Panel, Written_Panel, Editted_Panel, Footer_Panel;
        JLabel Title_Label, Author_Label, Id_Label, ReviewText_Label, Review_Label, WrittenOn_Label, EditedOn_Label, Written_Label, Edited_Label;
        JTextArea Review_Note;
        JScrollPane Review_Scroll;
        JButton Edit_Button, Delete_Button, Return_Button;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //
        
        Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Title_Label = new JLabel("Review of " + Inventory[obj].getTitle() + " Rating   :  ( "+ Inventory[obj].getRating() + " / 5 )");
        Header_Panel.add(Title_Label);
        
        SubHeader_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Author_Label = new JLabel("Written By   :  " + Inventory[obj].getAuthor());
        SubHeader_Panel.add(Author_Label);
        
        GameID_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Id_Label = new JLabel("Game ID   :  " + Inventory[obj].getId());
        GameID_Panel.add(Id_Label);
        
        PreContent_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ReviewText_Label = new JLabel("Review   :  ");
        PreContent_Panel.add(ReviewText_Label);
        
        Content_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Review_Label = new JLabel(Inventory[obj].getReview());
        Review_Note = new JTextArea(10,35);
        Review_Note.setText(Inventory[obj].getReview());
        Review_Scroll = new JScrollPane(Review_Note); 
        Review_Note.setEditable(false);
        Review_Note.setBackground(new Color(235,200,106));
        Content_Panel.add(Review_Scroll);
        
        SubContent_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        Written_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        WrittenOn_Label = new JLabel("Written on   :  ");
        Written_Label = new JLabel(Inventory[obj].getDateReviewed());
        Written_Panel.add(WrittenOn_Label);
        Written_Panel.add(Written_Label);
        
        SubContent_Panel.add(Written_Panel);
        
        if (!Inventory[obj].getDateEdited().equals("")) {
            
            Editted_Panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            EditedOn_Label = new JLabel("Edited on:");
            Edited_Label = new JLabel(Inventory[obj].getDateEdited());
            Editted_Panel.add(EditedOn_Label);
            Editted_Panel.add(Edited_Label);
            
            SubContent_Panel.add(Editted_Panel);
            
        }
        
        Edit_Button = new JButton("            Edit            ");
        Delete_Button = new JButton("         Delete         ");
        Return_Button = new JButton("         Return         ");
            
        
        // ----------------------------------------------------- //
        
        Main_Panel = new JPanel(gridBagLO,true);
        
        Main_Panel.add(Header_Panel);
        Main_Panel.add(SubHeader_Panel);
        Main_Panel.add(GameID_Panel);
        Main_Panel.add(PreContent_Panel);
        Main_Panel.add(Content_Panel);
        Main_Panel.add(SubContent_Panel);
        Main_Panel.add(Edit_Button);
        Main_Panel.add(Delete_Button);
        Main_Panel.add(Return_Button);
        
        
        Header_Panel.setBackground(new Color(232,255,54));
        SubHeader_Panel.setBackground(new Color(143,255,126));
        GameID_Panel.setBackground(new Color(206,255,118));
        PreContent_Panel.setBackground(new Color(230,255,153));
        Content_Panel.setBackground(new Color(230,255,153));
        SubContent_Panel.setBackground(new Color(251,255,164));
        Edit_Button.setBackground(new Color(235,200,106));
        Delete_Button.setBackground(new Color(235,200,106));
        Return_Button.setBackground(new Color(235,200,106));
        Main_Panel.setBackground(new Color(251,255,164));
        
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.insets = new Insets(0,0,5,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(5,0,5,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(SubHeader_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(10,0,10,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(GameID_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(5,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(PreContent_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,10,0);
        
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Content_Panel, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagLO.setConstraints(SubContent_Panel, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Edit_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Delete_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+-- View-Review Menu ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +-- View-Review Menu ---+");
        
        // ----------------------------------------------------- //
        
        Edit_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Returning to main menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to game's View Menu");
                
                Main_Panel.setVisible(false);
                editReview(Frame, Inventory, obj);

            }

        });
        
        Delete_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Delete button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Delete button clicked");

                UIManager.put("OptionPane.yesButtonText","Yes");
                UIManager.put("OptionPane.noButtonText", "No");

                if(JOptionPane.showConfirmDialog(Frame, "Are you sure?", "Assignment 2", JOptionPane.YES_NO_OPTION) == 0) {

                    UIManager.put("OptionPane.yesButtonText","Yes");
                    UIManager.put("OptionPane.noButtonText", "No");

                    if(JOptionPane.showConfirmDialog(Frame, "Would you like to export the review?", "Assignment 2", JOptionPane.YES_NO_OPTION) == 0) {

                        try {
                    
                            if(System_Methods.fixedPath.equals("-")) {

                                String path;

                                path = JOptionPane.showInputDialog(null, "Please input the absolute file path you wish to save to");

                                System.out.println("Exporting review data to " + path);
                                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Exporting game data to " + path);

                                Inventory[obj].exportReview(Inventory, obj, path);

                            }

                            else {

                                System.out.println("Exporting review data to " + System_Methods.fixedPath);
                                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Exporting game data to " + System_Methods.fixedPath);

                                Inventory[obj].exportReview(Inventory, obj, System_Methods.fixedPath);

                            }
                            
                        } catch (Exception error) {
                            
                            JOptionPane.showMessageDialog(Frame, "Error.\nDicrectory cannot be found.");
                    
                            System.out.println("Error, dicrectory cannot be found.");
                            Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Error, dicrectory cannot be found.");
                            
                        }

                    }

                    System.out.println("Deleting review");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Deleting game data");
                    
                    Inventory[obj].resetReview();
                    
                    System.out.println("Returning Main Menu");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning Main Menu");

                    Main_Panel.setVisible(false);
                    //viewReview(Frame, Inventory, obj);
                    
                }
                
                else {
                    
                    System.out.println("Cancelled");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Cancelled");
                    
                }

            }

        });
        
        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Returning to Main Menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Returning to game's View Menu");
                
                Main_Panel.setVisible(false);
                view(Frame, Inventory, obj);

            }

        });
        
    }
    
    private static void editReview(JFrame Frame, Game_Database Inventory[], int obj) {
        
        System.out.println("Initialising Add-Review Menu");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising Add-Review Menu");
        
        JPanel Main_Panel, Header_Panel, Author_Panel, Review_Panel, Rating_Panel, Written_Panel, Edited_Panel, Footer_Panel;
        JTextField Author_Input, Rating_Input, Written_Input, Edited_Input;
        JTextArea Review_Input;
        JScrollPane Review_Scroll;
        JLabel Title_Label, Author_Label, Review_Label, Rating_Label, Edited_Label, Written_Label;
        JButton Submit_Button, Return_Button;
        
        // ----------------------------------------------------- //
        
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //
        
        Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Title_Label = new JLabel("Editing review of " + Inventory[obj].getTitle());
        Header_Panel.add(Title_Label);
        
        // ----------------------------------------------------- //
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon authorLogo = new ImageIcon("./picture/Author_symbol.png");
        Image image = authorLogo.getImage();
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        authorLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(authorLogo);
        jp_Picture1.add(lb1);
        
        
        JPanel jp_Picture2 = new JPanel();
        ImageIcon reviewLogo = new ImageIcon("./picture/Review_symbol.png");
        Image image2 = reviewLogo.getImage();
        Image newimg2 = image2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        reviewLogo = new ImageIcon(newimg2);
        JLabel lbl2 = new JLabel(reviewLogo);
        jp_Picture2.add(lbl2);
        
        JPanel jp_Picture3 = new JPanel();
        ImageIcon ratingLogo = new ImageIcon("./picture/Rating_symbol.png");
        Image image3 = ratingLogo.getImage();
        Image newimg3 = image3.getScaledInstance(170, 50,  java.awt.Image.SCALE_SMOOTH);
        ratingLogo = new ImageIcon(newimg3);
        JLabel lbl3 = new JLabel(ratingLogo);
        jp_Picture3.add(lbl3);
        
        JPanel jp_Picture4 = new JPanel();
        ImageIcon dateLogo = new ImageIcon("./picture/Date_symbol.png");
        Image image4 = dateLogo.getImage();
        Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH);
        dateLogo = new ImageIcon(newimg4);
        JLabel lbl4 = new JLabel(dateLogo);
        jp_Picture4.add(lbl4);
        
        //     ------------------------------------------------------------  //
        
        Author_Label = new JLabel("Author            :  ");
        Review_Label = new JLabel("Review             :  ");
        Rating_Label = new JLabel("Rating (0 - 5)  :  ");
        Written_Label = new JLabel("Written on      :  ");
        Edited_Label = new JLabel("Edited on        :");
        
        Author_Input = new JTextField(25);
        Review_Input = new JTextArea(3,25);
        Review_Scroll = new JScrollPane(Review_Input);
        Rating_Input = new JTextField(25);
        Written_Input = new JTextField(25);
        Written_Input.setDisabledTextColor(Color.black);
        Edited_Input = new JTextField(25);
        Edited_Input.setDisabledTextColor(Color.black);
        
        Author_Input.setText(Inventory[obj].getAuthor());
        Review_Input.setText(Inventory[obj].getReview());
        Rating_Input.setText(Integer.toString(Inventory[obj].getRating()));
        
        Written_Input.setText(Inventory[obj].getDateReviewed());
        Written_Input.setEnabled(false);
        
        Edited_Input.setText(Logger.dateFormat.format(Logger.cal.getTime()));
        Edited_Input.setEnabled(false);
        
        // ----------------------------------------------------- //
        
        Return_Button = new JButton("Cancel");
        Submit_Button = new JButton("Submit");
        
        // ----------------------------------------------------- //
        
        Main_Panel = new JPanel(gridBagLO,true);
        
        Main_Panel.add(Header_Panel);
        Main_Panel.add(jp_Picture1);
        Main_Panel.add(Author_Label);
        Main_Panel.add(Author_Input);
        Main_Panel.add(jp_Picture2);
        Main_Panel.add(Review_Label);
        Main_Panel.add(Review_Scroll);
        Main_Panel.add(jp_Picture3);
        Main_Panel.add(Rating_Label);
        Main_Panel.add(Rating_Input);
        Main_Panel.add(jp_Picture4);
        Main_Panel.add(Written_Label);
        Main_Panel.add(Written_Input);
        Main_Panel.add(Edited_Label);
        Main_Panel.add(Edited_Input);
        Main_Panel.add(Return_Button);
        Main_Panel.add(Submit_Button);
                
        Header_Panel.setBackground(new Color(240,237,34));
        jp_Picture1.setBackground(new Color(251,255,164));
        Author_Input.setBackground(new Color(235,200,106));
        jp_Picture2.setBackground(new Color(251,255,164));
        Review_Input.setBackground(new Color(235,200,106));
        jp_Picture3.setBackground(new Color(251,255,164));
        Rating_Input.setBackground(new Color(235,200,106));
        jp_Picture4.setBackground(new Color(251,255,164));
        Written_Input.setBackground(new Color(235,200,106));
        Edited_Input.setBackground(new Color(235,200,106));
        Return_Button.setBackground(new Color(230,255,153));
        Submit_Button.setBackground(new Color(206,255,118));
        Main_Panel.setBackground(new Color(251,255,164));
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.insets = new Insets(0,0,1,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(Author_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagLO.setConstraints(Author_Input, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(2,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagLO.setConstraints(jp_Picture2, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Review_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagLO.setConstraints(Review_Scroll, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(2,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagLO.setConstraints(jp_Picture3, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagLO.setConstraints(Rating_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagLO.setConstraints(Rating_Input, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(2,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagLO.setConstraints(jp_Picture4, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(0,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Written_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Written_Input, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagLO.setConstraints(Edited_Label, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagLO.setConstraints(Edited_Input, gridBagConstraints);
        
        gridBagConstraints.insets = new Insets(4,0,0,0);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagLO.setConstraints(Return_Button, gridBagConstraints);
        
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagLO.setConstraints(Submit_Button, gridBagConstraints);
        
        // ----------------------------------------------------- //
        
        Frame.add(Main_Panel);
        
        System.out.println("+-- Add-Review Menu ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +-- Add-Review Menu ---+");
        
        // ----------------------------------------------------- //
        
        Submit_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                boolean submitChecker = true;
                String report = "", notFilled = "";
                
                try {
                    
                    Integer.parseInt(Rating_Input.getText());
                    
                    if(Integer.parseInt(Rating_Input.getText()) > 5 || Integer.parseInt(Rating_Input.getText()) < 0) {
                        throw new NumberFormatException();
                    }
                    
                } catch (NumberFormatException error) {
                    
                    report += "Invalid Rating input\n\n";
                    submitChecker = false;
                    
                }
                
                if(Author_Input.getText().equals("")) {
                    notFilled += "Title must not be left blank\n";
                    Author_Input.setText(Inventory[obj].getAuthor());
                    submitChecker = false;
                }
                if(Review_Input.getText().equals("")) {
                    notFilled += "Title must not be left blank\n";
                    Review_Input.setText(Inventory[obj].getReview());
                    submitChecker = false;
                }
                if(Rating_Input.getText().equals("")) {
                    notFilled += "Title must not be left blank\n";
                    Rating_Input.setText(Integer.toString(Inventory[obj].getRating()));
                    submitChecker = false;
                }

                if(submitChecker) {
                    
                    if (!Author_Input.getText().equals(Inventory[obj].getAuthor())) {
                        
                        System.out.println("Editting Reviewer's Author from " + Inventory[obj].getAuthor() + " to " + Author_Input.getText());
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Editting Reviewer's Author from " + Inventory[obj].getAuthor() + " to " + Author_Input.getText());
                        
                        Inventory[obj].setAuthor(Author_Input.getText());
                        
                    }
                    
                    if (!Review_Input.getText().equals(Inventory[obj].getReview())) {
                        
                        System.out.println("Editting Reviewer's Author from " + Inventory[obj].getReview() + " to " + Review_Input.getText());
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Editting Reviewer's Author from " + Inventory[obj].getReview() + " to " + Review_Input.getText());
                        
                        Inventory[obj].setReview(Review_Input.getText());
                        
                    }
                    
                    if (Integer.parseInt(Rating_Input.getText()) != Inventory[obj].getRating()) {
                        
                        System.out.println("Editting Reviewer's Author from " + Inventory[obj].getRating() + " to " + Rating_Input.getText());
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Editting Reviewer's Author from " + Inventory[obj].getRating() + " to " + Rating_Input.getText());
                        
                        Inventory[obj].setRating(Integer.parseInt(Rating_Input.getText()));
                        
                    }
                    
                    Inventory[obj].setDateEdited(Edited_Input.getText());
                
                    System.out.println("Successfully added review");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Successfully added review");

                    Main_Panel.setVisible(false);
                    viewReview(Frame, Inventory, obj);
                    
                }
                
                else {
                    
                    JOptionPane.showMessageDialog(Frame, report + notFilled);
                    
                }

            }

        });
        
        Return_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Cancelled adding review");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Cancelled adding review");
                
                Main_Panel.setVisible(false);
                view(Frame, Inventory, obj);

            }

        });
        
    }
    
}
