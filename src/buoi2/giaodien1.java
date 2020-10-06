package buoi2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class giaodien1 extends JFrame {

	private JPanel contentPane;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giaodien1 frame = new giaodien1();
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
	public giaodien1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.NORTH);
		
		JLabel lblHTn = new JLabel("Họ tên");
		splitPane.setLeftComponent(lblHTn);
		
		username = new JTextField();
		splitPane.setRightComponent(username);
		username.setColumns(10);
		
		JSplitPane splitPane_1 = new JSplitPane();
		contentPane.add(splitPane_1, BorderLayout.SOUTH);
		
		JLabel lblHTn_1 = new JLabel("Họ tên");
		splitPane_1.setLeftComponent(lblHTn_1);
		
		JLabel username_d = new JLabel("null");
		splitPane_1.setRightComponent(username_d);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JSplitPane splitPane_2 = new JSplitPane();
		scrollPane.setColumnHeaderView(splitPane_2);
		
		JButton btnXemKtQu = new JButton("Xem kết quả");
		splitPane_2.setLeftComponent(btnXemKtQu);
		
		ActionListener alKQ = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	username_d.setText(username.getText());
		    }
		};
		btnXemKtQu.addActionListener(alKQ);
		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_2.setRightComponent(splitPane_3);
		
		JButton btnThot = new JButton("Thoát");
		splitPane_3.setRightComponent(btnThot);
		ActionListener edit = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	System.exit(0);
		    }
		};
		btnThot.addActionListener(edit);
		
	}

}
