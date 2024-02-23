package Ventana;


import java.awt.*;
import javax.swing.JScrollPane;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Registro;
import Clases.Tarea;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Agregar extends JFrame {
    private Registro registro;

    private JPanel contentPane;
    private JTextField textField_fecha;
    private JTextField textField_Tarea;
    private JTextField textField_Descrip;

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
        registro = new Registro();
        
        
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

        
        

        textField_fecha = new JTextField();
        textField_fecha.setBounds(112, 140, 96, 19);
        panel_1.add(textField_fecha);
        textField_fecha.setColumns(10);

        textField_Tarea = new JTextField();
        textField_Tarea.setBounds(112, 57, 96, 19);
        panel_1.add(textField_Tarea);
        textField_Tarea.setColumns(10);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(68, 252, 101, 21);
        panel_1.add(btnAgregar);
        btnAgregar.setForeground(Color.WHITE);
        btnAgregar.setBackground(new Color(221, 160, 221));
        btnAgregar.setFont(new Font("Times New Roman", Font.ITALIC, 15));

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

        
        
        JLabel lblNewLabel_2_1_1 = new JLabel("Description");
        lblNewLabel_2_1_1.setForeground(new Color(221, 160, 221));
        lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 17));
        lblNewLabel_2_1_1.setBounds(10, 93, 112, 16);
        panel_1.add(lblNewLabel_2_1_1);
        
        textField_Descrip = new JTextField();
        textField_Descrip.setColumns(10);
        textField_Descrip.setBounds(112, 94, 96, 19);
        panel_1.add(textField_Descrip);

        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(78, 76, 274, 302);
        textArea.setEditable(false); 
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(78, 76, 274, 302);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        panel.add(scrollPane);

        textArea.setText(registro.toString());

        

        JButton btnVolver = new JButton("Volver");
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Menu ventanaInicio = new Menu();
                ventanaInicio.setVisible(true);
            }
        });
        btnVolver.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        btnVolver.setForeground(new Color(221, 160, 221));
        btnVolver.setBounds(525, 405, 120, 27);
        panel.add(btnVolver);
        btnAgregar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                String tarea = textField_Tarea.getText();
                String fecha = textField_fecha.getText();
                LocalDate fechaBien = LocalDate.parse(fecha);
                String detalles = textField_Descrip.getText();
                registro.addTarea(new Tarea(tarea,detalles,fechaBien));
                textArea.setText(registro.toString());
                textArea.revalidate();
                textArea.repaint();
               
            }
        });

    }


    
    





}
