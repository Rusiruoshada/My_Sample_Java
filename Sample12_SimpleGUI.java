import javax.swing.*;
import java.util.*;

public class Sample12_SimpleGUI{
  public static void main(String[] args) {
   GetUserTasks userTask = new GetUserTasks();
      
    while(true) {
      int option = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: \n1. Add new task \n2. Delete Task \n3. View all Tasks \n4. Exit"));
      if(option == 4) break;
      if(option>4 || option<1){ 
        JOptionPane.showMessageDialog(null,"Invalid Input! Try only 1 to 4 numbers to get Results");
        continue;
      }
      switch(option) {
        case 1:
          String task = JOptionPane.showInputDialog("Enter task you want to add :");
          userTask.addTask(task);
          JOptionPane.showMessageDialog(null,"Add to List "+ task);
          continue;
        case 2:
          String removetask = JOptionPane.showInputDialog("Enter what task you want to Remove: ");
          userTask.removeTask(removetask);
          
          continue;
        case 3:
          userTask.getTaskList();
          continue;
        default:
      JOptionPane.showMessageDialog(null,"Invalid Input! Try again");
        continue;
        
      }
    }
    
  }
  
}
