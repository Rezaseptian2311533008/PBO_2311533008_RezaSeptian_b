package Ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.CustomerRepo;
import DAO.UserRepo;
import Model.Customer;
import Model.User;
import table.TableCustomer;
import table.TableUser;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNama;
	private JTextField txtAlamat;
	private JTextField txtNoHP;
	private JTable tableCustomer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerFrame frame = new CustomerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	CustomerRepo cst = new CustomerRepo();
	List<Customer> ls;
	public String id;
	
	public void loadTable() {
		ls = cst.show();
		TableCustomer tu = new TableCustomer(ls);
		tableCustomer.setModel(tu);
		tableCustomer.getTableHeader().setVisible(true);
	}

	
	public void reset() {
		txtNama.setText("");
		txtAlamat.setText("");
		txtNoHP.setText("");
	}

	/**
	 * Create the frame.
	 */
	public CustomerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nama");
		lblNewLabel.setBounds(49, 45, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNama = new JTextField();
		txtNama.setColumns(10);
		txtNama.setBounds(105, 42, 295, 20);
		contentPane.add(txtNama);
		
		JLabel lblNewLabel_1 = new JLabel("Alamat");
		lblNewLabel_1.setBounds(49, 76, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtAlamat = new JTextField();
		txtAlamat.setColumns(10);
		txtAlamat.setBounds(105, 73, 295, 20);
		contentPane.add(txtAlamat);
		
		JLabel lblNewLabel_2 = new JLabel("NoHP");
		lblNewLabel_2.setBounds(49, 107, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNoHP = new JTextField();
		txtNoHP.setColumns(10);
		txtNoHP.setBounds(105, 104, 295, 20);
		contentPane.add(txtNoHP);
		
		JButton btnSave_1 = new JButton("Save");
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer customer = new Customer();
				customer.setNama(txtNama.getText());
				customer.setAlamat(txtAlamat.getText());
				customer.setNoHP(txtNoHP.getText());
				customer.setId(id);
				cst.update(customer);
				reset();
				loadTable();
			}
		});
		btnSave_1.setBounds(73, 148, 76, 23);
		contentPane.add(btnSave_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(159, 148, 76, 23);
		contentPane.add(btnUpdate);
		
		JButton btnSave = new JButton("Delete");
		btnSave.setBounds(245, 148, 76, 23);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(331, 148, 76, 23);
		contentPane.add(btnCancel);
		
		tableCustomer = new JTable();
		tableCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tableCustomer.setBounds(49, 185, 359, 202);
		contentPane.add(tableCustomer);
	}
}