/**
 * Class: Main
 * @author: Jaylan Igbinoba
 * @version: 1.0
 * @Course: ITEC 2140 Spring 2023
 * @Written: April 25, 2023
 * @Description: This code will try and let the user input a string and then the user will choose to encrypt and decrypt that string.
 * Then it will print out the string.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Caesarcipher code = new Caesarcipher();//This code is needed to call in the instant methods from the Caesarcipher class

        //Below is the code that asks questions to the user.
        System.out.println("Enter a message to be encrypted or decrypted: ");
        String message = input.nextLine();

        System.out.println("Enter 'E' to encrypt or 'D' to decrypt:  ");
        String type = input.nextLine();

        System.out.println("Enter an integer key value for encryption or decryption: ");
        int shift = input.nextInt();

        // If statements that calls the method appropriate to the letter he chose.
        if(type.equals("E")||type.equals("e")){
            System.out.println(code.encrypt(message,shift)); //calls and prints the encrypt method.

        }
        if(type.equals("D")||type.equals("d")){
            System.out.println(code.decrypt(message,shift)); //calls and prints the decrypt method.

        }

        Caesarcipher c2 = new Caesarcipher();
        System.out.println("Enter a message to be encrypted or decrypted: ");
        c2.setMessage(input.nextLine());



    }

}
