package com.javacodegeeks.snippets.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// import javax.swing.Spring;

public class Words{
//select all words of length # in dictionary store in a corressponding array:
// oneWords, twoWords, threeWords, fourWords, fiveWords, sixWords, sevenWords, eightWords, nineWords
// List myList = new ArrayList();
static ArrayList<String> oneWords = new ArrayList<String>();
 static ArrayList<String> twoWords  = new ArrayList<String>();
 static ArrayList<String> threeWords = new ArrayList<String>();
 static ArrayList<String> fourWords = new ArrayList<String>();
 static ArrayList<String> fiveWords = new ArrayList<String>();
 static ArrayList<String> sixWords  = new ArrayList<String>();
 static ArrayList<String> sevenWords = new ArrayList<String>();
 static ArrayList<String> eightWords = new ArrayList<String>();
 static ArrayList<String> nineWords = new ArrayList<String>();
// //counter
// static int onei=0,twoi=0,threei=0,fouri=0,fivei=0,sixi=0,seveni=0,eighti=0,ninei=0;


public static void readAndOrganize(){
    System.out.println("Reading file...");
    Scanner sc2 = null;
    int i = 1;
    
    // //array
    // List<String> wordArray = new ArrayList<String>();
    
    try {
        sc2 = new Scanner(new File("C:/Users/user/Documents/Java/Diffie-Hellman Key Generation/diffie-hellman/lib/usa.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();  
    }
    while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
            
        while (s2.hasNext()) {
            String s = s2.next();
            // String pattern = "[a-zA-Z]*";
            if(i%2==0){
            i++;
        System.out.println(" "+s.length()+" Word "+s);
            switch (s.length()) {
                case 1:  oneWords.add(s);
                         break;
                case 2:  twoWords.add(s);
                         break;
                case 3:  threeWords.add(s);
                         break;
                case 4:  fourWords.add(s);
                         break;
                case 5:  fiveWords.add(s);
                         break;
                case 6:  sixWords.add(s);
                         break;
                case 7:  sevenWords.add(s);
                         break;
                case 8:  eightWords.add(s);
                         break;
                case 9:  nineWords.add(s);
                         break;
            }
        }else{
            i++;
            break;
        }
        }
        
   
    }
  System.out.println("Finished organizing files\n---------------------------------------------");
}
//Swutch case statement for finding random words of a specific length
public static String getWordOfLength(int wordLength) {
System.out.println("Randomly selecting string of length "+wordLength);

String output = "";
    switch (wordLength) {
        case 1:  
        output = getRandomWord(oneWords);
                 break;
        case 2:  
        output = getRandomWord(twoWords); 
                 break;
        case 3:  
        output = getRandomWord(threeWords);
                 break;
        case 4:  
        output = getRandomWord(fourWords);
                 break;
        case 5:  
        output = getRandomWord(fiveWords);
                 break;
        case 6:  
        output = getRandomWord(sixWords); 
                 break;
        case 7:  
        output = getRandomWord(sevenWords);
                 break;
        case 8:  
        output = getRandomWord(eightWords);
                 break;
        case 9:  
        output = getRandomWord(nineWords);
                 break;

    }
    return output;
}

//randomly select one word from array
public static String getRandomWord(ArrayList<String> inArray){
    String simpleArray[]=inArray.toArray(new String[inArray.size()]);
// System.out.println("Randomly selecting string from "+simpleArray.length+" Words ");
System.out.println("Random value of type double between "+0+" to "+simpleArray.length+ ":");  
 int randomNumber = (int)(Math.random()*(simpleArray.length-0+1)+0);
 String finalWord = simpleArray[randomNumber-1];
 System.out.println(finalWord);
 

 return finalWord;
}

public static int log(){
    int ret = 1;
    Scanner sc3 = null;

    try {
        sc3 = new Scanner(new File("C:/Users/user/Documents/Java/Diffie-Hellman Key Generation/diffie-hellman/lib/logs.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();  
    }
    ret = sc3.nextInt();
    System.out.println(ret);
    
        if(ret==0){

                System.out.println("Successfully read "+ret+ " from the file.");
                ret = 0;
        }else{
            System.out.println("Supposedly unsuccessful");
            ret = 1;
        }
        
        return ret;
}

}