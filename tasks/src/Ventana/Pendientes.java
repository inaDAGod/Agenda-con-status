package Ventana;



import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Registro;
import Clases.Tarea;

import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Pendientes extends JFrame {
	private Registro registro;


    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Pendientes frame = new Pendientes();
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
    public Pendientes() {
    	registro = new  Registro();
    	
    	Tarea t= new Tarea("nombre", "detalle", LocalDate.now(),"Pendiente");
        registro.addTarea(t);
        Tarea ta= new Tarea("nombre", "detalle", LocalDate.now(),"Pendiente");
        ta.setCompletado();
        registro.addTarea(ta);
        Tarea tf= new Tarea("nombre", "detalle", LocalDate.now(),"Pendiente");
        tf.setEnCurso();
        registro.addTarea(tf);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 784, 580);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(221, 160, 221));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setBounds(10, 10, 750, 523);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Agenda agrupado");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 35));
        lblNewLabel.setBackground(Color.WHITE);
        lblNewLabel.setBounds(69, 10, 274, 66);
        panel.add(lblNewLabel);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(419, 60, 252, 107);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Estados a Buscar");
        lblNewLabel_1.setBounds(23, 10, 190, 30);
        lblNewLabel_1.setForeground(new Color(221, 160, 221));
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_1.add(lblNewLabel_1);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(77, 76, 101, 21);
        panel_1.add(btnBuscar);
        btnBuscar.setForeground(Color.WHITE);
        btnBuscar.setBackground(new Color(221, 160, 221));
        btnBuscar.setFont(new Font("Times New Roman", Font.ITALIC, 15));

       


        JLabel lblNewLabel_2_2 = new JLabel("Estado");
        lblNewLabel_2_2.setForeground(new Color(221, 160, 221));
        lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblNewLabel_2_2.setBounds(10, 50, 70, 16);
        panel_1.add(lblNewLabel_2_2);
        
        
        JComboBox<String> comboBox_estado = new JComboBox<>(new String[] {"TODO","PENDIENTE", "EN CURSO", "COMPLETADA"});
        comboBox_estado.setBounds(123, 50, 90, 21);
        panel_1.add(comboBox_estado);

        JTextArea textArea = new JTextArea();
        textArea.setText(registro.toString());
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
        btnNewButton_1.setBounds(565, 467, 120, 27);
        panel.add(btnNewButton_1);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBounds(419, 340, 252, 100);
        panel.add(panel_1_1);

        JLabel lblNewLabel_1_1 = new JLabel("Tarea a Borrar");
        lblNewLabel_1_1.setForeground(new Color(221, 160, 221));
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        lblNewLabel_1_1.setBounds(47, 0, 161, 30);
        panel_1_1.add(lblNewLabel_1_1);

        JComboBox comboBox_tarea = new JComboBox();
        comboBox_tarea.setBounds(132, 40, 90, 21);
        panel_1_1.add(comboBox_tarea);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setForeground(Color.WHITE);
        btnEliminar.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        btnEliminar.setBackground(new Color(221, 160, 221));
        btnEliminar.setBounds(63, 71, 101, 21);
        panel_1_1.add(btnEliminar);

        JLabel lblNewLabel_2_2_1 = new JLabel("Tarea");
        lblNewLabel_2_2_1.setForeground(new Color(221, 160, 221));
        lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblNewLabel_2_2_1.setBounds(28, 40, 70, 16);
        panel_1_1.add(lblNewLabel_2_2_1);
        
        JPanel panel_cambiares = new JPanel();
        panel_cambiares.setBounds(419, 182, 252, 146);
        panel.add(panel_cambiares);
        panel_cambiares.setLayout(null);
        
        JLabel lblNewLabel_2_2_2 = new JLabel("Estado");
        lblNewLabel_2_2_2.setBounds(26, 39, 58, 24);
        lblNewLabel_2_2_2.setForeground(new Color(221, 160, 221));
        lblNewLabel_2_2_2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        panel_cambiares.add(lblNewLabel_2_2_2);
        
        JLabel lblNewLabel_1_2 = new JLabel("Cambiar Estado");
        lblNewLabel_1_2.setBounds(26, 0, 177, 30);
        lblNewLabel_1_2.setForeground(new Color(221, 160, 221));
        lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_cambiares.add(lblNewLabel_1_2);
        
        JComboBox comboBox_estados2 = new JComboBox();
        comboBox_estados2.setBounds(113, 43, 90, 21);
        panel_cambiares.add(comboBox_estados2);
        
        JButton btnCambiar = new JButton("Cambiar");
        btnCambiar.setForeground(Color.WHITE);
        btnCambiar.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        btnCambiar.setBackground(new Color(221, 160, 221));
        btnCambiar.setBounds(71, 115, 101, 21);
        panel_cambiares.add(btnCambiar);
        
        JLabel lblNewLabel_2_2_1_1 = new JLabel("Tarea");
        lblNewLabel_2_2_1_1.setForeground(new Color(221, 160, 221));
        lblNewLabel_2_2_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblNewLabel_2_2_1_1.setBounds(28, 89, 70, 16);
        panel_cambiares.add(lblNewLabel_2_2_1_1);
        
        JComboBox comboBox_tarea2 = new JComboBox();
        comboBox_tarea2.setBounds(113, 84, 90, 21);
        panel_cambiares.add(comboBox_tarea2);
        
        JLabel lblNewLabel_1_3 = new JLabel("Opciones");
        lblNewLabel_1_3.setForeground(Color.WHITE);
        lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        lblNewLabel_1_3.setBounds(495, 20, 190, 30);
        panel.add(lblNewLabel_1_3);
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(comboBox_estado.getSelectedItem().toString().equals("PENDIENTE")){
                    textArea.setText(registro.getPendientes());
                    
                }

                if(comboBox_estado.getSelectedItem().toString().equals("TODO")){
                    textArea.setText(registro.toString());
                    
                }
                if(comboBox_estado.getSelectedItem().toString().equals("EN CURSO")){
                    textArea.setText(registro.getEnCurso());
                    
                }
                if(comboBox_estado.getSelectedItem().toString().equals("COMPLETADA")){
                    textArea.setText(registro.getCompletada());
                    
                }
                textArea.revalidate();
                textArea.repaint();

  
            }
        });

    }
}
