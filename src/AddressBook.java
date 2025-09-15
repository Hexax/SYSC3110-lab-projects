import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddiesList;

    public AddressBook(ArrayList<BuddyInfo> buddiesList) {
        this.buddiesList = buddiesList;
    }

    public void addBuddy(BuddyInfo temp){
        buddiesList.add(temp);
    }

    public void removeBuddy(BuddyInfo temp){
        buddiesList.remove(temp);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
