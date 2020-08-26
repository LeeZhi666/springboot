package com.qf.springboot.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisDemo {

    // 通过java程序访问redis数据库
    // 获得单一的jedis对象操作数据库
    @Test
    public void test1() {

        //获得连接对象
        Jedis jedis = new Jedis("112.124.12.56", 6379);

        //获得之前redis中存储的数据
        String name = jedis.get("username");
        System.out.println(name);

        //存储数据
        jedis.set("password", "123");
        System.out.println(jedis.get("password"));

        //关闭
        jedis.close();

    }
}
