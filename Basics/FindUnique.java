public class FindUnique {
    public static void Find_Unique(int[] nmb){
        for(int readIndex=0;readIndex<nmb.length;readIndex++){
            boolean isDuplicate=false;
            for(int compareIndex=0;compareIndex<nmb.length;compareIndex++){
                 if(readIndex==compareIndex){
                    continue;
                 }

                 else if(nmb[readIndex]==nmb[compareIndex]){
                    isDuplicate=true;
                    break;
                 }
            }
             if(!isDuplicate){
                System.out.println(nmb[readIndex]);
        }
       
        }
    }

    public static void main(String[] args) {
        int[] numbers={1,3,5,8,8,5,7,3};
        Find_Unique(numbers);
    }
    
}
