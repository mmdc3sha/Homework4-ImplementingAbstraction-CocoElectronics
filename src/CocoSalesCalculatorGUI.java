import javax.swing.*;
import java.awt.*;

public class CocoSalesCalculatorGUI {
    public CocoSalesCalculatorGUI(){
        JFrame frame = new JFrame();
        frame.setTitle("Coco Daily Sales Calculator");
        frame.setSize(796,761);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setSize(796,90);
        panel.setBackground(new Color(0,0,0));
        panel.setLayout(null);

        // STORE NAME: COCO ELECTRONICS
        JLabel storeName = new JLabel();
        Font storeNameFont = new Font("Helvetica", Font.BOLD, 28);
        storeName.setFont(storeNameFont);
        storeName.setText("Coco Electronics");
        storeName.setForeground(Color.white);
        storeName.setHorizontalAlignment(SwingConstants.LEFT); // Align text to the left
        storeName.setBounds(20, 20, 500, 32);
        panel.add(storeName);

        JLabel createdBy =  new JLabel();
        createdBy.setFont(new Font("Helvetica CY", Font.BOLD,14));
        createdBy.setText("By Trisha Quismundo");
        createdBy.setForeground(Color.white);
        createdBy.setHorizontalAlignment(SwingConstants.LEFT);
        createdBy.setBounds(20, 55,300,16);
        panel.add(createdBy);

        // ADD COMPONENTS TO THE FRAME
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the frame is closed
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CocoSalesCalculatorGUI::new);
    }
}