package guiproject;
public interface EmergencyContact 
{
    public void setCPFirstname(String Firstname);
    public void setCPMiddlename(String Middlename);
    public void setCPLastname(String Lastname);
    public void setRelationWithPatient(String RelationWithPatient);
    public void setContactNumber(long ContactNumber);
    public void setContactAddress(String ContactAddress);
     
    public String getCPFirstname();
    public String getCPMiddlename();
    public String getCPLastname();
    public String getRelationWithPatient();
    public long getContactNumber();
    public String getContactAddress();
}
