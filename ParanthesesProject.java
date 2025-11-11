//Peter Daniel
//11/7/25
//This project is meant to check if a given string has a valid set of brackets.

public class ParanthesesProject{
    public static boolean isValid(String s){
        

        //{({()})}
        
        //({)}

        //some kind of other loop
        //index of before, index of after
        //

        //for loop going through the string s, going from the end to the start of s. The string must only contain (), {}, and/or []
        //The loop will 
        while (s.length() > 0){ 
            System.out.println("here");   
            for(int i = s.length(); i>=0; i--){
                if(s.substring(i).equals("{")){
                    if(s.substring(i+1).equals("}")){
                        
                        s = s.substring(0, i) + s.substring(i+2);
                    }
                    else{
                        return false;
                    }
                }
                if(s.substring(i).equals("[")){
                    if(s.substring(i+1).equals("]")){
                        
                        s = s.substring(0, i) + s.substring(i+2);
                    }
                    else{
                        return false;
                    }
                }
                if(s.substring(i).equals("(")){
                    if(s.substring(i+1).equals(")")){
                        
                        s = s.substring(0, i) + s.substring(i+2);
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
        System.out.println(isValid("{{}}"));
    }


}
