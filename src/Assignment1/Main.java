package Assignment1;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.ArrayList;

public class Main 
{
	//public static int i=0;
	//public static int j=0;
	private static BufferedReader br1;
	private static BufferedReader br2;
	private static BufferedReader br3;
	private static BufferedReader br4;
	private static BufferedReader br5;
	private static BufferedReader br6;
	public static int i=0;
	public static int j=0;
	public static ArrayList  <user> users =new ArrayList ();
	public static ArrayList  <player> Players =new ArrayList ();
	public static Register_Login p;
	public static void main (String[] args) throws IOException {
		
		//users=new user[5];
		br1 = new BufferedReader(new FileReader("C:\\Users\\mms_h\\OneDrive\\Desktop\\usernames.txt"));
		 String[] line1=new String[8];
		 while ((line1[i] = br1.readLine()) != null) 
		 {
			 i++;
		 }
		 br2 = new BufferedReader(new FileReader("C:\\Users\\mms_h\\OneDrive\\Desktop\\pass.txt"));
		 String[] line2=new String[8];
		 while ((line2[j] = br2.readLine()) != null) 
		 {
			 users.add(new user(line1[j],line2[j]));
			 j++;
		 }
		 br3 = new BufferedReader(new FileReader("Striker.txt"));
		 br4 = new BufferedReader(new FileReader("Goal_Keeper.txt"));
		 br5 = new BufferedReader(new FileReader("Mid_Fielder.txt"));
		 br6 = new BufferedReader(new FileReader("Defender.txt"));
		 String[] line3=new String[8];
		 while ((line3[i] = br3.readLine()) != null) 
		 {
			 i++;
		 }
		p=new Register_Login(users);
		Scanner in = new Scanner(System.in);
		boolean x = true;
		String u="";
		String pa="";
		while(x==true) 
		{
			System.out.println("Login/Register");
			String y = in.nextLine();
			if(y.equals("Login"))
			{
				System.out.println("Please enter username");
				u=in.nextLine();
				System.out.println("Please enter Password");
				pa=in.nextLine();
				p.login(u, pa);
				boolean t=true;
				while(t==true)
				{
					System.out.println("Do u want to add a NEW Player OR Add a Squad");
					String choice2= in.nextLine();
					if(choice2.equals("Player")) 
					{
						player p1;
						System.out.print("Please Enter the Name: ");
						String p2=in.nextLine();
						System.out.print("Please Enter the Position: ");
						String p3=in.nextLine();
						System.out.print("Please Enter the Club: ");
						String club1=in.nextLine();
						System.out.print("Please Enter the Nationality: ");
						String nationality1=in.nextLine();
						System.out.print("Please Enter the Price: ");
						String price1=in.nextLine();
						if(p3.equals("Defender")) 
						{
							p1=new defender();
							p1.Add_player(p2,p3,club1,nationality1,price1);
						}
						else if(p3.equals("Striker")) 
						{
							p1=new striker();
							p1.Add_player(p2,p3,club1,nationality1,price1);
						}
						else if(p3.equals("MidFielder")) 
						{
							p1=new midfielder();
							p1.Add_player(p2,p3,club1,nationality1,price1);
						}
						else if(p3.equals("GoalKeeper")) 
						{
							p1=new goalkeeper();
							p1.Add_player(p2,p3,club1,nationality1,price1);
						}
					}
					else if(choice2.equals("Squad")) 
					{
						
					}
					else if(choice2.equals("Log-out")) 
					{
						t=false;
					}
				}
			}
			else if(y.equals("Register"))
			{
				System.out.println("Please enter username");
				u=in.nextLine();
				System.out.println("Please enter Password");
				pa=in.nextLine();
				p.Register(u, pa);
				
			}
			else if(y.equals("quit")) 
			{
				x=false;
			}
			
		}
	}
}