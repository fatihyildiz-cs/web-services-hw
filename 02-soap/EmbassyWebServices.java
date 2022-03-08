package hw2;

@javax.jws.WebService
public interface EmbassyWebServices {

    @javax.jws.WebMethod
    public String reviewDocumentsAndGiveInterviewDate(String linkToFilesFromThePrivateCompanyAboutApplicant);

    @javax.jws.WebMethod
    public String checkIfApplicantAttendedInterview(Boolean attended);

}
