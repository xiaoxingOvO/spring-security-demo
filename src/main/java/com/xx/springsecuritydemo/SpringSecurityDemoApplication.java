package com.xx.springsecuritydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author xiaoxing
 */
@SpringBootApplication
public class SpringSecurityDemoApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringSecurityDemoApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringSecurityDemoApplication.class, args);
        logApplicationStartup(run.getEnvironment());
    }

    /**
     * 打印服务地址
     *
     * @param env 应用程序上下文的Environment
     */
    private static void logApplicationStartup(Environment env) {
        String protocol = "http";
        if (env.getProperty("server.ssl.key-store") != null) {
            protocol = "https";
        }
        //服务端口
        String serverPort = env.getProperty("server.port");
        //服务名
        String contextPath = StringUtils
                .hasLength(env.getProperty("server.servlet.context-path")) ? env.getProperty("server.servlet.context-path") : "/";

        String hostAddress = "localhost";
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.warn("The host name could not be determined, using `localhost` as fallback");
        }
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Local: \t\t{}://localhost:{}{}\n\t" +
                        "External: \t{}://{}:{}{}\n\t" +
                        "Swagger: \t{}://localhost:{}{}{}\n\t" +
                        "----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                protocol, serverPort, contextPath,
                protocol, hostAddress, serverPort, contextPath,
                protocol, serverPort, contextPath, "/doc.html");
    }

}
