public class removeSpace {
    public static String RemoveSpace(String input){
        char[] inputArray=input.toCharArray();
        int write=0;
;
        
        //Using While Loop
        /*
            int read=0;
            while(read<input.length()){
            if(inputArray[read]!=' '){
                inputArray[write]=inputArray[read];
                write++;
                read++;
            }
            else{
                read++;
            }
        }
        return new String(inputArray,0,write);*/
                
           //Usig for loop 
        for(int read=0;read<input.length();read++){
            if(inputArray[read]!=' '){
                inputArray[write]=inputArray[read];
                write++;
                }
            }
           
            return new String(inputArray,0,write);
        }
        
    

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(RemoveSpace(input));
    }
}
