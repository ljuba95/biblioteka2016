package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	//lista knjiga
	private LinkedList<Knjiga> knjige = new LinkedList<>();
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		//, ne smeju se dodavati null knjige
		if(knjiga == null || knjige.contains(knjiga))
			throw new RuntimeException("Greska pri unosu knjige");
		knjige.add(knjiga);

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		if(knjiga == null || !knjige.contains(knjiga))
			throw new RuntimeException("Greska pri brisanju knjige");
		
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		if(naslov == null || naslov.isEmpty())
			throw new RuntimeException("Naslov je prazan");

		LinkedList<Knjiga> rezultat = new LinkedList<>();
		
		for (Knjiga knjiga : rezultat) {
			if(knjiga.getNaslov().contains(naslov)){
				rezultat.add(knjiga);
			}
		}
		return rezultat;
	}

}
