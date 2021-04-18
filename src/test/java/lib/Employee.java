package lib;

public class Employee {

    private String email;
    private String emp1stName;
    private String empMiddleName;
    private String empLastName;
    private String company;
    private String address;
    private String secAddress;
    private String city;
    private Object zip;
    private String country;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmp1stName() {
        return emp1stName;
    }

    public void setEmp1stName(String emp1stName) {
        this.emp1stName = emp1stName;
    }

    public Employee withEmp1stName(String emp1stName) {
        this.emp1stName = emp1stName;
        return this;
    }

    public String getEmpMiddleName() {
        return empMiddleName;
    }

    public void setEmpMiddleName(String empMiddleName) {
        this.empMiddleName = empMiddleName;
    }

    public Employee withEmpMiddleName(String empMiddleName) {
        this.empMiddleName = empMiddleName;
        return this;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public Employee withEmpLastName(String empLastName) {
        this.empLastName = empLastName;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Employee withCompany(String company) {
        this.company = company;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getSecAddress() {
        return secAddress;
    }

    public void setSecAddress(String secAddress) {
        this.secAddress = secAddress;
    }

    public Employee withSecAddress(String secAddress) {
        this.secAddress = secAddress;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee withCity(String city) {
        this.city = city;
        return this;
    }

    public Object getZip() {
        return zip;
    }

    public void setZip(Object zip) {
        this.zip = zip;
    }

    public Employee withZip(Object zip) {
        this.zip = zip;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Employee withCountry(String country) {
        this.country = country;
        return this;
    }

}
