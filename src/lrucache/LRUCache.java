package lrucache;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
class Qnode{
    Qnode next;
    Qnode prev;
    int pageNumber;
    public Qnode (int pageNumber){
        this.pageNumber=pageNumber;
        this.next=null;
        this.prev=null;
    }
}
class Queue{
    int count;
    int numberOfFrames;
    Qnode front;
    Qnode rear;
    public Queue(int numberOfFrames){
        this.count = 0;
        this.front=null;
        this.rear=null;
        this.numberOfFrames=numberOfFrames;
    }
    public boolean isFull(){
        return this.count==this.numberOfFrames;
    }
    public boolean isEmpty(){
        return this.rear == null;
    }
    public Qnode deQueue(int value,int NoofFrames){
        Qnode curr = null;
        if(isEmpty()){
            return curr;
        }
        if(this.front==this.rear)
            this.front=null;
        if(value==0){
            Random generator = new Random();
            int val = generator.nextInt(NoofFrames+1)+1;
            curr = this.front;
            for(int i=0;i<val;i++){
              curr=curr.next;  
            }
            if(curr!=this.front)
            curr.prev.next = curr.next;
            else
            this.front=this.front.next;
        }
        if(value==1){
            this.front = this.front.next;
        }
        if(value==2){
            this.rear = this.rear.prev;

            if(this.rear !=null){
                this.rear.next=null;
            }
        }
        this.count--;
        return curr;
    }
    public void Enqueue(Hash h, int pageNumber,int value,int NoofFrames){
        if(isFull()){
            if(value==2){
                h.qarray[this.rear.pageNumber] = null;
                System.out.println("Deleting "+ this.rear.pageNumber + " From cache");
            }
            if(value==1){
                h.qarray[this.front.pageNumber] = null;
                System.out.println("Deleting "+ this.front.pageNumber + " From cache"); 
            }
            Qnode node = deQueue(value,NoofFrames);
            if(value==0){
                h.qarray[node.pageNumber] = null;
                System.out.println("Deleting "+ node.pageNumber + " From cache"); 
            }
            
        }
        Qnode temp = new Qnode(pageNumber);
        temp.next = this.front;
        
        if(isEmpty()){
            this.rear=this.front=temp;
        }
        else{
            this.front.prev=temp;
            this.front=temp;
        }
        h.qarray[pageNumber]=temp;
        this.count++;
    }
    public String printQueue(){
        Qnode temp = this.front;
        String s = "";
        System.out.print("Current Cache: ");
        for(int i=0;i<this.count;i++){
            System.out.print(temp.pageNumber+" ");
            s = s + temp.pageNumber + " ";
            temp=temp.next;
        }
        System.out.println("");
        return s;
    }
    public void deleteQueue(){
        this.front = this.rear = null;
    }
}
class Hash{
    int capacity;
    Qnode[] qarray;
    public Hash(int capacity){
        this.capacity=capacity;
        this.qarray = new Qnode[capacity];
        for ( int i=0;i<this.capacity;i++){
            this.qarray[i]=null;
        }
    } 
}
public class LRUCache {
    
    public Boolean getPage(Queue q, Hash h,int pageNumber,int value,int NoofFrames){
        Qnode reqPage = h.qarray[pageNumber];
        if(reqPage==null){
            System.out.println("MISS!!!");
            q.Enqueue(h, pageNumber,value,NoofFrames);
            return false;
        }
        else
        {
            System.out.println("HIT!!!!");
             if (reqPage != q.front){
                reqPage.prev.next = reqPage.next;
                if (reqPage.next!=null)
                  reqPage.next.prev = reqPage.prev;
                if (reqPage == q.rear)
                {
                   q.rear = reqPage.prev;
                   q.rear.next = null;
                }
                reqPage.next = q.front;
                reqPage.prev = null;
                q.front.prev = reqPage;
                q.front = reqPage;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                JFrame frame = new JFrame("LRU Cache");
                frame.setSize(500,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                Panel p = new Panel();
                frame.add(p);
                frame.setSize(400,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
             }
        });
        
    }
}
  /*    */
