package hw2;

import javax.jws.WebService;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

@WebService(endpointInterface = "hw2.EmbassyWebServices")
public class EmbassyWebServicesImpl implements EmbassyWebServices{

    public String reviewDocumentsAndGiveInterviewDate(String linkToFilesFromThePrivateCompanyAboutApplicant) {

        try {
            URL url = new URL(linkToFilesFromThePrivateCompanyAboutApplicant);
        }
        catch (MalformedURLException e) {
            return "Invalid Link!";
        }

        LocalDate today = LocalDate.now();
        LocalDate interviewDate = today.plusDays(7);

        return "Interview Date: " + interviewDate.toString();
    }

    public String checkIfApplicantAttendedInterview(Boolean attended) {

        if(!attended){

            LocalDate today = LocalDate.now();
            LocalDate interviewDate = today.plusDays(14);

            return "You have another chance to attend the interview on " + interviewDate.toString();
        }
        else{

            return "Documents sent to the Interior Ministry. Tracking number: "+ (int) (Math.random() * 1000000);
        }
    }
}
