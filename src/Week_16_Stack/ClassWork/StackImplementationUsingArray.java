package Week_16_Stack.ClassWork;

public class StackImplementationUsingArray {
    static class Stack{
        private int index = 0;
        private int[] arr = new int[5];

        public void push(int x) throws Error{
            if(index == arr.length) throw new Error("Stack Overflow!!! ");
            arr[index] = x;
            index++;
        }

        public int pop() throws Error{
            if(index == 0) throw new Error("Stack Underflow !!! ");
            int pop = arr[index-1];
            index--;
            return pop;
        }

        public int peek() throws Error{
            if(index == 0) throw new Error("Stack underflow !!");
            return arr[index-1];
        }

        public int size(){
            return index;
        }

        public boolean isFull(){
            return index == arr.length;
        }

        public boolean isEmpty(){
            return index == 0;
        }

        public void display(){
            for(int i = 0;i <= index-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(10);
        st.push(20);
        System.out.println(st.size());
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());

        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
