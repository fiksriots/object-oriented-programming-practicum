package list;
public class doublelinklist 
{    
    int jumlah =0;
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
   
    public int hitungData(doublelinklist list) {
        node hitung = list.head;
        while (hitung != null) {
            jumlah++;
            hitung = hitung.next;
        }
        return jumlah;
    }
    
    public String[] getNama(doublelinklist list) {
        node nama = list.head;
        String[] tempNama = new String[jumlah];
        int index = 0;
        while (nama != null) {
            tempNama[index] = nama.pekerjaanB;
            nama = nama.next;
            index++;
        }
        return tempNama;
    }
    

    
}
