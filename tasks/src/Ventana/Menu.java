
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {
   

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu frame = new Menu();
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
    public Menu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(221, 160, 221));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setBounds(10, 10, 416, 243);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblMenu = new JLabel("Menu");
        lblMenu.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        lblMenu.setForeground(Color.WHITE);
        lblMenu.setBounds(172, 58, 80, 42);
        panel.add(lblMenu);

        JLabel lblNewLabel = new JLabel("Agenda");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 35));
        lblNewLabel.setBackground(Color.WHITE);
        lblNewLabel.setBounds(148, 0, 120, 66);
        panel.add(lblNewLabel);

        JButton btnNewButton = new JButton("Agregar");
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(new Color(221, 160, 221));
        btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Agregar agenda = new Agregar();
                agenda.setVisible(true);
            }
        });
        btnNewButton.setBounds(167, 127, 101, 21);
        panel.add(btnNewButton);

        JButton btnPendientes = new JButton("Pendientes");
        btnPendientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Pendientes grupo = new Pendientes();
                grupo.setVisible(true);
            }
        });
        btnPendientes.setForeground(Color.WHITE);
        btnPendientes.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        btnPendientes.setBackground(new Color(221, 160, 221));
        btnPendientes.setBounds(167, 175, 101, 21);
        panel.add(btnPendientes);
    }
}
