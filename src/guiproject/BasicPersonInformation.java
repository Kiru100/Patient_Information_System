package guiproject;
import java.io.Serializable;
public class BasicPersonInformation implements Person,Serializable
{
    protected String Firstname,Lastname,Middlename,
                    Sex,Address,Birthdate;
    protected int age;

    public BasicPersonInformation(String Firstname, String Lastname, 
            String Middlename, String Sex,String Address, String Birthdate, int age) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Middlename = Middlename;
        this.Sex = Sex;
        this.Address = Address;
        this.Birthdate = Birthdate;
        this.age = age;
    }

    @Override
    public void setFirstName(String Firstname) {
       this.Firstname=Firstname;
    }
    @Override
    public void setLastName(String Lastname) {
       this.Lastname=Lastname;
    }
    @Override
    public void setAge(int age) {
        this.age=age;
    }
    @Override
    public void setSex(String Sex) {
        this.Sex=Sex;
    }
    @Override
    public void setAddress(String Address) {
       this.Address=Address;
    }
    @Override
    public void setBirthDate(String Birthdate) {
        this.Birthdate=Birthdate;
    }
    @Override
    public String getFirstName() {
        return Firstname;
    }
    @Override
    public String getLastName() {
       return Lastname;
    }
    @Override
    public int getAge() {
       return age;
    }
    @Override
    public String getSex() {
       return Sex;
    }
    @Override
    public String getAddress() {
        return Address;
    }
    @Override
    public String getBirthdate() {
       return Birthdate;
    }   
    @Override
    public void setMiddleName(String Mname) {
        this.Middlename=Mname;
    }

    @Override
    public String getMiddleName() {
       return Middlename;
    }
}
