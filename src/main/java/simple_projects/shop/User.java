package simple_projects.shop;

public class User {
    public String username;
    public String pass;
    public Cart usersCart = new Cart();

    public User(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }
}
