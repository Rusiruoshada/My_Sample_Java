import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;

public class Working_With_Lables extends JFrame{
  Working_With_Lables(){
    JLabel label = new JLabel(); // create a label we can give strings or images
    label.setText("Bro, this is a label"); // set text of label
    label.setHorizontalTextPosition(JLabel.CENTER); // set text left center or right of imageIcon
    label.setVerticalTextPosition(JLabel.TOP); // this will set text TOP BOTTOM or CENTER
    label.setForeground(new Color(100,100,221)); // set text color
    label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font to our text
    label.setIconTextGap(23); // set gap between to other element
    label.setBackground(new Color(21,32,12)); // set background color label will take all space so color will show everywhere
    label.setOpaque(true); // to display the background color set this to true 
    label.setVerticalAlignment(JLabel.CENTER); // set vertical position icon and text to CENTER (TOP , BOTTOM)
    label.setHorizontalAlignment(JLabel.CENTER);// set horizontal position of icon and text to CENTER ( TOP, BOTTOm)
    // label.setBounds(0,0, 150,150); // set (x y sizeX sizeY)
    
    Border border = BorderFactory.createLineBorder(Color.green,3); // create a border
    label.setBorder(border); // set border to label
    
    ImageIcon imageIcon = new ImageIcon("/home/roms/Pictures/iamgeJava.jpeg");
    label.setIcon(imageIcon);
    
    this.add(label);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // this.setSize(500,500);
    this.setVisible(true);
    // this.setLayout(null);
    this.pack(); // resize to fit to component also remember to add this in last other wise it not work properly
  }
}
