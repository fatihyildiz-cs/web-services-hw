package hw2;

@javax.jws.WebService
public interface PrivateCompanyWebServices {


    @javax.jws.WebMethod
    public String registerApplicantAndSendRequiredDocumentList(String name, String id, String country);

    @javax.jws.WebMethod
    public String checkIfDocumentsAreSufficient(String passportNo, String flightNumber, String criminalRecord);
}
