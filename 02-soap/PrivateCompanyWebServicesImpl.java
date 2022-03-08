package hw2;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@WebService(endpointInterface = "hw2.PrivateCompanyWebServices")
public class PrivateCompanyWebServicesImpl implements PrivateCompanyWebServices {


    public String registerApplicantAndSendRequiredDocumentList(String name, String id, String country) {

        System.out.println("Registering "+name+" "+id+" to database.");

        ArrayList<String> requiredDocuments = new ArrayList<>();
        requiredDocuments.add("Passport");
        requiredDocuments.add("Flight Details");
        requiredDocuments.add("Criminal record from "+country);

        return "You are registered. Required documents: " + requiredDocuments.toString();
    }

    public String checkIfDocumentsAreSufficient(String passportNo, String flightNumber, String criminalRecord) {

        Set<String> missingDocuments = new HashSet<>();

        if(passportNo.equals("")){
            missingDocuments.add("Passport Number");
        }
        if(flightNumber.equals("")){
            missingDocuments.add("Flight Number");
        }
        if(criminalRecord.equals("")){
            missingDocuments.add("Criminal Record");
        }

        if (missingDocuments.isEmpty()){
            return "Your documents are correct and have been sent to the Embassy for review.";
        }
        else{
            return "Missing documents: " + missingDocuments;
        }

    }

}

