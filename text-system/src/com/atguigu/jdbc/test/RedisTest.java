package com.atguigu.jdbc.test;

import redis.clients.jedis.Jedis;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("180.76.118.18",6379);
        System.out.println(jedis.ping());
    }
}
