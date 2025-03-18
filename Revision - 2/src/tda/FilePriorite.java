package tda;

@SuppressWarnings("unchecked")
public class FilePriorite<E extends Comparable<E>> {

	E[] tab;
	int nbElements = 0;
	
	public FilePriorite() {
		tab = (E[]) new Integer[10];
	}
	
	public FilePriorite(int taille) {
		tab = (E[]) new Integer[taille];
	}
	
	/**
	 * M�thode qui ajoute un élément à la file. L'élément doit �tre plac�
	 * de manière à ce que les éléments les plus petits sortent en premier de 
	 * la file. 
	 * @param element
	 */
	public void enfiler(E element) {
		
		if(nbElements == tab.length) {
			agrandirTab();
		}

		// à compléter
		
	}
	
	public E defiler() throws Exception{

		if(nbElements == 0) {
			throw new Exception("La file est vide");
		}
		
		nbElements--;
		return tab[nbElements];
	}

	private void decalageVersFin(int index) {
		
		for(int i=nbElements-1;i>=index;i--) {
			
			tab[i+1] = tab[i];
		}
		
	}

	private void agrandirTab() {

		E[] temp = (E[]) new Integer[tab.length*2];
		
		for(int i=0;i<tab.length;i++) {
			temp[i] = tab[i];
		}
		
		tab = temp;
	}
}
