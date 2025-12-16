package medium;

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyURL535 {
    private Map<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder();
        char[] decode = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int n = longUrl.hashCode();
        while (n > 0) {
            sb.append(decode[n % 62]);
            n /= 62;
        }
        map.put(sb.toString(), longUrl);
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
