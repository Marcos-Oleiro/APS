package oo;

public class Main {

  public static void main(String[] args) {
	  // Padrões de Projeto (Design Patterns)
	  // - Observer (Observador)
	  
	  DiskSpaceListener janela = new MostradorJanela();
	  DiskSpaceListener console = new MostradorConsole();
	  
	  // os ouvintes não são obrigatório para a fonte de eventos
	  // podem ser adicionados vários ouvintes (a qualquer instante)
	  // os ouvintes podem ser removidos (a qualquer instante)
	  
	  DiskSpaceMonitor monitor = new DiskSpaceMonitor();
	  
	  monitor.addDiskSpaceListener(janela);
	  monitor.addDiskSpaceListener(console);
	
	  
	  monitor.monitorar();	 
	  
  }
}
