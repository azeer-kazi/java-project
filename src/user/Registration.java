package user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Registration extends JFrame implements ActionListener
{
    public static void main(String[] args) {
       new Registration();

    }
  
    JLabel logo,hname,hage,hgender,address,phno,salary,error1,error2,error3,error4;
    JTextField hname1,hage1,address1,phno1,salary1;
    JRadioButton male,female;
    JButton submit,login;
    ButtonGroup group;
    public int f=0;
    Border maxb;
    String un,up,hn,ha,hg,had,hp,hs,path;
    FileInputStream fis;
    File file1;
  
   
    
   public Registration()
   {
        
        Border border=BorderFactory.createLineBorder(Color.white.brighter(),3);
         
         ImageIcon image=new ImageIcon("C:\\Users\\Azeer\\Pictures\\Camera Roll\\tamil1.png");
         logo=new JLabel();
         logo.setIcon(image);

         logo.setBounds(650,40,125,125);
         logo.setBorder(border);
         
         hname=new JLabel("Head name:");
         hname.setBounds(500,200,150, 30);
         hname.setFont(new Font("MV Boli",Font.BOLD,25)); 
         hname.setForeground(Color.white);
         
         hname1=new JTextField();
         hname1.setFont(new Font("MV Boli",Font.BOLD,16));
         hname1.setBounds(720, 207, 200, 25);
         
         hage=new JLabel("Age:");
         hage.setBounds(500,260,150, 30);
         hage.setFont(new Font("MV Boli",Font.BOLD,25)); 
         hage.setForeground(Color.white);
         
         hage1=new JTextField();
         hage1.setFont(new Font("MV Boli",Font.BOLD,16));
         hage1.setBounds(720, 267, 200, 25);
         
        
         hgender=new JLabel("Gender:");
         hgender.setBounds(500,320,150, 30);
         hgender.setFont(new Font("MV Boli",Font.BOLD,25)); 
         hgender.setForeground(Color.white);
         
         male=new JRadioButton("Male");
         male.setBounds(720, 327,60, 25);
         male.setFocusable(false);
         
         female=new JRadioButton("Female");
         female.setBounds(790, 327,70, 25);
         female.setFocusable(false);
         
         group=new ButtonGroup();
         group.add(male);
         group.add(female);
         
         
         address=new JLabel("Adress:");
         address.setBounds(500,380,150, 30);
         address.setFont(new Font("MV Boli",Font.BOLD,25)); 
         address.setForeground(Color.white);
         
         
         address1=new JTextField();
         address1.setBounds(720,387,200,25);
         address1.setFont(new Font("MV Boli",Font.BOLD,16)); 
         
        
         phno=new JLabel("Mobile no:");
         phno.setBounds(500,440,150, 30);
         phno.setFont(new Font("MV Boli",Font.BOLD,25)); 
         phno.setForeground(Color.white);
         
         
         phno1=new JTextField();
         phno1.setBounds(720,447,200,25);
         phno1.setFont(new Font("MV Boli",Font.BOLD,16)); 
         
         
          
         salary=new JLabel("Salary:");
         salary.setBounds(500,500,150, 30);
         salary.setFont(new Font("MV Boli",Font.BOLD,25)); 
         salary.setForeground(Color.white);
         
         
         salary1=new JTextField();
         salary1.setBounds(720,507,200,25);
         salary1.setFont(new Font("MV Boli",Font.BOLD,16)); 
         
         
           
        
         
         
         
       
         
     
         
        

           
     
         
         
         
         
         submit=new JButton("Submit");
         submit.setBounds(650, 600,120,40);
         submit.setFocusable(false);
         submit.setFont(new Font("MV Boli",Font.BOLD,20));
         submit.addActionListener(this);
         
         
         login=new JButton("Login");
         login.setBounds(650, 700,120,40);
         login.setFocusable(false);
         login.setFont(new Font("MV Boli",Font.BOLD,20));
         login.addActionListener(this);
         login.setVisible(false);
      
         
         error1 = new JLabel("*Name must not contain numbers");
         error1.setBounds(950, 207, 300, 25);
         error1.setFont(new Font("MV Boli", Font.BOLD, 17));
         error1.setForeground(Color.white);
         error1.setVisible(false);
         
           
         error2 = new JLabel("*Age must not contain Alphabets");
         error2.setBounds(950, 267, 300, 25);
         error2.setFont(new Font("MV Boli", Font.BOLD, 17));
         error2.setForeground(Color.white);
         error2.setVisible(false);
         
         error3 = new JLabel("*Invalid Phone number");
         error3.setBounds(950, 447, 300, 25);
         error3.setFont(new Font("MV Boli", Font.BOLD, 17));
         error3.setForeground(Color.white);
         error3.setVisible(false);

         
         error4 = new JLabel("*Must contain onli digits");
         error4.setBounds(950,507, 300, 25);
         error4.setFont(new Font("MV Boli", Font.BOLD, 17));
         error4.setForeground(Color.white);
         error4.setVisible(false);


       

         
         
         add(logo);
         add(hname);
         add(hname1);
         add(hage);
         add(hage1);
         add(hgender);
         add(male);
         add(female);
         add(address);
         add(address1);
         add( phno);
         add( phno1);
         add(salary);
         add(salary1);
         add(submit);
         add(login);
         add(error1); 
         add(error2);
         add(error3); 
         add(error4);
         
        
         
        // Frame creation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(1550,900);
        setTitle("Registration page");
        setVisible(true);
        getContentPane().setBackground(Color.decode("#1F2833"));
   }
   
    public void actionPerformed(ActionEvent e)
       {
           
         
            if(male.isSelected())
             {
                hg="male";
             }
             if(female.isSelected())
             {
                 hg="female";
             }
           
           if(e.getSource()==submit)
           {
              hn = hname1.getText();  
              un=hn.substring(0,3)+"_ration";
              up="xxxx";
	      ha = hage1.getText();
	      had = address1.getText();
	      hp = phno1.getText();
	      hs = salary1.getText();
               System.out.println(hg);
           
               
              
              if(validation(hn,ha,hg,had,hp,hs))
              {
                  
                  
                insertvalues(un,up,hn,ha,hg,had,hp,hs);
           
                  
              }
               
            
           }
           
           if(e.getSource()==login)
           {
               Login obj=new Login();
           }
       }
    
    public void insertvalues(String un,String up,String hn,String ha,String hg,String had,String hp,String hs)
    {
        try {
            
        
            
             String uname="root";
             String url="jdbc:mysql://localhost:3306/admin";
             String pass="tawakkal719";
             Connection con=DriverManager.getConnection(url,uname, pass);
             String q="insert into head(user_id,password,name,age,sex,address,phone_no,salary) values (?,?,?,?,?,?,?,?)";
             
      
             
             PreparedStatement ps=con.prepareStatement(q);
             
             ps.setString(1,un);
             ps.setString(2,up);
             ps.setString(3,hn);
             ps.setString(4,ha);
             ps.setString(5,hg);
             ps.setString(6,had);
             ps.setString(7,hp);
             ps.setString(8,hs);
           
             System.out.println("setted");
             
             ps.executeUpdate();
             
             login.setVisible(true);
             System.out.println("done");
             
             con.close();
             
             
             
        } catch (Exception x) {
        }
    }
    
    public boolean validation(String hn,String ha,String hg,String had,String hp,String hs)
    {
                String hnmsg = checkHeadname(hn);
		String hamsg= checkAge(ha);
		String hpmsg = checkPhno(hp);
		String hsmsg = checkSalary(hs);
                if(hnmsg=="True" && hamsg=="True" && hpmsg=="True" && hsmsg=="True")
                {
                    return true;
                }
                else{
                    if (hnmsg != "True") {
                        error1.setVisible(true);
                    }
                    if (hamsg != "True") {
                        error2.setVisible(true);
                    }
                    if (hpmsg != "True") {
                        error3.setVisible(true);
                    }
                    if (hsmsg != "True") {
                        error4.setVisible(true);
                    }

                    return false;
                }
    }
    
    
    public String checkHeadname(String hn) {
        if (Pattern.matches("[a-zA-Z && [^0-9]]*$", hn)) {
            return "True";
        } else {
            return "Name must not contain numbers";
        }
    }
     
         public String checkAge(String ha) {
        try {
            if (Pattern.matches("[0-9 &&[[^a-zA-Z]]]*$", ha)) {
                return "True";
            } else {
                return "Age must not contain Alphabets";
            }
        } catch (Exception e) {
            return "Age must not contain Alphabets";
        }
    }
     
    public String checkPhno(String hp) {
        if (Pattern.matches("[0-9 &&[[^a-zA-Z]]]*$", hp)) {
            if (hp.length() == 10) {
                return "True";
            } else {
                return "Invalid number";
            }
        } else {
            return "Invalid Phone number";
        }
    }
        
     

    public String checkSalary(String hs) {
        if (Pattern.matches("[0-9 &&[[^a-zA-Z]]]*$", hs)) {
            return "True";
        } else {
            return "Income must contains in digits form";
        }
    }

};


//**************************************************************************************************************************************************************

