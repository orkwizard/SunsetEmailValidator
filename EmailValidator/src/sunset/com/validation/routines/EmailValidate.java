package sunset.com.validation.routines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.validator.routines.EmailValidator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class EmailValidate {

	/*
     * THe URL which should be requested
     * 0: Malformed Email
     */
    private static final String ApiUrl = "https://api1.27hub.com/api/emh/a/v2";
    private static final String apiKey = "A1A0EE94";
    private static final String QueryFormatString = "%1$s?e=%2$s&k=%3$s";
	
    
    private boolean isCorrectForm(String email){
    	EmailValidator validate = EmailValidator.getInstance();
    	
    	if(email == null || "".equals(email))
    		return false;
    	
    	return validate.isValid(email);
    }
    
	public HippoResponse isValidEmail(String email){
		
		HippoResponse res = new HippoResponse();
		//Check if its well formatted
		boolean format = isCorrectForm(email);
		if(!format){
			res.setResult("Bad");
			res.setReason("Mail Malformed");
			return res;
		}
		try {
			URL request = new URL(String.format(QueryFormatString,ApiUrl,email,apiKey));
			HttpURLConnection connection = (HttpURLConnection) request.openConnection();
			connection.setRequestMethod("GET");
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			StringBuilder response = new StringBuilder();
			
			while((inputLine = reader.readLine()) != null){
				response.append(inputLine);
			}
			reader.close();
			
			Gson g = new GsonBuilder().create();
			return g.fromJson(response.toString(), HippoResponse.class);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
