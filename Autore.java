public class Autore {
	private String nom_autore;
	private String email;
	private String gender;
	public Autore(String nom_autore,String email, String gender) {
		this.nom_autore=nom_autore;
		this.email=email;
		this.gender=gender;
	}
	public String getNom_autore() {
		return nom_autore;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Autore [nom_autore=" + nom_autore + ", email=" + email + ", gender=" + gender + ", getNom_autore()="
				+ getNom_autore() + ", getEmail()=" + getEmail() + ", getGender()=" + getGender() + "]";
	}
	
	
	
}
