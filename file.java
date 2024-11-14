import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Operator extends JFrame implements ActionListener {
    JLabel l, l2, l3;
    Font f;
    JButton b3, b4, b8;
    Container c1;

    Operator() {
        // Check if running in headless environment
        if (GraphicsEnvironment.isHeadless()) {
            System.err.println("Headless environment detected, GUI cannot be created.");
            return;
        }

        c1 = getContentPane();
        c1.setLayout(new FlowLayout());
        c1.setBackground(Color.LIGHT_GRAY);  // Corrected line to set the background

        f = new Font("Arial", Font.BOLD, 20);

        ImageIcon i = new ImageIcon("criminal1.jpg"); // Ensure this image path is correct

        l = new JLabel("Welcome, Chandu!!!!!!!!", JLabel.CENTER);
        l2 = new JLabel("Hi,", i, JLabel.LEADING);
        l3 = new JLabel("This is Operator", JLabel.CENTER);

        b3 = new JButton("Identifying Images");
        b4 = new JButton("Images from Database");
        b8 = new JButton("Drawing of Images");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        l.setForeground(new Color(100, 100, 100));
        l.setFont(new Font("Arial", Font.BOLD, 30));
        l2.setForeground(new Color(100, 100, 100));
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(new Color(0, 64, 64));
        l3.setFont(new Font("Arial", Font.BOLD, 20));

        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(0, 64, 64));
        b3.setFont(new Font("Arial", Font.BOLD, 15));

        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(0, 64, 64));
        b4.setFont(new Font("Arial", Font.BOLD, 15));

        b8.setForeground(Color.WHITE);
        b8.setBackground(new Color(0, 64, 64));
        b8.setFont(new Font("Arial", Font.BOLD, 15));

        b3.addActionListener(this);
        b4.addActionListener(this);
        b8.addActionListener(this);

        c1.add(l);
        c1.add(l2);
        c1.add(l3);
        c1.add(b4);
        c1.add(b3);
        c1.add(b8);

        setSize(500, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b3) {
            System.out.println("Face Framing page opening");
            FaceIdMain f1 = new FaceIdMain();
            f1.setSize(800, 800);
            f1.setVisible(true);
        }

        if (ae.getSource() == b4) {
            Retr r1 = new Retr();
            r1.setSize(600, 600);
            r1.setVisible(true);
        }

        if (ae.getSource() == b8) {
            Draw d1 = new Draw();
            d1.setSize(600, 400);
            d1.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Operator();
    }
}

// Placeholder class for FaceIdMain
class FaceIdMain extends JFrame {
    public FaceIdMain() {
        setTitle("Face Identification");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

// Placeholder class for Retr
class Retr extends JFrame {
    public Retr() {
        setTitle("Retrieve Images");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

// Placeholder class for Draw
class Draw extends JFrame {
    public Draw() {
        setTitle("Draw Images");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

       


      
       
