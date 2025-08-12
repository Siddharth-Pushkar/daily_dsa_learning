class experiemental {
    public static void main(String[] args) {


        int [] arr = new int[6];

        arr[0] = 12;
        arr[1] = 35;
        arr[2] = 1;
        arr[3] = 10;
        arr[4] = 34;
        arr[5] = 1;

        int max = arr[0];
        int secmax = 0;


        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                secmax = max;
                max = arr[i];
            }
            else if (max > arr[i]){

                secmax = arr[i];
            }
        }
        System.out.println(secmax);

    }
}
