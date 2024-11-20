import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Sample14_JFrame{
  public static void main(String[] args){
    // JFrame = a GUI window to add components to
    JFrame frame = new JFrame(); // this create a frame
    frame.setTitle("JFrame title goes here"); // set title of Frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// there is DO_NOTHING_ON_CLOSE and HIDE_ON_CLOSE when press close button
    frame.setResizable(true); // prevent frame form being resized also we can't maximize it if its false
    frame.setSize(420,420); // set x-dimension y-dimention
    frame.setVisible(true); // make frame visible
    
    ImageIcon image = new ImageIcon("/home/roms/Pictures/Wallpapers/edit.png"); // create an imageIcon
    frame.setIconImage(image.getImage()); // change icon in frame
    frame.getContentPane().setBackground(Color.green); // change Color of background
    
  }
}
