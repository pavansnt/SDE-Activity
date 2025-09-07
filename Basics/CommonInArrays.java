public class CommonInArrays{
    //print or get array of common elements in two array
    public static void CommonArray(int[] input1,int[] input2){
        for(int index1=0;index1<input1.length;index1++){
            boolean isFound=false;
            for(int index2=0;index2<input2.length;index2++){
                if(input1[index1]==input2[index2]){
                    isFound=true;
                    break;
                }
            }
            if(isFound){
                System.out.println(input1[index1]);
            }

        }
    }
 
    public static void main(String[] args) {
        int[] input1={1,4,7,8,6};
        int[] input2={4,6,1};

        CommonArray(input1,input2);
    }
}