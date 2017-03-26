package piatr;

/**
 * Created by piatr on 26.03.17.
 * Не знаю, надо ли этот класс вообще, я когда его создавал,
 * думал, что сделаю ArrayList с юзерами, но подумал, что легче
 * будет БД сюда присоеденить. Но удалять класс пока не буду, вдруг понадобится.
 */
public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String eMail;

    public User(String userName, String firstName, String lastName, String password, String eMail) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.eMail = eMail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    @Override
    public String toString (){
        return
                "User "+userName+"\n"+
                "First Name: "+firstName+"\n"+
                "Last name: " +lastName+"\n"+
                "E-mail: "+eMail;
    }
}
