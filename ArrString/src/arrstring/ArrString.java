
package arrstring;




public class ArrString {

    
    public static void main(String[] args) {
        
        //thequickbrownfoxxofnworbquickthe
        
        //tcoollooca
        String s="abcd";
        int a=longestPalindromic(s);
        System.out.println("Count = "+a);


        
        
    }
    
    public static void longestPalindromic(String s) {
        int count = 0;
        int middle=s.length()/2;
        
        for (int i = 0;i<middle; i++) {
            if(s.charAt(i)==s.charAt((s.length()-1)-i)){
                count++;
                
                
            }
            
            
        }
   }
    
}
