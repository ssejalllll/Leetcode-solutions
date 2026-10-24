class Solution {
    public String interpret(String command) {
        String result = "";
         for (int i =0 ; i <command.length(); i++){
         if (command.charAt(i)== 'G'){
         result= result +"G";
         }
         
          else  if( command.charAt(i)=='(' && command.charAt(i+1)==')'){
            result= result + "o";
            i++;
          }
          else if (command.charAt(i)=='(' && command.charAt(i+1)=='a' ){
           result = result + "al";
           i=i + 3;
          }
         }
         return result ; 
    }
}