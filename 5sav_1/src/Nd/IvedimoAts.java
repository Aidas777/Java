package Nd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class IvedimoAts extends JFrame {

	private JPanel contentPane;
	
	private JTextField pli; //Plotis
	private JTextField iL; //Ilgis
	private JTextField h; //Aukstis
	private JTextField pl1dez; //Koki PlotA nudazysim su 1 dezute
	private JTextField DezEur; //1 Dezutes kaina
	
	public JTextField tfRPlAll;
	private JTextField tfRDskAll;
	private JTextField tfREurAll;
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					IvedimoAts frame = new IvedimoAts();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}



	/**
	 * Create the frame.
	 */
	public IvedimoAts() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 100, 600, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rezultatas");
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(250, 30, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDaomasPlotasvis = new JLabel("Da\u017Eomas plotas (vis\u0173 sien\u0173 suma)");
		lblDaomasPlotasvis.setFont(lblDaomasPlotasvis.getFont().deriveFont(lblDaomasPlotasvis.getFont().getStyle() & ~Font.BOLD));
		lblDaomasPlotasvis.setBounds(110, 70, 250, 14);
		contentPane.add(lblDaomasPlotasvis);
		
		this.tfRPlAll = new JTextField("");
		this.tfRPlAll.setHorizontalAlignment(SwingConstants.CENTER);
		this.tfRPlAll.setColumns(10);
		this.tfRPlAll.setBounds(410, 67, 70, 20);
		contentPane.add(this.tfRPlAll);
		
		JLabel lblDuiSkaiiusVisoms = new JLabel("D\u0117\u017Eu\u010Di\u0173 skai\u010Dius visoms sienoms nuda\u017Eyti");
		lblDuiSkaiiusVisoms.setFont(lblDuiSkaiiusVisoms.getFont().deriveFont(lblDuiSkaiiusVisoms.getFont().getStyle() & ~Font.BOLD));
		lblDuiSkaiiusVisoms.setBounds(110, 112, 250, 14);
		contentPane.add(lblDuiSkaiiusVisoms);
		
		tfRDskAll = new JTextField();
		tfRDskAll.setHorizontalAlignment(SwingConstants.CENTER);
		tfRDskAll.setColumns(10);
		tfRDskAll.setBounds(410, 109, 70, 20);
		contentPane.add(tfRDskAll);
		
		JLabel lblVisDaKaina = new JLabel("Vis\u0173 da\u017E\u0173 kaina");
		lblVisDaKaina.setFont(lblVisDaKaina.getFont().deriveFont(lblVisDaKaina.getFont().getStyle() & ~Font.BOLD));
		lblVisDaKaina.setBounds(110, 158, 250, 14);
		contentPane.add(lblVisDaKaina);
		
		tfREurAll = new JTextField();
		tfREurAll.setHorizontalAlignment(SwingConstants.CENTER);
		tfREurAll.setColumns(10);
		tfREurAll.setBounds(410, 155, 70, 20);
		contentPane.add(tfREurAll);
		
		
	}
	
	public IvedimoAts(JTextField pli, JTextField tfL, JTextField tfH, JTextField tfPl1dez,JTextField tf1DezEur) {
		this();
		this.pli=pli;
		this.iL=tfL;
		this.h=tfH;
		this.pl1dez=tfPl1dez;
		this.DezEur=tf1DezEur;
		
		double spliAll = Double.parseDouble(this.pli.getText()) * Double.parseDouble(this.h.getText())*2;
		double sLAll = Double.parseDouble(this.iL.getText()) * Double.parseDouble(this.h.getText())*2;
		this.tfRPlAll.setText(""+ (spliAll+sLAll));

		double dezSkAll=(double) ((spliAll+sLAll) / Double.parseDouble(this.pl1dez.getText()));
		dezSkAll=(int) Math.ceil(dezSkAll);
		this.tfRDskAll.setText( ""+ (int) dezSkAll );
		
//		DezEur
		this.tfREurAll.setText("" + (dezSkAll*Double.parseDouble(this.DezEur.getText())));
	}
	

}
