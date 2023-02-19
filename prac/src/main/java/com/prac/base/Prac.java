package com.prac.base;

public class Prac {

//	public static void main(String[] args) {
//		String name = "govind";
//		String rama = name.concat(" Maddala");
//		System.out.println(rama);
//		StringBuffer fname = new StringBuffer("maddala");
//		fname.append(" govind");
//		System.out.println(fname);
//	}
	
	public static void main(String[] args) {

        String line = "python variable rama";
        String[] words = line.split(" ");
        String snakeCase = "";
        for(String word:words){
            snakeCase = snakeCase +"_"+word;
        }
        snakeCase = snakeCase.substring(1);
        System.out.println(snakeCase); 
    }
}