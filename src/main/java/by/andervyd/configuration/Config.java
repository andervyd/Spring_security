package by.andervyd.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


@Configuration
@ComponentScan(basePackages = "by.andervyd")
@EnableWebMvc
public class Config {

    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver internalResourceViewResolver =
                new InternalResourceViewResolver();

        internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        internalResourceViewResolver.setSuffix(".jsp");

        return internalResourceViewResolver;
    }

    @Bean
    public DataSource dataSource() {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        try {

            dataSource.setDriverClass
                    ("com.mysql.cj.jdbc.Driver");
            dataSource.setJdbcUrl
                    ("jdbc:mysql://localhost:3306/security_db?useSSL=false&serverTimezone=UTC");
            dataSource.setUser
                    ("root");
            dataSource.setPassword
                    ("root");

        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}