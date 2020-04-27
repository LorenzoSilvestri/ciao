public class Libro {
	private String nome;
	private Autore autore;
	private float prezzo;
	private int quantita;
	public Libro(String nome, Autore autore, float prezzo, int quantita)
	{
		this.nome=nome;
		this.autore=autore;
		this.prezzo=prezzo;
		this.quantita=quantita;
	}
	
	public String getNome(){
		return nome;
	}
	public Autore getAutore() {
		return autore;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo=prezzo;
	}
	public void setQuantita(int quantita) {
		this.quantita=quantita;
	}
	
	@Override
	public String toString() {
		return "Libro [nome=" + nome + ", autore=" + autore + ", prezzo=" + prezzo + ", quantita=" + quantita
				+ ", getNome()=" + getNome() + ", getPrezzo()=" + getPrezzo() + ", getQuantita()=" + getQuantita()
				+ ", getAautore()=" + getAutore() + "]";
	}

}
