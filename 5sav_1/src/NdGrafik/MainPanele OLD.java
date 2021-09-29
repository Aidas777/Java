//package NdGrafik;
//
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JCheckBox;
//
//
//public class MainPanele extends JFrame {
//
//	public static JPanel contentPane;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainPanele frame = new MainPanele();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public MainPanele() {
//		setTitle("Grafikas");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 800, 300);
//		contentPane = new drawGraphics(new Grafikas() {//MANO F /////////////
//			
//			@Override
//			public int getY(double x) {
////				return (int) (x / 5.0);
//				return (int) ((Math.sin(x /10.0))*100);
//			}
//						
//		}); 
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JCheckBox chbx1uX = new JCheckBox("y = 1 / x");
////		chbx1uX.setSelected(true);
//
//		
//		chbx1uX.setContentAreaFilled(false);
//		chbx1uX.setIconTextGap(10);
//		chbx1uX.setBorder(null);
//		chbx1uX.setBounds(10, 7, 100, 23);
//		contentPane.add(chbx1uX);
//		
//		JCheckBox chbxYSin = new JCheckBox("y = sin ( x )");
//		chbxYSin.setIconTextGap(10);
//		chbxYSin.setContentAreaFilled(false);
//		chbxYSin.setBorder(null);
//		chbxYSin.setBounds(10, 36, 100, 23);
//		contentPane.add(chbxYSin);
//		
////		chbx1uX.addMouseListener(new MouseAdapter() {
////			@Override
////			public void mouseClicked(MouseEvent e) {
////				System.out.println(chbx1uX.isSelected());
////				if (chbxYSin.isSelected()) {
////					chbxYSin.setSelected(false);
////				}
////				if (chbx1uX.isSelected()) {
////					dispose();
////					MainPanele ln=new MainPanele();
////					ln.setVisible(true);
////					chbx1uX.setSelected(true);
////				}
////			}
////		});
//		
////		chbxYSin.addMouseListener(new MouseAdapter() {
////			
////			@Override
////			public void mouseClicked(MouseEvent e) {
////				chbxYSin.setSelected(true);
////				if (chbx1uX.isSelected()) {
////					chbx1uX.setSelected(false);
////				}
////				if (chbxYSin.isSelected()) {
////					dispose();
////					MainPanele ln=new MainPanele();
////					ln.setVisible(true);
////					chbxYSin.setSelected(true);
////
////				}
////			}
////		});
//	}
//}
