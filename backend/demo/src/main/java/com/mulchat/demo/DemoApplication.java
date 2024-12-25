package com.mulchat.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	// static {
    //     javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
    //         new javax.net.ssl.HostnameVerifier() {
    //             public boolean verify(String hostname, javax.net.ssl.SSLSession sslSession) {
    //                 return true;
    //             }
    //         });
    // }

}
