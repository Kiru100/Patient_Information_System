package guiproject;
import java.io.Serializable;
public class RegisterNewPatient extends Patient  
                                implements EmergencyContact,
                                PatientHealthInformation,Serializable
{
    private String CPFirstname,CPMiddlename,CPLastname,RelationWithPatient,
                   ContactAddress,SignsSymptoms,Allergies,Medications,PastIllnesses,
                   LastOralIntake,EventLeadtoIlnessInjury;
    private long ContactNumber;

    public RegisterNewPatient(String CPFirstname, String CPMiddlename, 
            String CPLastname, String RelationWithPatient, String ContactAddress, 
            String SignsSymptoms, String Allergies, String Medications, 
            String PastIllnesses, String LastOralIntake, String EventLeadtoIlnessInjury, 
            long ContactNumber, String Bloodtype, String MaritalStatus, 
            long PatientContactNumber, long Patientnumber, String Firstname, 
            String Lastname, String Middlename, String Sex, String Address, 
            String Birthdate, int age) {
        super(Bloodtype, MaritalStatus, PatientContactNumber, Patientnumber, 
                Firstname, Lastname, Middlename, Sex, Address, Birthdate, age);
        
        this.CPFirstname = CPFirstname;
        this.CPMiddlename = CPMiddlename;
        this.CPLastname = CPLastname;
        this.RelationWithPatient = RelationWithPatient;
        this.ContactAddress = ContactAddress;
        this.SignsSymptoms = SignsSymptoms;
        this.Allergies = Allergies;
        this.Medications = Medications;
        this.PastIllnesses = PastIllnesses;
        this.LastOralIntake = LastOralIntake;
        this.EventLeadtoIlnessInjury = EventLeadtoIlnessInjury;
        this.ContactNumber = ContactNumber;
    }
    

    
  
    @Override
    public void setRelationWithPatient(String RelationWithPatient) {
        this.RelationWithPatient=RelationWithPatient;
    }
    @Override
    public void setContactNumber(long ContactNumber) {
        this.ContactNumber=ContactNumber;
    }
    @Override
    public void setContactAddress(String ContactAddress) {
        this.ContactAddress=ContactAddress;
    }
    @Override
    public String getRelationWithPatient() {
        return RelationWithPatient;
    }
    @Override
    public long getContactNumber() {
        return ContactNumber;
    }
    @Override
    public String getContactAddress() {
       return ContactAddress;
    }
    @Override
    public void setSignsSymptoms(String SignsSymptoms) {
        this.SignsSymptoms=SignsSymptoms;
    }
    @Override
    public void setAllergies(String Allergies) {
        this.Allergies=Allergies;
    }
    @Override
    public void setMedications(String Medications) {
       this.Medications=Medications;
    }
    @Override
    public void setPastIllnesses(String PastIllnesses) {
        this.PastIllnesses=PastIllnesses;
    }
    @Override
    public void setLastOralIntake(String LastOralIntake) {
        this.LastOralIntake=LastOralIntake;
    }
    @Override
    public void setEventLeadtoIlnessInjury(String EventLeadtoIlnessInjury) {
        this.EventLeadtoIlnessInjury=EventLeadtoIlnessInjury;
    }
    @Override
    public String getSignsSymptoms() {
        return SignsSymptoms;
    }
    @Override
    public String getAllergies() {
        return Allergies;
    }
    @Override
    public String getMedications() {
        return Medications;
    }
    @Override
    public String getPastIllnesses() {
        return PastIllnesses;
    }
    @Override
    public String getLastOralIntake() {
        return LastOralIntake;
    }
    @Override
    public String getEventLeadtoIlnessInjury() {
        return EventLeadtoIlnessInjury;
    }    
    @Override
    public String getCPFirstname() {
        return CPFirstname;
    }
    @Override
    public void setCPFirstname(String CPFirstname) {
        this.CPFirstname = CPFirstname;
    }
    @Override
    public String getCPMiddlename() {
        return CPMiddlename;
    }
    @Override
    public void setCPMiddlename(String CPMiddlename) {
        this.CPMiddlename = CPMiddlename;
    }
    @Override
    public String getCPLastname() {
        return CPLastname;
    }
    @Override
    public void setCPLastname(String CPLastname) {
        this.CPLastname = CPLastname;
    }  
    
}
