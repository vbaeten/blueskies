package be.vbaeten.blueskies.dao;

import org.flywaydb.core.Flyway;
import org.junit.BeforeClass;

public abstract class DAOTest {
    public static String JDBC_CONNECTION_STRING = "jdbc:h2:mem:blueskies;DB_CLOSE_DELAY=-1";
    
    @BeforeClass
    public static void initializeFlyway() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(JDBC_CONNECTION_STRING, null, null);
        flyway.migrate();
    }
}
