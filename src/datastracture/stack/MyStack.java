package datastracture.stack;

public class MyStack {

	int top;
	int size;
	int arr[];
	
	public MyStack(int size) {
    
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	
	public int push(int data) {
		
		if(top == size -1) {
			System.out.println("statc is full -- throw unsupported exception");
			return -1;
		}
		
		arr[++top] = data;
		return data;
	}
	
	public int pop()
	{
		int popedData;
		
		if(top == -1) {
			System.out.println("Stack is Empty --- throw no such element exception");
		   return -1;
		   
		}
		popedData = arr[top--];
		return popedData;
	}
	
	public static void main(String[] args) {
		MyStack stack  = new MyStack(5);
		System.out.println(stack.push(1));
		System.out.println(stack.push(2));
		System.out.println(stack.push(3));
		System.out.println(stack.push(4));
		System.out.println(stack.push(5));
		System.out.println(stack.push(6));
		

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
	
}
