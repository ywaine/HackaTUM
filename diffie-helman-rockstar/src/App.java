// import com.javacodegeeks.snippets.core.Main;
import com.javacodegeeks.snippets.core.Words;

import java.io.FileWriter;
import java.io.IOException;

import com.javacodegeeks.snippets.core.PubPriv;

public class App {
    // Main main = new Main();
    static Words word = new Words();
    static PubPriv key = new PubPriv();
    static int i;
    static int read;
    static String dictionaryNines;
    static String finalSentence="";
    static String keyPublic;
    static String[] allSentences;
    static String  singleWord;
    static String[] bits;
    
    public static void main(String[] args) throws Exception {
        //final sentence
        finalSentence = "";
        System.out.println("Run!");
        // read = Words.log();
        // System.out.println();

//create a function that scans past entry, writes opposite binary on the log in the txt file
//0 or 1

        // Words.log();
        // if(read==0){
        //read in public message
        keyPublic = key.read();
        System.out.println("Shared secret read\n");

        //read & organize data into: oneWords, twoWords, threeWords, fourWords, fiveWords, sixWords, sevenWords, eightWords, nineWords
        Words.readAndOrganize();
        System.out.println("Dictionary words organized\n");

        read = 1;
            System.out.println("Read complete!");
    // }

//loop times
for (int i = 0; i < keyPublic.length(); i++) {
    //cut the message block up & store it in bits
    bits = keyPublic.split("");
}
        //run a loop bits length times
         for (int j = 0; j < bits.length; j++) {
        
            //test if character is a String character OR a 0
                //true -> construct sentence
            if(bits[j].matches("[a-zA-Z]+") ){
                finalSentence+=bits[j]+" ";

            //else assume it is an int
            } else if(Integer.parseInt(bits[j])==0){
                finalSentence+=bits[j]+" ";
            } else {

//if int then send to the gulags. //extract a word of length e.g. "one" from "oneWords" array.
//return a single word from "oneWords" array

        singleWord = Words.getWordOfLength(Integer.parseInt(bits[j]));

//construct sentence 
        finalSentence+=singleWord+" ";
            } 
                
         }

         System.out.println("---------------------------\nOur final sentence is: "+finalSentence);

        //create a rockstar file & put sentences inside
        letsRock(finalSentence);
        // allSentences[i] += finalSentence;
    }
    public static void letsRock(String finalRockLyrics){
        try {
            FileWriter myWriter = new FileWriter("C:/Users/user/Documents/Java/Diffie-Hellman Key Generation/diffie-hellman/lib/rockon.rock");
            myWriter.write("Alice "+" is "+finalRockLyrics);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    }
    

