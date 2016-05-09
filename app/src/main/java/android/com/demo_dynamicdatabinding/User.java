package android.com.demo_dynamicdatabinding;

/**
 * Created by amitrai on 9/5/16.
 */
public class User {

    private final String firstName;
    private final String lastName;
    private boolean isFriend = false;
    private boolean isEnemy = false;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public boolean isFriend() {
        return isFriend;
    }

    public void setFriend(boolean friend) {
        isFriend = friend;
    }

    public boolean isEnemy() {
        return isEnemy;
    }

    public void setEnemy(boolean enemy) {
        isEnemy = enemy;
    }
}
