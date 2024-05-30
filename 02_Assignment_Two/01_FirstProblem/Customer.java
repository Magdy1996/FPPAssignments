public class Customer {
    private String firstName ;
    private String lastName ;
    private String socSecurityNum ;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String firstName , String lastName, String socSecurityNum){
        this.firstName= firstName ;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }
    // Five Setters for the five attributes

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    // Five Getters for the five attributes

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }

}

 class Address{
    private String street;
    private String city ;
    private String state;
    private String zipCode;


    public Address(String street, String city , String state , String zipCode){
        this.street =street;
        this.city = city ;
        this.state = state ;
        this.zipCode = zipCode ;

    }

     public String getStreet() {
         return street;
     }

     public String getCity() {
         return city;
     }

     public String getState() {
         return state;
     }

     public String getZipCode() {
         return zipCode;
     }

     public void setStreet(String street) {
         this.street = street;
     }

     public void setCity(String city) {
         this.city = city;
     }

     public void setState(String state) {
         this.state = state;
     }

     public void setZipCode(String zipCode) {
         this.zipCode = zipCode;
     }
 }

class Main{
    public static void main(String[] args) {
        Customer customerOne = new Customer("Magdy", "Youakim","999887766");
        Customer customerTwo = new Customer("Cuong", "Nguyen", "76543212");
        Customer customerThree= new Customer("Sai", "Soe San" , "732409233");
        Customer customerfour = new Customer("Mark", "Edwar", "39847324098");



        Address addressOne = new Address("123 Michigan Avenue", "Chicago", "IL", "60601");
        Address addressTwo = new Address("456 Broadway", "New York", "NY", "10012");
        Address addressThree = new Address("789 Sunset Boulevard", "Los Angeles", "CA", "90028");
        Address addressFour = new Address("3423 adfadf", "Chicago", "IL", "783243");

        customerOne.setBillingAddress(addressOne);
        customerOne.setShippingAddress(addressOne);
        customerTwo.setBillingAddress(addressTwo);
        customerTwo.setShippingAddress(addressTwo);
        customerThree.setBillingAddress(addressThree);
        customerThree.setShippingAddress(addressThree);
        customerfour.setShippingAddress(addressFour);
        customerfour.setBillingAddress(addressFour);

        //System.out.println(customerOne.getShippingAddress());

        Customer[] arrayOfCustomer = new Customer[4];
        arrayOfCustomer[0] = customerOne;
        arrayOfCustomer[1] = customerTwo;
        arrayOfCustomer[2] = customerThree;
        arrayOfCustomer[3] = customerfour;


        for(Customer c : arrayOfCustomer){
            if(c.getBillingAddress().getCity().equalsIgnoreCase("Chicago")){
                System.out.println(c);
            }
        }

    }
}
