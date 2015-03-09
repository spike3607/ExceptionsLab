package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        
        String lastName = "";
        String firstName = "";
        boolean done = false;
        
        do {
            try {
                String fullName = JOptionPane.showInputDialog("Enter full name:");
                
                lastName = nameService.extractLastName(fullName);

                String msg = "Your last name is: " + lastName;
                JOptionPane.showMessageDialog(null, msg);

                firstName = nameService.extractFirstName(fullName);

                msg = "Your first name is: " + firstName;
                JOptionPane.showMessageDialog(null, msg);

                done = true;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while (!done);
    }
     
}
