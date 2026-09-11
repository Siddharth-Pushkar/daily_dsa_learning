public class dynamicstacks extends stacks {


    public dynamicstacks(int size){
        super(size); // it will call stacks size from this
    }

    @Override
    public void push(int x) {

        this 
        if (isFull() == true) {
            int[] temp = new int[arr.length * 2];

            for (int i = 0; i< arr.length; i++){
                temp[i] = arr[i];
            }

            arr = temp;
        }
        arr[top] = x;
        top++;
    }




}
