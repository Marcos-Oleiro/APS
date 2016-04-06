package memory;

public class ConsolePrinter implements MemoryEventListener{

	//@Override
	public void MemoryPrint(MemoryEvent e) {
		// TODO Auto-generated method stub		
		System.out.println(e.getUsedMemory());
		
	}

}
