package proxy;

public class ImpressoraHp implements Impressora {
	
	private String nomeArquivo;
	
	public ImpressoraHp(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		this.carregar(nomeArquivo);
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo " + this.nomeArquivo + "\n");
		
	}
	
	public void carregar(String nomeArquivo) {
		System.out.println("Carregando " + nomeArquivo);
		
	}	

}
