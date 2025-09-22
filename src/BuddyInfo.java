public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNum;

    public BuddyInfo(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public static void main(String[] args) {
        BuddyInfo homer = new BuddyInfo("Homer", "123 donut lane", "6131234567");
        System.out.println("Hello " + homer.getName());
    }
}
