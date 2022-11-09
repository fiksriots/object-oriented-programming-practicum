/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06994praktikummodul3;

/**
 *
 * @author fikri
 */
public class siswa {
   inputuas uas;
   inpututs uts;
   inputtugas tgs;
   public siswa(inpututs uts, inputuas uas,inputtugas tgs){
       this.uas=uas;
       this.uts=uts;
       this.tgs=tgs;
   }
   public inputuas getuas(){
       return uas;
   }
   public inpututs getuts(){
       return uts;
   }
   public inputtugas gettgs(){
       return tgs;
   }
}
