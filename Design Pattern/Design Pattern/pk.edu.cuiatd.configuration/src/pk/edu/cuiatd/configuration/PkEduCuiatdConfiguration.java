/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pk.edu.cuiatd.configuration;

/**
 *
 * @author CUI-ATD
 */
public class PkEduCuiatdConfiguration {

    public static void main(String[] args) {
        // Get an instance of the Configuration class
        Configuration configuration = Configuration.getInstance();
        
        // Retrieve values from the configuration
        String value1 = configuration.getValue("key1");
        String value2 = configuration.getValue("key2");
        
        // Print the retrieved values
        System.out.println("Value for key1: " + value1);
        System.out.println("Value for key2: " + value2);
    }
}
