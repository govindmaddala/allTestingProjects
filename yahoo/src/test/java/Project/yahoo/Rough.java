package Project.yahoo;

import lombok.experimental.var;

public class Rough {

    public static void main(String[] args) {
       String sentenceString = "R1+with+Awigna";
//       String[] words = sentenceString.split("\\" + "+");
       String ansString = "";
//       
//       int len = words.length;
//       for(int i=len-1;i>=0;i--) {
//           ansString += words[i];
//           if(i>0) {
//               ansString += "+";
//           }
//       }
//       System.out.println(ansString);
       String[] words = sentenceString.split("//+");
       for(int i= (words.length-1);i>=0;i--) {
           ansString += words[i];
           ansString += "+";
//           ansString = String.join("+", words[i]);
       }
       
       System.out.println(ansString);
    }
}
