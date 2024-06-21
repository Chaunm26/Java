package data;

public class Information {

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String studentCode;

    public Information(String name, String address, String email, String phoneNumber, String studentCode) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
    
    public void showProfile() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%8s|\n", name, address, email,phoneNumber,studentCode);
    }
    
    

}
