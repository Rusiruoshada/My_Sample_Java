import java.util.*;
import javax.swing.*;

public class GetUserTasks{

  private ArrayList<String> task = new ArrayList<>();
  
  public GetUserTasks() {}
  
  public void addTask(String task){
    this.task.add(task);
  }
  
  public void getTaskList() {
      StringBuilder message = new StringBuilder();
      if(this.task.size() > 1) {
         for( int i = 0; i < this.task.size(); i++)
            message.append(task.get(i)).append("\n");
       JOptionPane.showMessageDialog(null,message.toString());
      }else
        JOptionPane.showMessageDialog(null, "No Task to view");
      
  }
  
  public void removeTask(String task){
    task.trim();
    if(this.task.contains(task)){
      this.task.remove(task);
      JOptionPane.showMessageDialog(null,"Remove form List "+ task);
    }else
      JOptionPane.showMessageDialog(null,"No Task as "+ task);
  }
  
  
  
  
}
