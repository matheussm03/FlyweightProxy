package proxy;

public class ImpressoraProxy implements Impressora {
	
	private ImpressoraHp impressoraHp;
	private String nomeArquivo;
	
	public ImpressoraProxy(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public void imprimir() {
		if (impressoraHp == null) {
			impressoraHp = new ImpressoraHp(nomeArquivo);
		}
		impressoraHp.imprimir();
	}

}
