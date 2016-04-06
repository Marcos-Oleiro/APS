package memory;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class TrayPrinter implements MemoryEventListener {
	
	String info ;
	public TrayPrinter (){
		SystemTray tray =  SystemTray.getSystemTray ();
		// criação do ícone q vai para a bandeja do sistema (constante)
		final TrayIcon trayIcon;
		// criação da imagem do ícone (constante)
		final Image image = Toolkit.getDefaultToolkit().getImage("tux.png");
		
	    //ação de sair
	    ActionListener sairListener = new ActionListener() {
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "Saindo"); // mensagem de saída
	          System.exit(0);
	       }
	    };
	    MouseListener mouse_over = new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, info);
			}
		};
	    
	    PopupMenu popup = new PopupMenu();
	    // clique direito
	    MenuItem sairItem = new MenuItem("Sair");
	    sairItem.addActionListener(sairListener);
	    popup.add(sairItem);
	    
	    // Criando o tray icon e colocando o popup para o
	    // clique com o botão direito
	    
	    trayIcon = new TrayIcon(image, "info" , popup);
	    
	    //Auto-ajuste do tamanho
	    trayIcon.setImageAutoSize(true);
	    
	    try {
	          tray.add(trayIcon);
	          //balão de aviso
	          trayIcon.displayMessage("","" , TrayIcon.MessageType.INFO);
	       } catch (AWTException e) {
	          System.err.println("TrayIcon não pode ser adicionado no sistema.");
	       }
	    
	    
		
		
	}	
	public void MemoryPrint(MemoryEvent e) {
		
		info = e.getUsedMemory();
			
	}
	
	

}
