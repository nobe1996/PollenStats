import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			
			CsvReader data = new CsvReader("src/STATION.csv");
			data.readHeaders();
//teszt 2
		//-------------eddig ne változtass---------------
		//R: az első index mindenhol 1	
			String[] Stations = new String[69];	
			Station[] Records = new Station[69];
			
			System.out.println("s");
		//R: olvas headereket a csvből, meg csinál objektumokat	
			for(int l=1;l<69;l++){
				Stations[l]=data.getHeader(l);	
				Records[l] = new Station(Stations[l]);
			}		
			
			/*for(int i = 1;i<69;i++){
				System.out.println(Records[i].getName());
			}*/

			System.out.println("teszt "+Records.length + Stations.length);
			
		//R: ez a szar
			//for(int i=1;i<69;i++){
				while(data.readRecord()){
					Records[16].setUnsplit(data.get(Stations[16]));	
				}
			
			System.out.println(Stations[1]+Records[16].getUnsplit());
			
			data.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}