package Ta.GUI;
import Ta.model.AllObject;
import java.awt.Color;
import java.awt.Font;
import Ta.controller.*;
import static Ta.controller.Kendaraancontroller.index;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
public class No2code extends JFrame
{
    int nomor =AllObject.kendaraan.index+1;
    String no =Integer.toString(nomor);
    public No2code()
    {        
 //Frame
   // int nomor =AllObject.kendaraan.index+1;
    
    JFrame mainFrame=new JFrame();
    mainFrame.setSize(1100,550);
    mainFrame.getContentPane().setBackground(Color.ORANGE);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setTitle("Kendaraan Masuk");
    mainFrame.setLayout(null);
    JLabel judtable =new JLabel("Data Kendaraan Masuk");
    JLabel judul2 =new JLabel("KENDARAAN MASUK");
    judul2.setBounds(60, 30, 600, 70);
    judul2.setFont(new Font("Arial",Font.BOLD,36));
    judtable.setBounds(620, 100, 600, 70);
    judtable.setFont(new Font("Arial",Font.BOLD,24));
    mainFrame.add(judul2);
    mainFrame.add(judtable);
    
    //radio button
    JRadioButton mobil2 =new JRadioButton("Mobil");
    JRadioButton motor2 =new JRadioButton("Motor");
    ButtonGroup kendaraan2 =new ButtonGroup();
    kendaraan2.add(mobil2);
    kendaraan2.add(motor2);
    mobil2.setBounds(150,100,60,30);
    motor2.setBounds(250,100,60,30);
    mobil2.setBackground(Color.ORANGE);
    motor2.setBackground(Color.ORANGE);
    mainFrame.add(mobil2);
    mainFrame.add(motor2);
    //Label
    JLabel Npenitipan = new JLabel("Nomor Penitipan ");
    JLabel PlatN = new JLabel("Plat Nomor");
    JLabel Stnk = new JLabel("STNK");
    JLabel Pjam = new JLabel("Waktu Penitipan");
    JLabel jam = new JLabel("Jam");
    JTextField Npenitipan1 = new JTextField();
    JTextField PlatN1 = new JTextField();
    JTextField Pjam1 = new JTextField();
    Npenitipan.setBounds(30, 170, 160, 30);
    Npenitipan.setFont(new Font("Arial",Font.BOLD,14));
    Npenitipan1.setBounds(200, 170, 250, 30);
    Npenitipan1.setFont(new Font("Arial",Font.BOLD,14));
    Npenitipan1.setText(no);
    Npenitipan1.setEditable(false);
    PlatN.setBounds(30, 220, 160, 30);
    PlatN.setFont(new Font("Arial",Font.BOLD,14));
    PlatN1.setBounds(200, 220, 250, 30);
    PlatN1.setFont(new Font("Arial",Font.BOLD,14));
    Stnk.setBounds(30, 270, 160, 30);
    Stnk.setFont(new Font("Arial",Font.BOLD,14));
    Pjam.setBounds(30, 320, 160, 30);
    Pjam.setFont(new Font("Arial",Font.BOLD,14));
    Pjam1.setBounds(200, 320, 100, 30);
    Pjam1.setFont(new Font("Arial",Font.BOLD,14));
    Pjam1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(Character.isAlphabetic(ke.getKeyChar())){
                    ke.consume();
                    JOptionPane.showMessageDialog(null,"Inputan hanya menerima angka");
                }
            }
        });
    jam.setBounds(320, 320, 100, 30);
    jam.setFont(new Font("Arial",Font.BOLD,14));
    
    JRadioButton Ada =new JRadioButton("Ada");
    JRadioButton TAda =new JRadioButton("Tidak ada");
    ButtonGroup Stnk2 =new ButtonGroup();
    Stnk2.add(Ada);
    Stnk2.add(TAda);
    Ada.setBounds(200,270,60,30);
    TAda.setBounds(300,270,100,30);
    Ada.setBackground(Color.ORANGE);
    TAda.setBackground(Color.ORANGE);
    mainFrame.add(Ada);
    mainFrame.add(TAda);
   // mainFrame.add(Npenitipan);
    mainFrame.add(PlatN);
    mainFrame.add(Stnk);
   // mainFrame.add(Npenitipan1);
    mainFrame.add(PlatN1);
    mainFrame.add(Pjam);
    mainFrame.add(jam);
    mainFrame.add(Pjam1);
    
    String[] fieldData={"Nomor Parkir","Plat Nomor","Jenis Kendaraan","STNK","Lama Penitipan"};
        
        DefaultTableModel TabelDataVoucher=new DefaultTableModel(fieldData,0);
        JTable tabelVoucher=new JTable(TabelDataVoucher);
        TableColumn tc1=new TableColumn(),tc2=new TableColumn(),tc3=new TableColumn(),tc4=new TableColumn(),tc5=new TableColumn();
        JScrollPane scrollPaneVoucher=new JScrollPane(tabelVoucher);
        scrollPaneVoucher.setBounds(500, 170, 500, 300);
        tc1=tabelVoucher.getColumnModel().getColumn(0);
        tc2=tabelVoucher.getColumnModel().getColumn(1);
        tc3=tabelVoucher.getColumnModel().getColumn(2);
        tc4=tabelVoucher.getColumnModel().getColumn(3);
        tc5=tabelVoucher.getColumnModel().getColumn(4);
        tc1.setPreferredWidth(100);
        tc2.setPreferredWidth(100);
        tc3.setPreferredWidth(100);
        tc4.setPreferredWidth(100);
        tc5.setPreferredWidth(100);
        mainFrame.add(scrollPaneVoucher);
//Button


    JButton Input2 = new JButton("Insert");
    JButton View2 = new JButton("View");
    JButton Back2 = new JButton("Back");
    Input2.setBounds(50, 400, 100, 30);
    Input2.setFont(new Font("Consolas",Font.BOLD,14));
    Input2.setForeground(Color.white);
    Input2.setBackground(Color.black);
    Input2.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent ae) {
                
                 //int getNomor1=Npenitipan1.setText();
                 String getPlat1=PlatN1.getText();
                 String getJenis="";
                 if(mobil2.isSelected()){getJenis=mobil2.getText();}
                 else if(motor2.isSelected()){getJenis=motor2.getText();}
                 String getStnk="";
                 if(Ada.isSelected()){getStnk=Ada.getText();}
                 else if(TAda.isSelected()){getStnk=TAda.getText();}
                 String getJam=Pjam1.getText();
                 
             if(PlatN1.getText().equals("")||Pjam1.getText().equals("")||getJenis.equals("")||getStnk.equals("") ){
                    JOptionPane.showMessageDialog(null, "Data salah");
                }
                else{
                    
                  AllObject.kendaraan.insert(AllObject.kendaraan.index+1, getPlat1, getJenis, getStnk, getJam);
                    JOptionPane.showMessageDialog(null, "Nomor Parkir "+nomor+"\nPlat Nomor "+getPlat1+"\nJenis Kendaraan "+getJenis+
                            "\nSTNK "+getStnk+"\nWaktu Penitipan"+getJam);
                   tabelVoucher.setModel(AllObject.kendaraan.viewTable1());
                   mobil2.setSelected(false);
                   motor2.setSelected(false);
                   kendaraan2.clearSelection();
                   Ada.setSelected(false);
                   TAda.setSelected(false);
                   Stnk2.clearSelection();
                   Npenitipan1.setText("");
                   //Npenitipan1.setText(no);
                   PlatN1.setText("");
                   Pjam1.setText("");
                 }
                
            }
        
    });
    mainFrame.add(Input2);
    
    View2.setBounds(200, 400, 100, 30);
    View2.setFont(new Font("Consolas",Font.BOLD,14));
    View2.setForeground(Color.white);
    View2.setBackground(Color.black);
    View2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
            tabelVoucher.setModel(AllObject.kendaraan.viewTable1());

    
    }
    });
    
    mainFrame.add(View2);
    Back2.setBounds(350, 400, 100, 30);
    Back2.setFont(new Font("Consolas",Font.BOLD,14));
    Back2.setForeground(Color.white);
    Back2.setBackground(Color.black);
    Back2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           Beranda beranda =new Beranda();
           beranda.setVisible(true);
           mainFrame.dispose();
        }
    });
    mainFrame.add(Back2);

    mainFrame.setVisible(true);
    
    
}
}

