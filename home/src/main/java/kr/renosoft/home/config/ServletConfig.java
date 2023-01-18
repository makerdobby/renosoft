package kr.renosoft.home.config;

import kr.renosoft.common.interceptor.TitleInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ServletConfig implements WebMvcConfigurer {

    /* Interceptor 설정 */
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(titleInterceptor()).order(0).addPathPatterns("/**");
    }

    @Bean
    public TitleInterceptor titleInterceptor() {
        return new TitleInterceptor();
    }

}
