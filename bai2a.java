package hoang;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai2a extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtMax;
	private JTextField txtMin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai2a frame = new bai2a();
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
	public bai2a() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSoNhspVao = new JLabel("So nhap vao");
		lblSoNhspVao.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSoNhspVao.setForeground(Color.BLUE);
		lblSoNhspVao.setBounds(38, 48, 99, 14);
		contentPane.add(lblSoNhspVao);
		
		JLabel lblNewLabel = new JLabel("A");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(38, 83, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblB.setBounds(221, 83, 46, 14);
		contentPane.add(lblB);
		
		txtA = new JTextField();
		txtA.setBounds(76, 81, 86, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(260, 80, 86, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnTim = new JButton("Tim");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int A =Integer.parseInt(txtA.getText());
				int B =Integer.parseInt(txtB.getText());
				if(A>B) {
					txtMax.setText(String.valueOf(A));
				}
				else{
					txtMin.setText(String.valueOf(A));	
				}
				if(B>A) {
					txtMax.setText(String.valueOf(B));
				}
				else {
					txtMin.setText(String.valueOf(B));	
				}
			}
			
		});
		btnTim.setForeground(Color.BLUE);
		btnTim.setBackground(Color.CYAN);
		btnTim.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTim.setBounds(95, 123, 67, 23);
		contentPane.add(btnTim);
		
		JLabel lblKetQua = new JLabel("Ket qua");
		lblKetQua.setForeground(Color.BLUE);
		lblKetQua.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKetQua.setBounds(38, 149, 67, 14);
		contentPane.add(lblKetQua);
		
		JLabel lblSoLonNhat = new JLabel("So lon nhat");
		lblSoLonNhat.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSoLonNhat.setForeground(Color.RED);
		lblSoLonNhat.setBounds(38, 179, 78, 14);
		contentPane.add(lblSoLonNhat);
		
		txtMax = new JTextField();
		txtMax.setBounds(126, 176, 86, 20);
		contentPane.add(txtMax);
		txtMax.setColumns(10);
		
		JLabel lblSoNhoNhat = new JLabel("So nho nhat");
		lblSoNhoNhat.setForeground(Color.RED);
		lblSoNhoNhat.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSoNhoNhat.setBounds(230, 179, 83, 14);
		contentPane.add(lblSoNhoNhat);
		
		txtMin = new JTextField();
		txtMin.setBounds(323, 177, 86, 20);
		contentPane.add(txtMin);
		txtMin.setColumns(10);
		
		JLabel lblSoSanh = new JLabel("SO SANH");
		lblSoSanh.setForeground(Color.GREEN);
		lblSoSanh.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSoSanh.setBounds(159, 11, 108, 14);
		contentPane.add(lblSoSanh);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtMax.setText("");
				txtMin.setText("");
			}
		});
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(257, 124, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblBaia = new JLabel("Bai 2a");
		lblBaia.setForeground(Color.GREEN);
		lblBaia.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBaia.setBounds(23, 13, 46, 14);
		contentPane.add(lblBaia);
	}

}