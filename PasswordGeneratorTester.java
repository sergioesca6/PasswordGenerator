/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

import javax.swing.JOptionPane;
        
/**
 *
 * @author sergioescalante
 */
public class PasswordGeneratorTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String one = JOptionPane.showInputDialog("Enter your favorite animal: ");
        
        String two = JOptionPane.showInputDialog("Enter your favorite color: ");
        
        int three = Integer.parseInt(JOptionPane.showInputDialog("What month of the year where you born in? (enter in numbers 1-12)"));
        
        int four = Integer.parseInt(JOptionPane.showInputDialog("What day of the month where you born in? (enter in numbers 1-31)"));
        
        String five = JOptionPane.showInputDialog("What Website will you be using this password for? (enter only name of company example:\"Facebook\")");
        
        PasswordGenerator password = new PasswordGenerator(one,two,three,four,five);
        
        System.out.println("\nThe first 3 letters of your animal are: " + password.getFirstAnimal());
        
        System.out.println("\nThe first 3 letters of your color are: " + password.getFirstColor());
        
        System.out.println("\nThe first 3 letters of your website in capital are: " + password.getFirstWebsite());
        
    }
    
}
