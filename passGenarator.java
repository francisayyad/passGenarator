



/**
 * Random password generator.
 *
 * @author (francis)
 * @version (6/30/2019)
 */
import java.util.*;
public class passGenarator
{
    public static void main(String args[]){
        System.out.println("Password Generator");
        // defining variables
        int max = 51;
        int min = 0;
        int x = 0;
        // all possible characters
        String pass = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*?-+/.,`";
        
            // while loop to generate a password till it reaches 10 characters
            while(x<10){
                if(x == 2){
                     int caps = (int)(Math.random() * ((26 - 0) + 1)) + 0; 
                   System.out.print(pass.substring(caps,caps+1).toUpperCase()); 
                }else if(x==4){
                    int nums = (int)(Math.random() * ((36 - 26) + 1)) + 26; 
                   System.out.print(pass.substring(nums,nums+1));
                }else if(x == 6){
                    int spchar = (int)(Math.random() * ((44 - 36) + 1)) + 36;
                    System.out.print(pass.substring(spchar,spchar+1));
                
                } else{
                    int num = (int)(Math.random() * ((max - min) + 1)) + min; 
                   System.out.print(pass.substring(num,num+1));
              }
           
                x++;
            }    
         
        
}
}


