package main;
import java.net.*;
import java.io.*;

public class URLContent {
	public static Boolean getContent(String URL) {
        Boolean found = false;

        try {
        	// get URL content
        	URL url = new URL("http://" + URL);
            URLConnection conn = url.openConnection();

            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String inputLine;
            while ((inputLine = br.readLine()) != null) {
            	found = true;
            	EmailAddresses.find(inputLine);
            }
            br.close();

            System.out.println("Done");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return found;
	}
}
