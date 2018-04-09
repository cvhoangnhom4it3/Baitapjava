package hoang;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class baic extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baic frame = new baic();
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
	public baic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhap vao so nguyen tu 0 - 9");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(70, 45, 199, 14);
		contentPane.add(lblNewLabel);
		
		txtN = new JTextField();
		txtN.setBounds(273, 43, 86, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JLabel lblKetQuaDoc = new JLabel("Ket qua doc so");
		lblKetQuaDoc.setForeground(Color.GREEN);
		lblKetQuaDoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKetQuaDoc.setBounds(70, 88, 133, 14);
		contentPane.add(lblKetQuaDoc);
		
		JTextArea txtA = new JTextArea();
		txtA.setBounds(70, 119, 289, 57);
		contentPane.add(txtA);
		
		JButton btnNewButton = new JButton("Doc");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int N = Integer.parseInt(txtN.getText());
				String dv;
				switch(N) {
				    case 1:dv ="Một";
				               break;
				    case 2:dv ="Hai";
				               break;
				    case 3:dv ="Ba";
		               break;
		            case 4:dv ="Bon";
		               break;
				    case 5:dv ="Nam";
		               break;
				    case 6:dv ="Sau";
		               break;
				    case 7:dv ="Bay";
		               break;
				    case 8:dv ="Tam";
		               break;
				    case 9:dv ="Chin";
		               break;
				    default : dv="";
				           break;
				}
				txtA.setText(dv);
				
			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(270, 85, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblBai = new JLabel("Bai 3");
		lblBai.setForeground(Color.ORANGE);
		lblBai.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBai.setBounds(24, 11, 46, 14);
		contentPane.add(lblBai);
	}
}