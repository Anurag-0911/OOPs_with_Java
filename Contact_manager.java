package OOPs;

class Contact {
    String name;
    String email;
    String phonenumber;
}

class ContactManager {
    // fields
    Contact[] myFriends;
    int friendscount;

    // constructor
    ContactManager() {
        this.friendscount = 0;
        this.myFriends = new Contact[500];
    }


    void addcontact(Contact c) {
        myFriends[friendscount] = c;
        friendscount++;
        System.out.println("contact added");
    }

    Contact searchcontact(String searchName) {
        for (int i = 0; i < friendscount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                System.out.println("contact found");
                return myFriends[i];
            }
            else {
                System.out.println("Contact not found");
                break;
            }
        }
        return null;
    }
}

public class Contact_manager {
    public static void main(String[] args) {

        ContactManager myContactManager = new ContactManager();
        Contact c1 = new Contact();
        c1.name = "Anurag";
        c1.email = "abc@gmail.com";
        c1.phonenumber = "324355";
        myContactManager.addcontact(c1);
        Contact c2 = new Contact();
        c2.name = "Ashish";
        c2.email = "pqr.gmail.com";
        c2.phonenumber = "33";
        myContactManager.addcontact(c2);
        myContactManager.searchcontact("Anura");
        myContactManager.searchcontact("Anurag");
    }
}