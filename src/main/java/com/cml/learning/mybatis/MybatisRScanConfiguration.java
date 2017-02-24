package com.cml.learning.mybatis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(MybatisRConfig.class)
@MapperScan(basePackages = { "com.cml.springboot.sample.db.r" }, sqlSessionFactoryRef = "readOnlySqlSessionFactory")
public class MybatisRScanConfiguration {
	protected static Log log = LogFactory.getLog(MybatisRScanConfiguration.class);

	public MybatisRScanConfiguration() {
		log.info("*************************MybatisScanConfiguration***********************");
	}
}
