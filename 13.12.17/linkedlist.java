class Qnode{
    int key;
    Qnode next;
    public Qnode(int key){
        this.key=key;
        this.next=null;
    }
}

class Queue
{
  Qnode front,rear;
    public Queue(){
      this.front=this.rear=null;
    }

    void enqueue(int key)
    {
      Qnode temp = new Qnode(key);
      if(this.rear==null)
      {
        this.front=this.rear=temp;
        return ;
      }

      this.rear.next = temp;
      this.rear = temp;

    }

    Qnode dequeue(){
      //Qnode temp = new Qnode(key);
      if (this.front==null) {
        return null;
      }
      Qnode temp = this.front;
      this.front = this.front.next;

      if (this.front == null) {
        this.rear = null;

      }  return temp;
    }
}


public class linkedlist{
  public static void main(String[] args) {
    Queue q = new Queue();
     q.enqueue(20);
     q.enqueue(20);
     q.enqueue(20);
     q.dequeue();

    System.out.println("the dequeued element is "+q.dequeue().key);
  }
}
