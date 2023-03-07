package is;

import java.util.List;

import is.factorycontratti.ArchivioClienti;
import is.factorycontratti.ArchivioContratti;
import is.factorycontratti.ArchivioGenerale;
import is.factorycontratti.Cliente;
import is.factorycontratti.Contratto;
import is.factorycontratti.FactoryArchivi;
import is.factorycontratti.FactoryArchiviTxt;

public class TestContratti {
	
	public static void main(String[] args){
		
		FactoryArchivi factory = new FactoryArchiviTxt();
		
		ArchivioClienti ac = factory.createArchivioClienti();		
		List<Cliente> l=ac.getListaClienti();		
		System.out.println(l);
		
		ArchivioGenerale ag = new ArchivioGenerale(factory);
		Cliente c = ag.cercaCliente("cod3");
		System.out.println(c);
	}
		
}
