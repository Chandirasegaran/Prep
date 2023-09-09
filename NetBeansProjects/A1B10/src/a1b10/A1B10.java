/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a1b10;
import java.util.*;

/**
 *
 * @author Chandirasegaran
 */
public class A1B10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        int flag = 1;
        char ind = str.charAt(0);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int currentindex = (int) str.charAt(i);

            if (currentindex >= 'a' && currentindex <= 'z') {
                ind = str.charAt(i);
            }
            if (currentindex >= '0' && currentindex <= '9') {
                int digit = Character.getNumericValue(str.charAt(i));

                if (flag == 1) {
                    sum = digit;
                    flag = 0; 
                } else {
                    sum = sum * 10 + digit;
                }
                if (i + 1 >= str.length() || !Character.isDigit(str.charAt(i + 1))) {
                    for (int j = 1; j <= sum; j++) {
                        System.out.print(ind);
                    }
                    flag = 1; 
                }
            }
        }
        System.out.println();
    }
}
