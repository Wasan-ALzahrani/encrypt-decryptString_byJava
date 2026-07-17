
package lab4;
import java.util.Scanner;

public class Lab4 {

    
   public static String encryptString (String inputString, int aKey){
        String outputStr="";
       for(int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);
            ch+=aKey;
            
            outputStr+=ch;
            
        }
       return outputStr;
    }
   public static String decryptString (String inputString, int aKey){
        String outputStr="";
       for(int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);
            ch-=aKey;
            
            outputStr+=ch;
            
        }
       return outputStr;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
       String inputStr,encyptedText;
       char repeat;
       int key;
        do{
        System.out.print("Enter STRING to Encrypt :");
        inputStr=scan.nextLine();
        
        System.out.print("Enter key : ");
        key=scan.nextInt();
        
        encyptedText=encryptString(inputStr,key);
          System.out.println("Encrypted STRING is "+encyptedText);
          System.out.println("Original STRING is "+decryptString(encyptedText,key));
            System.out.print("IF you want to repeat the process choose (YES / NO):");
            repeat=scan.next().charAt(0);
            
            scan.nextLine();
          
        }while(repeat=='y'||repeat=='Y');
          
          
    }
    
}
