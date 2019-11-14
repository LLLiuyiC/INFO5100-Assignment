package Assignment8.sis;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.io.IOException;

public class StudentsModel implements TableModel {
    private Students S;


    public StudentsModel(Students s){
        this.S=s;
        Student s0 = new Student("Lily","2019111101","Female") ;
        Student s1=new Student("Tom","2019111302","Male");
        s.add(s0);
        s.add(s1);
    }
    public StudentsModel(){

    }

    @Override
    public int getRowCount() {
        return S.getStudentCount();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex==0)return "NO";
        else if(columnIndex==1) return "ID";
        else if(columnIndex==2) return "Name";
        else  return "Gender";

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student s = S.getStudents().get(rowIndex);
        if(columnIndex==0) return rowIndex+1;
        else if(columnIndex==1) return s.getName();
        else if(columnIndex==2) return s.getID();
        else  return s.getGender();
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
