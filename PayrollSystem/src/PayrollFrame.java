import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class PayrollFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldEmployeeName;
	private JTextField textFieldRatePerHour;
	private JTextField textFieldHourPerDay;
	private JTextField textFieldNumberOfDaysWorked;
	private JTextField textFieldTax;
	private JTextField textFieldPhihealth;
	private JTextField textFieldSSS;
	private JTextField textFieldGrossSalary;
	private JTextField textFieldDeduction;
	private JTextField textFieldGross;
	private JTextField textFieldTotalDeduction;
	private JTextField textFieldNetSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayrollFrame frame = new PayrollFrame();
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
	public PayrollFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(new Rectangle(0, 0, 993, 398));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(20, 84, 103, 24);
		panel.add(lblNewLabel_1);
		
		textFieldEmployeeName = new JTextField();
		textFieldEmployeeName.setColumns(10);
		textFieldEmployeeName.setBounds(176, 84, 131, 27);
		panel.add(textFieldEmployeeName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Rate per hour:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(20, 120, 103, 24);
		panel.add(lblNewLabel_1_1);
		
		textFieldRatePerHour = new JTextField();
		textFieldRatePerHour.setColumns(10);
		textFieldRatePerHour.setBounds(176, 120, 131, 27);
		panel.add(textFieldRatePerHour);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hour per day:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(20, 156, 103, 24);
		panel.add(lblNewLabel_1_2);
		
		textFieldHourPerDay = new JTextField();
		textFieldHourPerDay.setColumns(10);
		textFieldHourPerDay.setBounds(176, 159, 131, 27);
		panel.add(textFieldHourPerDay);
		
		JLabel lblNewLabel_1_3 = new JLabel("Number of days worked:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3.setBounds(20, 200, 146, 24);
		panel.add(lblNewLabel_1_3);
		
		textFieldNumberOfDaysWorked = new JTextField();
		textFieldNumberOfDaysWorked.setColumns(10);
		textFieldNumberOfDaysWorked.setBounds(176, 199, 131, 27);
		panel.add(textFieldNumberOfDaysWorked);
		
		JLabel lblNewLabel_2 = new JLabel("DEDUCTION OF SALARY");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(347, 86, 208, 18);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("TAX 15% of monthly wage:");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_1.setBounds(347, 121, 171, 24);
		panel.add(lblNewLabel_1_3_1);
		
		textFieldTax = new JTextField();
		textFieldTax.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldTax.setEnabled(false);
		textFieldTax.setEditable(false);
		textFieldTax.setColumns(10);
		textFieldTax.setBounds(528, 120, 131, 27);
		panel.add(textFieldTax);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Phihealth 5%:");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_2.setBounds(347, 157, 146, 24);
		panel.add(lblNewLabel_1_3_2);
		
		textFieldPhihealth = new JTextField();
		textFieldPhihealth.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldPhihealth.setEnabled(false);
		textFieldPhihealth.setEditable(false);
		textFieldPhihealth.setColumns(10);
		textFieldPhihealth.setBounds(528, 156, 131, 27);
		panel.add(textFieldPhihealth);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("SSS 2%:");
		lblNewLabel_1_3_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_3.setBounds(347, 192, 146, 24);
		panel.add(lblNewLabel_1_3_3);
		
		textFieldSSS = new JTextField();
		textFieldSSS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldSSS.setEnabled(false);
		textFieldSSS.setEditable(false);
		textFieldSSS.setColumns(10);
		textFieldSSS.setBounds(528, 191, 131, 27);
		panel.add(textFieldSSS);
		
		textFieldGrossSalary = new JTextField();
		textFieldGrossSalary.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldGrossSalary.setEnabled(false);
		textFieldGrossSalary.setEditable(false);
		textFieldGrossSalary.setColumns(10);
		textFieldGrossSalary.setBounds(824, 100, 131, 27);
		panel.add(textFieldGrossSalary);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("Gross Salary:");
		lblNewLabel_1_3_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_2_1.setBounds(725, 101, 90, 24);
		panel.add(lblNewLabel_1_3_2_1);
		
		JLabel lblNewLabel_1_3_2_1_1 = new JLabel("Deduction:");
		lblNewLabel_1_3_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_2_1_1.setBounds(725, 139, 90, 24);
		panel.add(lblNewLabel_1_3_2_1_1);
		
		textFieldDeduction = new JTextField();
		textFieldDeduction.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldDeduction.setEnabled(false);
		textFieldDeduction.setEditable(false);
		textFieldDeduction.setColumns(10);
		textFieldDeduction.setBounds(824, 138, 131, 27);
		panel.add(textFieldDeduction);
		
		JLabel lblNewLabel_1_3_2_1_2 = new JLabel("GROSS SALARY:");
		lblNewLabel_1_3_2_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3_2_1_2.setBounds(21, 248, 146, 24);
		panel.add(lblNewLabel_1_3_2_1_2);
		
		textFieldGross = new JTextField();
		textFieldGross.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldGross.setEnabled(false);
		textFieldGross.setEditable(false);
		textFieldGross.setColumns(10);
		textFieldGross.setBounds(176, 247, 131, 27);
		panel.add(textFieldGross);
		
		JLabel lblNewLabel_1_3_2_1_3 = new JLabel("TOTAL DEDUCTION:");
		lblNewLabel_1_3_2_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3_2_1_3.setBounds(335, 246, 182, 24);
		panel.add(lblNewLabel_1_3_2_1_3);
		
		textFieldTotalDeduction = new JTextField();
		textFieldTotalDeduction.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldTotalDeduction.setEnabled(false);
		textFieldTotalDeduction.setEditable(false);
		textFieldTotalDeduction.setColumns(10);
		textFieldTotalDeduction.setBounds(526, 245, 131, 27);
		panel.add(textFieldTotalDeduction);
		
		JLabel lblNewLabel_1_3_2_1_4 = new JLabel("NET SALARY:");
		lblNewLabel_1_3_2_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3_2_1_4.setBounds(684, 246, 131, 24);
		panel.add(lblNewLabel_1_3_2_1_4);
		
		textFieldNetSalary = new JTextField();
		textFieldNetSalary.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldNetSalary.setEnabled(false);
		textFieldNetSalary.setEditable(false);
		textFieldNetSalary.setColumns(10);
		textFieldNetSalary.setBounds(824, 245, 131, 27);
		panel.add(textFieldNetSalary);
		
		JButton btnNewButtonCompute = new JButton("Compute");
		btnNewButtonCompute.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButtonCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rate,hourPerDay,numberOfDays,tax,phihealth,sss,grossSalary,netSalary,deductions;
				
				rate = Integer.valueOf(textFieldRatePerHour.getText());
				hourPerDay = Integer.valueOf(textFieldHourPerDay.getText());
				numberOfDays = Integer.valueOf(textFieldNumberOfDaysWorked.getText());
				grossSalary = rate*hourPerDay*numberOfDays;
				
				tax = (int) (0.15 * grossSalary);
				phihealth = (int) (0.05 * grossSalary);
				sss = (int) (0.02 * grossSalary);
				deductions = tax + phihealth + sss;
				
				netSalary = grossSalary - deductions;
				
				textFieldGrossSalary.setText(String.valueOf(grossSalary));
				textFieldTax.setText(String.valueOf(tax));
				textFieldPhihealth.setText(String.valueOf(phihealth));
				textFieldSSS.setText(String.valueOf(sss));
				textFieldDeduction.setText(String.valueOf(deductions));
				textFieldGross.setText(String.valueOf(grossSalary));
				textFieldTotalDeduction.setText(String.valueOf(deductions));
				textFieldNetSalary.setText(String.valueOf(netSalary));
			
			}
		});
		btnNewButtonCompute.setForeground(Color.WHITE);
		btnNewButtonCompute.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButtonCompute.setBorderPainted(false);
		btnNewButtonCompute.setBackground(new Color(0, 128, 128));
		btnNewButtonCompute.setBounds(413, 293, 171, 49);
		panel.add(btnNewButtonCompute);
		
		JLabel lblNewLabel = new JLabel("Simple payroll system");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 965, 51);
		panel.add(lblNewLabel);
	}
}
