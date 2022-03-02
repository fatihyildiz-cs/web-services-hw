package hw2;

@javax.jws.WebService
public interface VisaApplication {

    @javax.jws.WebMethod
    public String reviewDocumentsAndGiveInterviewDate(String linkToFilesFromThePrivateCompanyAboutApplicant);

    @javax.jws.WebMethod
    public String registerApplicantAndSendRequiredDocumentList(String name, String id, String country);
}
