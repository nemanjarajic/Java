package guiTest;
import java.awt.Color;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.*;
import java.awt.*;

public class test implements ActionListener{
    JTextField text1,text2,text3;
    JButton b1,b2,b3;
    test(){
        JFrame f = new JFrame();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();

        text1.setBounds(50, 50, 150, 25);
        text2.setBounds(50, 100, 150, 25);
        text3.setBounds(50, 150, 150, 25);

        b1 = new JButton("+");
        b2 = new JButton("-");

        b1.setBounds(50, 200, 50, 50);
        b2.setBounds(125, 200, 50, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(text1);f.add(text2);f.add(text3);f.add(b1);f.add(b2);

        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s1 = text1.getText();
        String s2 = text2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        int res = 0;

        if(e.getSource() == b1){
            res = a +b;
        }else{
            res = a-b;

        }

        String result = String.valueOf(res);
        text3.setText(result);
    }
    public static void main(String agrs[]){
        new test();
    }

}
