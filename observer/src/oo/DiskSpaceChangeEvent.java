package oo;

public class DiskSpaceChangeEvent {
	
	private long total;
	private long bytesUsados;
	
	public DiskSpaceChangeEvent(long total, long bytesUsados) {
		this.total = total;
		this.bytesUsados = bytesUsados;
	}
	
	public long getTotal() {
		return total;
	}
	
	public long getUsedBytes() {
		return bytesUsados;
	}

}
