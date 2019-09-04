package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ChangePanelLis implements ActionListener {
	private JPanel source;
	private JPanel destination;
	
	public void setOrigin(JPanel s) {
		source=s;
	}
	
	public void setDetination(JPanel d) {
		destination=d;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		source.setVisible(false);
		destination.setVisible(true);
		
	}
	
}
