package Ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Laundry Apps");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(32, 38, 164, 43);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PESANAN");
		btnNewButton.setBounds(32, 102, 89, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LAYANAN");
		btnNewButton_1.setBounds(170, 102, 89, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PELANGGAN");
		btnNewButton_2.setBounds(314, 102, 112, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PENGGUNA");
		btnNewButton_3.setBounds(32, 178, 89, 50);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("LAPORAN");
		btnNewButton_4.setBounds(170, 178, 89, 50);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("PROFILE");
		btnNewButton_5.setBounds(314, 178, 112, 50);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("KELUAR");
		btnNewButton_6.setBounds(32, 250, 394, 43);
		contentPane.add(btnNewButton_6);
	}

}
