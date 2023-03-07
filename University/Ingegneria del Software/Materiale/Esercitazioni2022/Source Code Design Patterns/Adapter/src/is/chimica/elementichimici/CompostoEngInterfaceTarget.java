package is.chimica.elementichimici;

public interface CompostoEngInterfaceTarget {
	
	enum Type {Melting, Boiling, Weight, Formula, Name}
	
	String getInfo(Type t);

}
