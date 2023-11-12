import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JInternalFrame;

public class Payroll extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldEmployeeName;
	private JTextField textFieldRatePerHour;
	private JTextField textFieldNumberOfDaysWorked;
	private JTextField textFieldTax;
	private JTextField textFieldPhihealth;
	private JTextField textFieldSSS;
	private JTextField textFieldGrossSalary;
	private JTextField textFieldDeduction;
	private JTextField textFieldGross;
	private JTextField textFieldTotalDeduction;
	private JTextField textFieldNetSalary;
	private JTextField textFieldHourPerDay;

	/**
	 * Create the panel.
	 */
	public Payroll() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple payroll system");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 965, 51);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(20, 84, 103, 24);
		add(lblNewLabel_1);
		
		textFieldEmployeeName = new JTextField();
		textFieldEmployeeName.setBounds(176, 84, 131, 27);
		add(textFieldEmployeeName);
		textFieldEmployeeName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Rate per hour:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(20, 120, 103, 24);
		add(lblNewLabel_1_1);
		
		textFieldRatePerHour = new JTextField();
		textFieldRatePerHour.setColumns(10);
		textFieldRatePerHour.setBounds(176, 120, 131, 27);
		add(textFieldRatePerHour);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hour per day:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(20, 156, 103, 24);
		add(lblNewLabel_1_2);
		

		textFieldHourPerDay = new JTextField();
		textFieldHourPerDay.setColumns(10);
		textFieldHourPerDay.setBounds(176, 159, 131, 27);
		add(textFieldHourPerDay);

		
		JLabel lblNewLabel_1_3 = new JLabel("Number of days worked:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3.setBounds(20, 200, 146, 24);
		add(lblNewLabel_1_3);
		
		textFieldNumberOfDaysWorked = new JTextField();
		textFieldNumberOfDaysWorked.setColumns(10);
		textFieldNumberOfDaysWorked.setBounds(176, 199, 131, 27);
		add(textFieldNumberOfDaysWorked);
		
		JLabel lblNewLabel_2 = new JLabel("DEDUCTION OF SALARY");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(347, 86, 208, 18);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("TAX 15% of monthly wage:");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_1.setBounds(347, 121, 171, 24);
		add(lblNewLabel_1_3_1);
		
		textFieldTax = new JTextField();
		textFieldTax.setEditable(false);
		textFieldTax.setEnabled(false);
		textFieldTax.setColumns(10);
		textFieldTax.setBounds(528, 120, 131, 27);
		add(textFieldTax);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Phihealth 5%:");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_2.setBounds(347, 157, 146, 24);
		add(lblNewLabel_1_3_2);
		
		textFieldPhihealth = new JTextField();
		textFieldPhihealth.setEditable(false);
		textFieldPhihealth.setEnabled(false);
		textFieldPhihealth.setColumns(10);
		textFieldPhihealth.setBounds(528, 156, 131, 27);
		add(textFieldPhihealth);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("SSS 2%:");
		lblNewLabel_1_3_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_3.setBounds(347, 192, 146, 24);
		add(lblNewLabel_1_3_3);
		
		textFieldSSS = new JTextField();
		textFieldSSS.setEditable(false);
		textFieldSSS.setEnabled(false);
		textFieldSSS.setColumns(10);
		textFieldSSS.setBounds(528, 191, 131, 27);
		add(textFieldSSS);
		
		textFieldGrossSalary = new JTextField();
		textFieldGrossSalary.setEnabled(false);
		textFieldGrossSalary.setEditable(false);
		textFieldGrossSalary.setColumns(10);
		textFieldGrossSalary.setBounds(824, 100, 131, 27);
		add(textFieldGrossSalary);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("Gross Salary:");
		lblNewLabel_1_3_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_2_1.setBounds(725, 101, 90, 24);
		add(lblNewLabel_1_3_2_1);
		
		JLabel lblNewLabel_1_3_2_1_1 = new JLabel("Deduction:");
		lblNewLabel_1_3_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3_2_1_1.setBounds(725, 139, 90, 24);
		add(lblNewLabel_1_3_2_1_1);
		
		textFieldDeduction = new JTextField();
		textFieldDeduction.setEnabled(false);
		textFieldDeduction.setEditable(false);
		textFieldDeduction.setColumns(10);
		textFieldDeduction.setBounds(824, 138, 131, 27);
		add(textFieldDeduction);
		
		JLabel lblNewLabel_1_3_2_1_2 = new JLabel("GROSS SALARY:");
		lblNewLabel_1_3_2_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3_2_1_2.setBounds(21, 248, 146, 24);
		add(lblNewLabel_1_3_2_1_2);
		
		textFieldGross = new JTextField();
		textFieldGross.setEnabled(false);
		textFieldGross.setEditable(false);
		textFieldGross.setColumns(10);
		textFieldGross.setBounds(176, 247, 131, 27);
		add(textFieldGross);
		
		JLabel lblNewLabel_1_3_2_1_3 = new JLabel("TOTAL DEDUCTION:");
		lblNewLabel_1_3_2_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3_2_1_3.setBounds(335, 246, 182, 24);
		add(lblNewLabel_1_3_2_1_3);
		
		textFieldTotalDeduction = new JTextField();
		textFieldTotalDeduction.setEnabled(false);
		textFieldTotalDeduction.setEditable(false);
		textFieldTotalDeduction.setColumns(10);
		textFieldTotalDeduction.setBounds(526, 245, 131, 27);
		add(textFieldTotalDeduction);
		
		JLabel lblNewLabel_1_3_2_1_4 = new JLabel("NET SALARY:");
		lblNewLabel_1_3_2_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3_2_1_4.setBounds(684, 246, 131, 24);
		add(lblNewLabel_1_3_2_1_4);
		
		textFieldNetSalary = new JTextField();
		textFieldNetSalary.setEnabled(false);
		textFieldNetSalary.setEditable(false);
		textFieldNetSalary.setColumns(10);
		textFieldNetSalary.setBounds(824, 245, 131, 27);
		add(textFieldNetSalary);
		
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
		btnNewButtonCompute.setBorderPainted(false);
		btnNewButtonCompute.setBackground(new Color(0, 128, 128));
		btnNewButtonCompute.setForeground(new Color(255, 255, 255));
		btnNewButtonCompute.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButtonCompute.setBounds(413, 293, 171, 49);
		add(btnNewButtonCompute);
		
	}
}
