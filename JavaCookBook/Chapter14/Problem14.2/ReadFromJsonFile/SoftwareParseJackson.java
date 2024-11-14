package org.parsejson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

public class SoftwareParseJackson {

    // Define the file name where the JSON data is stored
    final static String FILE_NAME = "/softwareinfo.json"; // Make sure this file exists in your project directory

    public static void main(String[] args) throws Exception {
        // Create the ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        // Read the JSON data from the file
        // File jsonFile = new File(FILE_NAME);
        //if (!jsonFile.exists()) {
        //   throw new NullPointerException("Can't find " + FILE_NAME);
        //}

        InputStream jsonFile =
                SoftwareParseJackson.class.getResourceAsStream(FILE_NAME);

        if (jsonFile == null) {
            throw new NullPointerException("can't find " + FILE_NAME);
        }

        // Convert the JSON file to a SoftwareInfo object
        SoftwareInfo sware = mapper.readValue(jsonFile, SoftwareInfo.class);

        // Print the parsed SoftwareInfo object
        System.out.println(sware);
    }
}

// SoftwareInfo class to map the JSON
class SoftwareInfo {
    private int id;
    private String firstName;
    private String lastName;
    private List<String> contributors;

    // Getters and setters for each field
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getContributors() {
        return contributors;
    }

    public void setContributors(List<String> contributors) {
        this.contributors = contributors;
    }

    // Override toString() for a nice output format
    @Override
    public String toString() {
        return "Software: " + firstName + " " + lastName + " by " + contributors;
    }
}
