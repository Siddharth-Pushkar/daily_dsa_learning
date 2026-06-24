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

        String oo = "anagram";
        int counter = 1;
        HashMap<Character, Integer> set3 = new HashMap<>();

        for (int i = 0; i<oo.length();++i){
            boolean check2 = set3.containsKey(oo.charAt(i));
            if (check2 == true){
                int getvalue = set3.get(oo.charAt(i));
                set3.put(oo.charAt(i),++getvalue);
            } else {
                set3.put(oo.charAt(i),counter);
            }
        }
        System.out.println(set3);


//        Trying to find the smallest difference as well as the smallest one

        int[] arr2 = {1,2};
        int[] prices = {7,1,2,6,3,2,5};

        HashMap<Integer,Integer> set5 = new HashMap<>();

        int currentmin = arr2[0];
        int buypos = 0;
        int currentprof = 0;
        int sellpos = 0;
        int availableprof = 0;

//        Find minimum

        for (int i = 0; i<arr2.length;++i){
            if (currentmin>arr2[i]){
                currentmin = arr2[i];
                buypos = i;
            }
        }
        System.out.println(currentmin);

//        Find profit and feed into hashmaps
        for (int i = 0; i<arr2.length;++i){
            int checkop = arr2[i] - currentmin;
            set5.put(i,checkop);
        }

//        Find the proper sell position
        for (int i = buypos; i<set5.size();++i){
            if (availableprof<set5.get(i)){
                availableprof = set5.get(i);
                sellpos = i;
            }
        }

        System.out.println(availableprof);
        System.out.println(currentprof);
        System.out.println(set5);




    }
}
