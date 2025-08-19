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


        int [] arr2 = {3,5,0,0,4};

        int index = -1;
        int target = 0;

        for (int i1 = 0; i1 < arr2.length; i1++){
            if (arr2[i1] == target){
                index = i1;
                for (int i2 = index; i2 < arr2.length -1; i2++){
                    arr2[i2] = arr2[i2 + 1];
                }
                arr2[arr2.length - 1] = target;
            }
        }
        for (int i1 = 0; i1 < arr2.length; i1++){
            System.out.print(arr2[i1]+ " ");
        }

        System.out.println();






        int [][] mart1 = {
                {2,4,6},
                {8,10,12},
                {47,36,8}
        };
        int [][] mart2 = {
                {3,6,9},
                {12,15,18},
                {7,2,8}
        };

        int [][] addi1 = new int[mart1.length][mart1[0].length];


        for (int ii = 0; ii<mart1.length; ii++){
            for (int jj = 0; jj<mart1[ii].length; jj++){
                addi1[ii][jj] = mart1[ii][jj] + mart2[ii][jj];
            }
        }

        for (int ii1 = 0; ii1<addi1.length; ii1++){
            for (int jj1 = 0; jj1<addi1[ii1].length; jj1++){
                System.out.print(addi1[ii1][jj1]+" ");
            }

            System.out.println();
        }





    }
}
