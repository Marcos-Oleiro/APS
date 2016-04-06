package memory;


public class Teste {

	public static void main(String[] args) throws InterruptedException {
		MemoryEventListener console = new ConsolePrinter();
		MemoryEventListener janela = new WindowPrinter();
		//MemoryEventListener bandeja = new TrayPrinter();
		MemoryMonitor monitor = new MemoryMonitor();
		
		monitor.addListeners(console);
		monitor.addListeners(janela);
		//monitor.addListeners(bandeja);
		
		monitor.memoryCheck();
		
	}	

}
