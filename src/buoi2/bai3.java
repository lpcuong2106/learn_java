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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;

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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dưới 20", "20-30", "30-40", "Trên 40"}));
		splitPane_4.setRightComponent(comboBox);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_2.setViewportView(scrollPane_3);
		
		JSplitPane splitPane_5 = new JSplitPane();
		scrollPane_3.setColumnHeaderView(splitPane_5);
		
		JLabel lblaCh = new JLabel("Địa chỉ");
		splitPane_5.setLeftComponent(lblaCh);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(4);
		splitPane_5.setRightComponent(textArea);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_3.setViewportView(scrollPane_4);
		
		JSplitPane splitPane_6 = new JSplitPane();
		scrollPane_4.setColumnHeaderView(splitPane_6);
		
		JButton btnLu = new JButton("Lưu");
		splitPane_6.setLeftComponent(btnLu);
		
		JButton btnHy = new JButton("Hủy");
		splitPane_6.setRightComponent(btnHy);
	}

}
