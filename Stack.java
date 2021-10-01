package StackADT;
public class Stack  {
    int stack[]=new int[5];
    int top=-1;
    int i;
    public void push(int element)
    {
        if(top>=4)
        {
            System.out.println("Overflow");
        }
        else
        {
            top=top+1;
            stack[top]=element;
            System.out.print("Element pushed: "+stack[top]);
        }
    }
    public void pop()
    {
        if(top<0)
            System.out.println("Underflow");
        else
        {
            System.out.print("Element popped: "+stack[top]);
            top=top-1;
        }
    }
    public void display()
    {
        if(top<0)
            System.out.println("No Element in stack");
        else
        {
            for(i=top;i>=0;i--)
                System.out.println(""+stack[i]);
        }
    }
}