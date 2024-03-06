package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExecutar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton,btnCancelar,btnProcurar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExecutar frame = new TelaExecutar();
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
	public TelaExecutar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(57, 142, 353, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Abrir:");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 145, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite o caminho ou clique em Procurar");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		lblNewLabel_1.setBounds(104, 27, 278, 53);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("OK");
		btnNewButton.setBackground(new Color(0, 64, 128));
		btnNewButton.setBounds(39, 209, 89, 23);
		contentPane.add(btnNewButton);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(204, 0, 0));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(172, 209, 89, 23);
		contentPane.add(btnCancelar);
		
		btnProcurar = new JButton("Procurar");
		btnProcurar.setBackground(new Color(0, 153, 153));
		btnProcurar.setBounds(293, 209, 89, 23);
		contentPane.add(btnProcurar);
	}
}
