package josionary;

/*
 * @author Josiah Thobejane
 */

import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class Engine{
    
    Josionary josionary = new Josionary();    
    Connection connection;
    Statement statement = null;
    public Engine()
    {        
        //setup the database
        try {            
            //use the imported JDBC library.
            Class.forName("org.sqlite.JDBC");

            //establish a new database connection
            connection = DriverManager.getConnection("jdbc:sqlite:josionary.db"); 
            
            setupDatabase();
        } catch (ClassNotFoundException | SQLException e ) {            
            JOptionPane.showMessageDialog(null, e.getClass().getName() + "\n\n " + e.getMessage()  + "\n\n : Database driver not found - Could not connect");
        }        
    }
    
    //setup our database upon start
    public final void setupDatabase() throws SQLException
    {
        statement = connection.createStatement();
        String createWordsTable = "CREATE TABLE IF NOT EXISTS wordsdata " +
                                "(Word VARCHAR(50) NOT NULL," +
                                "WORD_DES VARCHAR(250) NOT NULL)";
        statement.executeUpdate(createWordsTable);
        statement.close();        
    }
    //Add new word to the database
    public void addWord(String theWord, String theWordDes)
    {        
        try {            
            PreparedStatement ps = connection.prepareStatement("INSERT INTO wordsdata (Word, WORD_DES) VALUES (?, ?)");
            
            ps.setString(1, theWord);
            ps.setString(2, theWordDes);
            
            if (ps.executeUpdate() == 1)
                JOptionPane.showMessageDialog(null, "Word Added");                                
            else
                JOptionPane.showMessageDialog(null, "WORD NOT ADDED");
            
            //close the connection
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e);
        }
    }
    
    //delete a certain word
    public void deleteWord(String theWord)
    {
        try {            
            PreparedStatement ps = connection.prepareStatement("DELETE FROM wordsdata WHERE Word=?");
            
            ps.setString(1, theWord);
           
            switch(ps.executeUpdate()) 
            {
                case 1: 
                    JOptionPane.showMessageDialog(null, "DONE: ' " + theWord + " ' has been deleted");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Word Has Not Been Added");
                    break;
            }                                                           
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Occured");
        }        
    }
    
    //update a words data
    public void updateWord(String newWord, String oldWord)
    {
        try {
            
            PreparedStatement ps = connection.prepareStatement("UPDATE wordsdata SET Word=? WHERE Word=?");
            
            ps.setString(1, newWord);
            ps.setString(2, oldWord);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DONE");
            
            connection.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Occured");
        }
    }        
    
    //delete all words in the database
    public void deleteAll()
    {
        try {            
            PreparedStatement ps = connection.prepareStatement("DELETE * FROM wordsdata");
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DONE");
            
            connection.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Occured");
        }
    }
}