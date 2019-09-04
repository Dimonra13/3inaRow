package controler;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;

public class ColorListener implements ItemListener{
	
	private ArrayList<JPanel> panels; 
	private Choice colorChoice;
	
	public ColorListener() {
		panels = new ArrayList<>();
	}
	
	public void addPanels (JPanel pnew) {
		panels.add(pnew);
	}
	
	public void addChoice(Choice c) {
		colorChoice=c;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(colorChoice.getSelectedItem().contentEquals("Pink")) {
			for(JPanel paux:panels) {
				paux.setBackground(new Color(255,204,229));
			}
		}else if(colorChoice.getSelectedItem().contentEquals("Gray")) {
			for(JPanel paux:panels) {
				paux.setBackground(new Color(234,234,234));
			}
		}else if(colorChoice.getSelectedItem().contentEquals("Blue")) {
			for(JPanel paux:panels) {
				paux.setBackground(new Color(204,229,255));
			}
		}
	}

}
