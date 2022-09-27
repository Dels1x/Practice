import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "password";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

        while (true) {
            System.out.println("1. Show all tasks");
            System.out.println("2. Complete task");
            System.out.println("3. Create task");
            System.out.println("4. Quit");

            int command = scanner.nextInt();

            if (command == 1) {
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery("SELECT * FROM task ORDER BY id DESC");

                System.out.println("Id\tName\tState");

                while (result.next()) {
                    System.out.println(result.getInt("id") + "\t" +
                            result.getString("name") + "\t" +
                            result.getString("state"));
                }
            } else if (command == 2) {
                String sql = "UPDATE task SET state = 'DONE' where id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                System.out.println("Enter ID of task: ");
                int id = scanner.nextInt();
                preparedStatement.setInt(1, id);
                preparedStatement.execute();
            } else if (command == 3) {
                String sql = "INSERT INTO task (name, state) VALUES (?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                System.out.println("Enter name of task");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Enter state of task");
                String state = scanner.nextLine();

                if(name.length() > 54)
                    name = name.substring(0, 54);
                if(state.length() > 54)
                    state = state.substring(0, 54);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, state);
                preparedStatement.execute();
            } else if (command == 4) {
                System.exit(0);
            } else {
                System.err.println("Unknown command");
            }
        }
    }
}
