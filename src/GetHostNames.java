import java.util.*;
import java.net.*;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;


// Jak zjistím IP adresu mého notebooku na mém síťovém routeru?

public class GetHostNames {
    public static void main(String[] args) throws Exception {
        // get IP address of a host
        String hostname = "AC-DC";                     // TADY ZADAT NÁZEV HOSTA PC !!!
        InetAddress addr=InetAddress.getByName(hostname);
        System.out.println("host " + hostname + " IP address " + addr.getHostAddress());
        String subnet="192.168.1";
        // scan IP address for hosts
        for (int i=100;i<150;i++){   // ZDE MŮŽU ZADAT ROZSAH IP
            byte[] ipAddr = new byte[] { (byte) 192, (byte) 168, 1,(byte) i };
            addr = InetAddress.getByAddress(ipAddr);
            String hostnameCanonical = addr.getCanonicalHostName();
            System.out.println("IP " + subnet + " host " + hostnameCanonical);
        }
    }
}