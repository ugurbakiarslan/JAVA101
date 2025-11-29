package OOP1;

public class Customer {

    private String id;
    private String customerNumber;
    private String phone;

    // Getter ve Setter
    public String getId() {
        return id; // sadece id’yi döndürür
    }

    public void setId(String id) {
        this.id = id; // id’yi atar
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
