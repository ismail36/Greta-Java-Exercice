package fr.greta.java.Exo_POO.Exo5;

public class Connection {
    private User[] utilisateurs = new User[3];

    public Connection() {
        utilisateurs[0] = creeUser("bob", "mdp");
        utilisateurs[1] = creeUser("alice", "mdp2");
        utilisateurs[2] = creeUser("admin","admin");
    }

    public User creeUser(String login, String password) {
        User user = new User();
        user.login = login;
        user.password = password;
        return user;
    }


    public void login(String login, String password) {
        for (User user: utilisateurs) {
            if (user.login.equals(login) && user.password.equals(password)) {
                AppConnectedUser.connectedUser = user;
                System.out.println("Connected " + login + " " + password);
            }
        }
    }


}
