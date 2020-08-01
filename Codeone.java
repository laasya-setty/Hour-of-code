/*Renu wrote a sentence on the note and tried to count the number of words in the sentence.

Write a program to obtain a sentence and count the number of words in it.

Input format
The input consists of a sentence in which the words are separated by space

Output format
The output prints the number of words in the sentence. */


import java.util.*;
public class Codeone{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a string");
     String str=sc.nextLine();
     sc.close();
      String[] count=str.split(" ");
      System.out.println(count.length);
    }
}