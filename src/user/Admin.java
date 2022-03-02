
package user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Admin {
    
    public static void main(String[] args) {
        adminpage obj=new adminpage();
    }
    
}
class adminpage extends JFrame implements ActionListener{
    
    String daala,ricea,sugara,wheata,oila,kerosenea;
    JLabel daal,rice,sugar,wheat,oil,kerosene,heading;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton submit;
    
   
      
    public adminpage(){
        
         Border border=BorderFactory.createLineBorder(Color.decode("#66FcF1"),3);
       
         heading=new JLabel("STOCK UPDATE");
        heading.setFont(new Font("MV Boli",Font.BOLD,40));
        heading.setBounds(550,50,500,250);
        heading.setForeground(Color.decode("#66FcF1"));
        
     
        
        daal=new JLabel("Daal");
        daal.setFont(new Font("MV Boli",Font.BOLD,25)); 
        daal.setForeground(Color.white);
        daal.setBounds(600,250, 150,30);
        
        c1=new JCheckBox();
        c1.setBounds(750, 250, 25, 25);
        
        
        rice=new JLabel("Rice");
        rice.setFont(new Font("MV Boli",Font.BOLD,25)); 
        rice.setForeground(Color.white);
        rice.setBounds(600,300, 150,30);
        
        c2=new JCheckBox();
        c2.setBounds(750, 300, 25, 25);
        
        
        sugar=new JLabel("Sugar");
        sugar.setFont(new Font("MV Boli",Font.BOLD,25)); 
        sugar.setForeground(Color.white);
        sugar.setBounds(600, 350, 150,30);
        
        c3=new JCheckBox();
        c3.setBounds(750, 350, 25, 25);
        
        
        wheat=new JLabel("Wheat");
        wheat.setFont(new Font("MV Boli",Font.BOLD,25)); 
        wheat.setForeground(Color.white);
        wheat.setBounds(600, 400, 150,30);
        
        c4=new JCheckBox();
        c4.setBounds(750, 400, 25, 25);
        
        
        
        oil=new JLabel("Oil");
        oil.setFont(new Font("MV Boli",Font.BOLD,25)); 
        oil.setForeground(Color.white);
        oil.setBounds(600, 450, 150,30);
        
        c5=new JCheckBox();
        c5.setBounds(750, 450, 25, 25);
        
        
        kerosene=new JLabel("Kerosene");
        kerosene.setFont(new Font("MV Boli",Font.BOLD,25)); 
        kerosene.setForeground(Color.white);
        kerosene.setBounds(600, 500, 150,30);
        
        c6=new JCheckBox();
        c6.setBounds(750, 500, 25, 25);
       
        
        submit=new JButton("Submit");
        submit.addActionListener(this);
        
        submit.setBounds(610, 600,150, 50);
        
        
        
        
        
        
        add(heading);
        add(daal);
        add(c1);
        add(rice);
        add(c2);
        add(sugar);
        add(c3);
        add(wheat);
        add(c4);
        add(oil);
        add(c5);
        add(kerosene);
        add(c6);
        add(submit);
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1550,900);
        setTitle("Admin Page");
        setVisible(true);
        

        
        getContentPane().setBackground(Color.decode("#1F2833"));
        
    }  
     
     @Override
       public void actionPerformed(ActionEvent e)
       {
         
          if(e.getSource()==submit)
          {
            
           if(c1.isSelected())
           {
               daala="available";
           }
           else
           {
               daala="not available";
           }
           if(c2.isSelected())
           {
               ricea="available";
           }
            else
           {
               ricea="not available";
           }
           if(c3.isSelected())
           {
               sugara="available";
           }
            else
           {
               sugara="not available";
           }
           if(c4.isSelected())
           {
               wheata="available";
           }
            else
           {
              wheata="not available";
           }
           if(c5.isSelected())
           {
               oila="available";
           }
            else
           {
               oila="not available";
           }
           if(c6.isSelected())
           {
               kerosenea="available";
           }
            else
           {
               kerosenea="not available";
           }
            setdata();
          }
         
       }
       
       public void setdata()
       {
            
           try{
                String uname="root";
             String url="jdbc:mysql://localhost:3306/admin";
             String pass="tawakkal719";
             Connection con=DriverManager.getConnection(url,uname, pass);
             
             
             String q="update stock set daal=? , rice=? , sugar=? , wheat=? , oil=? , kerosene=? where id=1";
             
             PreparedStatement ps=con.prepareStatement(q);
            
             ps.setString(1,daala);
             ps.setString(2,ricea);
             ps.setString(3,sugara);
             ps.setString(4,wheata);
             ps.setString(5,oila);
             ps.setString(6,kerosenea);
         
              
             ps.executeUpdate();
             
               System.out.println("inserted");
             
             con.close();
             
             
           } catch (Exception e) {
               e.printStackTrace();
           }
            
        
           

           
       }
      
}