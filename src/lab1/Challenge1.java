package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();

        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        try {
            String lastName = app.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
    public String extractLastName(String fullName) throws Exception {
        
        
            if (fullName == null) {
                throw new IllegalArgumentException("null string");
            }
            else if (fullName.equals("")) {
                throw new IllegalArgumentException("blank string");
            }      

            String[] nameParts = fullName.split(" ");
            if (nameParts.length != 2) {
                throw new IllegalArgumentException("Did not recieve 2 names");
                }
            return nameParts[nameParts.length - 1];
        }
    }
