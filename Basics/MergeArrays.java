public class MergeArrays {
    public static void MergeArray(int[] masterArray,int[] dataArray){
        
        if (masterArray == null || dataArray == null || masterArray.length < dataArray.length) {
            System.out.println("Invalid arrays provided for merge");
            return;
        }
        
        int startIndex=masterArray.length-dataArray.length;

        for(int dataIndex=0;dataIndex<dataArray.length;startIndex++,dataIndex++){
            masterArray[startIndex]=dataArray[dataIndex];
        }
    }
    public static void printArray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args){
        int[] masterArray={1,2,3,4,0,0,0};
        int[] dataArray={5,6,7};
        System.out.println("Before Array :");
        printArray(masterArray);
        MergeArray(masterArray, dataArray);
        System.out.println("After Merge :");
        printArray(masterArray);
    }
}
