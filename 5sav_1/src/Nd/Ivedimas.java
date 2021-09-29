package Nd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ivedimas extends JFrame {

	private JPanel contentPane;
	
	public static JTextField tfPli;
	public static JTextField tfPl1dez;
	public static JTextField tfL;
	public static JTextField tfH;
	public static JTextField tf1DezEur;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ivedimas frame = new Ivedimas();
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
	public Ivedimas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kambario da\u017Eymo skai\u010Diuokl\u0117");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(100, 11, 300, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbKplot = new JLabel("Kambario plotis");
		lbKplot.setFont(lbKplot.getFont().deriveFont(lbKplot.getFont().getStyle() & ~Font.BOLD));
		lbKplot.setBounds(74, 78, 250, 14);
		contentPane.add(lbKplot);
		
		JLabel lbPateikMain = new JLabel("Pateikite duomenis");
		lbPateikMain.setHorizontalAlignment(SwingConstants.CENTER);
		lbPateikMain.setFont(lbPateikMain.getFont().deriveFont(lbPateikMain.getFont().getStyle() & ~Font.BOLD));
		lbPateikMain.setBounds(100, 40, 300, 14);
		contentPane.add(lbPateikMain);
		
		tfPli = new JTextField();
		tfPli.setHorizontalAlignment(SwingConstants.CENTER);
		tfPli.setBounds(340, 75, 70, 20);
		contentPane.add(tfPli);
		tfPli.setColumns(10);
		
		JLabel lblKokPlotGalima = new JLabel("Kok\u012F plot\u0105 galima nuda\u017Eyti su viena d\u0117\u017Eute");
		lblKokPlotGalima.setFont(lblKokPlotGalima.getFont().deriveFont(lblKokPlotGalima.getFont().getStyle() & ~Font.BOLD));
		lblKokPlotGalima.setBounds(74, 210, 250, 14);
		contentPane.add(lblKokPlotGalima);
		
		tfPl1dez = new JTextField();
		tfPl1dez.setHorizontalAlignment(SwingConstants.CENTER);
		tfPl1dez.setColumns(10);
		tfPl1dez.setBounds(340, 207, 70, 20);
		contentPane.add(tfPl1dez);
		
		JLabel lblKambarioIlgis = new JLabel("Kambario ilgis");
		lblKambarioIlgis.setFont(lblKambarioIlgis.getFont().deriveFont(lblKambarioIlgis.getFont().getStyle() & ~Font.BOLD));
		lblKambarioIlgis.setBounds(74, 122, 250, 14);
		contentPane.add(lblKambarioIlgis);
		
		tfL = new JTextField();
		tfL.setHorizontalAlignment(SwingConstants.CENTER);
		tfL.setColumns(10);
		tfL.setBounds(340, 119, 70, 20);
		contentPane.add(tfL);
		
		JLabel lblKambarioAuktis = new JLabel("Kambario auk\u0161tis");
		lblKambarioAuktis.setFont(lblKambarioAuktis.getFont().deriveFont(lblKambarioAuktis.getFont().getStyle() & ~Font.BOLD));
		lblKambarioAuktis.setBounds(74, 166, 250, 14);
		contentPane.add(lblKambarioAuktis);
		
		tfH = new JTextField();
		tfH.setHorizontalAlignment(SwingConstants.CENTER);
		tfH.setColumns(10);
		tfH.setBounds(340, 163, 70, 20);
		contentPane.add(tfH);
		
		JLabel lblVienosDutsKaina = new JLabel("Vienos d\u0117\u017Eut\u0117s kaina");
		lblVienosDutsKaina.setFont(lblVienosDutsKaina.getFont().deriveFont(lblVienosDutsKaina.getFont().getStyle() & ~Font.BOLD));
		lblVienosDutsKaina.setBounds(74, 255, 250, 14);
		contentPane.add(lblVienosDutsKaina);
		
		tf1DezEur = new JTextField();
		tf1DezEur.setHorizontalAlignment(SwingConstants.CENTER);
		tf1DezEur.setColumns(10);
		tf1DezEur.setBounds(340, 252, 70, 20);
		contentPane.add(tf1DezEur);
		
		JButton btnSk = new JButton("Skai\u010Diuoti");
		btnSk.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSk.setBounds(315, 340, 120, 30);
		contentPane.add(btnSk);
		
		btnSk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				IvedimoAts atsakymasFr= new IvedimoAts(tfPli,tfL, tfH, tfPl1dez, tf1DezEur);
				atsakymasFr.setVisible(true);
			}
			
			
		});
	}
}
