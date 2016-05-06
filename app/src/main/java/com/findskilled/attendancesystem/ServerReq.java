package com.findskilled.attendancesystem;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lenovo on 05-05-2016.
 */
public class ServerReq {

    static String stream=null;
    public String FacultyValidation(String username,String password) throws IOException {
        try{
            URL url = new URL("https://www.findskilled.in/ums/facultyValidate.php?username="+username+"&password="+password);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            //check the connection status
            if(urlConnection.getResponseCode() == 200) {
                // if response code = 200 ok
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                // Read the BufferedInputStream
                BufferedReader r = new BufferedReader(new InputStreamReader(in));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null) {
                    sb.append(line);
                }
                stream = sb.toString();

                // End reading...............

                // Disconnect the HttpURLConnection
                urlConnection.disconnect();
            } else {
                // Do something
            }
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {


        }
        // Return the data from specified url
        return stream;


    }
    public String ViewBranch() throws IOException {
        try{
            URL url = new URL("https://www.findskilled.in/ums/BranchName.php");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            //check the connection status
            if(urlConnection.getResponseCode() == 200) {
                // if response code = 200 ok
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                // Read the BufferedInputStream
                BufferedReader r = new BufferedReader(new InputStreamReader(in));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null) {
                    sb.append(line);
                }
                stream = sb.toString();

                // End reading...............

                // Disconnect the HttpURLConnection
                urlConnection.disconnect();
            } else {
                // Do something
            }
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {


        }
        // Return the data from specified url
        return stream;


    }

    public String AddBranch(String fac_id,String branch_name) throws IOException {
        try{
            URL url = new URL("https://www.findskilled.in/ums/AddBranch.php?fac_id="+fac_id+"&branch_name="+branch_name);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            //check the connection status
            if(urlConnection.getResponseCode() == 200) {
                // if response code = 200 ok
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                // Read the BufferedInputStream
                BufferedReader r = new BufferedReader(new InputStreamReader(in));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null) {
                    sb.append(line);
                }
                stream = sb.toString();

                // End reading...............

                // Disconnect the HttpURLConnection
                urlConnection.disconnect();
            } else {
                // Do something
            }
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {


        }
        // Return the data from specified url
        return stream;


    }
    public String BranchName(String fac_id) throws IOException {
        try{
            URL url = new URL("https://www.findskilled.in/ums/AddBranch.php?fac_id="+fac_id);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            //check the connection status
            if(urlConnection.getResponseCode() == 200) {
                // if response code = 200 ok
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                // Read the BufferedInputStream
                BufferedReader r = new BufferedReader(new InputStreamReader(in));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null) {
                    sb.append(line);
                }
                stream = sb.toString();

                // End reading...............

                // Disconnect the HttpURLConnection
                urlConnection.disconnect();
            } else {
                // Do something
            }
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {


        }
        // Return the data from specified url
        return stream;


    }



}
