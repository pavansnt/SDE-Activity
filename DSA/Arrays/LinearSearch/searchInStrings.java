package LinearSearch;

import java.util.Arrays;

public class searchInStrings {
    public static void main(String[] args) {
        String name = "Pavan";
        char target = 'k';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("target = " + target);
        System.out.println(search(name, target));
    }

    public static boolean search (String name, char target){
        char[] nameArr = name.toCharArray();
        if (nameArr.length == 0){
            return false;
        }

        // for (int i = 0; i< nameArr.length; i++) {
        //     if (nameArr[i] == target){
        //         return true;
        //     }
        // }

        //Enhanced Loop
        for (char alpha : nameArr){
            if (alpha == target)
                return true;
        }
        return false;   
    }
}
