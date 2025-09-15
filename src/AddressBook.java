import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddiesList;

    public AddressBook() {
        this.buddiesList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo temp){
        buddiesList.add(temp);
    }

    public void removeBuddy(BuddyInfo temp){
        buddiesList.remove(temp);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
