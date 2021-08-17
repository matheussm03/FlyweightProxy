package proxy;

public class Teste {

	public static void main(String[] args) {
		Impressora impressora = new ImpressoraProxy("Arquivo.doc");
		
		System.out.println("Documento sendo carregado:");
		impressora.imprimir();
		System.out.println("Documento não sendo carregado:");
		impressora.imprimir();
		
		
		Impressora impressora2 = new ImpressoraProxy("Arquivo2.doc");
		System.out.println("Documento sendo carregado:");
		impressora2.imprimir();
		
		
	}
	
	

}
