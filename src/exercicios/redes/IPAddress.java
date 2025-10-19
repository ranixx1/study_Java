public class IPAddress {
    private String ipStr;
    private String maskStr;
    private int ipInt;
    private int maskInt;
    public String rede;
    public String broadcast;

    public IPAddress(String ipStr, String maskStr) {
        this.ipStr = ipStr;
        this.maskStr = maskStr;
        this.ipInt = ipToInt(ipStr);
        this.maskInt = ipToInt(maskStr);

        int redeInt = ipInt & maskInt;
        int broadcastInt = redeInt | (~maskInt);

        this.rede = intToIp(redeInt);
        this.broadcast = intToIp(broadcastInt);
    }

    private int ipToInt(String ip) {
        String[] partes = ip.split("\\.");
        int n = 0;
        for (String p : partes) {
            n = (n << 8) | Integer.parseInt(p);
        }
        return n;
    }

    private String intToIp(int n) {
        return String.format("%d.%d.%d.%d",
                (n >>> 24) & 0xFF,
                (n >>> 16) & 0xFF,
                (n >>> 8) & 0xFF,
                n & 0xFF);
    }

    private int maskToCidr() {
        int bits = Integer.bitCount(maskInt);
        return bits;
    }

    public boolean pertenceARede(String ipStr) {
        int ipInt = ipToInt(ipStr);
        int redeIp = ipInt & maskInt;
        return redeIp == (this.ipInt & this.maskInt);
    }

    @Override
    public String toString() {
        return ipStr + "/" + maskToCidr();
    }

    // ===== EXEMPLO DE TESTE =====
    public static void main(String[] args) {
        IPAddress ip = new IPAddress("192.168.1.10", "255.255.255.0");
        System.out.println(ip);                        
        System.out.println(ip.rede);                   
        System.out.println(ip.broadcast);              
        System.out.println(ip.pertenceARede("192.168.1.55")); 
        System.out.println(ip.pertenceARede("192.168.2.1"));  
    }
}