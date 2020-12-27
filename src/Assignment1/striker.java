package Assignment1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class striker extends player {
	public void Add_player(String nam,String positio,String clu, String nationalit, String pric) throws IOException 
	{
		name=nam;
		position=positio;
		club=clu;
		nationality=nationalit;
		price=pric;
		FileWriter f1 =new FileWriter("Striker.txt",true);
		BufferedWriter br = new BufferedWriter(f1);
		br.write(name+" "+position+" "+club+" "+nationality+" "+price);
		br.write("\n");
		br.close();
		f1.close();
	}

}
