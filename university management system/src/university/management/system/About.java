package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        // Fullscreen window
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use a JPanel with BoxLayout for vertical alignment
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(new Color(252, 228, 210));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100)); // padding

        // Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/abouts.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setAlignmentX(Component.CENTER_ALIGNMENT);
        contentPanel.add(img);

        // Heading
        JLabel heading = new JLabel("<html><center>Vishweshwaraiah<br>Technical University</center></html>");
        heading.setFont(new Font("Tahoma", Font.BOLD, 48));
        heading.setForeground(new Color(50, 50, 150));
        heading.setAlignmentX(Component.CENTER_ALIGNMENT);
        heading.setBorder(BorderFactory.createEmptyBorder(30, 0, 30, 0));
        contentPanel.add(heading);

        // College Name
        JLabel name = new JLabel("PESITM Shimogga");
        name.setFont(new Font("Tahoma", Font.BOLD, 40));
        name.setAlignmentX(Component.CENTER_ALIGNMENT);
        contentPanel.add(name);

        // Email
        JLabel contact = new JLabel("pesitmshimogga@gmail.com");
        contact.setFont(new Font("Tahoma", Font.BOLD, 32));
        contact.setAlignmentX(Component.CENTER_ALIGNMENT);
        contact.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        contentPanel.add(contact);

        add(contentPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new About();
    }
}
