
package railway.ticket.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;


public class RailwayTicketManagementSystem {

    Connection conn=null;
    public static Connection dbConnector(){

        try {
          Class.forName("org.sqlite.JDBC");
           Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Dark\\Desktop\\aaaaaaa\\New Folder (2)\\Railway Ticket Management System\\Database\\TrainTicket.sqlite");
           //JOptionPane.showMessageDialog(null,"Connected to the database");
          return conn;

        } catch ( Exception e ) {
             JOptionPane.showMessageDialog(null,e);

          System.exit(0);
        }
        return null;
    }

    
}
