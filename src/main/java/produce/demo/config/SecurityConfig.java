package produce.demo.config;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/index.html").permitAll()
                .antMatchers("/login.html").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/performance.html").permitAll()
                .antMatchers("/equipment.html").permitAll()
                .antMatchers("/produce.html").permitAll()
                .antMatchers("/production.html").permitAll()
                .antMatchers("/quality.html").permitAll()
                .antMatchers("/equipment.html").permitAll()
                .antMatchers("/equipment.html").permitAll();
        http.formLogin()
                .loginPage("/login")

                .defaultSuccessUrl("/index");




        http.rememberMe().rememberMeParameter("remember-me");
        http.logout().logoutSuccessUrl("/");


    }


    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("username").password(new BCryptPasswordEncoder()
                .encode("password")).roles("User")
                .and()
                .withUser("xiaoxiao").password(new BCryptPasswordEncoder()
                .encode("1234567")).roles("Manager","User");
    }
//    @Autowired
//private DataSource dataSource;
//
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .usersByUsernameQuery("select username,password,true from admin where username = ?")
//                .authoritiesByUsernameQuery("select username,role from admin where username = ?")
//                .passwordEncoder(new PasswordEncoder() {
//                    @Override
//                    public String encode(CharSequence rawPassword) {
//                        return MD5Util.MD5EncodeUtf8((String) rawPassword);
//                    }
//
//                    @Override
//                    public boolean matches(CharSequence rawPassword, String encodedPassword) {
//                        return encodedPassword.equals(MD5Util.MD5EncodeUtf8((String) rawPassword));
//                    }
//                });
//    }
}


