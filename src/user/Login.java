
package user;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.reflect.Array.set;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Login extends JFrame implements ActionListener{
    
    public static void main(String[] args) {
        new Login();
    }

    
    
    JLabel logo,user,pass,invalidu,invalidp,newreg;
    JTextField user1,pass1;
    JButton submit,register;
    String aname,apass,cname="",cpass="";
    public Login() {
        
        Border border=BorderFactory.createLineBorder(Color.gray,3);

        
        ImageIcon image=new ImageIcon("C:\\Users\\Azeer\\Pictures\\Camera Roll\\tamil1.png");
        logo=new JLabel();
        logo.setIcon(image);
        
        logo.setBounds(650,50,125,125);
        logo.setBorder(border);
        
        
        
         user=new JLabel("User name:");
         user.setBounds(480,280,150, 30);
         user.setFont(new Font("MV Boli",Font.BOLD,25)); 
         user.setForeground(Color.white);
         
         user1=new JTextField();
         user1.setBounds(670,285,200,25);
         user1.setFont(new Font("MV Boli",Font.BOLD,16)); 
         
         invalidu=new JLabel("*Invalid user");
         invalidu.setBounds(920,284,200,25);
         invalidu.setFont(new Font("MV Boli", Font.BOLD, 19));
         invalidu.setForeground(Color.RED);
         invalidu.setVisible(false);
         
         
         pass=new JLabel("Password:");
         pass.setBounds(480,355,150, 30);
         pass.setFont(new Font("MV Boli",Font.BOLD,25)); 
         pass.setForeground(Color.white);
         
         pass1=new JTextField();
         pass1.setBounds(670,360,200,25);
         pass1.setFont(new Font("MV Boli",Font.BOLD,16)); 
         
         invalidp=new JLabel("*Invalid password");
         invalidp.setBounds(920,359,200,25);
         invalidp.setFont(new Font("MV Boli", Font.BOLD, 19));
         invalidp.setForeground(Color.RED);
         invalidp.setVisible(false);
         
         
         
         
         
         submit=new JButton("Submit");
         submit.setBounds(650,450,120,40);
         submit.setFocusable(false);
         submit.setBackground(Color.decode("#66FcF1"));
         submit.setFont(new Font("MV Boli",Font.BOLD,20));
         submit.addActionListener(this);
         
          
         register=new JButton("Register");
         register.setBounds(830,450,120,40);
         register.setFocusable(false);
         register.setBackground(Color.decode("#66FcF1"));
         register.setFont(new Font("MV Boli",Font.BOLD,20));
         register.setVisible(false);
         register.addActionListener(this);
         
         newreg=new JLabel("*New registration");
         newreg.setBounds(1000,450,200,25);
         newreg.setFont(new Font("MV Boli", Font.BOLD, 19));
         newreg.setForeground(Color.white);
         newreg.setVisible(false);
        
        
        
        
        add(logo);
        add(user);
        add(user1);
        add(pass);
        add(pass1);
        add(submit);
        add(invalidu);
        add(invalidp);
        add(register);
        add(newreg);
       
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(1550,900);
        setTitle("Login page");
        setVisible(true);
       
         getContentPane().setBackground(Color.decode("#1F2833"));

    }
    
    @Override
       public void actionPerformed(ActionEvent e)
       {
           if(e.getSource()==submit)
           {
               try {
                    aname=user1.getText();
                    apass=pass1.getText();
                    
                    String uname="root";
                    String url="jdbc:mysql://localhost:3306/admin";
                    String password="tawakkal719";
                    Connection con=DriverManager.getConnection(url,uname, password);
                    PreparedStatement st=con.prepareCall("select * from head where user_id=?");
                    st.setString(1,aname);
                    ResultSet set=st.executeQuery(); 
                    
                            
                    if(set.next())
                    {
                        cname=set.getString("user_id");
                        cpass=set.getString("password");
                    }
                    
                   
                    
                    if(!cname.equals(aname))
                    {
                        invalidu.setVisible(true);
                    }
                    if(!cpass.equals(apass))
                    {
                        invalidp.setVisible(true);
                    }
                    if(!cname.equals(aname) && !cpass.equals(apass))
                    {
                        register.setVisible(true);
                        newreg.setVisible(true);
                    }
                    
                    if(cname.equals(aname) && cpass.equals(apass))
                    {
                        userpage obj=new userpage(cname);
                        
                    }
                    
                   con.close();
                    
               }     
               catch (Exception t) {
                   
               }
               
           }
           if(e.getSource()==register)
           {
               new Registration();
           }
       }
     
    
}
