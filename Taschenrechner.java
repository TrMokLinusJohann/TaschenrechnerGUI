import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class Taschenrechner extends JFrame implements ActionListener{
    static double num1;
    static double num2;
    static int i = 1;
    static double result;
    static List<Double> list;
    JButton plus;
    JButton minus;
    JButton times;
    JButton divide;
    JButton a1;
    JButton a2;
    JButton a3;
    JButton a4;
    JButton a5;
    JButton a6;
    JButton a7;
    JButton a8;
    JButton a9;
    JButton a0;
    JButton ce;
    JTextField eingabe;
    JLabel label1;
    JPanel panel1;
    public Taschenrechner (){
        this.setTitle("Taschenrechner");
        this.setSize(300,400);
        //creating a Panel
        panel1 = new JPanel();
        //creating a Label
        label1 = new JLabel();
        //creating a text field
        eingabe = new JTextField(11);
        //creating the ArrayList for num1
        list = new ArrayList<Double>();
        //creating the buttons
        plus = new JButton("+");
        minus = new JButton("-");
        times = new JButton("*");
        divide = new JButton("/");
        a1 = new JButton("1");
        a2 = new JButton("2");
        a3 = new JButton("3");
        a4 = new JButton("4");
        a5 = new JButton("5");
        a6 = new JButton("6");
        a7 = new JButton("7");
        a8 = new JButton("8");
        a9 = new JButton("9");
        a0 = new JButton("0");
        ce = new JButton("CE");
        //adding the Buttons to the ActionListener
        plus.addActionListener(this);
        minus.addActionListener(this);
        times.addActionListener(this);
        divide.addActionListener(this);
        ce.addActionListener(this);
    //below is the ActionListener for the text field
    eingabe.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent enter){
            if (i == 1){
                String text1 = eingabe.getText();
                num1 = Double.parseDouble(text1);
                eingabe.setText("");
                i++;
           }
            else if (i == 2){
                String text2 = eingabe.getText();
                num2 = Double.parseDouble(text2);
                eingabe.setText("");
            }
        }
    });
       //adding the buttons and stuff to the Panel 
        panel1.add(plus);
        panel1.add(minus);
        panel1.add(times);
        panel1.add(divide);
        panel1.add(a1);
        panel1.add(a2);
        panel1.add(a3);
        panel1.add(a4);
        panel1.add(a5);
        panel1.add(a6);
        panel1.add(a7);
        panel1.add(a8);
        panel1.add(a9);
        panel1.add(a0);
        panel1.add(eingabe);
        panel1.add(ce);
        this.add(panel1);
    }
    //the main exec
    public static void main(String [] args){
        Taschenrechner b1 = new Taschenrechner();
        b1.setVisible(true);
    }
    //the action performed when specific buttons are pressed
    public void actionPerformed (ActionEvent ae1){
        //if "+" is pressed
        if (ae1.getSource() == this.plus){
            result = num1+num2;
            String eh = String.valueOf(result);
            eingabe.setText(eh);
        }
        //if "-" is pressed
        else if (ae1.getSource() == this.minus){
            result = num1-num2;
            String eh = String.valueOf(result);
            eingabe.setText(eh);
        }
        //if "*" is pressed
        else if (ae1.getSource() == this.times){
            result = num1*num2;
            String eh =String.valueOf(result);
            eingabe.setText(eh);
        }
        //if "/" is pressed
        else if (ae1.getSource() == this.divide){
            result = num1/num2;
            String eh =String.valueOf(result);
            eingabe.setText(eh);
        }
        //if CE is pressed: Clear All
        else if (ae1.getSource() == this.ce){
            num1 = 0;
            num2 = 0;
            result = 0;
            i = 1;
            eingabe.setText("");
        }
        else if (ae1.getSource() == this.a1){
            list.add(1.0);
            for (double current: list){
                eingabe.setText(current);
        }
}
}
}
