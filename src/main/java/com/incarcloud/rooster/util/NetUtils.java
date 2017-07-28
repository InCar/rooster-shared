package com.incarcloud.rooster.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Enumeration;
import java.util.Random;
import java.util.regex.Pattern;

/**
 * 解决获取本地ip地址和端口的工具类（来自dubbo框架）
 *
 * @author fanbeibei
 */
public class NetUtils {
    private static Logger logger = LoggerFactory.getLogger(NetUtils.class);

    /**
     * ip地址正则表达式
     */
    private static final Pattern IP_PATTERN = Pattern.compile("\\d{1,3}(\\.\\d{1,3}){3,5}$");
    /**
     * 本地地址的正则表达式
     */
    private static final Pattern LOCAL_IP_PATTERN = Pattern.compile("127(\\.\\d{1,3}){3}$");

    /**
     * 本地地址
     */
    public static final String LOCALHOST = "127.0.0.1";

    /**
     * 任意地址
     */
    public static final String ANYHOST = "0.0.0.0";

    /**
     * 一个可以访问的网站
     */
    public static final String ACCESS_WEBSITE = "www.baidu.com";
    public static final int ACCESS_WEBSITE_PORT = 80;

    /**
     * 是否为非法地址或本地地址
     *
     * @param host
     * @return
     */
    public static boolean isInvalidLocalHost(String host) {
        return host == null || host.length() == 0 || host.equalsIgnoreCase("localhost") || host.equals("0.0.0.0")
                || (LOCAL_IP_PATTERN.matcher(host).matches());
    }

    /**
     * 是否是合法的地址
     *
     * @param address
     * @return
     */
    public static boolean isValidAddress(InetAddress address) {
        if (address == null || address.isLoopbackAddress())
            return false;
        String name = address.getHostAddress();
        return isValidAddress(name);
    }

    /**
     * 是否是合法的地址
     *
     * @param host
     * @return
     */
    public static boolean isValidAddress(String host) {
        return (host != null && !ANYHOST.equals(host) && !LOCALHOST.equals(host) && IP_PATTERN.matcher(host).matches());
    }

    private static volatile InetAddress LOCAL_ADDRESS = null;

    /**
     * 遍历本地网卡，返回第一个合理的IP。
     *
     * @return 本地网卡IP
     */
    public static InetAddress getLocalAddress() {
        if (LOCAL_ADDRESS != null)
            return LOCAL_ADDRESS;
        InetAddress localAddress = getLocalAddress0();
        LOCAL_ADDRESS = localAddress;
        return localAddress;
    }

    /**
     * 获取本地Host. 若address == null ? "127.0.0.1" : InetAddress.getHostAddress();
     */
    public static String getLocalHost() {
        InetAddress address = getLocalAddress();
        return address == null ? LOCALHOST : address.getHostAddress();
    }

    /**
     * 遍历本地网卡，返回第一个合理的IP。
     *
     * @return 本地网卡IP
     */
    private static InetAddress getLocalAddress0() {
        InetAddress localAddress = null;
        try {
            localAddress = InetAddress.getLocalHost();
            if (isValidAddress(localAddress)) {
                return localAddress;
            }
        } catch (Throwable e) {
            logger.warn("Failed to retriving ip address, " + e.getMessage(),
                    e);
        }

        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            if (interfaces != null) {
                while (interfaces.hasMoreElements()) {
                    try {
                        NetworkInterface network = interfaces.nextElement();
                        Enumeration<InetAddress> addresses = network.getInetAddresses();
                        if (addresses != null) {
                            while (addresses.hasMoreElements()) {
                                try {
                                    InetAddress address = addresses.nextElement();
                                    if (isValidAddress(address)) {
                                        return address;
                                    }
                                } catch (Throwable e) {
                                    logger.warn("Failed to retriving ip address, " + e.getMessage(), e);
                                }
                            }
                        }
                    } catch (Throwable e) {
                        logger.warn("Failed to retriving ip address, " + e.getMessage(), e);
                    }
                }
            }
        } catch (Throwable e) {
            logger.warn("Failed to retriving ip address, " + e.getMessage(), e);
        }
        logger.error("Could not get local host ip address, will use 127.0.0.1 instead.");
        return localAddress;
    }

    /**
     * 获取可用的地址
     *
     * @return
     */
    public static String getAvailableHostOfLocal() {
        String host = null;
        Socket socket = new Socket();
        try {
            // 1. 通过Socket的方式获取Host
            // 一般解析到这里, 都会获取到正确的本地IP, 除非你有多网卡, 或者有VPN,
            // 导致无法正常解析.
            SocketAddress addr = new InetSocketAddress(ACCESS_WEBSITE, ACCESS_WEBSITE_PORT);
            socket.connect(addr, 1000);
            host = socket.getLocalAddress().getHostAddress();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (Throwable e) {
            }
        }

        // 2. 遍历本地网卡, 返回第一个合理的Host
        // 最后一个大招. 当上述都解析不到时, 则会遍历本地网卡.
        // 逐个获取IP, 直到有一个合理的IP为止.
        if (isInvalidLocalHost(host)) {
            host = getLocalHost();
        }

        return host;

    }

    /*********************************************************************************************************/

    /**
     * 最小端口号
     */
    private static final int MIN_PORT = 0;

    /**
     * 最大端口号
     */
    private static final int MAX_PORT = 65535;

    /**
     * 随机端口开始值
     */
    private static final int RND_PORT_START = 30000;

    /**
     * 随机端口变化范围
     */
    private static final int RND_PORT_RANGE = 10000;

    private static final Random RANDOM = new Random(System.currentTimeMillis());

    /**
     * 获取随机端口
     *
     * @return
     */
    public static int getRandomPort() {
        return RND_PORT_START + RANDOM.nextInt(RND_PORT_RANGE);
    }

    /**
     * 端口是否正确
     *
     * @param port
     * @return
     */
    public static boolean isInvalidPort(int port) {
        return port > MIN_PORT || port <= MAX_PORT;
    }

    /**
     * 获取一个可用的端口
     *
     * @return
     */
    public static int getAvailablePort() {
        ServerSocket ss = null;
        try {
            ss = new ServerSocket();
            ss.bind(null);
            return ss.getLocalPort();
        } catch (IOException e) {
            return getRandomPort();
        } finally {
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                }
            }
        }
    }

    /**
     * 获取端口号大于port的可用端口
     *
     * @param port
     * @return
     */
    public static int getAvailablePort(int port) {
        if (port <= 0) {
            return getAvailablePort();
        }
        for (int i = port; i < MAX_PORT; i++) {
            ServerSocket ss = null;
            try {
                ss = new ServerSocket(i);
                return i;
            } catch (IOException e) {
                // continue
            } finally {
                if (ss != null) {
                    try {
                        ss.close();
                    } catch (IOException e) {
                    }
                }
            }
        }
        return port;
    }


    /**
     * 组装url
     *
     * @param protocol
     * @param host
     * @param port
     * @param path
     * @return
     */
    public static String toURL(String protocol, String host, int port, String path) {
        StringBuilder sb = new StringBuilder();
        sb.append(protocol).append("://");
        sb.append(host).append(':').append(port);
        if (path.charAt(0) != '/')
            sb.append('/');
        sb.append(path);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getAvailableHostOfLocal());
    }

}
