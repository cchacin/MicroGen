package myservice;

import org.flywaydb.core.Flyway;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.sql.DataSource;

@Startup
@Singleton
@TransactionManagement(TransactionManagementType.BEAN)
public class FlywayUpdater {

    @Resource(lookup = "jdbc/postgresql")
    private DataSource dataSource;

    @PostConstruct
    public void initFlyway() {
        System.out.println("Starting to migrate the database schema with Flyway");
        Flyway.configure()
                .dataSource(dataSource)
                .load()
                .migrate();
        System.out.println("Successfully applied latest schema changes");
    }
}