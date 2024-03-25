/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validator;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class DataValidator {
    public static void validateEmpty(JTextField field, StringBuilder sb, String errorMessage)
    {
        if (field.getText().equals("")) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.setForeground(Color.white);
            field.requestFocus();
        } else {
            field.setBackground(Color.white);
            field.setForeground(Color.black);
        }
    }
    public static void validateEmpty(JPasswordField field, StringBuilder sb, String errorMessage)
    {
        String password = new String(field.getPassword());
        if(password.equals(""))
        {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.setForeground(Color.white);
            field.requestFocus();
        }
        else{
            field.setBackground(Color.white);
            field.setForeground(Color.black);
        }
    }
    public static boolean validateIsEmail(JTextField field, String errorMessage)
    {
        String txtValue = field.getText().trim();
        String strPtn = "^[a-zA-Z]\\w{2,}@\\w{2,}(\\.\\w{2,3}){1,2}$";
        if(!txtValue.matches(strPtn))
        {
            JOptionPane.showMessageDialog(null, errorMessage);
            field.setBackground(Color.YELLOW);
            field.requestFocus();
            return false;
        }
        field.setBackground(Color.WHITE);
        return true;
    }
    public static boolean validatePhone10(JTextField field, String errorMessage)
    {
        String txtValue = field.getText().trim();
        String strPtn = "^[0-9]{10}$";
        if(!txtValue.matches(strPtn))
        {
            JOptionPane.showMessageDialog(null, errorMessage);
            field.setBackground(Color.YELLOW);
            field.requestFocus();
            return false;
        }
        field.setBackground(Color.WHITE);
        return true;
    }
     public static boolean validateIsNumber(JTextField field, String errorMessage)
    {
        String txtValue = field.getText().trim();
        String strPtn = "^\\d{1,}";
        if(!txtValue.matches(strPtn))
        {
            JOptionPane.showMessageDialog(null, errorMessage);
            field.setBackground(Color.YELLOW);
            field.requestFocus();
            return false;
        }
        field.setBackground(Color.WHITE);
        return true;
    }
}
