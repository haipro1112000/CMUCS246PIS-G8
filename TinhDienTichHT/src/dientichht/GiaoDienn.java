package dientichht;

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

public class GiaoDienn extends JFrame {

	private JPanel contentPane;
	private JTextField bankinh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienn frame = new GiaoDienn();
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
	public GiaoDienn() {
		setTitle("T\u00EDnh di\u1EC7n t\u00EDch h\u00ECnh tr\u00F2n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("B\u00E1n k\u00EDnh");
		lblNewLabel.setBounds(106, 58, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("K\u1EBFt qu\u1EA3");
		lblNewLabel_1.setBounds(106, 129, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		bankinh = new JTextField();
		bankinh.setBounds(194, 55, 146, 20);
		contentPane.add(bankinh);
		bankinh.setColumns(10);
		
		JLabel ketqua = new JLabel("");
		ketqua.setBounds(210, 129, 146, 14);
		contentPane.add(ketqua);
		
		JButton tinh = new JButton("T\u00EDnh");
		tinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            if (bankinh.getText().equals(""))
		                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập giá trị bán kính!!");
		            else if(Double.parseDouble(bankinh.getText()) <= 0)
		                JOptionPane.showMessageDialog(rootPane, "Giá trị kính bán không hợp lệ!!");
		            else
		                Double.parseDouble(bankinh.getText());
		        } catch (NumberFormatException ex) {
		    // xử lý khi số nhập vào ko đúng
		            JOptionPane.showMessageDialog(rootPane, "Giá trị không hợp lệ!!");
		        }
				DienTichHinhTron solve = new DienTichHinhTron(Double.parseDouble(bankinh.getText()));
				ketqua.setText(solve.solve());
			}
		});
		tinh.setBounds(37, 211, 89, 23);
		contentPane.add(tinh);
		
		JButton xoa = new JButton("X\u00F3a");
		xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankinh.setText("");
				ketqua.setText("");
			}
		});
		xoa.setBounds(162, 211, 89, 23);
		contentPane.add(xoa);
		
		JButton thoat = new JButton("Tho\u00E1t");
		thoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		thoat.setBounds(298, 211, 89, 23);
		contentPane.add(thoat);
	}
}
