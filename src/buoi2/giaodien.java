package buoi2;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class giaodien extends JFrame {

	private JPanel contentPane;
	private JTextField namsinh;
	private JTextField mssv;
	private JTextField username;
	private JTextField quequan;
	private JTextField xeploai;
	private JTextField diemtb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giaodien frame = new giaodien();
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
	public giaodien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 352);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmHelp = new JMenuItem("help");
		menuBar.add(mntmHelp);
		
		JMenuItem mntmFile = new JMenuItem("file");
		menuBar.add(mntmFile);
		
		JMenu mnItem = new JMenu("Item1");
		menuBar.add(mnItem);
		
		JMenuItem mntmItem = new JMenuItem("Item1");
		mnItem.add(mntmItem);
		
		JMenuItem mntmItem_1 = new JMenuItem("item2");
		mnItem.add(mntmItem_1);
		
		JMenuItem mntmEdit = new JMenuItem("edit");
		menuBar.add(mntmEdit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{440, 0};
		gbl_contentPane.rowHeights = new int[]{15, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 0;
		gbc_scrollPane_2.gridy = 0;
		contentPane.add(scrollPane_2, gbc_scrollPane_2);
		
		JLabel lblHTnSinh = new JLabel("Họ tên sinh viên");
		scrollPane_2.setRowHeaderView(lblHTnSinh);
		
		username = new JTextField();
		scrollPane_2.setViewportView(username);
		username.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 1;
		contentPane.add(scrollPane_1, gbc_scrollPane_1);
		
		JLabel lblMSSinh_1 = new JLabel("Mã số sinh viên");
		scrollPane_1.setRowHeaderView(lblMSSinh_1);
		
		mssv = new JTextField();
		mssv.setHorizontalAlignment(SwingConstants.LEFT);
		scrollPane_1.setViewportView(mssv);
		mssv.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		JLabel lblNewLabel_2 = new JLabel("Năm sinh");
		scrollPane.setRowHeaderView(lblNewLabel_2);
		
		namsinh = new JTextField();
		namsinh.setHorizontalAlignment(SwingConstants.LEFT);
		scrollPane.setViewportView(namsinh);
		namsinh.setColumns(10);
		
		JSplitPane splitPane = new JSplitPane();
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.insets = new Insets(0, 0, 5, 0);
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 3;
		contentPane.add(splitPane, gbc_splitPane);
		
		JLabel lblQuQun = new JLabel("Quê quán");
		splitPane.setLeftComponent(lblQuQun);
		
		quequan = new JTextField();
		splitPane.setRightComponent(quequan);
		quequan.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		contentPane.add(panel, gbc_panel);
		
		JSplitPane splitPane_1 = new JSplitPane();
		GridBagConstraints gbc_splitPane_1 = new GridBagConstraints();
		gbc_splitPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_splitPane_1.fill = GridBagConstraints.BOTH;
		gbc_splitPane_1.gridx = 0;
		gbc_splitPane_1.gridy = 5;
		contentPane.add(splitPane_1, gbc_splitPane_1);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_1.setLeftComponent(splitPane_2);
		
		JLabel lblNewLabel = new JLabel("Điểm trung bình");
		splitPane_2.setLeftComponent(lblNewLabel);
		
		diemtb = new JTextField();
		splitPane_2.setRightComponent(diemtb);
		diemtb.setColumns(10);
		
		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_1.setRightComponent(splitPane_3);
		
		JLabel lblXpLoi = new JLabel("Xếp loại");
		splitPane_3.setLeftComponent(lblXpLoi);
		
		xeploai = new JTextField();
		splitPane_3.setRightComponent(xeploai);
		xeploai.setColumns(10);
		
		JSplitPane splitPane_4 = new JSplitPane();
		GridBagConstraints gbc_splitPane_4 = new GridBagConstraints();
		gbc_splitPane_4.insets = new Insets(0, 0, 5, 0);
		gbc_splitPane_4.fill = GridBagConstraints.BOTH;
		gbc_splitPane_4.gridx = 0;
		gbc_splitPane_4.gridy = 6;
		contentPane.add(splitPane_4, gbc_splitPane_4);
		
		JSplitPane splitPane_5 = new JSplitPane();
		splitPane_4.setRightComponent(splitPane_5);
		
		JButton btnKQ = new JButton("Xem kết quả");
		splitPane_5.setLeftComponent(btnKQ);
		ActionListener alKQ = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
//		    	s_mssv = mssv.getText();
		    }
		};
		btnKQ.addActionListener(alKQ);
		
		JButton btnExit = new JButton("Thoát");
		splitPane_5.setRightComponent(btnExit);
		ActionListener al = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
		};

		btnExit.addActionListener(al);
		
		JButton btnXeploai = new JButton("Xếp loại");
		splitPane_4.setLeftComponent(btnXeploai);
		
		ScrollPane scrollPane_3 = new ScrollPane();
		GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
		gbc_scrollPane_3.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_3.gridx = 0;
		gbc_scrollPane_3.gridy = 7;
		contentPane.add(scrollPane_3, gbc_scrollPane_3);
		
		JSplitPane splitPane_6 = new JSplitPane();
		GridBagConstraints gbc_splitPane_6 = new GridBagConstraints();
		gbc_splitPane_6.insets = new Insets(0, 0, 5, 0);
		gbc_splitPane_6.fill = GridBagConstraints.BOTH;
		gbc_splitPane_6.gridx = 0;
		gbc_splitPane_6.gridy = 8;
		contentPane.add(splitPane_6, gbc_splitPane_6);
		
		Label label = new Label("Mã số sinh viên");
		splitPane_6.setLeftComponent(label);
		
		Label label_1 = new Label("null");
		splitPane_6.setRightComponent(label_1);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 9;
		contentPane.add(panel_1, gbc_panel_1);
		
		JSplitPane splitPane_7 = new JSplitPane();
		GridBagConstraints gbc_splitPane_7 = new GridBagConstraints();
		gbc_splitPane_7.insets = new Insets(0, 0, 5, 0);
		gbc_splitPane_7.fill = GridBagConstraints.BOTH;
		gbc_splitPane_7.gridx = 0;
		gbc_splitPane_7.gridy = 10;
		contentPane.add(splitPane_7, gbc_splitPane_7);
		
		JLabel lblHTn = new JLabel("Họ tên");
		splitPane_7.setLeftComponent(lblHTn);
		
		JSplitPane splitPane_8 = new JSplitPane();
		GridBagConstraints gbc_splitPane_8 = new GridBagConstraints();
		gbc_splitPane_8.fill = GridBagConstraints.BOTH;
		gbc_splitPane_8.gridx = 0;
		gbc_splitPane_8.gridy = 11;
		contentPane.add(splitPane_8, gbc_splitPane_8);
	}
}
