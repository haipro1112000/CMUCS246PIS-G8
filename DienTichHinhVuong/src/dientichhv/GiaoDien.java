package dientichhv;

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

public class GiaoDien extends JFrame {

	private JPanel contentPane;
	private JTextField canh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDien frame = new GiaoDien();
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
	public GiaoDien() {
		setTitle("Di\u1EC7n t\u00EDch h\u00ECnh vu\u00F4ng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u1EA1nh");
		lblNewLabel.setBounds(107, 66, 45, 13);
		contentPane.add(lblNewLabel);
		
		canh = new JTextField();
		canh.setBounds(203, 63, 126, 19);
		contentPane.add(canh);
		canh.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("K\u1EBFt qu\u1EA3");
		lblNewLabel_1.setBounds(107, 129, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel ketqua = new JLabel("");
		ketqua.setBounds(203, 129, 126, 13);
		contentPane.add(ketqua);
		
		JButton tinh = new JButton("T\u00EDnh");
		tinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            if (canh.getText().equals(""))
		                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập giá trị Cạnh!!");
		            else if(Double.parseDouble(canh.getText()) <= 0)
		                JOptionPane.showMessageDialog(rootPane, "Giá trị Cạnh không hợp lệ!!");
		            else
		                Double.parseDouble(canh.getText());
		        } catch (NumberFormatException ex) {
		    // xử lý khi số nhập vào ko đúng
		            JOptionPane.showMessageDialog(rootPane, "Giá trị không hợp lệ!!");
		        }
				DienTichHinhVuong solve = new DienTichHinhVuong(Double.parseDouble(canh.getText()));
				ketqua.setText(solve.solve());
			}
		});
		tinh.setBounds(46, 206, 85, 21);
		contentPane.add(tinh);
		
		JButton xoa = new JButton("X\u00F3a");
		xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canh.setText("");
				ketqua.setText("");
			}
		});
		xoa.setBounds(174, 206, 85, 21);
		contentPane.add(xoa);
		
		JButton thoat = new JButton("Tho\u00E1t");
		thoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		thoat.setBounds(306, 206, 85, 21);
		contentPane.add(thoat);
	}
}
