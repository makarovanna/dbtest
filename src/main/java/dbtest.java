import java.sql.*;

/**
 * Created by IIS on 11.02.2016.
 */
public class dbtest {
    public static void main(String[] args) throws SQLException {
        try (Connection c = DriverManager.getConnection("jdbc:derby:TestDB; create=true")) {
//            try (PreparedStatement create = c.prepareStatement("Create table student( id int, name varchar(50), groupId varchar(10))")) {
//                create.execute();
//            }
//            try (PreparedStatement ins = c.prepareStatement("insert into student( id, name,groupId) values( 3,'Маша','Ученик')")) {
//                ins.execute();
//            }
            try (PreparedStatement select = c.prepareStatement("select, id, name,groupId from students order by name")) {
              try( ResultSet rs= select.executeQuery()){
                  while (rs.next()){
                      String name=rs.getString(2);
                      int id= rs.getInt(1);
                  }
            }

        }
    }
}
}



