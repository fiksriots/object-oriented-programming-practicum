
package project_uts;
import java.util.Scanner;
import java.io.*;
public class Project_uts {
    public static void main(String[] args) throws IOException
    {
        Scanner input= new Scanner(System.in);
        File temp = new File("nomor.txt");
        Scanner file=new Scanner(temp);
        File temp2 = new File("nomor1.txt");
        Scanner file2=new Scanner(temp2);
        File temp3 = new File("distrik.txt");
        Scanner file3=new Scanner(temp3);
        proses d=new proses();
        int pil,dat,dat2;
        String dat3;
        for(int i=0;i<7215;i++){
        dat=file.nextInt();
        dat2=file2.nextInt();
        dat3=file3.nextLine();
        d.input(dat,dat2,dat3);
        }
        do{
        System.out.println("data kecamatan se+62");
        System.out.println("1. cetak semua data");
        System.out.println("2. search data");
        System.out.println("3. exit program");
        System.out.print("pilih = ");
        pil=input.nextInt();
        switch(pil){
            case 1:
                d.detak();
                break;
            case 2:
                d.search();
                break;
        }
        }while(pil!=3);
      
    }
    
}
