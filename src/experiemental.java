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


        int [] arr2 = {1,5,0,4,6,0,7,0,0,0};

        int index = -1;

        for (int i1 =0;i1<arr2.length; i1++){
            if (arr2[i1] == 0){
                index = i1;
                for (int j1 = index; j1<arr2.length-1;j1++){
                    arr2[i1] = arr2[i1 + 1];
                }
                arr2[arr2.length - 1] = 0;
            }
        }

        for (int j = 0; j < arr2.length; j++){
            System.out.print(arr2[j]+" ");
        }


    }
}
