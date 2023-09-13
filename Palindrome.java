public class Main {
        public boolean isPalindrome(int x) {
    
        int temp = x; 
        int remainder;
        int reversedNumber = 0;
    
        while       (temp > 0) {
    
            remainder =   temp % 10; 
            reversedNumber = reversedNumber * 10 + remainder;  
            temp = temp/10; 
            
        }  
    
        if (x == reversedNumber) {
            return true;
        } 
        
        return false;
        
        
        }
    }
    

