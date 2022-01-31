package guiproject;
import java.io.Serializable;
public class Patient extends BasicPersonInformation implements NewPatient,Serializable
{
    private String Bloodtype,MaritalStatus;
    private long PatientContactNumber,Patientnumber;

    public Patient(String Bloodtype, String MaritalStatus, long PatientContactNumber, 
            long Patientnumber, String Firstname, String Lastname, String Middlename, 
            String Sex, String Address, String Birthdate, int age) {
        
        super(Firstname, Lastname, Middlename, Sex, Address, Birthdate, age);
        this.Bloodtype = Bloodtype;
        this.MaritalStatus = MaritalStatus;
        this.PatientContactNumber = PatientContactNumber;
        this.Patientnumber = Patientnumber;
    }

    @Override
    public void setBloodtype(String Bloodtype) {
        this.Bloodtype=Bloodtype;
    }
    @Override
    public void setMaritalStatus(String MaritalStatus) {
        this.MaritalStatus=MaritalStatus;
    }
    @Override
    public void setPatientContactNumber(long PatientContactNumber) {
        this.PatientContactNumber=PatientContactNumber;
    }
    @Override
    public String getBloodtype() {   
        return Bloodtype;
    }
    @Override
    public String getMaritalStatus() {
       return MaritalStatus;
    }
    @Override
    public long getPatientContactNumber() {
        return PatientContactNumber;
    }

    @Override
    public void setPatientnumber(long Patientnumber) {
       this.Patientnumber=Patientnumber;
    }

    @Override
    public long getPatientnumber() {
        return Patientnumber;
    }
}
