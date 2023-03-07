package is.lista;

import is.lista.copyonwrite.ListaCopyOnWrite;
import is.lista.impl.ListaSuArray;
import is.lista.sicurezza.ListaSicura;

public class Liste {

	public static <E> Lista<E> creaLista(int dim, boolean proxy) {
		Lista<E> miaLista = new ListaSuArray<E>(dim);
		if (!proxy)
			return miaLista;
		else
			return new ListaCopyOnWrite<E>(miaLista);
	}

	public static <E> Lista<E> creaListaSicura(int dim, int nread, int nwrite, boolean proxy) {
		Lista<E> miaLista = new ListaSuArray<E>(dim);

		if (proxy)
			miaLista = new ListaCopyOnWrite<E>(miaLista);

		return new ListaSicura<E>(miaLista, nread, nwrite);
	}

}
