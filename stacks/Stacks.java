/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacks;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author admin
 */
public class Stacks {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        
        for (int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));
        }
        String reversed = "";
        
        while(!stack.isEmpty()){
            reversed += stack.pop();
        }
        System.out.println("Reversed word: " + reversed);
        
        if (word.equalsIgnoreCase(reversed)){
            System.out.println("The word is a palindrome");
        }else{
            System.out.println("The word is not a palndrome");
        }
        scan.close();
    }
    
}
