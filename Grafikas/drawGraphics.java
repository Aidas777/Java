package NdGrafik;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class drawGraphics extends JPanel {
	
	private Grafikas funkcija;
	
	
	public drawGraphics(Grafikas funkcija) {
		this.funkcija=funkcija;
	}
	
	
	
//	public double getY(double x) {
//		return (int) ((Math.sin(x /10.0))*100);
//	}
//	
//	public double getY(double x) {
//		return (int) x/10;
//	}
	
	
	

	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int w2 = getWidth()/2;
		int h2 = getHeight()/2;
		
		g.setColor(Color.gray);
		g.drawLine(0, h2, w2*2, h2);
		g.drawLine(w2, 0, w2, h2*2);
		
		
		for (double x=0; x<800;x+=0.15) {
			
			g.setColor(Color.blue);
//			g.fillOval((int) x, (int) (getY(x)+getHeight()/2), 2, 2);
//			g.fillOval((int) x, (int) (Math.sin(x /10.0)*100)+130, 2, 2);
			g.fillOval((int) x, (funkcija.getY(x))+h2, 2, 2);
			
//			System.out.println("W: " + getWidth() + " / H:" + getHeight());
		}
	}

}
