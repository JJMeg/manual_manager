package com.bit.management.manual_management.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter {
  @Override
  public void configure(HttpSecurity http) throws Exception{
    //1. 定制请求的授权规则
    http.authorizeRequests()
            .antMatchers("/","/login","/register").permitAll()
            .antMatchers("/mybatis").hasRole("USER")
            .antMatchers("/admin/**").hasAuthority("ADMIN")
            .antMatchers("/index").hasRole("ADMIN");
//            .anyRequest().authenticated();



            http.logout().permitAll()
            .and()
            .formLogin().usernameParameter("username").passwordParameter("userpwd").loginPage("/login")
            .defaultSuccessUrl("/index")
            .failureUrl("/login?error")
            .permitAll()
            .and()
            .logout();



            //2. 开启自动配置的登陆功能
            //http.formLogin();
            //3. 关闭csrf，这个功能此版本security无法做到
            http.csrf().disable();

    //开启自动配置的注销功能，用户注销清空session
    http.logout().logoutSuccessUrl("/");
  }

  //忽略对css js静态资源的权限
  @Override
  public void configure(WebSecurity webSecurity) throws Exception{
    webSecurity.ignoring().antMatchers("/login.html","/login_timeout.html","/web/css/**","/static/assets/**",
            "/static/B-JUI/**","/static/images/**","/static/json/**","/static/jquery-easyui-1.6.10");
  }
  //定义认证规则
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
            .withUser("admin").password("123456").roles("ADMIN")
            .and()
            .withUser("qaz").password("qaz").roles("USER")
            .and()
            .withUser("dicoogle").password("dicoogle").roles("ADMIN")
            .and()
            .withUser("test").password("1234").roles("USER");

  }


}
