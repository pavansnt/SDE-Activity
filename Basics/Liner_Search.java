public class Liner_Search{
    static int L_Search(int[] num,int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        
    }
    return -1;
}
public static void main(String[] args){
    int[] num={3,5,-2,6,8};
    int key=8;
    int res=L_Search(num, key);
    if(res==-1)
        System.out.println("Not FOund!!!!");
    else
        System.out.println(" Element "+key+" Found at index "+res);
}

}