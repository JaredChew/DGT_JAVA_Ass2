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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class Game_Inventory {
    
    static final int CAPACITY = 100;

    static private GridBagLayout gridBagLO = new GridBagLayout();
    
    static private GridBagConstraints gridBagConstraints = new GridBagConstraints();
    
    public static void main(String[] args) {
        
        System.out.println("Initialising");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Initialising");
        
        JFrame Frame = new JFrame("Assignment 2");
        
        JLabel MainMenu;
        JButton Add_Button, Search_Button, Export_Button;
        JPanel MainPanel, Header_Panel;
        JMenuBar MenuBar_Main;
        JMenu File_MenuBar;
        JMenuItem Delete_MenuItem, Save_MenuItem, SetPath_MenuItem, Exit_MenuItem;
        
        // ----------------------------------------------------- //
        
        Game_Database Inventory[] = new Game_Database[CAPACITY];
        
        for(int i = 0; i < CAPACITY; i++) {
            
           Inventory[i] = new Game_Database(); 
            
        }
        
        // ----------------------------------------------------- //
        
        {   //Temperory scope
            
            System.out.println("Loading data");
            
            File directory = new File("src/data/");

            while(true) {

                if(directory.exists()){
                    
                    System_Methods.loadData(Inventory);
                    
                    System.out.println("Data loaded");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Data loaded");

                    break;

                }

                else {

                    System.out.println("Error, default directory does not exits\nCreating new directory");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Error, default directory does not exits\nCreating new directory");

                    directory.mkdir();

                    System.out.println("Retrying load data");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Retrying load data");

                }
                
            }

        }   //End of temperory scope
        
        // ----------------------------------------------------- //
        
        Frame.setSize(420, 520);
        Frame.setLocationRelativeTo(null);
        Frame.setResizable(false);
        Frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //JFrame.EXIT_ON_CLOSE
        Frame.setLayout(new CardLayout());
        
        // ----------------------------------------------------- //
        
        MenuBar_Main = new JMenuBar();
        
        File_MenuBar = new JMenu("File");

        Delete_MenuItem = new JMenuItem("Delete All");
        Save_MenuItem = new JMenuItem("Save");
        SetPath_MenuItem = new JMenuItem("Set fixed path");
        Exit_MenuItem = new JMenuItem("Exit");
        
        File_MenuBar.add(Save_MenuItem);
        File_MenuBar.add(Delete_MenuItem);
        File_MenuBar.add(SetPath_MenuItem);
        //File_MenuBar.addSeparator();
        File_MenuBar.add(Exit_MenuItem);
        
        MenuBar_Main.add(File_MenuBar);
        
        Frame.setJMenuBar(MenuBar_Main);
        
        // ----------------------------------------------------- //
        
        Header_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER), true);
        MainMenu = new JLabel("<      <  <            \" The KDU Games Tech Sdn Bhd \"            >  >      >");
        Header_Panel.add(MainMenu);
        
        // ----------------------------------------------------- //
        
        Add_Button = new JButton("Add game");
        Search_Button = new JButton("Search game");
        Export_Button = new JButton("Export database");
        
        JPanel jp_Picture1 = new JPanel();
        ImageIcon kduGameLogo = new ImageIcon("./picture/KDU-Game-Development-logo.jpg");
        Image image = kduGameLogo.getImage();
        Image newimg = image.getScaledInstance(380, 320,  java.awt.Image.SCALE_SMOOTH);
        kduGameLogo = new ImageIcon(newimg);
        JLabel lb1 = new JLabel(kduGameLogo);
        jp_Picture1.add(lb1);
        
        // ----------------------------------------------------- //
        
        MainPanel = new JPanel(gridBagLO, true);
        
        MainPanel.add(jp_Picture1);
        MainPanel.add(Header_Panel);
        MainPanel.add(Add_Button);
        MainPanel.add(Search_Button);
        MainPanel.add(Export_Button);
        
        //////////////////////////////////////////////////////////////////////////
        jp_Picture1.setBackground(new Color(176,214,236));
        Header_Panel.setBackground(new Color(176,214,236));
        //Add_Button.setBackground(new Color(238,244,249));
        //Search_Button.setBackground(new Color(238,244,249));
        //Export_Button.setBackground(new Color(238,244,249));
        MainPanel.setBackground(new Color(126,188,224));
        //////////////////////////////////////////////////////////////////////////
        
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagLO.setConstraints(jp_Picture1, gridBagConstraints);
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagLO.setConstraints(Header_Panel, gridBagConstraints);
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagLO.setConstraints(Add_Button, gridBagConstraints);
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagLO.setConstraints(Search_Button, gridBagConstraints);
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagLO.setConstraints(Export_Button, gridBagConstraints);
        
        // ----------------------------------------------------- //
        
        Frame.add(MainPanel);
        
        Frame.setVisible(true);
        
        // ----------------------------------------------------- //
        
        System.out.println("+--- Main menu ---+");
        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " +--- Main menu ---+");
        
        Frame.addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e) {
                
                System.out.println("Close button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Close button clicked");
                
                UIManager.put("OptionPane.yesButtonText","Yes");
                UIManager.put(" OptionPane.noButtonText", "No");
                
                if (JOptionPane.showConfirmDialog(Frame, "Are you sure?\n\nAll unsaved data will be lost.", "Assignment 2", JOptionPane.YES_NO_OPTION) == 0) {
                    
                    System.out.println("Closing application");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Closing application");
                    
                    System.out.println("Exporting log file");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Exporting log file");
                    Logger.exportLog();
                    
                    Frame.dispose();
                    System.exit(0);
                
                }
                
                System.out.println("Canceled");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Canceled");
                
            }
            
        });
        
        Delete_MenuItem.addActionListener(new ActionListener(){
            
           @Override
           public void actionPerformed(ActionEvent e){
               
                System.out.println("Delete All button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Delete All button clicked");
               
               if (JOptionPane.showConfirmDialog(Frame, "Are you sure?\nAll data will be will be deleted.", "Assignment 2", JOptionPane.YES_NO_OPTION) == 0) {
                    
                    if (JOptionPane.showConfirmDialog(Frame, "Are you really sure?", "Assignment 2", JOptionPane.YES_NO_OPTION) == 0) {
                    
                        System.out.println("Deleting all data");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Deleting all data");
                
                        System_Methods.resetInventory(Inventory);
                        
                        System.out.println("Deleted");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Deleted");
                
                    }
                    else {
                        
                        System.out.println("Cancelled");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Canceled");
                        
                    }
                
                }
               
               else {
                   
                    System.out.println("Cancelled");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Canceled");
                   
               }
               
           } 
           
        });
        
        Save_MenuItem.addActionListener(new ActionListener(){
            
           @Override
           public void actionPerformed(ActionEvent e){
               
                System.out.println("Save button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Save button clicked");
               
                File directory = new File("src/data/");
                
                while(true) {
                
                    if(directory.exists()){

                        System_Methods.writeData(Inventory);

                        System.out.println("Data saved");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Data saved");

                        JOptionPane.showMessageDialog(Frame, "Saved");
                        
                        break;

                    }

                    else {

                        System.out.println("Error, default directory does not exits\nCreating new directory");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Error, default directory does not exits\nCreating new directory");

                        directory.mkdir();

                        System.out.println("Retrying save data");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Retrying save data");

                    }
                
                }
                 
           } 
           
        });
        
        SetPath_MenuItem.addActionListener(new ActionListener(){
            
           @Override
           public void actionPerformed(ActionEvent e){
               
                String path;
                
                System.out.println("Set path button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Set path button clicked");

                path = JOptionPane.showInputDialog(Frame, "Please input the absolute file path you wish to have your files permenently saved to.\n\nCurrent path is set to: " + System_Methods.fixedPath + "\n\nLeave blank to remove fixed path.\n");

                if(path != null) {
                    
                    if (path.equals("")) {
                        path = "-";
                    }
                    else {
                        path = path + "/";
                    }
                    
                    System_Methods.setFixedPath(path);
                    
                    System.out.println("Fixed path set to: " + path);
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Fixed path set to: " + path);
                    
                }
                
                else {
                    
                    System.out.println("Cancelled");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Cancelled");
                    
                }
               
           } 
           
        });
        
        Exit_MenuItem.addActionListener(new ActionListener(){
            
           @Override
           public void actionPerformed(ActionEvent e){
               
                System.out.println("Exit button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Exit button clicked");
                
                UIManager.put("OptionPane.yesButtonText","Yes");
                UIManager.put(" OptionPane.noButtonText", "No");
                
                if (JOptionPane.showConfirmDialog(Frame, "Are you sure?\n\nAll unsaved data will be lost.", "Assignment 2", JOptionPane.YES_NO_OPTION) == 0) {
                    
                    System.out.println("Closing application");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Closing application");
                    
                    System.out.println("Exporting log file");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Exporting log file");
                    Logger.exportLog();
                    
                    Frame.dispose();
                    System.exit(0);
                
                }
                
                System.out.println("Canceled");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Canceled");
               
           } 
           
        });

        Add_Button.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                int obj = 0;
                
                System.out.println("Add button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Add button clicked");

                for ( ; obj < Inventory.length; ) {

                    if(Inventory[obj].getId() == 0) {
                        break;
                    }

                    obj++;

                }

                if (obj == 99) {

                    System.out.println("Error, database full");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Error, database full");
                    
                    JOptionPane.showMessageDialog(Frame, "Database full.\n\nReturning to main menu...");

                }
                
                else {

                    System.out.println("Switching to Add menu");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to Add menu");
                    
                    MainPanel.setVisible(false);
                    Main_Methods.add(Frame, Inventory, obj);
                    
                }

            } 

        });

        Search_Button.addActionListener(new ActionListener(){

             @Override
             public void actionPerformed(ActionEvent e){
                 
                System.out.println("Switching to Search menu");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Switching to Search menu");
                
                MainPanel.setVisible(false);
                Main_Methods.search(Frame, Inventory);

            } 

        });

        Export_Button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                
                System.out.println("Export button clicked");
                Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Export button clicked");

                try {
                    
                    String path;

                    path = JOptionPane.showInputDialog(Frame, "Please input the absolute file path you wish to save to");
                    
                    if (path != null) {
                        
                        System_Methods.exportAll(Inventory, path);
                        JOptionPane.showMessageDialog(Frame, "\nGame inventory successfully exported.");
                        
                        System.out.println("Inventory exported to " + path);
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Inventory exported to " + path);
                        
                    }
                    else {
                        
                        System.out.println("Cancelled");
                        Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Cancelled");
                        
                    }
                        
                } catch (Exception error) {
                    
                    JOptionPane.showMessageDialog(Frame, "Error.\nDirectory cannot be found");
                    
                    System.out.println("Error, directory cannot be found");
                    Logger.addLog(Logger.dateFormat.format(Logger.cal.getTime()) + " Error, directory cannot be found");
                    
                }

            } 

        });
        
    }
    
}
