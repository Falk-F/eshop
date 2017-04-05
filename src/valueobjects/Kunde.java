package valueobjects;

public class Kunde {

	private String name;//
	private String strasse = "";//
	private String hausnummer = "";
	private String ort = "";
	private String plz = "";//
	private int kundenNr;
	
	  public Kunde(int nr, String name) {
			kundenNr = nr;
			this.name = name;
	  }
	  public
	  
	  public String getName(){
		  return name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  public String getPlz() {
		  return plz;
	  }

	  public void setPlz(String plz) {
		  this.plz = plz;
	  }

	  public String getStrasse() {
		  return strasse;
	  }

	  public void setStrasse(String strasse) {
		  this.strasse = strasse;
	}
}
