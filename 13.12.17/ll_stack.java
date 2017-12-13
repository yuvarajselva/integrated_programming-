import java.io.*;
class node
{
    int data;
    node next;
    public node(int x)
    {
        data=x;
        next=null;
    }
}
class stackll
{
    node top=null;
    public boolean isEmpty()
    {
        if (top==null)
            return true;
        else
            return false;
    }
    public void push(int x)
    {
        if(isEmpty()==true)
        {
            node p=new node(x);
            top=p;
        }
        else
        {
            node p=new node(x);
            p.next=top;
            top=p;
        }
    }
    public int pop()
    {
        if(isEmpty()==true)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            int x=top.data;
            top=top.next;
            return x;
        }
    }
    public int peek()
    {
        if(isEmpty()==true)
        {
            System.out.println("No elements in stack");
            return -1;
        }
        else
        {
            return top.data;
        }
    }
    public void display()
    {
        if(isEmpty()==true)
        {
            System.out.println("No elements in stack");
        }
        else
        {
            node current=top;
            while(current!=null)
            {
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
}
public class ll_stack
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      int ch,temp;
      stackll sl=new stackll();
      do
      {
        System.out.println("##MENU##");
        System.out.println("1.Insert an element in stack");
        System.out.println("2.Remove an element");
        System.out.println("3.Peek element");
        System.out.println("4.Display Stack");
        System.out.println("5.Exit");
        System.out.println("Enter Choice");
        ch=Integer.parseInt(obj.readLine());
        switch (ch)
        {
            case 1:System.out.println("Enter element to be inseted");
                temp=Integer.parseInt(obj.readLine());
                sl.push(temp);
                break;
            case 2:temp=sl.pop();
                System.out.println("Popped element is "+temp);
                break;
            case 3:temp=sl.peek();
                System.out.println("Peeked element is "+temp);
                break;
            case 4:sl.display();
        }
      }
      while(ch!=5);
    }
}
