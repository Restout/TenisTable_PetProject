package application.service;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class H2DataSource {
    public static DataSource getDataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:database.sql'");
        return ds.getDataSource();
    }
}

