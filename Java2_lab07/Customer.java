package Java2_lab07;

public class Customer {
    private int customerId;
    private String name,gender,email,address,dateOfbirth,registrationdate;
    private int phone,level;

    public int getCustomerId(){
        return customerId;
    }
    public int getLevel(){
        return level;
    }
    public int getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return name;
    }
    public String getName() {
        return name;
    }
    public String getDateOfbirth(){
        return dateOfbirth;
    }
    public String getGender(){
        return gender;
    }
    public String getRegistrationdate(){
        return registrationdate;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRegistrationdate(String registrationdate) {
        this.registrationdate = registrationdate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "customer{" +
                "customerId = " + customerId +
                ", name = '"+ name + '\''+
                ", gender = '"+ gender + '\''+
                ", email = '"+ email + '\''+
                ", address = '"+ address + '\''+
                ", dateOfbirth = '"+ dateOfbirth + '\''+
                ", phone = '"+ phone + '\''+
                ", level = '"+ level + '\''+
                ", registrationdate = '"+ registrationdate + '\''+ '}';
    }


}
