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
    String connString = "jdbc:mysql://localhost:3306/josionary?";
    String cred = "user=root&password=";
    
    //Josionary josionary = new Josionary();
    Connection conn;
    
    public Engine()
    {
        
        //instantiate objects
        try {            
            //use the imported JDBC library.
            Class.forName("com.mysql.jdbc.Driver");
            
            //establish a new database connection
            conn = DriverManager.getConnection(connString + cred); 
        }
        
        catch(ClassNotFoundException | SQLException e )
        {
            //print the errors list on the console
            e.printStackTrace();
        }
        
    }
            
    
    //search a word
    public void searchWord(String word)
    {        
        
        //descriptionField.setText(word);
    }
    
    
    //Add new word to the database
    public void addWord(String theWord, String theWordDes)
    {        
        try {
            
            PreparedStatement ps = conn.prepareStatement("INSERT INTO wordsdata (Word, WORD_DES) VALUES (?, ?)");
            
            ps.setString(1, theWord);
            ps.setString(2, theWordDes);
            
            if (ps.executeUpdate() == 1)
                JOptionPane.showMessageDialog(null, "Word Added");                                
            else
                JOptionPane.showMessageDialog(null, "WORD NOT ADDED");
            
            //close the connection
            conn.close();
        }
        
        catch (SQLException e)
        {
        }
    }
    
    //delete a certain word
    public void deleteWord(String theWord)
    {
        try {
            
            PreparedStatement ps = conn.prepareStatement("DELETE FROM wordsdata WHERE Word=?");
            
            ps.setString(1, theWord);
           
            switch(ps.executeUpdate()) 
            {
                case 1: 
                    JOptionPane.showMessageDialog(null, "DONE: ' " + theWord + " ' has been deleted");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR");
                    break;
            }
                    
               
            
            
            conn.close();
        }
        
        
        catch(SQLException e)
        {
        }        
    }
    
    //update a words data
    public void updateWord(String newWord, String oldWord)
    {
        try {
            
            PreparedStatement ps = conn.prepareStatement("UPDATE wordsdata SET Word=? WHERE Word=?");
            
            ps.setString(1, newWord);
            ps.setString(2, oldWord);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DONE");
            
            conn.close();
        }
        
        catch(SQLException e)
        {
        }
    }        
    
    //delete all words in the database
    public void deleteAll()
    {
        try {            
            PreparedStatement ps = conn.prepareStatement("DELETE * FROM wordsdata");
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DONE");
            
            conn.close();
        }
        
        catch(SQLException e)
        {
        }
    }
}