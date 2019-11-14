package Assignment8.sis;

import Assignment5.Q5.Boardable;

import javax.swing.*;
import java.awt.*;

public class SisFrame extends BaseFrame {
    private JLabel nameLabel,IDLabel,genderLabel;
    private  JTextField nameText,IDText,genderText;
    private JButton add;
    private  JTable studentTable;
    private StudentsModel stumodel;
    private Students students;
    private  JScrollPane jScrollPane;
    private  BorderLayout bl;
    @Override
    public void create() {
         nameLabel = new JLabel("name");
         nameText = new JTextField(10);
        IDLabel = new JLabel("ID");
        IDText = new JTextField(10);
        genderLabel = new JLabel("gender");
        genderText = new JTextField(10);
         add =new JButton("add");
        students=new Students();
         try{
             stumodel = new StudentsModel(students);
         }catch (Exception e){}
         studentTable = new JTable(stumodel);
         jScrollPane=new JScrollPane(studentTable);
         bl = new BorderLayout();



    }

    @Override
    public void add(Container con) {

        con.setLayout(bl);
        con.add(jScrollPane,"South");

        Panel panel=new Panel();
        con.add(panel,"North");


        addLabel(con,panel);

        addButton(con,panel);

    }
    public void addButton(Container con,Panel panel){

        panel.add(add);
    }


    public void addLabel(Container con,Panel panel){

        panel.add(nameLabel);
        panel.add(nameText);
        panel.add(IDLabel);
        panel.add(IDText);
        panel.add(genderLabel);
        panel.add(genderText);
        con.add(panel);
    }
    public void addStudent(){
        String name= nameText.getText();
        String ID =IDText.getText();
        String gender = genderText.getText();
        Student s = new Student(name,ID,gender);
        students.add(s);
        nameText.setText("");
        genderText.setText("");
        IDText.setText("");
        studentTable.updateUI();



    }



    @Override
    public void addListeners() {
        add.addActionListener((e)->addStudent());


    }

    public static  void main(String[] args){
        new SisFrame();
    }
}
