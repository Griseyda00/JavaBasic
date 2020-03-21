package com.syntax.class13;

public class InterviewQuestion4 {
public static void main(String[] args) {
    String str="Hi83934%^&***";
    str=str.replaceAll("[^A-Za-z]","");
    int num=str.length();
    System.out.println(num);
    
    String myString="Today is wednesday";
    String[] array=myString.split(" ");
    int words=array.length;
    System.out.println(words);
    
}
}
