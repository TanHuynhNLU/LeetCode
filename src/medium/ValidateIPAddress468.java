package medium;

public class ValidateIPAddress468 {
    public String validIPAddress(String queryIP) {
        if (isValidIP4(queryIP)) return "IPv4";
        else if (isValidIP6(queryIP)) return "IPv6";
        return "Neither";
    }

    public boolean isValidIP4(String queryIP) {
        if (queryIP.endsWith(".")) return false;
        String[] splitIP = queryIP.split("\\.");
        if (splitIP.length != 4) return false;
        for (String ip : splitIP) {
            if (ip.isEmpty()) return false;
            if (ip.startsWith("0") && ip.length() > 1) return false;
            if (!isInteger(ip) || Integer.parseInt(ip) > 255) {
                return false;
            }
        }
        return true;
    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isValidIP6(String queryIP) {
        if (queryIP.endsWith(":")) return false;
        String[] splitIP = queryIP.split(":");
        if (splitIP.length != 8) return false;
        for (String ip : splitIP) {
            if (ip.length() > 4) return false;
            if (ip.isEmpty()) return false;
            if (!isHexaString(ip)) {
                return false;
            }
        }
        return true;
    }

    public boolean isHexaString(String s) {
        try {
            Integer.parseInt(s, 16);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Best Solution
//    public String validIPAddress(String IP) {
//        if (IP.contains(".")) return validIPv4(IP);
//        if (IP.contains(":")) return validIPv6(IP);
//        return "Neither";
//    }
//
//    private String validIPv4(String IP) {
//        String[] parts = IP.split("\\.", -1);
//        if (parts.length != 4) return "Neither";
//        for (String part : parts) {
//            if (part.length() == 0 || part.length() > 3) return "Neither";
//            if (part.charAt(0) == '0' && part.length() != 1) return "Neither";
//            for (char c : part.toCharArray())
//                if (!Character.isDigit(c)) return "Neither";
//            int val = Integer.parseInt(part);
//            if (val < 0 || val > 255) return "Neither";
//        }
//        return "IPv4";
//    }
//
//    private String validIPv6(String IP) {
//        String[] parts = IP.split(":", -1);
//        if (parts.length != 8) return "Neither";
//        String hex = "0123456789abcdefABCDEF";
//        for (String part : parts) {
//            if (part.length() == 0 || part.length() > 4) return "Neither";
//            for (char c : part.toCharArray())
//                if (hex.indexOf(c) == -1) return "Neither";
//        }
//        return "IPv6";
//    }
}
