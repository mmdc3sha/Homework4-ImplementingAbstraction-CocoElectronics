package CocoElectronics;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CocoSalesCalculatorGUI extends CocoSalesCalculator{

    public CocoSalesCalculatorGUI(){

        super("",0,0,"",0, 0);


        JFrame frame = new JFrame();
        frame.setTitle("Coco Daily Sales Calculator");
        frame.setSize(1154,800);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(255,255,255));
        frame.setResizable(false);


        //PANEL FOR HEADER
        JPanel panel = new JPanel();
        panel.setSize(1154,90);
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

        // JLABEL FOR AUTHOR NAME
        JLabel createdBy =  new JLabel();
        createdBy.setFont(new Font("Helvetica CY", Font.BOLD,14));
        createdBy.setText("By Trisha Quismundo");
        createdBy.setForeground(Color.white);
        createdBy.setHorizontalAlignment(SwingConstants.LEFT);
        createdBy.setBounds(20, 55,300,16);
        panel.add(createdBy);


        //---- Labels for the TextFields---
        //Assigned Font for Each Label:
        Font fontLabel = new Font("Monospaced", Font.PLAIN,20);
        JLabel phoneNameLabel = new JLabel();
        phoneNameLabel.setText("Phone Name:");
        phoneNameLabel.setBounds(20,115,138,25);
        phoneNameLabel.setFont(fontLabel);
        phoneNameLabel.setForeground(Color.black);

        JLabel priceLabel = new JLabel();
        priceLabel.setText("Price:");
        priceLabel.setBounds(20,193,158,25);
        priceLabel.setFont(fontLabel);
        phoneNameLabel.setForeground(Color.black);

        JLabel quantityLabel = new JLabel();
        quantityLabel.setText("Quantity Sold:");
        quantityLabel.setBounds(20,274,200,25);
        quantityLabel.setFont(fontLabel);
        quantityLabel.setForeground(Color.black);

        JLabel serviceNameLabel = new JLabel();
        serviceNameLabel.setText("Service Name:");
        serviceNameLabel.setFont(fontLabel);
        serviceNameLabel.setBounds(600,115,200,25);
        serviceNameLabel.setForeground(Color.black);

        JLabel feePerHourLabel = new JLabel();
        feePerHourLabel.setText("Fee/hr:");
        feePerHourLabel.setFont(fontLabel);
        feePerHourLabel.setBounds(600,193,138,25);
        feePerHourLabel.setForeground(Color.black);

        JLabel hoursOfServiceLabel = new JLabel();
        hoursOfServiceLabel.setText("Service Hour(s):");
        hoursOfServiceLabel.setFont(fontLabel);
        hoursOfServiceLabel.setBounds(600,274,200,25);
        hoursOfServiceLabel.setForeground(Color.black);

        JLabel totalLabel = new JLabel();
        totalLabel.setText("TOTAL");
        totalLabel.setFont(new Font("Helvetica", Font.BOLD,36));
        totalLabel.setForeground(Color.black);

        //-----Input Fields-----//
        Font inputFont = new Font("Monospaced", Font.PLAIN, 20);
        JTextField inputPhoneName = new JTextField();
        inputPhoneName.setToolTipText("Enter Phone Name:");
        inputPhoneName.setSize(355,42);
        inputPhoneName.setBounds(20,145,355,42);
        inputPhoneName.setFont(inputFont);
        inputPhoneName.setBackground(new Color(217,217,217));
        inputPhoneName.setBorder(null);

        JTextField inputPrice = new JTextField();
        inputPrice.setToolTipText("Enter Price:");
        inputPrice.setBounds(20,224,355,42);
        inputPrice.setFont(inputFont);
        inputPrice.setBackground(new Color(217,217,217));
        inputPrice.setBorder(null);

        JTextField inputQuantity = new JTextField();
        inputQuantity.setToolTipText("Enter Quantity:");
        inputQuantity.setBounds(20, 310,355,42);
        inputQuantity.setFont(inputFont);
        inputQuantity.setBackground(new Color(217,217,217));
        inputQuantity.setBorder(null);

        JTextField inputServiceName = new JTextField();
        inputServiceName.setToolTipText("Enter Service Name:");
        inputServiceName.setBounds(600, 145,355,42);
        inputServiceName.setFont(inputFont);
        inputServiceName.setBackground(new Color(217,217,217));
        inputServiceName.setBorder(null);

        JTextField inputFee = new JTextField();
        inputFee.setToolTipText("Enter Fee:");
        inputFee.setBounds(600, 224,355,42);
        inputFee.setFont(inputFont);
        inputFee.setBackground(new Color(217,217,217));
        inputFee.setBorder(null);

        JTextField inputHours = new JTextField();
        inputHours.setToolTipText("Enter Hours:");
        inputHours.setBounds(600, 310,355,42);
        inputHours.setFont(inputFont);
        inputHours.setBackground(new Color(217,217,217));
        inputHours.setBorder(null);

        //TABLE FOR PHONE SALES
        String[] phoneSalesColumns = {"Phone Name", "Price", "Quantity Sold", "Total"};
        DefaultTableModel phoneSalesModel = new DefaultTableModel(phoneSalesColumns, 0);
        JTable phoneSalesTable = new JTable(phoneSalesModel);
        JScrollPane phoneSalesScrollPane = new JScrollPane(phoneSalesTable);
        phoneSalesScrollPane.setBounds(20, 400, 550, 330);

        // Service Fees Table
        String[] serviceFeesColumns = {"Service Name", "Fee/hr", "Service Hours", "Total"};
        DefaultTableModel serviceFeesModel = new DefaultTableModel(serviceFeesColumns, 0);
        JTable serviceFeesTable = new JTable(serviceFeesModel);
        JScrollPane serviceFeesScrollPane = new JScrollPane(serviceFeesTable);
        serviceFeesScrollPane.setBounds(600, 400, 520, 330);

        //CALCULATE PHONE SALES BUTTON
        JButton calculateButton = new JButton();
        calculateButton.setText("Total Sales");
        calculateButton.setFont(new Font("Helvetica", Font.PLAIN,14));
        calculateButton.setBounds(385,310,120,40);
        calculateButton.setBorder(new LineBorder(Color.blue));
        calculateButton.setBackground(new Color(0,102,51));
        calculateButton.setForeground(Color.white);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double phonePrice = Double.parseDouble(inputPrice.getText());
                int phoneQuantity = Integer.parseInt(inputQuantity.getText());
                double phoneTotal = phonePrice * phoneQuantity;
                phoneSalesModel.addRow(new Object[]{inputPhoneName.getText(), phonePrice, phoneQuantity, phoneTotal});
            }
        });


        JButton calculateServiceFeesBtn = new JButton();
        calculateServiceFeesBtn.setText("Total Fees");
        calculateServiceFeesBtn.setBounds(960,310,120,40);
        calculateServiceFeesBtn.setFont(new Font("Helvetica", Font.PLAIN,14));
        calculateServiceFeesBtn.setBorder(new LineBorder(Color.blue));
        calculateServiceFeesBtn.setForeground(Color.white);
        calculateServiceFeesBtn.setBackground(new Color(0,102,51));
        calculateServiceFeesBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double serviceFee = Double.parseDouble(inputFee.getText());
                double serviceHours = Double.parseDouble(inputHours.getText());
                double serviceTotal = serviceFee * serviceHours;
                serviceFeesModel.addRow(new Object[]{inputServiceName.getText(), serviceFee, serviceHours, serviceTotal});
            }
        });



        //RESET BUTTON
        JButton resetButton = new JButton();
        resetButton.setBounds(275,115,100,25);
        resetButton.setText("RESET");
        resetButton.setBackground(Color.black);
        resetButton.setForeground(Color.white);

        resetButton.addActionListener(new ActionListener() {// When the action is performed the textfield reverts back to empty
            @Override
            public void actionPerformed(ActionEvent e) {
                inputPhoneName.setText("");
                inputPrice.setText("");
                inputQuantity.setText("");
            }
        });

        JButton resetFeesBtn = new JButton();
        resetFeesBtn.setBounds(856,115,100,25);
        resetFeesBtn.setText("RESET");
        resetFeesBtn.setBackground(Color.black);
        resetFeesBtn.setForeground(Color.white);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputHours.setText("");
                inputFee.setText("");
                inputServiceName.setText("");
            }
        });

        // ADD COMPONENTS TO THE FRAME
        frame.add(calculateServiceFeesBtn);
        frame.add(resetButton);
        frame.add(calculateButton);
        frame.add(inputPhoneName);
        frame.add(inputPrice);
        frame.add(inputQuantity);
        frame.add(inputPrice);
        frame.add(inputFee);
        frame.add(inputServiceName);
        frame.add(inputHours);
        frame.add(phoneNameLabel);
        frame.add(quantityLabel);
        frame.add(serviceNameLabel);
        frame.add(feePerHourLabel);
        frame.add(hoursOfServiceLabel);
        frame.add(totalLabel);
        frame.add(priceLabel);
        frame.add(panel);
        frame.add(phoneSalesScrollPane);
        frame.add(serviceFeesScrollPane);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CocoSalesCalculatorGUI::new);
    }

}