import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection  = helper.getConnection();
            String sql  = "DELETE FROM city WHERE id= ?";
            statement   = connection.prepareStatement(sql);
            statement.setInt(1, 4087);
            int Sonuc   = statement.executeUpdate();
            if(Sonuc > 0){
                System.out.println("Bağlantı Sağlandı.");
            }else{
                System.out.println("Bağlantı Başarısız.");
            }

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                System.out.println(throwables.getMessage());
            }
        }
    }
    public static void updateData(){
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection  = helper.getConnection();
            String sql  = "UPDATE city SET population = ? WHERE id= ?";
            statement   = connection.prepareStatement(sql);
            statement.setInt(1, 300800);
            statement.setInt(2, 4087);
            int Sonuc   = statement.executeUpdate();
            if(Sonuc > 0){
                System.out.println("Bağlantı Sağlandı.");
            }else{
                System.out.println("Bağlantı Başarısız.");
            }

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                System.out.println(throwables.getMessage());
            }
        }
    }
    public static void insertData(){
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection  = helper.getConnection();
            String sql  = "INSERT INTO city (Name, CountryCode, District, Population) values (?,?,?,?)";
            statement   = connection.prepareStatement(sql);
            statement.setString(1, "Kirklareli 2");
            statement.setString(2, "TUR");
            statement.setString(3, "TURKEY");
            statement.setInt(4, 350000);
            int Sonuc   = statement.executeUpdate();
            if(Sonuc > 0){
                System.out.println("Bağlantı Sağlandı.");
            }else{
                System.out.println("Bağlantı Başarısız.");
            }

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                System.out.println(throwables.getMessage());
            }
        }
    }
    public static void selectDemo() {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select * from country LIMIT 200");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")
                ));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            helper.showErrorMessage(exception);
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                System.out.println(throwables.getMessage());
            }
        }
    }


}
