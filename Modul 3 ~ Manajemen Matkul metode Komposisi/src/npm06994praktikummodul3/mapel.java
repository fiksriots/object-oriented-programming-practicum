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
public class mapel {
    int ipa;
    int mtk;
    int BI;
    int ips;
    int b_ing;
    int pkn;
    
    public mapel(int ipa,int mtk,int bi,int ips,int bing,int pkn){
        this.ipa=ipa;
        this.mtk=mtk;
        this.BI=bi;
        this.ips=ips;
        this.b_ing=bing;
        this.pkn=pkn;
    }

    int getipa(){
        return ipa;
    }
    int getmtk(){
        return mtk;
    }
    int getbi(){
        return BI;
    }
    int getips(){
        return ips;
    }
    int getbing(){
        return b_ing;
    }
    int getpkn(){
        return pkn;
    }
}
