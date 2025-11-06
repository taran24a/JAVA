
class Stack{
    int arr[];
    int capacity;
    int top;

    // Constructor to initialize stack
    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }

    void push (int data){
        if(top==capacity-1){
            System.out.println("Stack is full");
            return;
        }
        else{
            top++;
            arr[top]=data;
            System.out.println("Pushed "+data);
        }
    }
    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        else{
            System.out.println("Stack elements are:");
            for(int i=0;i<=top;i++){
                System.out.println(arr[i]);
            }
        }
}

void pop(){
    if(top==-1){
        System.out.println("Stack is empty");
        return;
    }else{
        System.out.println("Popped element: "+arr[top]);
        top--;
    }
}

    // top // peek element
    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[top];
        }
    }


    public static void reverseArray(int[] array) {
       Stack s = new Stack(array.length);
         for (int value : array) {
              s.push(value);
         }
         for (int i = 0; i < array.length; i++) {
             array[i] = s.peek();
                s.pop();
         }
    }




public class index {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        System.out.println("Stack of capacity " + st.capacity + " created.");
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60); // This should show stack is full
        st.display();
        st.pop();
        st.display();
        System.out.println("Top element is: " + st.peek());
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nReversed array:");
        reverseArray(arr);

        
    }
}
}

