
package calculator;
  import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;


public class Calculator extends JFrame implements ActionListener {
private JTextField display;
    private double num1 = 0;
private double num2 = 0,result = 0;
private char opreator;
 
public Calculator() {
setTitle("hisab");
        setSize(400,500);
setLocationRelativeTo(null);

setDefaultCloseOperation(EXIT_ON_CLOSE);

setLayout(new BorderLayout());

display = new JTextField();
display.setFont(new Font("Arial",Font.BOLD, 24));

display.setHorizontalAlignment(JTextField.RIGHT);
display.setEditable(false);
add(display,BorderLayout.NORTH);

JPane1 pane1 = new JPane1();
pane1.setLayout(new GridLayout(4,4,10,10));

String[] buttons = {
    
    "7","8","9","/",
    "4","5","6","*",
    "1","2","3","-",
    "0","C","=","+"
};

for (String text : buttons) { 
JButton button = new JButton(text);


}







    public static void main(String[] args) {
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
