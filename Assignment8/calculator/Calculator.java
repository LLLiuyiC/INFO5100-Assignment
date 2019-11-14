package Assignment8.calculator;

import javax.swing.*;
import java.awt.*;

public  class Calculator extends BaseFrame {
    private JButton resultButton;
    private  JLabel firstLabel,secondLable,operationLabel,resuleLabel;
    private  JTextField firstText,secondText,result;
    private JComboBox operation;

    @Override
    public void create(){
        firstLabel =new JLabel("1st num is");
        secondLable =new JLabel("2nd num is");
        resuleLabel = new JLabel("the result is");
        operationLabel = new JLabel("operation:");
        firstText = new JTextField(10);
        secondText = new JTextField(10);
        result = new JTextField(10);

        operation = new JComboBox(new String[] {"+","-","*","/"});
        resultButton =new JButton("calculate");

    }

    @Override
    public void add(Container con) {
        GridLayout gl=new GridLayout(5,1);
        con.setLayout(gl);
        addNum(con);
        addOperation(con);
        addResult(con);


    }
    public  void addResult(Container con){
        JPanel panel =new JPanel();
        panel.add(resultButton);
        panel.add(resuleLabel);
        panel.add(result);
        con.add(panel);

    }
    public  void addOperation(Container con){
        JPanel panel =new JPanel();
        panel.add(operationLabel);
        panel.add(operation);
        con.add(panel);

    }
    public void  addNum(Container con){
        JPanel panel = new JPanel();
        panel.add(firstLabel);
        panel.add(firstText);
        panel.add(secondLable);
        panel.add(secondText);
        con.add(panel);
    }

    public  void calculate(){
        int a = Integer.parseInt(firstText.getText());
        int b=Integer.parseInt(secondText.getText());
        String operationOption = operation.getSelectedItem().toString();
        int c=0;
        if(operationOption.equals("+")) c=a+b;
        if(operationOption.equals("-")) c=a-b;
        if(operationOption.equals("*")) c=a*b;
        if(operationOption.equals("/")) c=a/b;
        String r = firstText.getText()+" "+operationOption+" "+secondText.getText()+"="+String.valueOf(c);
        result.setText(r);
       // firstText.setText("");
        //secondText.setText("");
    }
    @Override
    public void addListeners() {
        resultButton.addActionListener((e)->calculate());

    }

    public static void main(String args[]){
        new Calculator();
    }


}
