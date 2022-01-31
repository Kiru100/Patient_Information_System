package guiproject;
public interface Person 
{
    public void setFirstName(String Fname);
    public void setMiddleName(String Mname);
    public void setLastName(String Lname);
    public void setAge(int age);
    public void setSex(String Sex);
    public void setAddress(String Address);
    public void setBirthDate(String BirthDate);
    
    public String getFirstName();
    public String getMiddleName();
    public String getLastName();
    public int getAge();
    public String getSex();
    public String getAddress(); 
    public String getBirthdate();
}
