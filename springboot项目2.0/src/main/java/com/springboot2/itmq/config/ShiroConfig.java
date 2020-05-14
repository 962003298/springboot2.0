package com.springboot2.itmq.config;

import com.springboot2.itmq.shiro.UserRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Shiro的配置文件
 *  shiro 三大对象
 *     subject:用户
 *     securityManager:管理用户
 *     Realm: 连接数据
 * @author Mark sunlightcs@gmail.com
 */
@Configuration
public class ShiroConfig {

    //添加shiro的内置过滤器
    /**
     * anon:无需认证就可以访问
     * authc:必须认证才能就行访问
     * user:必须记住我才能访问
     * perms:拥有对某个资源的权限才能访问
     * role:拥有某个角色权限才能访问
     */
      //@Qualifier 两个方法进行关联
    //3.ShiroFilterFactoryBean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("getdefaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);
        return bean;
    }
    //2.DefaultWebSessionManager
    @Bean
     public DefaultWebSecurityManager getdefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
         DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
         securityManager.setRealm(userRealm);
         return securityManager;

     }
    //1.创建realm对象，需要自定义一个realm类
    @Bean
    public UserRealm userRealm(){

        return  new UserRealm();
    }

}
