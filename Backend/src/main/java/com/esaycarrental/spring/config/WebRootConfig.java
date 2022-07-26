package com.esaycarrental.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}
