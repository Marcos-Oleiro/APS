package oo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MostradorJanela extends JFrame 
							 implements DiskSpaceListener {
	
	private JTextField texto;
	private JLabel rotulo;
	
	public MostradorJanela() {
		this.texto = new JTextField();
		this.rotulo = new JLabel("bytes usados");
		this.texto.setEnabled(false);
		this.texto.setColumns(10);
		this.texto.setHorizontalAlignment(JTextField.RIGHT);
		this.setLayout(new FlowLayout(FlowLayout.LEADING));
		this.getContentPane().add(texto);
		this.getContentPane().add(rotulo);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void diskSpaceChange(DiskSpaceChangeEvent e) {
		this.texto.setText(Long.toString(e.getUsedBytes()));
	}

}
