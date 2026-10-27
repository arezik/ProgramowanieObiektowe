public class User {
    private String login;
    private String password;
    private int age;

    public User(String login, String password, int age) {
        this.login = login;
        setPassword(password);
        setAge(age);
    }

    public void setPassword(String password) {
        if (password == null || password.length() < 6) {
            System.out.println("zbyt krótkie!");
            return;
        }
        this.password = password;
    }

    public void setAge(int age) {
        if (age < 0 || age > 130) {
            System.out.println("albo sie nie urodziles albo juz lezysz w trumnie!");
            return;
        }
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public int getAge() {
        return age;
    }

    public void showUser() {
        System.out.println(
                "Login: " + login + ", wiek: " + age
        );
    }
}
