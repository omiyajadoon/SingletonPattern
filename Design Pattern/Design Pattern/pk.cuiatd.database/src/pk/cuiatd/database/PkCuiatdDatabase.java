
package pk.cuiatd.database;

/**
 *
 * @author CUI-ATD
 */
public class PkCuiatdDatabase {

    public static void main(String[] args) {
        // Get an instance of the Connection class
        Connection connection = Connection.getInstance();
        
        // Call the getData() method to retrieve data from the database
        connection.getData();
    }
    
}
