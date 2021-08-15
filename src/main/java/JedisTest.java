import redis.clients.jedis.Jedis;

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("hadoop112", 6379);

        jedis.set("aaa", "1");

        System.out.println(jedis.get("aaa"));

        jedis.close();
    }
}
