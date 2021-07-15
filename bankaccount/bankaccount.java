package bankaccount;
import java.awt.Color;
import java.util.*;
import javax.swing.*;

public class bankaccount {
    public static void main(String agrs[]){
        JFrame frame = new JFrame();
        frame.setTitle("Bank Account");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);
    }
}

class BankAccount{
    int balance;
    int prevTransaction;
    String name;
    String ID;

    BankAccount(String cName, String cID){
        name = cName;
        ID = cID;
    }

    void deposit(int amount){
        if(amount > 0){
            balance += amount;
            prevTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(amount > 0){
            balance -= amount;
            prevTransaction = -amount;
        }
    }

    void getPrevTrans(){
        if(prevTransaction > 0){
            System.out.println("Deposited: " + prevTransaction);
        }else if( prevTransaction < 0){
            System.out.println("Withdrawn: " + Math.abs(prevTransaction));
        }else{
            System.out.println("No previous transaction.");
        }
    }
}