package Search;
import praktikummodul5.inputBarang;
/**
 *
 * @author rifai
 */
public class Searching 
{
    int index =0;
    void sequenSearch(String cari)
    {
        inputBarang[] barang =new inputBarang[100];
        boolean ketemu = false ;
        for (int i = 0; i<index;i++){
            inputBarang[] nama = barang;
        if(nama.equals(cari))
        {
        System.out.println(" Data ketemu ");
        System.out.println(data[i].cetak());
        ketemu = true;
        break;
        }
        }
        if(ketemu==false){
        System.out.println("Data tidak ada");}
    }
   int binarySearch(int nAwal, int batas, int cari) 
    { 
        if (batas >= nAwal) { 
            int mid = nAwal + (batas - nAwal) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (data[mid].getId() == cari) 
                return mid+1; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (data[mid].getId() > cari) 
                return binarySearch(nAwal, mid - nAwal, cari); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(mid + nAwal, batas, cari); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    }    
}
