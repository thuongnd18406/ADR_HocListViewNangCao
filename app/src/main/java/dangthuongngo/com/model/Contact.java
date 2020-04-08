package dangthuongngo.com.model;

public class Contact {
    private int avatar;
    private String name;
    private String phone;

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact(int avatar, String name, String phone) {
        this.avatar = avatar;
        this.name = name;
        this.phone = phone;
    }

    public Contact() {
    }
}
