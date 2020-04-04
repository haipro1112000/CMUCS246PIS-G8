package dientichhcn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HinhChuNhat extends JFrame {

	private JPanel contentPane;
	private JTextField chieudai;
	private JTextField chieurong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HinhChuNhat frame = new HinhChuNhat();
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
	public HinhChuNhat() {
		setTitle("Di\u1EC7n t\u00EDch h\u00ECnh ch\u1EEF nh\u1EADt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Di\u1EC7n t\u00EDch h\u00ECnh ch\u1EEF nh\u1EADt");
		lblNewLabel.setBounds(150, 33, 191, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chi\u1EC1u d\u00E0i");
		lblNewLabel_1.setBounds(58, 69, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chi\u1EC1u r\u1ED9ng");
		lblNewLabel_2.setBounds(58, 106, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("k\u1EBFt qu\u1EA3");
		lblNewLabel_3.setBounds(58, 148, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		chieudai = new JTextField();
		chieudai.setBounds(160, 66, 86, 20);
		contentPane.add(chieudai);
		chieudai.setColumns(10);
		
		chieurong = new JTextField();
		chieurong.setBounds(160, 103, 86, 20);
		contentPane.add(chieurong);
		chieurong.setColumns(10);
		
		JLabel ketqua = new JLabel("");
		ketqua.setBounds(162, 148, 84, 25);
		contentPane.add(ketqua);
		
		JButton thuchien = new JButton("Th\u1EF1c Hi\u1EC7n");
		thuchien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
		            if (chieudai.getText().equals(""))
		                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập giá trị Chiều dài!!");
		            else if(Double.parseDouble(chieudai.getText()) <= 0)
		                JOptionPane.showMessageDialog(rootPane, "Giá trị chiều dài không hợp lệ!!");
		            else
		                Double.parseDouble(chieudai.getText());
		        } catch (NumberFormatException e) {
		    // xử lý khi số nhập vào ko đúng
		            JOptionPane.showMessageDialog(rootPane, "Giá trị không hợp lệ!!");
		        }
		        try {
		            if (chieurong.getText().equals(""))
		                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập giá trị Chiều Rộng!!");
		            else if(Double.parseDouble(chieurong.getText()) <= 0)
		                JOptionPane.showMessageDialog(rootPane, "Giá trị chiều rộng không hợp lệ!!");
		            else
		                Double.parseDouble(chieurong.getText());
		        } catch (NumberFormatException e) {
		    // xử lý khi số nhập vào ko đúng
		            JOptionPane.showMessageDialog(rootPane, "Giá trị không hợp lệ!!");
		        }
				
				
				Control a = new Control(Double.parseDouble(chieudai.getText()),Double.parseDouble(chieurong.getText()));
				ketqua.setText(a.sovle());
			}
		});
		thuchien.setBounds(32, 202, 89, 23);
		contentPane.add(thuchien);
		
		JButton xoa = new JButton("x\u00F3a");
		xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chieudai.setText("");
				chieurong.setText("");
				ketqua.setText("");
			}
		});
		xoa.setBounds(150, 202, 89, 23);
		contentPane.add(xoa);
		
		JButton thoat = new JButton("tho\u00E1t");
		thoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		thoat.setBounds(280, 202, 89, 23);
		contentPane.add(thoat);
	}
}
