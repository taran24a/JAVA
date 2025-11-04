// Stack is a linear data structure that follows the LIFO (Last In First Out) principle.
// Push operation adds an element to the top of the stack.
// Pop operation removes the element from the top of the stack.
// top(peak) points to the last added element in the stack.
// In empty stack, top will be pointing at -1.
public class Stackk {
     int arr[];
     int capacity;
     int top;
     Stackk(int size){
         arr=new int[size];
         capacity=size;
         top=-1;
     }
         public void insert(int val){
                if(top==capacity-1){
                    System.out.println("Stack Overflow");
                }
                else{
                    top++;
                    arr[top]=val;
                    System.out.println("Inserted "+val);
                }
         }

         public static void main(String[] args) {
                Stackk stack=new Stackk(5);
                stack.insert(10);
                stack.insert(20);
                stack.insert(30);
                stack.insert(40);
                stack.insert(50);
                stack.insert(60);
                
         }


}
