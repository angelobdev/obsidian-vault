package is.factorycontratti;

import java.util.List;

public class ArchivioGenerale {
	
	
	private is.factorycontratti.FactoryArchivi lnkFactoryArchivi;


	ArchivioContratti<ContrattoTelefonico> contrattiTelefonici;
	
	
	ArchivioContratti<ContrattoTelevisivo> contrattiTelevisivi;

	
	ArchivioClienti clienti;
	
	/*
	 * query 
	 */

	public ArchivioGenerale(FactoryArchivi factory) {
		clienti = factory.createArchivioClienti();
		contrattiTelefonici = factory.createArchivioContrattiTelefonici();
		contrattiTelevisivi = factory.createArchivioContrattiTelevisivi();
	}

	public Cliente cercaCliente(String cod) {
		return clienti.getClienteCodice(cod);
	}

	public ContrattoTelevisivo cercaContrattoTelevisivo(String cod) {
		return contrattiTelevisivi.getContrattoCodice(cod);
	}

	public ContrattoTelefonico cercaContrattoTelefonico(String num) {
		return contrattiTelefonici.getContrattoCodice(num);
	}

	public List<ContrattoTelefonico> cercaContrattiTelCli(String cognome, String nome) {
		Cliente cli = clienti.getClienteNome(cognome, nome);
		return contrattiTelefonici.getContrattiCliente(cli.getCodice());

	}
}
