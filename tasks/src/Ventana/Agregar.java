package Ventana;



import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Agregar extends JFrame {
    

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Agregar frame = new Agregar();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Agregar() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 495);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(221, 160, 221));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setBounds(10, 10, 700, 496);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Agenda");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 35));
        lblNewLabel.setBackground(Color.WHITE);
        lblNewLabel.setBounds(148, 0, 120, 66);
        panel.add(lblNewLabel);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(419, 62, 226, 310);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Tarea a agregar");
        lblNewLabel_1.setBounds(12, 5, 167, 30);
        lblNewLabel_1.setForeground(new Color(221, 160, 221));
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_1.add(lblNewLabel_1);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(118, 183, 90, 21);
        panel_1.add(comboBox);

        textField = new JTextField();
        textField.setBounds(112, 140, 96, 19);
        panel_1.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(112, 57, 96, 19);
        panel_1.add(textField_1);
        textField_1.setColumns(10);

        JButton btnNewButton = new JButton("Agregar");
        btnNewButton.setBounds(68, 252, 101, 21);
        panel_1.add(btnNewButton);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(new Color(221, 160, 221));
        btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 15));

        JLabel lblNewLabel_2 = new JLabel("Fecha");
        lblNewLabel_2.setForeground(new Color(221, 160, 221));
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblNewLabel_2.setBounds(26, 139, 70, 16);
        panel_1.add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Tarea");
        lblNewLabel_2_1.setForeground(new Color(221, 160, 221));
        lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblNewLabel_2_1.setBounds(26, 56, 70, 16);
        panel_1.add(lblNewLabel_2_1);

        JLabel lblNewLabel_2_2 = new JLabel("Estado");
        lblNewLabel_2_2.setForeground(new Color(221, 160, 221));
        lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblNewLabel_2_2.setBounds(26, 183, 70, 16);
        panel_1.add(lblNewLabel_2_2);
        
        JLabel lblNewLabel_2_1_1 = new JLabel("Description");
        lblNewLabel_2_1_1.setForeground(new Color(221, 160, 221));
        lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 17));
        lblNewLabel_2_1_1.setBounds(10, 93, 112, 16);
        panel_1.add(lblNewLabel_2_1_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(112, 94, 96, 19);
        panel_1.add(textField_2);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(69, 76, 274, 302);
        panel.add(textArea);

        JButton btnNewButton_1 = new JButton("Volver");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Menu ventanaInicio = new Menu();
                ventanaInicio.setVisible(true);
            }
        });
        btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        btnNewButton_1.setForeground(new Color(221, 160, 221));
        btnNewButton_1.setBounds(525, 405, 120, 27);
        panel.add(btnNewButton_1);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
