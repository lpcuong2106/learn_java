package buoi2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;

public class bai3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai3 frame = new bai3();
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
	public bai3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.NORTH);
		
		JLabel lblId = new JLabel("STT");
		splitPane.setLeftComponent(lblId);
		
		textField = new JTextField();
		splitPane.setRightComponent(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JSplitPane splitPane_1 = new JSplitPane();
		scrollPane.setColumnHeaderView(splitPane_1);
		
		JLabel lblHTn = new JLabel("Họ tên");
		splitPane_1.setLeftComponent(lblHTn);
		
		textField_1 = new JTextField();
		splitPane_1.setRightComponent(textField_1);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setViewportView(scrollPane_1);
		
		JSplitPane splitPane_2 = new JSplitPane();
		scrollPane_1.setColumnHeaderView(splitPane_2);
		
		JLabel lblGiiTnh = new JLabel("Giới tính");
		splitPane_2.setLeftComponent(lblGiiTnh);
		
		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_2.setRightComponent(splitPane_3);
		
		JRadioButton gioitinh1 = new JRadioButton("nam");
		gioitinh1.setSelected(true);
		splitPane_3.setLeftComponent(gioitinh1);
		
		JRadioButton gioitinh = new JRadioButton("Nữ");
		splitPane_3.setRightComponent(gioitinh);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane_2);
		
		JSplitPane splitPane_4 = new JSplitPane();
		scrollPane_2.setColumnHeaderView(splitPane_4);
		
		JLabel lblTui = new JLabel("Độ tuổi");
		splitPane_4.setLeftComponent(lblTui);
	}

}
