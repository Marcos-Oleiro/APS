package oo;

public class MostradorConsole implements DiskSpaceListener {	
	
	@Override
	public void diskSpaceChange(DiskSpaceChangeEvent e) {
		System.out.println(e.getUsedBytes());
	}

}
