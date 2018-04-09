package hoang;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class baid extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baid frame = new baid();
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
	public baid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhapVaoSo = new JLabel("Nhap vao so nguyen N");
		lblNhapVaoSo.setForeground(Color.GREEN);
		lblNhapVaoSo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNhapVaoSo.setBounds(70, 37, 202, 14);
		contentPane.add(lblNhapVaoSo);
		
		txtN = new JTextField();
		txtN.setBounds(297, 34, 86, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JTextArea txtA = new JTextArea();
		txtA.setBounds(70, 120, 313, 54);
		contentPane.add(txtA);
		
		JLabel lblKetQuaDoc = new JLabel("Ket qua doc so");
		lblKetQuaDoc.setForeground(Color.GREEN);
		lblKetQuaDoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKetQuaDoc.setBounds(70, 84, 123, 14);
		contentPane.add(lblKetQuaDoc);
		
		JButton btnDoc = new JButton("Doc");
		btnDoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDoc.setForeground(Color.BLUE);
		btnDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int N = Integer.parseInt(txtN.getText());
				int hangtram = N/100;
				String tram ="";
				int hangdv = N%10;
				String dv;
				int hangchuc = N/10%10;
				String chuc;
				switch(hangtram) {
			    case 1:tram ="Một trăm";
			               break;
			    case 2:tram ="Hai trăm";
			               break;
			    default : dv="";
			           break;
				}
				
				switch(hangchuc) {
			        case 1:chuc ="Muoi";
			                   break;
			        case 2:chuc ="Hai muoi";
			                   break;
			        case 3:chuc ="Ba muoi";
	                   break;
			        default : chuc="";
			           break;
				}
				switch(hangdv) {
			    case 1:dv ="Một";
			               break;
			    case 2:dv ="Hai";
			               break;
			    case 3:dv ="Ba";
                break;
			    default : dv="";
			           break;
			}
				txtA.setText(tram +" "+chuc +" "+ dv);
			}
			
		});
		btnDoc.setBounds(297, 80, 75, 23);
		contentPane.add(btnDoc);
		
		
		
		JLabel lblBai = new JLabel("Bai 4");
		lblBai.setForeground(Color.GREEN);
		lblBai.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBai.setBounds(10, 11, 46, 14);
		contentPane.add(lblBai);
	}

}
