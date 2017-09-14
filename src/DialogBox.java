/**
 * @author Andres Montenegro
 * 9/14/2017
 * Purpose:
 * Contact: am23828@email.vccs.edu
 */
import java.util.Scanner;
import javax.swing.*;

public class DialogBox {
        public static void main(String [] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a byte value");
            byte By = keyboard.nextByte();
            System.out.println("Enter a short vlaue");
            short S = keyboard.nextShort();
            System.out.println("Enter an int value");
            int I = keyboard.nextInt();
            System.out.println("Enter a long value");
            long L = keyboard.nextLong();
            System.out.println("Enter a float value");
            float F = keyboard.nextFloat();
            System.out.println("Enter a double value");
            double D = keyboard.nextDouble();
            System.out.println("Enter a char value");
            char C = keyboard.next().charAt(0);
            System.out.println("Enter a boolean value");
            boolean Bo = keyboard.nextBoolean();
            JOptionPane.showMessageDialog(null,"Byte value: " + By + "\n" + "Short value: " + S +
                    "\n" + "Int value: " + I + "\n" + "Long value: " + L + "\n" + "Float value: " + F + "\n" + "Double value: " + D +
                    "\n" + "Char value: " + C + "\n" + "Boolean value: " + Bo);

        }
    }
