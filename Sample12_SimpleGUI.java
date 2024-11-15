import javax.swing.*;

public class Sample12_SimpleGUI{
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter task you want to add :");
    JOptionPane.showMessageDialog(null, "Hello "+ name);
  }
  
}
