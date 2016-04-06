package bc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BreadCrumb bc = new BreadCrumb("eletronico", " > ");
		
		
		bc.setBreadcrumb(null);
		
		System.out.println( bc.getBreadcrumb());
		
//		System.out.println( bc.getBreadcrumb());

		bc.setBreadcrumb("PlaSma");
		
		System.out.println( bc.getBreadcrumb());
//		
//		bc.setBreadcrumb("50 pol");
//		
//		System.out.println( bc.getBreadcrumb());	
//		
//		
//		System.out.println(bc.deleteBreadCrumb());
//		
//		System.out.println(bc.deleteBreadCrumb());
		
//		System.out.println(bc.deleteBreadCrumb());
//		
//		System.out.println(bc.deleteBreadCrumb());
//		
//		System.out.println(bc.deleteBreadCrumb());
//		
//		System.out.println("teste");
//		
//		System.out.println(bc.deleteBreadCrumb());
	}

}
