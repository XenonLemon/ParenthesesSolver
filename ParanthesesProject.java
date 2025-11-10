//Peter Daniel
//11/7/25
//This project is meant to check if a given string has a valid set of brackets.

public class ParanthesesProject{
    public static void isValid(String s){
        boolean parenthesesCheck = false;
        boolean curlyCheck = false;
        boolean squareCheck = false;

        //{({()})}
        
        //({)}

        //for(int i=0; i<s.length(); i++){
          //  int endCurly = s.indexOf("}");
            //int startCurly = s.indexOf("{");
              //  if(startCurly<endCurly){
                //    curlyCheck = true;         
                //}
                
        //}
        //some kind of other loop
        //index of before, index of after

        for(int i = s.length(); i>=0; i--){
            if(s.substring(i).equals("{")){
                if(s.substring(i+1).equals("}")){
                    curlyCheck = true;
                }
            }

        }
    }

    public static void main(String[] args){
        isValid("{{}}");
    }


}
