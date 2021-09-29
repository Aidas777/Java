import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Cursor;
import java.awt.Color;

public class Alga extends JFrame {

	private JPanel contentPane;
	private JTextField tfAlgaR;
	private JTextField tfNPD;
	private JTextField tfAlgaP;
	private JTextField tfNPDtaik;
	private JTextField tfPaj15Proc;
	private JTextField tfSvDr6;
	private JTextField tfSocDr3;
	private JTextField tfAlgaR2;
	private JTextField tfDarbMokAll;
	private JTextField tfDarbSo3048;
	private JTextField tfSoGar02;
	private JTextField tfSoilg05;
	private JTextField tfDVietAll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alga frame = new Alga();
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
	public Alga() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfAlgaR = new JTextField();
		tfAlgaR.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfAlgaR.setHorizontalAlignment(SwingConstants.CENTER);
		tfAlgaR.setBounds(182, 22, 70, 20);
		contentPane.add(tfAlgaR);
		tfAlgaR.setColumns(10);
		
		tfNPD = new JTextField();
		tfNPD.setHorizontalAlignment(SwingConstants.CENTER);
		tfNPD.setText("380");
		tfNPD.setColumns(10);
		tfNPD.setBounds(351, 22, 50, 20);
		contentPane.add(tfNPD);
		
		JButton btnSkaiciuok = new JButton("Skai\u010Diuoti");
		btnSkaiciuok.setFont(btnSkaiciuok.getFont().deriveFont(btnSkaiciuok.getFont().getStyle() & ~Font.BOLD));
		btnSkaiciuok.setBounds(169, 53, 120, 23);
		contentPane.add(btnSkaiciuok);
		
		JTextArea txtrveskiteAtlyginim = new JTextArea();
		txtrveskiteAtlyginim.setBackground(new Color(240,240,240));
		txtrveskiteAtlyginim.setBorder(null);
		txtrveskiteAtlyginim.setLineWrap(true);
		txtrveskiteAtlyginim.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrveskiteAtlyginim.setWrapStyleWord(true);
		txtrveskiteAtlyginim.setText("\u012Eveskite Atlyginim\u0105 ant popieriaus");
		txtrveskiteAtlyginim.setBounds(32, 22, 140, 34);
		contentPane.add(txtrveskiteAtlyginim);
		
		JTextArea txtrveskiteNpd = new JTextArea();
		txtrveskiteNpd.setWrapStyleWord(true);
		txtrveskiteNpd.setLineWrap(true);
		txtrveskiteNpd.setBackground(new Color(240,240,240));
		txtrveskiteNpd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrveskiteNpd.setText("\u012Eveskite NPD");
		txtrveskiteNpd.setBounds(271, 23, 70, 20);
		contentPane.add(txtrveskiteNpd);
		
		JLabel lblNewLabel = new JLabel("Priskai\u010Diuotas atlyginimas \u201Eant popieriaus\u201C");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(32, 102, 289, 14);
		contentPane.add(lblNewLabel);
		
		tfAlgaP = new JTextField();
		tfAlgaP.setHorizontalAlignment(SwingConstants.CENTER);
		tfAlgaP.setBounds(331, 102, 70, 20);
		contentPane.add(tfAlgaP);
		tfAlgaP.setColumns(10);
		
		JLabel lblPritaikytasNpd = new JLabel("Pritaikytas NPD ");
		lblPritaikytasNpd.setHorizontalAlignment(SwingConstants.LEFT);
		lblPritaikytasNpd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPritaikytasNpd.setBounds(32, 129, 289, 14);
		contentPane.add(lblPritaikytasNpd);
		
		tfNPDtaik = new JTextField();
		tfNPDtaik.setHorizontalAlignment(SwingConstants.CENTER);
//		tfNPDtaik.setText("0");
		tfNPDtaik.setColumns(10);
		tfNPDtaik.setBounds(331, 129, 70, 20);
		contentPane.add(tfNPDtaik);
		
		JLabel lblPajamMokestis = new JLabel("Pajam\u0173 mokestis 15%");
		lblPajamMokestis.setHorizontalAlignment(SwingConstants.LEFT);
		lblPajamMokestis.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPajamMokestis.setBounds(32, 156, 289, 14);
		contentPane.add(lblPajamMokestis);
		
		tfPaj15Proc = new JTextField();
		tfPaj15Proc.setHorizontalAlignment(SwingConstants.CENTER);
		tfPaj15Proc.setColumns(10);
		tfPaj15Proc.setBounds(331, 156, 70, 20);
		contentPane.add(tfPaj15Proc);
		
		JLabel lblSodraSodraSveikatos = new JLabel("Sodra. Sveikatos draudimas 6% ");
		lblSodraSodraSveikatos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSodraSodraSveikatos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSodraSodraSveikatos.setBounds(32, 183, 289, 14);
		contentPane.add(lblSodraSodraSveikatos);
		
		tfSvDr6 = new JTextField();
		tfSvDr6.setHorizontalAlignment(SwingConstants.CENTER);
		tfSvDr6.setColumns(10);
		tfSvDr6.setBounds(331, 183, 70, 20);
		contentPane.add(tfSvDr6);
		
		JLabel lblSodraPensijIr = new JLabel("Sodra. Pensij\u0173 ir soc. draudimas 3%");
		lblSodraPensijIr.setHorizontalAlignment(SwingConstants.LEFT);
		lblSodraPensijIr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSodraPensijIr.setBounds(32, 210, 289, 14);
		contentPane.add(lblSodraPensijIr);
		
		tfSocDr3 = new JTextField();
		tfSocDr3.setHorizontalAlignment(SwingConstants.CENTER);
		tfSocDr3.setColumns(10);
		tfSocDr3.setBounds(331, 210, 70, 20);
		contentPane.add(tfSocDr3);
		
		tfAlgaR2 = new JTextField();
		tfAlgaR2.setHorizontalAlignment(SwingConstants.CENTER);
		tfAlgaR2.setColumns(10);
		tfAlgaR2.setBounds(331, 237, 70, 20);
		contentPane.add(tfAlgaR2);
		
		JLabel lblImokamasAtlyginimas = new JLabel("I\u0161mokamas atlyginimas \u201E\u012F rankas\u201C");
		lblImokamasAtlyginimas.setHorizontalAlignment(SwingConstants.LEFT);
		lblImokamasAtlyginimas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblImokamasAtlyginimas.setBounds(32, 237, 289, 14);
		contentPane.add(lblImokamasAtlyginimas);
		
		tfDarbMokAll = new JTextField();
		tfDarbMokAll.setHorizontalAlignment(SwingConstants.CENTER);
		tfDarbMokAll.setColumns(10);
		tfDarbMokAll.setBounds(331, 287, 70, 20);
		contentPane.add(tfDarbMokAll);
		
		JLabel lblDarbdavioSumokamiMokesiai = new JLabel("Darbdavio sumokami mokes\u010Diai");
		lblDarbdavioSumokamiMokesiai.setHorizontalAlignment(SwingConstants.LEFT);
		lblDarbdavioSumokamiMokesiai.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDarbdavioSumokamiMokesiai.setBounds(32, 287, 289, 14);
		contentPane.add(lblDarbdavioSumokamiMokesiai);
		
		JLabel lblSodraSodra = new JLabel("Sodra 30.48 %");
		lblSodraSodra.setHorizontalAlignment(SwingConstants.LEFT);
		lblSodraSodra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSodraSodra.setBounds(32, 315, 289, 14);
		contentPane.add(lblSodraSodra);
		
		tfDarbSo3048 = new JTextField();
		tfDarbSo3048.setHorizontalAlignment(SwingConstants.CENTER);
		tfDarbSo3048.setColumns(10);
		tfDarbSo3048.setBounds(331, 315, 70, 20);
		contentPane.add(tfDarbSo3048);
		
		JLabel lblSodramokos = new JLabel("Sodra \u012Emokos \u012F garantin\u012F fond\u0105 | 0.2 % |");
		lblSodramokos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSodramokos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSodramokos.setBounds(32, 342, 289, 14);
		contentPane.add(lblSodramokos);
		
		tfSoGar02 = new JTextField();
		tfSoGar02.setHorizontalAlignment(SwingConstants.CENTER);
		tfSoGar02.setColumns(10);
		tfSoGar02.setBounds(331, 342, 70, 20);
		contentPane.add(tfSoGar02);
		
		JLabel lblSodramoka = new JLabel("Sodra \u012Emoka \u012F ilgalaikio darbo i\u0161mok\u0173 fond\u0105 | 0.5 % |  ");
		lblSodramoka.setHorizontalAlignment(SwingConstants.LEFT);
		lblSodramoka.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSodramoka.setBounds(32, 369, 289, 14);
		contentPane.add(lblSodramoka);
		
		tfSoilg05 = new JTextField();
		tfSoilg05.setHorizontalAlignment(SwingConstants.CENTER);
		tfSoilg05.setColumns(10);
		tfSoilg05.setBounds(331, 369, 70, 20);
		contentPane.add(tfSoilg05);
		
		JLabel lblVisaDarboVietos = new JLabel("Visa darbo vietos kaina");
		lblVisaDarboVietos.setHorizontalAlignment(SwingConstants.LEFT);
		lblVisaDarboVietos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVisaDarboVietos.setBounds(32, 396, 289, 14);
		contentPane.add(lblVisaDarboVietos);
		
		tfDVietAll = new JTextField();
		tfDVietAll.setHorizontalAlignment(SwingConstants.CENTER);
		tfDVietAll.setColumns(10);
		tfDVietAll.setBounds(331, 396, 70, 20);
		contentPane.add(tfDVietAll);
		
		//--
//s			kaiciuoti.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int x = Integer.parseInt(tfX.getText());
//				int y = Integer.parseInt(tfY.getText());
//				int suma= x+y;
//				
//				atsakymas.setText("Atsakymas yra: " + suma);
//			}
//		});
		//--
		
		
		btnSkaiciuok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double algaR=Double.parseDouble(tfAlgaR.getText());
				
				//NPD ///////////////////////////////////////////////////////////////
				double npd=Double.parseDouble(tfNPD.getText());
//				if (algaR>642) {
					npd=380-(0.5*(algaR-400));
//				} else {
//					npd=400;
//				}
				tfNPDtaik.setText(Double.toString(npd));
				
				double SocDr3 = algaR / 100*3;
				tfSocDr3.setText(Double.toString(Math.round(SocDr3)));
				
				double SvDr6 = algaR / 100*6;
				tfSvDr6.setText(Double.toString(Math.round(SvDr6)));
				
				double Paj15Proc = (algaR-npd) / 100*15;
				tfPaj15Proc.setText(Double.toString(Math.round(Paj15Proc)));
				
				tfAlgaR2.setText(Double.toString(algaR-(Paj15Proc+SvDr6+SocDr3)));
				
				
			
				//DARBDAVIO MOKESCIAI ////////////////////////////////////////////////
				double DarbSo3048 = algaR / 100*30.48;
				tfDarbSo3048.setText(Double.toString(DarbSo3048));
				
				double SoGar02 = (algaR /100*0.2);
				tfSoGar02.setText(Double.toString(SoGar02));
				
				double Soilg05 = algaR /100*0.5;
				tfSoilg05.setText(Double.toString(Soilg05));
				tfDVietAll.setText(Double.toString(algaR +DarbSo3048+SoGar02+Soilg05));
				
				tfDarbMokAll.setText(Double.toString(DarbSo3048+SoGar02+Soilg05));
				
				System.out.println(tfPaj15Proc.getText() + " " +npd);
			}
		});
	}
}
