import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(); // stack is a datastructure that follows the LIFO

        System.out.println("Before: "+stack.isEmpty());
        //push for adding to a stack
        stack.push(23);
        stack.push(23);
        stack.push(23);
        stack.push(23);
        stack.push(23);
        stack.push(23);

        System.out.println("After: "+stack.isEmpty()); // check if stack is empty
        //pop of removing from a stack
        System.out.println(stack); // print stack

        //poping the stack
        stack.pop();
        stack.pop();

        System.out.println(stack); // print stack

        
        System.out.println(stack.peek()); // check for element at top of stack
        System.out.println(stack.size()); // check for size of stack

        //searching elements in stack
        System.out.println("34 indes is : "+stack.search(34)); //negative indicates not found

        




        
    }
}
