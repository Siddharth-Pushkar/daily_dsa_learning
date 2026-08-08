public class maxconsecutiveones {
    public static void main(String[] args) {
        System.out.println("This is not a max consecutive ones solution because the GPT has lost its mind and giving me a binary search question to solve.");


        System.out.println("Name this a 205 Isomorphic, because that is the question i am doing which used HashMaps");

        String s = "egg";
        String t = "add";
        boolean isittrue = true;
        int[] indexS = new int[256];
        int[] indexT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (indexS[c1] != indexT[c2]) {
                isittrue = false;
                break;
            }

            indexS[c1] = i + 1;
            indexT[c2] = i + 1;
        }

        System.out.println(isittrue);
    }
}
