import java.util.HashMap;
import java.util.HashSet;

public class hashmaps {
    public static void main(String[] args) {

        HashMap<String, Integer> markos = new HashMap<>();

        markos.put("M",44);
        markos.put("E",347);
        markos.put("S",467);
        markos.put("P",9);
        markos.put("C",12);
        markos.put(" ",8);
        markos.put("  ",0);

        System.out.println(markos.get("P"));
        System.out.println(markos.get("C"));
        System.out.println(markos.get("E"));
        System.out.println(markos.get(" "));
        System.out.println(markos.get("  "));



//      Counting the categories
        int[] arr= {1,2,1,1,3,1,2,2,2,2,2,6,8,4,2};
        HashMap<Integer,Integer> set2 = new HashMap<>();
        int count = 1;
        for (int i = 0; i<arr.length; ++i){
            boolean checko = set2.containsKey(arr[i]);
            if (checko == true){
                int getval = set2.get(arr[i]);
                set2.put(arr[i],++getval);
            } else {
                set2.put(arr[i],count);
            }
        }
        System.out.println(set2);


//        Finding the most frequent number
        int cumax = set2.get(arr[0]);
        int maxval = arr[0];
        for (int j = 0; j<arr.length; ++j){
            boolean checko = set2.containsKey(arr[j]);
            if (checko == true){
                if (set2.get(arr[j]) > cumax){
                    maxval = arr[j];
                }
            }
        }
        System.out.println("The MFN is: "+maxval);


//        First repeated number
        HashSet<Integer> set1 = new HashSet<>();
        for (int ii = 0; ii<arr.length; ++ii){
            boolean check2 = set1.contains(arr[ii]);
            if (check2 == true){
                System.out.println("First repeated number is: "+ arr[ii]);
                break;
            } else {
                set1.add(arr[ii]);
            }
        }






    }
}
