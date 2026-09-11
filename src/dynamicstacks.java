public class dynamicstacks extends stacks {

    public dynamicstacks(int size){
        super(size); // it will call stacks size from this
    }
    @Override
    public void push(int x) {

        // this one triggers when the stack is full and then the size is increased by double to compensate.
        if (isFull() == true) {
            int[] temp = new int[arr.length * 2];

            for (int i = 0; i< arr.length; i++){
                temp[i] = arr[i];

            }
            arr = temp;
            top++; // it is pointing now to the next empty spot
        }
        // then we will insert the next value into the stacks
        arr[top] = x;
        top++;
    }




}
