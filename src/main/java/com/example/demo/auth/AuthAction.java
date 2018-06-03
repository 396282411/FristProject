package com.example.demo.auth;



/*@Configuration
@EnableWebMvcSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)//开启security注解
public class AuthAction extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        System.out.println(333);
        super.configure(web);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println(444);

        //允许所有用户访问"/"和"/home"
        http.authorizeRequests()
                .antMatchers( "/home","/css/**","/js/**","/img/**","/").permitAll()
                //其他地址的访问均需验证权限
                .anyRequest().authenticated()
                .and()
                .formLogin()
                //指定登录页是"/login"
                .loginPage("/hello")
                .defaultSuccessUrl("/index")//登录成功后默认跳转到"/hello"
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/login")//退出登录后的默认url是"/home"
                .permitAll();
        super.configure(http);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println(222);
        super.configure(auth);
    }*/
public class AuthAction{

}

