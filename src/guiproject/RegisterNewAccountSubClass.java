package guiproject;
import java.io.Serializable;
public class RegisterNewAccountSubClass extends BasicPersonInformation implements NewAccount,Serializable
{
    private String UserPassword, UserName, UserEmail;
    public RegisterNewAccountSubClass(String UserPassword, 
            String UserName, String UserEmail, String Firstname, 
            String Lastname, String Middlename, String Sex, 
            String Address, String Birthdate, int age) {
        super(Firstname, Lastname, Middlename, Sex, Address, Birthdate, age);
        this.UserPassword = UserPassword;
        this.UserName = UserName;
        this.UserEmail = UserEmail;
    }

    @Override
    public void setUserPassword(String UserPassword) {
        this.UserPassword=UserPassword; 
    }
    @Override
    public void setUserName(String UserName) {
       this.UserName=UserName;
    }
    @Override
    public void setUserEmail(String UserEmail) {
        this.UserEmail=UserEmail;
    }
    @Override
    public String getUserPassword() {
        return UserPassword;
    }
    @Override
    public String getUserName() {
        return UserName;
    }
    @Override
    public String getUserEmail() {
        return UserEmail;
    }   
}

