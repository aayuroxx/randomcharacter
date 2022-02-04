
import java.util.*;


class CountLetterInArray {
    static final int ch = 1000;
 
    static void getRandomCharacter(String str)
    {   
        int count[] = new int[ch];
 
        int length = str.length();
 
        for (int i = 0; i < length; i++)
          
        	count[str.charAt(i)]++;
        
        char ch[] = new char[str.length()];
        
        for (int i = 0; i < length; i++) {
        
        	ch[i] = str.charAt(i);
            
        	int find = 0;
            
        	for (int j = 0; j <= i; j++) {
            
        		if (str.charAt(i) == ch[j])
                    find++;
            }
 
            if (find == 1)
                System.out.println("display count "+ str.charAt(i)+ " :" + count[str.charAt(i)]);
             
                    
         }
    }
   
    
public static void main(String[] args){
  
  Scanner sc= new Scanner(System.in);

  System.out.print("Enter a string: ");  
  String str= sc.nextLine();  

  System.out.println("string = " +str);

 
        getRandomCharacter(str);
    }
}
