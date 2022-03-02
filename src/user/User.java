
package user;




import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class User {
    
    public static void main(String[] args) {
       new userpage("null");
     
    }
    
}
class userpage extends JFrame implements ActionListener{
         
    JPanel check1,check2,check3,check4,check5,check6,green,red;
    JLabel heading,logo,daal,rice,sugar,wheat,oil,kerosene,g,r,gt,rt;
    JMenuBar menubar;
    JMenu menu3;
    JMenuItem menu3i1;
    JCheckBox checkbox1,checkbox2,checkbox3,checkbox4,checkbox5,checkbox6;
    JButton submit,next,logout;
    String daala,ricea,sugara,wheata,oila,kerosenea,ds,rs,ss,ws,os,ks;
    Border db,rb,sb,wb,ob,kb;
    int a=0,b=0,c=0,x=0,y=0,z=0,n=0;
    String hi;

    public userpage(String username) {
        
        
        hi=username;
        
        
        
        heading=new JLabel("WELCOME TO E-RATION MANAGEMENT");
        heading.setFont(new Font("MV Boli",Font.BOLD,27));
        heading.setBounds(435,-100,600,250);
        heading.setForeground(Color.decode("#66FcF1"));
        
     
        menubar=new JMenuBar();
        menubar.setBounds(0, 80, 1550, 35);
       
     
        
       
        menu3=new JMenu("View e-ration card");
        
        logout=new JButton("Logout");
        logout.setFocusable(false);
        logout.addActionListener(this);
        
       
        
       
        menubar.add(menu3);
        menubar.add(logout);
        
        
        
        ImageIcon m3i1=new ImageIcon("view.png");
        menu3i1=new JMenuItem("View smart card");
        menu3i1.setIcon(m3i1);
        menu3i1.addActionListener(this);
        
        
        
        
        
        menu3.add(menu3i1);
        
        try {
             
             String uname="root";
             String url="jdbc:mysql://localhost:3306/admin";
             String pass="tawakkal719";
             Connection con=DriverManager.getConnection(url,uname, pass);
             
             String q="select * from stock";
             Statement st=con.createStatement();
             ResultSet set=st.executeQuery(q);
             
             while(set.next())
             {
                 daala=set.getString(2);
                 ricea=set.getString(3);
                 sugara=set.getString(4);
                 wheata=set.getString(5);
                 oila=set.getString(6);
                 kerosenea=set.getString(7);
             }     
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
     
       Border border=BorderFactory.createLineBorder(Color.gray,3);
        
       ImageIcon image=new ImageIcon("C:\\Users\\Azeer\\Pictures\\Camera Roll\\tamil1.png");
       logo=new JLabel();
       logo.setIcon(image);

       logo.setBounds(650,50,125,125);
       logo.setBorder(border);
       
      
       ImageIcon image1=new ImageIcon("daal.png");
       daal=new JLabel("Daal");
       daal.setIcon(image1);
       daal.setVerticalTextPosition(JLabel.BOTTOM);
       daal.setHorizontalTextPosition(JLabel.CENTER);
       daal.setFont(new Font("MV Boli",Font.BOLD,25)); 
       daal.setForeground(Color.white);
       daal.setBorder(border);
       daal.setBounds(20,260,215,201);
       
       ImageIcon image2=new ImageIcon("rice.jpg");
       rice=new JLabel("Rice");
       rice.setIcon(image2);
       rice.setVerticalTextPosition(JLabel.BOTTOM);
       rice.setHorizontalTextPosition(JLabel.CENTER);
       rice.setFont(new Font("MV Boli",Font.BOLD,25)); 
       rice.setForeground(Color.white);
       rice.setBorder(border);
       rice.setBounds(275,260,215,201);
       
       ImageIcon image3=new ImageIcon("sugar.jpg");
       sugar=new JLabel("Sugar");
       sugar.setIcon(image3);
       sugar.setVerticalTextPosition(JLabel.BOTTOM);
       sugar.setHorizontalTextPosition(JLabel.CENTER);
       sugar.setFont(new Font("MV Boli",Font.BOLD,25)); 
       sugar.setForeground(Color.white);
       sugar.setBorder(border);
       sugar.setBounds(530,260,215,201);
       
       
       ImageIcon image4=new ImageIcon("wheat.jpg");
       wheat=new JLabel("Wheat");
       wheat.setIcon(image4);
       wheat.setVerticalTextPosition(JLabel.BOTTOM);
       wheat.setHorizontalTextPosition(JLabel.CENTER);
       wheat.setFont(new Font("MV Boli",Font.BOLD,25)); 
       wheat.setForeground(Color.white);
       wheat.setBorder(border);
       wheat.setBounds(785,260,215,201);
       
       
       ImageIcon image5=new ImageIcon("oil.jpg");
       oil=new JLabel("Oil");
       oil.setIcon(image5);
       oil.setVerticalTextPosition(JLabel.BOTTOM);
       oil.setHorizontalTextPosition(JLabel.CENTER);
       oil.setFont(new Font("MV Boli",Font.BOLD,25)); 
       oil.setForeground(Color.white);
       oil.setBorder(border);
       oil.setBounds(1040,260,215,201);
       
       ImageIcon image6=new ImageIcon("kerosene.jpg");
       kerosene=new JLabel("Kerosene");
       kerosene.setIcon(image6);
       kerosene.setVerticalTextPosition(JLabel.BOTTOM);
       kerosene.setHorizontalTextPosition(JLabel.CENTER);
       kerosene.setFont(new Font("MV Boli",Font.BOLD,25)); 
       kerosene.setForeground(Color.white);
       kerosene.setBorder(border);
       kerosene.setBounds(1295,260,215,201);
       
               
       
       if(daala.equals("available"))
       {
        db=BorderFactory.createLineBorder(Color.green,3);
        
       }
       else{
           db=BorderFactory.createLineBorder(Color.red,3);
           a=1;
       }
       
        
       check1=new JPanel();
       check1.setBounds(50,500,130,28);
       check1.setBackground(Color.decode("#1F2833"));
       check1.setBorder(db);
       check1.setLayout(null);
       
       checkbox1=new JCheckBox("select daal");
       checkbox1.setBounds(4,4,122,20);
       checkbox1.setFocusable(false);
       checkbox1.setBackground(Color.decode("#1F2833"));
       checkbox1.setForeground(Color.white);
       checkbox1.setFont(new Font("MV Boli",Font.BOLD,16));
       if(a==1)
       {
           checkbox1.setEnabled(false);
       }
       
       
       
       
       if(ricea.equals("available"))
       {
        rb=BorderFactory.createLineBorder(Color.GREEN,3);
       
       }
       else{
           rb=BorderFactory.createLineBorder(Color.red,3);
            b=1;
       }      
 
       
       check2=new JPanel();
       check2.setBounds(307,500,130,28);
       check2.setBackground(Color.decode("#1F2833"));
       check2.setBorder(rb);
       check2.setLayout(null);
       
       checkbox2=new JCheckBox("select rice");
       checkbox2.setBounds(4,4,122,20);
       checkbox2.setFocusable(false);
       checkbox2.setBackground(Color.decode("#1F2833"));
       checkbox2.setForeground(Color.white);
       checkbox2.setFont(new Font("MV Boli",Font.BOLD,16));
       if(b==1)
       {
           checkbox2.setEnabled(false);
       }
       
       
       
       if(sugara.equals("available"))
       {
        sb=BorderFactory.createLineBorder(Color.GREEN,3);
       
       }
       else{
           sb=BorderFactory.createLineBorder(Color.red,3);
            c=1;
       }
         
       check3=new JPanel();
       check3.setBounds(564,500,130,28);
       check3.setBackground(Color.decode("#1F2833"));
       check3.setBorder(sb);
       check3.setLayout(null);
       
       checkbox3=new JCheckBox("select sugar");
       checkbox3.setBounds(4,4,122,20);
       checkbox3.setFocusable(false);
       checkbox3.setBackground(Color.decode("#1F2833"));
       checkbox3.setForeground(Color.white);
       checkbox3.setFont(new Font("MV Boli",Font.BOLD,16));
       if(c==1)
       {
           checkbox3.setEnabled(false);
       }
       
       
       
       
       if(wheata.equals("available"))
       {
        wb=BorderFactory.createLineBorder(Color.GREEN,3);
  
       }
       else{
           wb=BorderFactory.createLineBorder(Color.red,3);
                 x=1;
       }
       check4=new JPanel();
       check4.setBounds(821,500,130,28);
       check4.setBackground(Color.decode("#1F2833"));
       check4.setBorder(wb);
       check4.setLayout(null);
  

       checkbox4=new JCheckBox("select wheat");
       checkbox4.setBounds(4,4,122,20);
       checkbox4.setFocusable(false);
       checkbox4.setBackground(Color.decode("#1F2833"));
       checkbox4.setForeground(Color.white);
       checkbox4.setFont(new Font("MV Boli",Font.BOLD,16));
        if(x==1)
       {
           checkbox4.setEnabled(false);
       }
       
       
       
       
       if(oila.equals("available"))
       {
        ob=BorderFactory.createLineBorder(Color.GREEN,3);
      
       }
       else{
           ob=BorderFactory.createLineBorder(Color.red,3);
             y=1;
       }
       
       check5=new JPanel();
       check5.setBounds(1078,500,130,28);
       check5.setBackground(Color.decode("#1F2833"));
       check5.setBorder(ob);
       check5.setLayout(null);
       
       checkbox5=new JCheckBox("select oil");
       checkbox5.setBounds(4,4,122,20);
       checkbox5.setFocusable(false);
       checkbox5.setBackground(Color.decode("#1F2833"));
       checkbox5.setForeground(Color.white);
       checkbox5.setFont(new Font("MV Boli",Font.BOLD,16));
        if(y==1)
       {
           checkbox5.setEnabled(false);
       }
       
       
       
       if(kerosenea.equals("available"))
       {
        kb=BorderFactory.createLineBorder(Color.GREEN,3);
       
       }
       else{
           kb=BorderFactory.createLineBorder(Color.red,3);
            z=1;
       }
       
       
       check6=new JPanel();
       check6.setBounds(1335,500,130,28);
       check6.setBackground(Color.decode("#1F2833"));
       check6.setBorder(kb);
       check6.setLayout(null);
       
       checkbox6=new JCheckBox("select kerosene");
       checkbox6.setBounds(4,4,122,20);
       checkbox6.setFocusable(false);
       checkbox6.setBackground(Color.decode("#1F2833"));
       checkbox6.setForeground(Color.white);
       checkbox6.setFont(new Font("MV Boli",Font.BOLD,14));
        if(z==1)
       {
           checkbox6.setEnabled(false);
       }
       
       
       green=new JPanel();
       green.setBounds(600,590,15,15);
       green.setBackground(Color.green);
       
       g=new JLabel("------>");
       g.setFont(new Font("MV Boli",Font.BOLD,25));
       g.setForeground(Color.white);
       g.setBounds(620, 590,100, 15);
       
       gt=new JLabel("Stock Available");
       gt.setFont(new Font("MV Boli",Font.BOLD,20));
       gt.setForeground(Color.decode("#66FcF1"));
       gt.setBounds(720, 590,150, 18);
       
       
       
       red=new JPanel();
       red.setBounds(600,635,15,15);
       red.setBackground(Color.red);
       
       r=new JLabel("------>");
       r.setFont(new Font("MV Boli",Font.BOLD,25));
       r.setForeground(Color.white);
       r.setBounds(620, 635,100, 15);
       
       rt=new JLabel("Stock Not Available");
       rt.setFont(new Font("MV Boli",Font.BOLD,20));
       rt.setForeground(Color.decode("#66FcF1"));
       rt.setBounds(720,635,200, 18);
    
       
       submit=new JButton("Submit");
       submit.setBounds(650, 700,120,40);
       submit.setFocusable(false);
       submit.setBackground(Color.decode("#66FcF1"));
       submit.setFont(new Font("MV Boli",Font.BOLD,20));
       submit.addActionListener(this);
      
       
       next=new JButton("Next");
       next.setBounds(800, 700,120,40);
       next.setFocusable(false);
       next.setBackground(Color.decode("#66FcF1"));
       next.setFont(new Font("MV Boli",Font.BOLD,20));
       next.addActionListener(this);
       if(n==0)
       {
        next.setEnabled(false);
       }

        getContentPane().setBackground(Color.decode("#1F2833"));
        
       
   
        add(heading);
        setJMenuBar(menubar);
         
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1550,900);
        setTitle("Home Page");
        setVisible(true);
        
        add(logo);
        add(daal);
        add(rice);
        add(sugar);
        add(wheat);
        add(oil);
        add(kerosene);
        add(check1);
        add(check2);
        add(check3);
        add(check4);
        add(check5);
        add(check6);
        add(green);
        add(g);
        add(gt);
        add(red);
        add(r);
        add(rt);
        add(submit);
        add(next);
      
        check1.add(checkbox1);
        check2.add(checkbox2);
        check3.add(checkbox3);
        check4.add(checkbox4);
        check5.add(checkbox5);
        check6.add(checkbox6);
        
          
    }
  
   
     @Override
       public void actionPerformed(ActionEvent e)
       {
          
           
           if(e.getSource()==menu3i1)
           {
               view obj=new view();
               obj.set(hi);
              
               
           }
           
           if(e.getSource()==submit)
           {
               if(checkbox1.isSelected())
               {
                  ds="selected";
               }
               else
               {
                   ds="not selected";
               }
                if(checkbox2.isSelected())
               {
                  rs="selected";
               }
               else
               {
                   rs="not selected";
               }
                 if(checkbox3.isSelected())
               {
                  ss="selected";
               }
               else
               {
                   ss="not selected";
               }
                  if(checkbox4.isSelected())
               {
                  ws="selected";
               }
               else
               {
                   ws="not selected";
               }
                   if(checkbox5.isSelected())
               {
                  os="selected";
               }
               else
               {
                   os="not selected";
               }
                    if(checkbox6.isSelected())
               {
                  ks="selected";
               }
               else
               {
                   ks="not selected";
               }
                   
                try {
                     String uname="root";
                     String url="jdbc:mysql://localhost:3306/admin";
                     String pass="tawakkal719";
                     Connection con=DriverManager.getConnection(url,uname, pass);
             
                      
                     String q="update bill set daal=? , rice=? , sugar=? , wheat=? , oil=? , kerosene=? where id=1";
             
                     PreparedStatement ps=con.prepareStatement(q);
            
                     ps.setString(1,ds);
                     ps.setString(2,rs);
                     ps.setString(3,ss);
                     ps.setString(4,ws);
                     ps.setString(5,os);
                     ps.setString(6,ks);
         
              
                     ps.executeUpdate();
             
                     System.out.println("inserted");
             
                     con.close();
                   
               } catch (Exception x) {
                   x.printStackTrace();
               }
                 next.setEnabled(true);    
               
           }
           if(e.getSource()==logout)
           {
               new Logout();
           }
           if(e.getSource()==next)
           {
               new bill();
           }
          
       }
       
       
}//**************************************************************************************************************************************************************
      
class bill extends JFrame implements ActionListener
{
    String ds,rs,ss,ws,os,ks;
    JButton next;
    JPanel panel;
    JLabel logo,daal,daall,rice,ricel,sugar,sugarl,wheat,wheatl,oil,oill,kerosene,kerosenel,total,q1,q2,q3,q4,q5,q6,p1,p2,p3,p4,p5,p6,t1,t2,t3,t4,t5,t6,dc,rc,sc,wc,oc,kc,de,re,se,we,oe,ke,te,totalf;
    String dq="0",rq="0",dp="0",rp="0",sq="0",sp="0",wq="0",wp="0",oq="0",op="0",kq="0",kp="0",dst="0",rst="0",sst="0",wst="0",ost="0",kst="0",t="0";
    int dt=0,rt=0,st=0,wt=0,ot=0,kt=0;
   
    public bill(){
        
         try {
             
             String uname="root";
             String url="jdbc:mysql://localhost:3306/admin";
             String pass="tawakkal719";
             
             Connection con=DriverManager.getConnection(url,uname, pass);
             
             String q="select * from bill";
             Statement st=con.createStatement();
             ResultSet set=st.executeQuery(q);
             
             while(set.next())
             {
                 ds=set.getString(2);
                 rs=set.getString(3);
                 ss=set.getString(4);
                 ws=set.getString(5);
                 os=set.getString(6);
                 ks=set.getString(7);
             }     
            } catch (Exception e) {
            e.printStackTrace();
            }
         
         if(ds.equals("selected"))
         {
             dq="2";
             dp="20";
             dst=String.valueOf(Integer.parseInt(dq)*Integer.parseInt(dp));
          }
          if(rs.equals("selected"))
         {
             rq="20";
             rp="15";
             rst=String.valueOf(Integer.parseInt(rq)*Integer.parseInt(rp));
         }
          if(ss.equals("selected"))
         {
             sq="3";
             sp="12";
             sst=String.valueOf(Integer.parseInt(sq)*Integer.parseInt(sp));
         }
         
           if(ws.equals("selected"))
         {
             wq="10";
             wp="20";
             wst=String.valueOf(Integer.parseInt(wq)*Integer.parseInt(wp));
         }
         
            if(os.equals("selected"))
         {
             oq="1";
             op="40";
             ost=String.valueOf(Integer.parseInt(oq)*Integer.parseInt(op));
         }
         
             if(ks.equals("selected"))
         {
             kq="5";
             kp="40";
             kst=String.valueOf(Integer.parseInt(kq)*Integer.parseInt(kp));
         }
        
        
         
         Border border=BorderFactory.createLineBorder(Color.white.brighter(),3);
         
         ImageIcon image=new ImageIcon("C:\\Users\\Azeer\\Pictures\\Camera Roll\\tamil1.png");
         logo=new JLabel();
         logo.setIcon(image);

         logo.setBounds(650,50,125,125);
         logo.setBorder(border);
         
         
         
         panel=new JPanel();
         panel.setBounds(545,250,365,350);
         panel.setBackground(Color.lightGray);
         panel.setBorder(border);
         panel.setLayout(null);
         
         
         daal=new JLabel("Daal");
         daal.setBounds(15,25,100,20);
         daal.setFont(new Font("MV Boli",Font.BOLD,25));
         
         q1=new JLabel(dq);
         q1.setBounds(160,30,35,17);
         q1.setFont(new Font("MV Boli",Font.BOLD,20));
         
         dc=new JLabel("x");
         dc.setBounds(200,30,35,17);
         dc.setFont(new Font("MV Boli",Font.BOLD,25));
         
         p1=new JLabel(dp);
         p1.setBounds(240,30,35,17);
         p1.setFont(new Font("MV Boli",Font.BOLD,20));
         
         de=new JLabel("=");
         de.setBounds(285,30,35,17);
         de.setFont(new Font("MV Boli",Font.BOLD,25));


         
         
         
         t1=new JLabel(dst);
         t1.setBounds(310,30,50,17);
         t1.setFont(new Font("MV Boli",Font.BOLD,20));
         
         
         daall=new JLabel("-----------------------------");
         daall.setBounds(0,45,380,15);
         daall.setFont(new Font("MV Boli",Font.BOLD,25));
         
         rice=new JLabel("Rice");
         rice.setBounds(15,70,100,20);
         rice.setFont(new Font("MV Boli",Font.BOLD,25));
         
         q2=new JLabel(rq);
         q2.setBounds(160,75,35,17);
         q2.setFont(new Font("MV Boli",Font.BOLD,20));
         
         rc=new JLabel("x");
         rc.setBounds(200,75,35,17);
         rc.setFont(new Font("MV Boli",Font.BOLD,25));
         
         p2=new JLabel(rp);
         p2.setBounds(240,75,35,17);
         p2.setFont(new Font("MV Boli",Font.BOLD,20));
         
         re=new JLabel("=");
         re.setBounds(285,75,35,17);
         re.setFont(new Font("MV Boli",Font.BOLD,25));

         
         
         t2=new JLabel(rst);
         t2.setBounds(310,75,50,17);
         t2.setFont(new Font("MV Boli",Font.BOLD,20));
         
         
         ricel=new JLabel("-----------------------------");
         ricel.setBounds(0,90,350,15);
         ricel.setFont(new Font("MV Boli",Font.BOLD,25));
         
         sugar=new JLabel("Sugar");
         sugar.setBounds(15,115,100,20);
         sugar.setFont(new Font("MV Boli",Font.BOLD,25));
         
         q3=new JLabel(sq);
         q3.setBounds(160,120,35,17);
         q3.setFont(new Font("MV Boli",Font.BOLD,20));
         sc=new JLabel("x");
         sc.setBounds(200,120,35,17);
         sc.setFont(new Font("MV Boli",Font.BOLD,25));


         
         p3=new JLabel(sp);
         p3.setBounds(240,120,35,17);
         p3.setFont(new Font("MV Boli",Font.BOLD,20));
         
         se=new JLabel("=");
         se.setBounds(285,120,35,17);
         se.setFont(new Font("MV Boli",Font.BOLD,25));



         
         t3=new JLabel(sst);
         t3.setBounds(310,120,50,17);
         t3.setFont(new Font("MV Boli",Font.BOLD,20));
         
         sugarl=new JLabel("-----------------------------");
         sugarl.setBounds(0,135,350,15);
         sugarl.setFont(new Font("MV Boli",Font.BOLD,25));        


         wheat=new JLabel("Wheat");
         wheat.setBounds(15,160,100,20);
         wheat.setFont(new Font("MV Boli",Font.BOLD,25));
         
         
         q4=new JLabel(wq);
         q4.setBounds(160,165,35,17);
         q4.setFont(new Font("MV Boli",Font.BOLD,20));
         
         wc=new JLabel("x");
         wc.setBounds(200,165,35,17);
         wc.setFont(new Font("MV Boli",Font.BOLD,25));


         
         p4=new JLabel(wp);
         p4.setBounds(240,165,35,17);
         p4.setFont(new Font("MV Boli",Font.BOLD,20));
         
         we=new JLabel("=");
         we.setBounds(285,165,35,17);
         we.setFont(new Font("MV Boli",Font.BOLD,25));


         t4=new JLabel(wst);
         t4.setBounds(310,165,50,17);
         t4.setFont(new Font("MV Boli",Font.BOLD,20));
         
         wheatl=new JLabel("-----------------------------");
         wheatl.setBounds(0,180,350,15);
         wheatl.setFont(new Font("MV Boli",Font.BOLD,25));        

         oil=new JLabel("Oil");
         oil.setBounds(15,205,100,20);
         oil.setFont(new Font("MV Boli",Font.BOLD,25));
         
         q5=new JLabel(oq);
         q5.setBounds(160,210,35,17);
         q5.setFont(new Font("MV Boli",Font.BOLD,20));
         
         oc=new JLabel("x");
         oc.setBounds(200,210,35,17);
         oc.setFont(new Font("MV Boli",Font.BOLD,25));


         p5=new JLabel(op);
         p5.setBounds(240,210,35,17);
         p5.setFont(new Font("MV Boli",Font.BOLD,20));
         
         oe=new JLabel("=");
         oe.setBounds(285,210,35,17);
         oe.setFont(new Font("MV Boli",Font.BOLD,25));


         
         
         t5=new JLabel(ost);
         t5.setBounds(310,210,50,17);
         t5.setFont(new Font("MV Boli",Font.BOLD,20));
         
         oill=new JLabel("-----------------------------");
         oill.setBounds(0,225,350,15);
         oill.setFont(new Font("MV Boli",Font.BOLD,25));        


         kerosene=new JLabel("Kerosene");
         kerosene.setBounds(15,250,200,20);
         kerosene.setFont(new Font("MV Boli",Font.BOLD,25));
         
         q6=new JLabel(kq);
         q6.setBounds(160,255,35,17);
         q6.setFont(new Font("MV Boli",Font.BOLD,20));
         
         ke=new JLabel("=");
         ke.setBounds(285,255,35,17);
         ke.setFont(new Font("MV Boli",Font.BOLD,25));
         
        
         
         kc=new JLabel("x");
         kc.setBounds(200,255,35,17);
         kc.setFont(new Font("MV Boli",Font.BOLD,25));

         p6=new JLabel(kp);
         p6.setBounds(240,255,35,17);
         p6.setFont(new Font("MV Boli",Font.BOLD,20));
         
         t6=new JLabel(kst);
         t6.setBounds(310,255,50,17);
         t6.setFont(new Font("MV Boli",Font.BOLD,20));
         
         kerosenel=new JLabel("-----------------------------");
         kerosenel.setBounds(0,270,350,15);
         kerosenel.setFont(new Font("MV Boli",Font.BOLD,25));
         
         t=String.valueOf(Integer.parseInt(dst)+Integer.parseInt(rst)+Integer.parseInt(sst)+Integer.parseInt(wst)+Integer.parseInt(ost)+Integer.parseInt(kst));
         
         total=new JLabel("Total");
         total.setBounds(130,295,100,20);
         total.setFont(new Font("MV Boli",Font.BOLD,25));
         
          
         te=new JLabel("=");
         te.setBounds(245,295,35,17);
         te.setFont(new Font("MV Boli",Font.BOLD,25));
         
         
         totalf=new JLabel(t);
         totalf.setBounds(290,295,100,20);
         totalf.setFont(new Font("MV Boli",Font.BOLD,25));
         
         
         next=new JButton("Next");
         next.setBounds(650, 700,120,40);
         next.setFocusable(false);
         next.setBackground(Color.decode("#66FcF1"));
         next.setFont(new Font("MV Boli",Font.BOLD,20));
         next.addActionListener(this);
         
         
         
         
         
         
         
         
         
        add(panel);
        add(logo);
        panel.add(daal);
        panel.add(daall);
        panel.add(q1);
        panel.add(dc);
        panel.add(p1);
        panel.add(de);
        panel.add(t1);
        
        panel.add(rice);
        panel.add(ricel);
        panel.add(q2);
        panel.add(rc);
        panel.add(p2);
        panel.add(re);
        panel.add(t2);
        
        panel.add(sugar);
        panel.add(sugarl);
        panel.add(q3);
        panel.add(sc);
        panel.add(p3);
        panel.add(se);
        panel.add(t3);
        
        panel.add(wheat);
        panel.add(wheatl);
        panel.add(q4);
        panel.add(wc);
        panel.add(p4);
        panel.add(we);
        panel.add(t4);
        
        panel.add(oil);
        panel.add(oill);
        panel.add(q5);
        panel.add(oc);
        panel.add(p5);
        panel.add(oe);
        panel.add(t5);
        
        panel.add(kerosene);
        panel.add(kerosenel);
        panel.add(q6);
        panel.add(kc);
        panel.add(p6);
        panel.add(ke);
        panel.add(t6);
        
        panel.add(total);
        panel.add(te);
        panel.add(totalf);
        
        add(next);
       
       

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(1550,900);
        setTitle("billing page");
        setVisible(true);
        getContentPane().setBackground(Color.decode("#1F2833"));
        
        
         
         
    }
    @Override
       public void actionPerformed(ActionEvent e)
       {
           if(e.getSource()==next)
           {
               new payment();
           }
       }
    
}



//**************************************************************************************************************************************************************



class payment extends JFrame implements ActionListener
{
    JPanel pan;
    JRadioButton r1, r2, r3, r4, r5, r6;
    ButtonGroup bg = new ButtonGroup();
    JTextField t1, t2;
    JLabel Phonenum, Otp;
    JLabel image, label;
    JLabel Image1, Image2, Image3, Image4, Image5, Image6;
    JButton b;

    public payment() {

        ImageIcon im = new ImageIcon("E:\\college works\\TN Symbol.jpg");
        image = new JLabel();
        image.setIcon(im);
        image.setBounds(600, 0, 200, 200);

        
        ImageIcon img3 = new ImageIcon("Gpay1.jpg");
        Image3 = new JLabel();
        Image3.setIcon(img3);
        Image3.setBounds(100, 250, 200, 200);
        r3 = new JRadioButton("Gpay");

        ImageIcon img4 = new ImageIcon("Paytm1.jpeg");
        Image4 = new JLabel();
        Image4.setIcon(img4);
        Image4.setBounds(400, 250, 200, 200);
        r4 = new JRadioButton("Paytm");

        ImageIcon img5 = new ImageIcon("Phonepay1.png");
        Image5 = new JLabel();
        Image5.setIcon(img5);
        Image5.setBounds(700, 250, 200, 200);
        r5 = new JRadioButton("Phone Pay");

        ImageIcon img6 = new ImageIcon("Cod.png");
        Image6 = new JLabel();
        Image6.setIcon(img6);
        Image6.setBounds(1000, 250, 200, 200);
        r6 = new JRadioButton("Cash on Delievery");

        add(image);

        add(Image3);
        add(Image4);
        add(Image5);
        add(Image6);

        label = new JLabel("Please select one of the given payment mode");
        label.setBounds(500, 50, 500, 100);
        label.setFont(new Font("MV Boli",Font.BOLD,40));
        Phonenum = new JLabel("Phone Number");
        Otp = new JLabel("OTP");

        t1 = new JTextField();
        t2 = new JPasswordField();

        b = new JButton("Submit");
        b.addActionListener(this);

      

        Phonenum.setBounds(550, 570, 200, 30);
        Otp.setBounds(550, 610, 100, 30);

        t1.setBounds(700, 570, 150, 30);
        t2.setBounds(700, 610, 150, 30);

        r3.setBounds(120, 480, 140, 25);
        r4.setBounds(420, 480, 140, 25);
        r5.setBounds(750, 480, 140, 25);
        r6.setBounds(1020, 480, 170, 25);

        b.setBounds(620, 670, 100, 30);

        add(label);
        add(Phonenum);
        add(Otp);

        add(t1);
        add(t2);

        add(r3);
        add(r4);
        add(r5);
        add(r6);
        bg.add(r3);
        bg.add(r4);
        bg.add(r5);
        bg.add(r6);

        add(b);

        label.setFont(new Font("Serif", Font.BOLD, 18));
        label.setForeground(Color.decode("#66FcF1"));

        Phonenum.setFont(new Font("Serif", Font.BOLD, 18));
        Phonenum.setForeground(Color.decode("#66FcF1"));

        Otp.setFont(new Font("Serif", Font.BOLD, 18));
        Otp.setForeground(Color.decode("#66FcF1"));

       
        r3.setFont(new Font("Serif", Font.BOLD, 18));
        r3.setForeground(Color.decode("#1F2833"));

        r4.setFont(new Font("Serif", Font.BOLD, 18));
        r4.setForeground(Color.decode("#1F2833"));

        r5.setFont(new Font("Serif", Font.BOLD, 18));
        r5.setForeground(Color.decode("#1F2833"));

        r6.setFont(new Font("Serif", Font.BOLD, 18));
        r6.setForeground(Color.decode("#1F2833"));

        b.setFont(new Font("Serif", Font.BOLD, 18));
        b.setForeground(Color.decode("#1F2833"));

       
        

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(1550,900);
        setTitle("View page");
        setVisible(true);
       
        getContentPane().setBackground(Color.decode("#1F2833"));

        }
    
    @Override
       public void actionPerformed(ActionEvent e)
       {
           if(e.getSource()==b)
           {
               new lastpage();
           }
       }
}

//**************************************************************************************************************************************************************
class lastpage extends JFrame
{
    JLabel l1;
    JPanel pan;
    public lastpage()
    {
          l1 = new JLabel("Your payment had been done successfully");
        l1.setBounds(400, 80, 1000, 600);

        l1.setFont(new Font("Serif", Font.BOLD, 40));
        l1.setForeground(Color.decode("#66FcF1"));

        add(l1);
        

        pan = new JPanel();
        setLayout(null);
        getContentPane().add(pan);
        getContentPane().setBackground(Color.decode("#1F2833"));
        
        
        
        
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1550,900);
        setTitle("View page");
        setVisible(true);
       
        getContentPane().setBackground(Color.decode("#1F2833"));
              
    }
}




//**************************************************************************************************************************************************************

class view extends JFrame
{
    JPanel panel1,panel2;
    JLabel icon,icon1,person,person1,name,age,adres,phone,hname,hage,hadd,hmobile,heading,bar1;
    String hn,ha,had,hmn;
    public view() {
        
        
        heading=new JLabel("DIGITAL RATION CARD");
        heading.setBounds(435,10,600,150);
        heading.setFont(new Font("MV Boli",Font.BOLD,40));
        heading.setForeground(Color.decode("#66FcF1"));
        
        
        panel1=new JPanel();
        panel1.setBackground(Color.decode("#3CB371"));
        panel1.setBounds(200, 230, 410, 270);
        panel1.setLayout(null);
       
        ImageIcon image1=new ImageIcon("person.png");
        person=new JLabel();
        person.setIcon(image1);
        person.setBounds(10, 90, 110, 110);
        
      
        ImageIcon image2=new ImageIcon("smart.jpg");
        bar1=new JLabel();
        bar1.setIcon(image2);
        bar1.setBounds(0, 70, 410, 250);
        
        panel2=new JPanel();
        panel2.setBackground(Color.decode("#3CB371"));
        panel2.setBounds(850, 230, 410, 270);
        panel2.setLayout(null);
        
        ImageIcon image=new ImageIcon("card.jpg");
        icon=new JLabel();
        icon.setIcon(image);
        icon.setBounds(0,0,410,70);
        
        icon1=new JLabel();
        icon1.setIcon(image);
        icon1.setBounds(0,0,410,70);
        
       
        name=new JLabel("Head name:");
        name.setBounds(125, 90,120, 25);
        name.setFont(new Font("MV Boli",Font.BOLD,18));
        
        age=new JLabel("Age       :");
        age.setBounds(125, 125,120, 25);
        age.setFont(new Font("MV Boli",Font.BOLD,18));
        
        
        adres=new JLabel("Address   :");
        adres.setBounds(125, 155,120, 25);
        adres.setFont(new Font("MV Boli",Font.BOLD,18));
       
        phone=new JLabel("Mobile no :");
        phone.setBounds(125, 185,120, 25);
        phone.setFont(new Font("MV Boli",Font.BOLD,18));
        
        
        add(heading);
        add(panel1);
        panel1.add(icon);
        add(panel2);
        panel2.add(icon1);
        panel2.add(bar1);
        panel1.add(person);
        panel1.add(name);
        panel1.add(age);
        panel1.add(adres);
        panel1.add(phone);
       
       
        
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(1550,900);
        setTitle("View page");
        setVisible(true);
       
        getContentPane().setBackground(Color.decode("#1F2833"));
        
        
        
        
    }
    
    
    public void set(String username)
    {
         String un=username;
         System.out.println(un);
        try {
            String uname="root";
             String url="jdbc:mysql://localhost:3306/admin";
             String pass="tawakkal719";
             Connection con=DriverManager.getConnection(url,uname, pass);
             
             System.err.println("connected"); 
             PreparedStatement stmt=con.prepareStatement("select * from head where user_id=?");
             
             stmt.setString(1,un);
             System.out.println("done");
             ResultSet result=stmt.executeQuery();
             
             while(result.next())
             {
                 hn=result.getString(3);
                 ha=result.getString(4);
                 had=result.getString(6);
                 hmn=result.getString(7);
             }
             hname=new JLabel(hn);
             hname.setBounds(235, 90,130, 25);
             hname.setFont(new Font("MV Boli",Font.BOLD,18));
             panel1.add(hname);
             
             hage=new JLabel(ha);
             hage.setBounds(235, 125,90, 25);
             hage.setFont(new Font("MV Boli",Font.BOLD,18));
             panel1.add(hage);
             
             hadd=new JLabel(had);
             hadd.setBounds(235, 155,140, 25);
             hadd.setFont(new Font("MV Boli",Font.BOLD,18));
             panel1.add(hadd);
             
             
             hmobile=new JLabel(hmn);
             hmobile.setBounds(235, 185,140, 25);
             hmobile.setFont(new Font("MV Boli",Font.BOLD,18));
             panel1.add(hmobile);
             
             
        } catch (Exception e) {
        }
        
    }
   
}


//**************************************************************************************************************************************************************
class Logout extends JFrame
{

   
    JPanel pan;
    JLabel l1;
    JLabel image;

    public Logout() {


        ImageIcon img = new ImageIcon("C:\\Users\\Azeer\\Pictures\\Camera Roll\\tamil1.png");
        image = new JLabel();
        image.setIcon(img);
        image.setBounds(600, 70, 200, 200);

        l1 = new JLabel("You have Successfully Logged out");
        l1.setBounds(400, 80, 1000, 600);

        l1.setFont(new Font("Serif", Font.BOLD, 40));
        l1.setForeground(Color.decode("#66FcF1"));

        add(l1);
        add(image);

        pan = new JPanel();
        setLayout(null);
        getContentPane().add(pan);
        getContentPane().setBackground(Color.decode("#1F2833"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1300, 900);
        setTitle("Logout Page");
        setVisible(true);

    }
    
}
