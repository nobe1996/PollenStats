
public class Station {
	private String name, unsplit="";
	private String[] split;
	private String[] db = new String[5480];

	//------------------------------------------
	
	public Station(String name){
		this.name=name;
	}
	public String[] getDb() {
		return db;
	}
	public void setDb(String[] strings) {
		this.db = strings;
	}
	public String getName() {
		return name;
	}
	public String getUnsplit() {
		return unsplit;
	}
	public void setUnsplit(String unsplit) {
		this.unsplit += unsplit + " ";
	}
	
	public String[] getSplit() {
		return split;
	}
	
	//-------------------------------------------
	//R: ennek kéne majd tömbökbe szedni a számokat, de ez TODO
	public void sortString(){
		this.split=(this.unsplit.split(" "));
		for (int i=0;i<getSplit().length;i++){
			if(Integer.parseInt(getSplit()[i])%1000>0){
				getSplit()[i] = "EVSZAM";
			}
		}
	}
	
}
