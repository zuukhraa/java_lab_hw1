package ru.itis;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import javax.sql.DataSource;
import java.util.List;

public class PasswordBlackListJdbcImpl implements PasswordBlackList {

    private JdbcTemplate jdbcTemplate;

    public PasswordBlackListJdbcImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    //language=SQL
    private static final String SQL_SELECT_ALL = "select * from password_black_list where password = ?";

    private final RowMapper<String> passwordRowMapper = (row, rowNumber) -> {
        String password = row.getString("password");
        return password;
    };

    @Override
    public boolean contains(String password) {
        List<String> passwords = jdbcTemplate.query(SQL_SELECT_ALL, passwordRowMapper, password);
        return passwords.size() > 0;
    }
}
