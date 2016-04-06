package memory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MemoryMonitor {
	private String linha2;
	private Process proc;
	private BufferedReader in;
	private InputStream input;
	private String aux;
	
	ArrayList <MemoryEventListener> listeners = new ArrayList<MemoryEventListener>();
	
	public void memoryCheck() {
		
		try {
			while (true) {
				proc = Runtime.getRuntime().exec("free -h");
				input = proc.getInputStream();
				in = new BufferedReader(new InputStreamReader(input));
				in.readLine();
				linha2 = in.readLine();
				aux = (String) linha2.subSequence(25, 29); 
				notifyListeners();
				//System.out.println(aux);
//				 System.out.println("------------------------------------------------------------------------------------");
//				 System.out.println(linha1);
//				 System.out.println(linha2);
				 try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void notifyListeners (){
		
		MemoryEvent event = new MemoryEvent(aux);
		
		for (MemoryEventListener listener : listeners) {
			listener.MemoryPrint(event);
		}		
	}
	
	public void addListeners (MemoryEventListener listener){		
		listeners.add(listener);		
	}
	public void removeListeners (MemoryEventListener listener){		
		listeners.remove(listener);		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
