import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame{
  MyFrame() {
      // Jthis = a GUI window to add components to
    this.setTitle("JFrame title goes here"); // set title of this
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// there is DO_NOTHING_ON_CLOSE and HIDE_ON_CLOSE when press close button
    this.setResizable(true); // prevent this form being resized also we can't maximize it if its false
    this.setSize(420,420); // set x-dimension y-dimention
    this.setVisible(true); // make this visible
    
    ImageIcon image = new ImageIcon("/home/roms/Pictures/Wallpapers/edit.png"); // create an imageIcon
    this.setIconImage(image.getImage()); // change icon in this
    this.getContentPane().setBackground(new Color(101,0,123)); // change Color of background we can use pre defined sets using Color.green , Color.someColor to set hexadecimal value 0xFFFFFF
  }
}
