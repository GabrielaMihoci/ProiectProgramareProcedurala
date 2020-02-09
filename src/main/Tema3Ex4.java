package main;

public class Tema3Ex4 {

    public static void main(String args[]) { 
        String str = "JavaMentee"; 
  
        char[] ch = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
        } 
  
        for (char c : ch) { 
            System.out.println(c); 
        } 
    } 
}
