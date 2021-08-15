import redis.clients.jedis.Jedis;

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("hadoop112", 6379);

        jedis.set("aaa", "1");

        System.out.println(jedis.get("aaa"));

//        commit v2.0
        System.out.println("v2.0");

        jedis.close();


        System.out.println("hot-fix v2.1");


        System.out.println("v3.0 from master");
    }
}
