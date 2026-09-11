import sidlibs.stacks;

public class dynamicstacks extends stacks {

    public dynamicstacks(int size){
        super(size); // it will call sidlibs.stacks size from this
    }
    @Override
    public void push(int x) {

        // this one triggers when the stack is full and then the size is increased by double to compensate.
        if (isFull() == true) {
            int[] temp = new int[arr.length * 2];
            System.out.println("Dynamic stacks has been triggered - Length doubled");

            for (int i = 0; i< arr.length; i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }
        // then we will insert the next value into the sidlibs.stacks
        arr[top] = x;
        top++;
    }




}
