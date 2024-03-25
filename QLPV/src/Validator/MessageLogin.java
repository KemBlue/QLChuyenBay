/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validator;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class MessageLogin {
    public static void showMessageDangnhap(Component parent, String content, String title)
    {
        JOptionPane.showMessageDialog(parent, content, title, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void showErrorDangnhap(Component parent, String content , String title)
    {
        JOptionPane.showMessageDialog(parent, content, title, JOptionPane.ERROR_MESSAGE);
    }
    public static int showConfirmDangnhap(Component parent , String content , String title)
    {
        int choose = JOptionPane.showConfirmDialog(parent, content, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return choose;
    }
}
