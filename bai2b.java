package hoang;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai2b extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtMax;
	private JTextField txtMin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai2b frame = new bai2b();
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
	public bai2b() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSoSanh = new JLabel("SO SANH 3 SO");
		lblSoSanh.setForeground(Color.GREEN);
		lblSoSanh.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSoSanh.setBounds(160, 22, 112, 14);
		contentPane.add(lblSoSanh);
		
		JLabel lblNewLabel = new JLabel("So nhap vao");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(34, 45, 82, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(Color.CYAN);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblA.setBounds(34, 83, 24, 14);
		contentPane.add(lblA);
		
		txtA = new JTextField();
		txtA.setBounds(54, 80, 62, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(Color.RED);
		lblB.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblB.setBounds(142, 83, 33, 14);
		contentPane.add(lblB);
		
		txtB = new JTextField();
		txtB.setBounds(171, 80, 69, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblC.setForeground(Color.MAGENTA);
		lblC.setBounds(262, 83, 24, 14);
		contentPane.add(lblC);
		
		txtC = new JTextField();
		txtC.setBounds(311, 80, 63, 20);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		JButton btnTim = new JButton("Tim");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int A=Integer.parseInt(txtA.getText());
				int B=Integer.parseInt(txtB.getText());
				int C=Integer.parseInt(txtC.getText());
				if(A>B) {
					if(A>C) {
						txtMax.setText(String.valueOf(A));
						if(B>C) {
							txtMin.setText(String.valueOf(C));
						}
						else {
							txtMin.setText(String.valueOf(B));
						}
					}
					else{
						txtMax.setText(String.valueOf(C));
						txtMin.setText(String.valueOf(B));
					}
				}
				else {
					if(B>C) {
						txtMax.setText(String.valueOf(B));
						if(A>C) {
							txtMin.setText(String.valueOf(C));
						}
						else {
							txtMin.setText(String.valueOf(A));
						}
					}
					else {
						txtMax.setText(String.valueOf(C));
						txtMin.setText(String.valueOf(A));
					}
				}
			}
		});
		btnTim.setBackground(Color.ORANGE);
		btnTim.setForeground(Color.GREEN);
		btnTim.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTim.setBounds(106, 108, 69, 23);
		contentPane.add(btnTim);
		
		JLabel lblKetQua = new JLabel("Ket Qua");
		lblKetQua.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKetQua.setForeground(Color.BLUE);
		lblKetQua.setBounds(34, 140, 69, 14);
		contentPane.add(lblKetQua);
		
		JLabel lblSoLonNhat = new JLabel("So lon nhat");
		lblSoLonNhat.setForeground(Color.ORANGE);
		lblSoLonNhat.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSoLonNhat.setBounds(34, 177, 82, 14);
		contentPane.add(lblSoLonNhat);
		
		txtMax = new JTextField();
		txtMax.setBounds(126, 174, 86, 20);
		contentPane.add(txtMax);
		txtMax.setColumns(10);
		
		JLabel lblSoNhoNhat = new JLabel("So nho nhat");
		lblSoNhoNhat.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSoNhoNhat.setForeground(Color.ORANGE);
		lblSoNhoNhat.setBounds(240, 177, 88, 14);
		contentPane.add(lblSoNhoNhat);
		
		txtMin = new JTextField();
		txtMin.setBounds(338, 175, 86, 20);
		contentPane.add(txtMin);
		txtMin.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(Color.BLUE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
				txtMax.setText("");
				txtMin.setText("");
			}
		});
		btnReset.setBounds(240, 108, 89, 23);
		contentPane.add(btnReset);
	}

}