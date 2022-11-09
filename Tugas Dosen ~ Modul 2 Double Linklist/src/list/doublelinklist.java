package list;
public class doublelinklist 
{    
    node head;
    node tail;
    public doublelinklist()
    {
        head=null;
        tail=null;
    }
    public boolean isEmpty()
    {
        return (head==null);
    }
    public void insert(String a,String b,String c)
    {
        node nod=new node(a,b,c);
        if(isEmpty()){
            head=nod;
        }else{
            tail.next=nod;
            nod.prev=tail;
        }
        tail=nod;
    }
    public boolean sisip(String name, String nam,String des,String stat){
        node current = head;
        while(!current.pekerjaanB.equals(name)){
            current = current.next;
            if(current == null)
            return false;
        }
        node nod = new node(nam,des,stat);

        if(current==tail){
            nod.next = null;
            tail = nod;
        }else{
            nod.next = current.next;
         
            current.next.prev = nod;
        }
        nod.prev = current;
        current.next = nod;
        return true;
    }
     
    public node delete(String name){
        node current=head;
        while(!current.pekerjaanB.equals(name)){
            current=current.next;
            if(current==null)
                return null;
        }
        if(current==head){
            head=current.next;
        }else{
            current.prev.next=current.next;
        }
        if(current==tail){
           tail=current.prev; 
        }else{
            current.next.prev=current.prev;
        }
        return current;
    }
   
    void view(){
        
        node current = head;
        
        
        if(current==null){
            System.out.println("kosong");
        }else{
            
            current.tampil();
            current = current.next;
        }
                        
        
        System.out.println("");
        
    }
    public node vie(String view)
    {
        node cetak=head;
        if(cetak==null)
        {
            System.out.println("kosong");
        }else{
            
            cetak.tampil();
            
            return cetak;
        }
        cetak = cetak.next;
        return cetak;
    }

    
}
