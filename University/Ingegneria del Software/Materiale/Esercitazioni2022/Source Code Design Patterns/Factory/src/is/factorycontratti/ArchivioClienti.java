package is.factorycontratti;

import java.util.List;


public interface ArchivioClienti {
	//Product

	/**
	 * @directed true
	 * @link composition
	 * @supplierCardinality 0..*
	 */
	public is.factorycontratti.Cliente lnkCliente = null;

	/**
	 * @return restituisce la lista dei clienti in archivio
	 */
	List<Cliente> getListaClienti();

	/**
	 * @param cognome 
	 * @param nome
	 * @return
	 */
	Cliente getClienteNome(String cognome, String nome);

	/**
	 * @param cod
	 * @return
	 */
	Cliente getClienteCodice(String cod);

}
