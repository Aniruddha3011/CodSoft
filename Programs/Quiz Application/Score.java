
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener{
    JLabel qno,quizscore;
    JButton submit,exit;
    Score(String name,int score){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(400, 150, 750, 550);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
       
        qno = new JLabel("Thank You "+ name + " For Playing Simple Minds");
        qno.setBounds(45, 30, 700, 30);
        qno.setFont(new Font("Roboto", Font.BOLD, 26));
        add(qno);
        
        quizscore = new JLabel("Your Score is "+score);
        quizscore.setBounds(375, 200, 300, 30);
        quizscore.setFont(new Font("Roboto", Font.BOLD, 26));
        add(quizscore);
        
        submit = new JButton("Play Again");
        submit.setBounds(350, 270, 100, 20);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        exit = new JButton("Exit");
        exit.setBounds(520, 270, 80, 20);
        exit.setBackground(new Color(30, 144, 255));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            setVisible(false);
            new Login();
        }else{
            setVisible(false);
        }
        
    }
    public static void main(String [] args){
        new Score("user",0);
    }
    
}
