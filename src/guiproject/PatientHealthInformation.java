package guiproject;
public interface PatientHealthInformation
{
    //SAMPLE HISTORY 
    public void setSignsSymptoms(String SignsSymptoms);
    public void setAllergies(String Allergies);
    public void setMedications(String Medications);
    public void setPastIllnesses(String PastIllnesses);
    public void setLastOralIntake(String LastOralIntake);
    public void setEventLeadtoIlnessInjury(String EventLeadtoIlnessInjury);
    
    public String getSignsSymptoms();
    public String getAllergies();
    public String getMedications();  
    public String getPastIllnesses();
    public String getLastOralIntake();        
    public String getEventLeadtoIlnessInjury();  
}
