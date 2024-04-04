package assignment;
import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
public class Assignment extends WindowAdapter implements ActionListener{
    Frame f;
    MenuBar menuBar;
    Menu menu1,menu2,menu3;
    MenuItem itemLogin,itemStudent;
    JPanel p1,p2,p3,p4,p5;
    Label l;
    Assignment(){
    f=new Frame();
    menuBar=new MenuBar();
    menu1=new Menu("Pages");
    menu2=new Menu("Edit");
    menu3=new Menu("Help");
    itemLogin=new MenuItem("login");
    itemStudent=new MenuItem("student");
    itemStudent.addActionListener(this);
    l=new Label("SIMPLE JAVA AWT LAYOUT");
    Label lab=new Label("LOGIN PAGE");
    Label label1=new Label("USERNAME");
    TextField txtfld1=new TextField();
    Label label2=new Label("PASSWORD");
    TextField txtfld2=new TextField();
    Button btn1=new Button("LOGIN");
    p1=new JPanel();
    p2=new JPanel();
    p3=new JPanel();
    p4=new JPanel();
    p5=new JPanel();
    f.setMenuBar(menuBar);
    menuBar.add(menu1);
    menuBar.add(menu2);
    menuBar.add(menu3);
    menu1.add(itemLogin);
    menu1.add(itemStudent);
    p1.add(l);
    p1.setBackground(Color.BLUE);
    p1.setForeground(Color.WHITE);
    p2.setSize(50, 100);
    p2.setBackground(Color.blue);
    p3.setBackground(Color.LIGHT_GRAY);
    p4.setBackground(Color.LIGHT_GRAY);
    btn1.setBackground(Color.BLUE);
    p5.add(label1);
    p5.add(label2);
    p5.add(txtfld1);
    p5.add(txtfld2);
    p5.add(btn1);
    p5.setBackground(Color.GRAY);
    f.add(p1,BorderLayout.NORTH);
    f.add(p2,BorderLayout.SOUTH);
    f.add(p3,BorderLayout.EAST);
    f.add(p4,BorderLayout.WEST);
    f.add(p5,BorderLayout.CENTER);
    f.setSize(500, 300);
    f.setTitle("AWT MENU Practice");
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
      System.exit(0);
      }
      });
    }
    public static void main(String[] args) {
        new Assignment();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==itemStudent){
      Label label1=new Label("FirstName");
      Label label2=new Label("LastName");
      TextField t1=new TextField();
      TextField t2=new TextField();
      label1.setBounds(40, 50, 110, 120);
      label2.setBounds(40, 50, 120, 130);
      t1.setBounds(30, 50, 130, 140);
      t2.setBounds(30, 50, 140, 160);
    }
    }
    
}
