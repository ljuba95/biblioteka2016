package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<>();
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		LinkedList<Knjiga> rezultat = new LinkedList<>();
		
		for (Knjiga knjiga : rezultat) {
			if(knjiga.getNaslov().contains(naslov)){
				rezultat.add(knjiga);
			}
		}
		return rezultat;
	}

}