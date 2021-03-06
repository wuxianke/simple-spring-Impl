package com.wu.demo.configuration;

import com.wu.spring.annotation.ioc.Bean;
import com.wu.spring.annotation.ioc.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author Cactus
 * redis配置
 * 用来测试Configuration
 */
@Configuration
public class JedisConfig {
	@Bean
	public Jedis getJedis() {
		JedisPoolConfig config = new JedisPoolConfig();
	    config.setMaxTotal(100);
	    config.setMaxIdle(50);
	    config.setMinIdle(10);
	    //设置连接时的最大等待毫秒数
	    config.setMaxWaitMillis(10000);
	    //设置在获取连接时，是否检查连接的有效性
	    config.setTestOnBorrow(true);
	    //设置释放连接到池中时是否检查有效性
	    config.setTestOnReturn(true);

	    //在连接空闲时，是否检查连接有效性
	    config.setTestWhileIdle(true);

	    //两次扫描之间的时间间隔毫秒数
	    config.setTimeBetweenEvictionRunsMillis(30000);
	    //每次扫描的最多的对象数
	    config.setNumTestsPerEvictionRun(10);
	    //逐出连接的最小空闲时间，默认是180000（30分钟）
	    config.setMinEvictableIdleTimeMillis(60000);
		//Jedis服务器地址
	    //String redisHost = "192.168.26.128" ;
		String redisHost = "1.15.27.75" ;
	    Integer port = 6379;
	    String password = "123456";
		return new JedisPool(config, redisHost, 6379, 30000, password, 0).getResource();
	}
	
	
}
