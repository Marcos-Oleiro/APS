package memory;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class WindowPrinter extends JFrame implements MemoryEventListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField texto;
	private JLabel rotulo;
	
	public WindowPrinter() {
		this.texto = new JTextField();
		this.rotulo = new JLabel("Memória sendo utilizada.");
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
	
	public void MemoryPrint (MemoryEvent e) {
		this.texto.setText((e.getUsedMemory()));
	}

}
