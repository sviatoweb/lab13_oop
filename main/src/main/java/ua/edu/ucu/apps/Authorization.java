package ua.edu.ucu.apps;

public class Authorization {
    public boolean authorize(DataBase db) {
        db.getUsersData();
        return true;
    }
}
