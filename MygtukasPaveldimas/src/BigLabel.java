import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class BigLabel extends JLabel {
	
//	private void init() {
//		this.setForeground(new Color(214,118,63));
//		this.setFont(new Font("Verdana", Font.PLAIN,12));
//		
//	}
//
//	public BigLabel() {
//		super();
//		this.init();
//		
//	}
//
//	public BigLabel(String alltxt, int horizontalAlignment) {
//		super(alltxt, horizontalAlignment);
//		this.init();
//		this.setText(alltxt.toUpperCase());
//	}
//
	public BigLabel(String txt) {
		super(txt);
//		this.init();
//		this.setText(alltxt.toUpperCase());
	}

	@Override
	public void setText(String txt) {
		super.setText(txt.toUpperCase());
	}

	
	
}
