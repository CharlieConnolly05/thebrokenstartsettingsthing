import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {    
    
        firstStart teststart = new firstStart();
        
        Scanner input = new Scanner(System.in);

        boolean finished = false;

        String doublecheck = teststart.getFirstStarted();
        System.out.println(doublecheck);

        /*System.out.println("Would you like to run a test start?");
        String testcheck = input.nextLine();
        */
        if (finished == false) {
            System.out.println("Test");
            
            teststart.initialize();

            finished = true;            
        } 
        else if (finished == true) {
            System.out.println("Holy shit you wrote code that works charlie");
        }
        else {
            System.out.println("You fucking bozo it doesn't work dumbass");
        }

        System.out.println(teststart.getFirstStarted());
    }
}