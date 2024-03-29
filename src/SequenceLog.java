import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class SequenceLog {
	String fileName;
	String title;
	
	public SequenceLog() {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String t = new SimpleDateFormat("MM.dd.yy-HH.mm.ss").format(timestamp);
        
        title = "SequenceLog(" + t + ")\n";
        fileName = "SequenceLog(" + t + ").txt";
        //System.out.println(fileName);
        
		//Crea file 
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write(title);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}


	void updateLog(String str) 
	{ 
		try { 
			str+="\n";
			// Abre el archivo dado en modo anexar. 
			BufferedWriter out = new BufferedWriter( 
					new FileWriter(fileName, true)); 
			out.write(str); 
			out.close(); 
		} 
		catch (IOException e) { 
			System.out.println("exception occoured" + e); 
		} 
	} 


}
