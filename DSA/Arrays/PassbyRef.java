public class PassbyRef{

    public static void UpdateMarks(int[] marks, int nonChangeable)
    {   
        nonChangeable = 20;
        for(int i = 0; i < marks.length; i++){
            marks[i]++;
        }
    }

    public static void main(String[] args)
    {
        int nonChangeable = 10;
        int[] marks = { 90, 80, 70, 60, 50 };
        UpdateMarks(marks,nonChangeable);
        System.out.println("nonChangeable = " + nonChangeable);
        for(int i = 0; i < marks.length; i++){
        System.out.print(" " + marks[i]);
        }
   
    }
    
}