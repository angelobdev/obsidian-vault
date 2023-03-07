package is.factorycontratti;

public interface FactoryArchivi {
	//Creator
	ArchivioClienti createArchivioClienti();
	ArchivioContratti<ContrattoTelefonico> createArchivioContrattiTelefonici();
	ArchivioContratti<ContrattoTelevisivo> createArchivioContrattiTelevisivi();
}
