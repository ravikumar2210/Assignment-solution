package URL_Request;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
public class Test_URL_Req {
	public static void main(String[] args) throws ParseException {
     
		try {
	   
     String url = "https://git.io/vpg9V"; 
     URL obj = new URL(url);
     
     
     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
     // optional default is GET
     con.setRequestMethod("GET");
     //add request header
     con.setRequestProperty("User-Agent", "Mozilla/5.0"); 
     
     
     int responseCode = con.getResponseCode();
     System.out.println("\nSending 'GET' request to URL : " + url);
     System.out.println("Response Code : " + responseCode);
     BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
     String inputLine;
     StringBuffer response = new StringBuffer();
     
     int count = 0;
     while ((inputLine = in.readLine()) != null) {
     	response.append(inputLine);
     	count++;
     	
     	//int count = response.length();
       System.out.println("printing json" + count);


     }
     
     System.out.println("Total Lines = "+ in.read());

     //in.close();
     

     //print in String
     System.out.println(response.toString());

     
		 } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

		}
     
} 
    
