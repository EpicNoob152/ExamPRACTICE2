/**
 * Class: Caesarcipher
 * @author: Jaylan Igbinoba
 * @version: 1.0
 * @Course: ITEC 2140 Spring 2023
 * @Written: April 25, 2023
 * @Description: This code will try set up the encrypt and decrypt methods needed to run the main class
 */

public class Caesarcipher {
    //field
    private int shiftKey;
    private String message;
    //This is the constructor

    public Caesarcipher(){

    }

    public Caesarcipher(String message, int shift){
        this.message = message;
        this.shiftKey = shift;

    }
    public String getMessage(){
        return message;
    }
    public int getshift(){

        return shiftKey;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void setShiftKey(int shiftKey){
        this.shiftKey = shiftKey;
    }

    /** Method: encrypt
     * Encrypts the string typed in the main class.
     * @param the int shift is to be converted.
     * @param the String message to is being converted.
     * @return A new string that shifts each letter of the String message by the shift value.
     *
     */
    public String encrypt(String message, int shift){
        String result = "";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    int position = letters.indexOf(message.charAt(i));
                    int letterPosition = (shift + position) % 26;
                    char encryptLetter = letters.charAt(letterPosition);
                    result += encryptLetter;
                }
                else{
                    int position = letters.indexOf(Character.toLowerCase(message.charAt(i)));
                    int letterPosition = (shift + position) % 26;
                    char encryptLetter = letters.charAt(letterPosition);
                    result += Character.toUpperCase(encryptLetter);
                }
            }
            else{
                result += ch;
            }
        }
        return result;
    }


    /** Method: encrypt
     * decrypts the string typed in the main class.
     * @param the int shift is to be converted.
     * @param the String message to is being converted.
     * @return A new string that shifts each letter of the String message backwards by the shift value.
     */

    public String decrypt(String message,int shift) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char shifted =
                            (char) ('A' + (ch - 'A' - shift + 26) % 26);
                    decrypted.append(shifted);
                } else {
                    char shifted = (char) ('a' + (ch - 'a' - shift + 26) % 26);
                    decrypted.append(shifted);

                }
            }
            else{
                decrypted.append(ch);
            }
        }
        return decrypted.toString();
    }

}


