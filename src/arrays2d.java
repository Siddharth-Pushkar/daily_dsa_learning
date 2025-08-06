public class arrays2d {
    public static void main(String[] args) {

        int [][] dirmatrix = {
                {2,4,6},
                {1,3,5},
                {5,10,15}
        };

        int [][] indmatrix = new int[3][3];

        indmatrix [0][0] = 3;
        indmatrix [0][1] = 3;
        indmatrix [0][2] = 3;
        indmatrix [1][0] = 3;
        indmatrix [1][1] = 3;
        indmatrix [1][2] = 3;
        indmatrix [2][0] = 3;
        indmatrix [2][1] = 3;
        indmatrix [2][2] = 3;

        for (int i =0; i < dirmatrix.length; i++ ){
            for (int j = 0; j < dirmatrix[i].length; j++){
                System.out.print(dirmatrix[i][j]+" ");
            }
            System.out.println();
        }

        int sum = 0;

        for (int i1 =0; i1 < dirmatrix.length; i1++ ){
            for (int j1 = 0; j1 < dirmatrix[i1].length; j1++){
                sum += dirmatrix[i1][j1];
            }
        }

        System.out.println("The sum of all the elements in the matrix is "+sum);


        int sum1 = 0;

        for (int i2 =0; i2 < dirmatrix.length; i2++ ){
            for (int j2 = 0; j2 < dirmatrix[i2].length; j2++){
                sum1 += dirmatrix[i2][j2];
            }
            System.out.println(sum1 + " row " + i2);
            sum1 = 0;
        }


        int max = dirmatrix[0][0];


        for (int i3 = 0; i3 < dirmatrix.length; i3++ ){
            for (int j3 = 0; j3 < dirmatrix[i3].length; j3++){
                if (max < dirmatrix[i3][j3]) {
                    max = dirmatrix[i3][j3];
                }
            }
        }
        System.out.println("The current Max is "+max);


    }
}
