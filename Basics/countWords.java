public class countWords {
    public static int getCountOfWords(String input) {
    int count=0;
    if(input==null||input.length()==0){
        return count;
    }
    boolean isprevCharSpace=true;
    for(int i=0;i<input.length();i++){
        char currentChar=input.charAt(i);
        if(currentChar!=' '&&currentChar!='\n'&&currentChar!='\t'){
            if(isprevCharSpace)
                count++;
            isprevCharSpace=false;
        }else{
            isprevCharSpace=true;
        }
    }
    return count;
    }

    public static void main(String[] args) {
        String input1String=" NAMMA yadagiri";
        String input2String="NAMASTE KARNATAKA";
        String input3String="BASVA RAJ\nYARGOL";
        String input4String="";
        String input5String=null;
        System.out.println("Number of words in the string \"" + input1String+"\" : "+ (getCountOfWords(input1String)));
        System.out.println("Number of words in the string \"" + input2String+"\" : "+ (getCountOfWords(input2String)));
        System.out.println("Number of words in the string \"" + input3String+"\" : "+ (getCountOfWords(input3String)));
        System.out.println("Number of words in the string \"" + input4String+"\" : "+ (getCountOfWords(input4String)));
        System.out.println("Number of words in the string \"" + input5String+"\" : "+ (getCountOfWords(input5String)));
    }
}
