package bc.teste;

import org.junit.Test;

import bc.BreadCrumb;
import static org.junit.Assert.*;

// caso de teste / test case => testa uma unidade (BreadCrumb) <- System Under Test (SUT)

public class BreadCrumbTest {

//	@Test
	public void inserir_null () {
		
		BreadCrumb bc = new BreadCrumb("eletronico", " > ");
		bc.setBreadcrumb(null);
		assertEquals("Nao inseriu null","eletronico", bc.getBreadcrumb());
		
	}
//	@Test
	public void inserir_palavra_vazia(){
		
		BreadCrumb bc = new BreadCrumb("eletronico", " > ");
		bc.setBreadcrumb("");
		assertEquals("Nao ignorou String vazia","eletronico", bc.getBreadcrumb());
		
	}
	
//	@Test
	public void inserir_sempre_minuscula(){
		BreadCrumb bc = new BreadCrumb("eletronico", " > ");
		bc.setBreadcrumb("Plasma");
		assertEquals("Nao ignorou String vazia","eletronico > plasma", bc.getBreadcrumb());
	}
	
	@Test
	public void deletar_raiz (){
		BreadCrumb bc = new BreadCrumb("eletronico", " > ");
		bc.setBreadcrumb("Plasma");
		bc.deleteBreadCrumb();
		bc.deleteBreadCrumb();
		bc.deleteBreadCrumb();
		bc.deleteBreadCrumb();
		assertEquals("deletou raiz","eletronico", bc.getBreadcrumb());
	}
	

}
