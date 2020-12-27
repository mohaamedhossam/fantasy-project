package Assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class Register_Login 
{
	//ArrayList<String> users = new ArrayList <String>();
	//ArrayList<String> pass = new ArrayList <String>();
	//user users[]=new user[20];
	ArrayList <user> users;
	int k;
	public Register_Login(ArrayList <user> u) throws IOException
	{
		 users=u;
	}
/*	{
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\mms_h\\Desktop\\usernames.txt"));
		 String line1;
		 while ((line1 = br1.readLine()) != null) 
		 {
			users[i].username=line1;
		  // users.add(line1);
			i++;
		 }
		 BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\mms_h\\Desktop\\pass.txt"));
		 String line2;
		 while ((line2 = br2.readLine()) != null) 
		 {
			 users[j].password=line2;
		   //pass.add(line2);
			j++;
		 }
	}*/
	
	public void login(String user_name,String password) throws IOException 
	{
		
		for(int i=0;i<users.size();i++) 
		{
			if(user_name.equals(users.get(i).username))
			{
				k=i;
				break;
			}
		}
		if(password.equals(users.get(k).password)) 
		{
			System.out.println("Login Successfully");
		}
		else
			System.out.println("Password doesnot match");
	}
	public void Register(String user_name, String user_password) throws IOException
	{
		users.add(new  user(user_name,user_password));
		String path1 = "C:\\Users\\mms_h\\Desktop\\usernames.txt";
		String path2 = "C:\\Users\\mms_h\\Desktop\\pass.txt";
		OutputStream os1 = new FileOutputStream(new File(path1), true);
		OutputStream os2 = new FileOutputStream(new File(path2), true);
		os1.write("\n".getBytes(), 0, "\n".length());
		os1.write(user_name.getBytes(), 0,user_name.length());
		os2.write("\n".getBytes(), 0, "\n".length());
		os2.write(user_password.getBytes(), 0,user_password.length());
		os1.close();
		os2.close();
	}
}