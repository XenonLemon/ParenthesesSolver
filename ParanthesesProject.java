//Peter Daniel
//11/7/25
//This project is meant to check if a given string has a valid set of brackets.

public class ParanthesesProject{
    //this method must be given a string that only contains the characters of (), {}, and [].
    //this method will check if the given string s is valid in terms of a set of brackets.
    public static boolean isValid(String s){

        while (s.length() > 0){ 
               
            if(s.length()%2 != 0){
                    return false;
                }
            for(int i = s.length()-1; i>=0; i--){
                if(s.substring(i, i+1).equals("{")){
                    if(s.substring(i+1, i+2).equals("}")){
                        
                        s = s.substring(0, i) + s.substring(i+2);
                        i =-1;
                    }
                    else{
                        return false;
                    }
                }
                
                else if(s.substring(i, i+1).equals("[")){
                    if(s.substring(i+1, i+2).equals("]")){
                        
                        s = s.substring(0, i) + s.substring(i+2);
                        i=-1;
                    }
                    else{
                        return false;
                    }
                }
                else if(s.substring(i, i+1).equals("(")){

                   
                    if(s.substring(i+1, i+2).equals(")")){
                        s = s.substring(0, i) + s.substring(i+2);
                        i = -1;
                    }
                    else{
                        return false;
                    }
                   
                }

            }
            
        }
        return true;

    }
    

    

    public static void main(String[] args){
        System.out.println(isValid("([{({})}])"));
    }


}
