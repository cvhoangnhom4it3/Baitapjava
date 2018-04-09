package hoang;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.io.Closeable;
import java.awt.event.ActionEvent;

public class baia extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtTong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baia frame = new baia();
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
	public baia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhapN = new JLabel("Nhap N ");
		lblNhapN.setForeground(Color.BLUE);
		lblNhapN.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNhapN.setBounds(39, 51, 60, 14);
		contentPane.add(lblNhapN);
		
		txtN = new JTextField();
		txtN.setBounds(150, 49, 181, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JLabel lblTong = new JLabel("Tong");
		lblTong.setForeground(Color.BLUE);
		lblTong.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTong.setBounds(39, 92, 46, 14);
		contentPane.add(lblTong);
		
		txtTong = new JTextField();
		txtTong.setBounds(150, 90, 181, 20);
		contentPane.add(txtTong);
		txtTong.setColumns(10);
		
		JButton btnTinh = new JButton("Tinh");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int N =Integer.parseInt(txtN.getText());
				int s=0;
				for(int i=0;i<=N;i++) {
					s=s+i;
				}
				txtTong.setText( String.valueOf(s));
			}
		});
		btnTinh.setForeground(UIManager.getColor("Button.disabledForeground"));
		btnTinh.setBackground(Color.GREEN);
		btnTinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTinh.setBounds(150, 160, 69, 23);
		contentPane.add(btnTinh);
		
		JButton btnThoat = new JButton("Thoat");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		btnThoat.setBackground(Color.GREEN);
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThoat.setBounds(249, 160, 82, 23);
		contentPane.add(btnThoat);
		
		JLabel lblBai = new JLabel("Bai 1");
		lblBai.setForeground(Color.GREEN);
		lblBai.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBai.setBounds(10, 11, 46, 14);
		contentPane.add(lblBai);
	}
}
