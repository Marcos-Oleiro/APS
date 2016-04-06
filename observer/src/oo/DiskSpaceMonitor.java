package oo;

import java.io.File;
import java.util.ArrayList;

// Princípio Open/Close (OCP)
// Classes devem estar "fechadas" para modificações
// mas "abertas" para extensão do seu comportamento
public class DiskSpaceMonitor { // É o sujeito (subject, o observado) 
	
	// EventSource (fonte de eventos)
	// Event (alteração do espaço disponível em disco)
	// Listener (ouvinte dos eventos a partir de uma fonte)
	
	// acoplamento aparece nas dependências
	// a maior dependência está na declaração "new"
	
	private ArrayList<DiskSpaceListener> ouvintes = new ArrayList<>();
	
	private long livre = 0L;
    private long total = 0L;
    private long usado = 0L;	
    
    // adicionar ouvintes add*****
    public void addDiskSpaceListener(DiskSpaceListener ouvinte) {
    	ouvintes.add(ouvinte);
    }
    
    public void removeDiskSpaceListener(DiskSpaceListener ouvinte) {
    	ouvintes.remove(ouvinte);
    }
    

	public void monitorar() {
		File unidade = new File("/home");	

	    while (true) {
	        livre = unidade.getFreeSpace();
	        total = unidade.getTotalSpace();
	        if (total - livre != usado) { // EVENTO!
	            usado = total - livre;
	            // double gbUsado = usado / 1024.0 / 1024.0 / 1024.0;            
	            notificarOuvintes();
	        }
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	}

	private void notificarOuvintes() {
		// TODO fazer a noticação aos ouvintes da mudança de espaço
		DiskSpaceChangeEvent evento = new DiskSpaceChangeEvent(total, usado);
		// foreach equivale a for (int i = 0; i < ouvintes.size(); i++) { ouvintes.get(i)
		for (DiskSpaceListener ouvinte : ouvintes) {
			ouvinte.diskSpaceChange(evento);
		}
	}

}
