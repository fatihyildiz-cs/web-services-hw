package hw2;

import javax.jws.WebService;
import java.time.LocalDate;
import java.util.ArrayList;

@WebService(endpointInterface = "hw2.VisaApplication")
public class VisaApplicationImpl implements VisaApplication {

    public String reviewDocumentsAndGiveInterviewDate(String linkToFilesFromThePrivateCompanyAboutApplicant) {

        if(linkToFilesFromThePrivateCompanyAboutApplicant.equals("")){
            return "Some documents missing!";
        }

        LocalDate today = LocalDate.now();
        LocalDate interviewDate = today.plusDays(7);

        return "Interview Date: " + interviewDate.toString();
    }

    public String registerApplicantAndSendRequiredDocumentList(String name, String id, String country) {

        System.out.println("Registering "+name+" "+id+" to database.");

        ArrayList<String> requiredDocuments = new ArrayList<>();
        requiredDocuments.add("Passport");
        requiredDocuments.add("Flight Details");
        requiredDocuments.add("Criminal record from "+country);

        return requiredDocuments.toString();
    }


}

