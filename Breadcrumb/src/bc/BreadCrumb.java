package bc;
public class BreadCrumb {
	
	private String root;
	private String breadcrumb;
	private String separator;
	
	public BreadCrumb(String root, String separator){
		this.root = root;
		this.breadcrumb = root ; 
		this.separator = separator;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	public String getBreadcrumb() {
		return breadcrumb;
	}
	
	
	public void setBreadcrumb(String breadcrumb) {
		if (breadcrumb == null || breadcrumb.trim() == "") return;
		this.breadcrumb = this.breadcrumb + this.separator
				+ breadcrumb.toLowerCase() ;
	}
	 public String deleteBreadCrumb ( ) {
		int j = 0;
		char [] charArray = this.breadcrumb.toCharArray(); 
		int size = charArray.length;
		int root_size = this.root.length();
//		System.out.println(size);
//		System.out.println(this.root);
		for (int i = size -1; i >= root_size ; i--) {
			if (charArray[i] ==  '>' ) {
				this.breadcrumb = this.breadcrumb.substring(0, i);
				return this.breadcrumb;
			}
			j++;
		}
		this.breadcrumb = this.breadcrumb.substring(0, size-j);
		return this.breadcrumb;
	 }
	
	

	
	
	
	
	
	
	

}
