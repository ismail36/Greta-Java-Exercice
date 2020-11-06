package fr.greta.java.Exo_POO.Exo5;

public class ConnectionRunner {
    public static void main(String[] args) {

        Connection connect = new Connection();
        connect.login("admin","admin");
        System.out.println(AppConnectedUser.connectedUser.login);
        System.out.println(AppConnectedUser.connectedUser.password);
    }
}
