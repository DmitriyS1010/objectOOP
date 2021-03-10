package Task2;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("login1","pass1","name1");
        User user2 = new User("login2","pass2","name2");
        User user3 = new User("login3","pass3","name3");
        User user4 = new User("login4","pass4","name4");
        User use5r = new User("login5","pass5","name5");



        DataBaseUsers dataBaseUsers=new DataBaseUsers();

        dataBaseUsers.addUser(user1);
        dataBaseUsers.addUser(user2);
        dataBaseUsers.addUser(user3);
        System.out.println(dataBaseUsers);

        System.out.println( dataBaseUsers.removeUser(1));
        System.out.println(dataBaseUsers);
        System.out.println("=======");
       dataBaseUsers.infoUsers();
        System.out.println("=======");
        System.out.println( dataBaseUsers.findUser("login1"));
        System.out.println( dataBaseUsers.findUser("login456"));


        dataBaseUsers.clearBase();
        System.out.println(dataBaseUsers);
    }




}
