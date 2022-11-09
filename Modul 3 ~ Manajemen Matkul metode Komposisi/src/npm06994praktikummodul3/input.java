/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06994praktikummodul3;
import java.util.Scanner;
/**
 *
 * @author fikri
 */
public class input {
    Scanner in = new Scanner(System.in);
    inputuas [] uas = new inputuas[100];
    inpututs [] uts = new inpututs[100];
    inputtugas [] tgs=new inputtugas[100];
    siswa [] sis=new siswa[100];
    int index=0;
    int index1=0;
    int index2=0;
    void insertuas(){
        System.out.print("masukkan uas ipa = ");
        int ipaa=in.nextInt();
        System.out.print("masukkan uas mtk = ");
        int mat=in.nextInt();
        System.out.print("masukkan uas BI = ");
        int bi=in.nextInt();
        System.out.print("masukkan uas ips = ");
        int ipss=in.nextInt();
        System.out.print("masukkan uas bing = ");
        int bing=in.nextInt();
        System.out.print("masukkan uas pkn = ");
        int pknn=in.nextInt();
        uas[index]=new inputuas(ipaa,mat,bi,ipss,bing,pknn);
        sis[index]=new siswa(uts[index],uas[index],tgs[index]);
        index++;
    }
    void insertuts(){
        System.out.print("masukkan uts ipa = ");
        int ipaa=in.nextInt();
        System.out.print("masukkan uts mtk = ");
        int mat=in.nextInt();
        System.out.print("masukkan uts BI = ");
        int bi=in.nextInt();
        System.out.print("masukkan uts ips = ");
        int ipss=in.nextInt();
        System.out.print("masukkan uts bing = ");
        int bing=in.nextInt();
        System.out.print("masukkan uts pkn = ");
        int pknn=in.nextInt();
        uts[index1]=new inpututs(ipaa, mat, bi, ipss, bing, pknn);
        sis[index1]=new siswa(uts[index1],uas[index1],tgs[index1]);
        index1++;
    }
    void inserttgs(){
        System.out.print("masukkan tugas ipa = ");
        int ipaa=in.nextInt();
        System.out.print("masukkan tugas mtk = ");
        int mat=in.nextInt();
        System.out.print("masukkan tugas BI = ");
        int bi=in.nextInt();
        System.out.print("masukkan tugas ips = ");
        int ipss=in.nextInt();
        System.out.print("masukkan tugas bing = ");
        int bing=in.nextInt();
        System.out.print("masukkan tugas pkn = ");
        int pknn=in.nextInt();
        tgs[index2]=new inputtugas(ipaa, mat, bi, ipss, bing, pknn);
        sis[index2]=new siswa(uts[index2],uas[index2],tgs[index2]);
        index2++;
    }
    
    void outputuas(){
        for(int i=0;i<index;i++){
            System.out.println("===nilai uas===");
            System.out.println("nilai uas IPA = "+sis[i].getuas().getmapel().getipa());
            System.out.println("nilai uas MTK = "+sis[i].getuas().getmapel().getmtk());
            System.out.println("nilai uas BI = "+sis[i].getuas().getmapel().getbi());
            System.out.println("nilai uas IPS = "+sis[i].getuas().getmapel().getips());
            System.out.println("nilai uas B.Ing = "+sis[i].getuas().getmapel().getbing());
            System.out.println("nilai uas PKN = "+sis[i].getuas().getmapel().getpkn());
        }
    }
    void outpututs(){
        for(int i=0;i<index1;i++){
            System.out.println("===nilai uts===");
            System.out.println("nilai uts IPA = "+sis[i].getuts().getmapel().getipa());
            System.out.println("nilai uts MTK = "+sis[i].getuts().getmapel().getmtk());
            System.out.println("nilai uts BI = "+sis[i].getuts().getmapel().getbi());
            System.out.println("nilai uts IPS = "+sis[i].getuts().getmapel().getips());
            System.out.println("nilai uts B.Ing = "+sis[i].getuts().getmapel().getbing());
            System.out.println("nilai uts PKN = "+sis[i].getuts().getmapel().getpkn());
        }
    }
    void outputtugas(){
        for(int i=0;i<index2;i++){
            System.out.println("===nilai tugas===");
            System.out.println("nilai tugas IPA = "+sis[i].gettgs().getmapel().getipa());
            System.out.println("nilai tugas MTK = "+sis[i].gettgs().getmapel().getmtk());
            System.out.println("nilai tugas BI = "+sis[i].gettgs().getmapel().getbi());
            System.out.println("nilai tugas IPS = "+sis[i].gettgs().getmapel().getips());
            System.out.println("nilai tugas B.Ing = "+sis[i].gettgs().getmapel().getbing());
            System.out.println("nilai tugas PKN = "+sis[i].gettgs().getmapel().getpkn());
        }
    }
}

