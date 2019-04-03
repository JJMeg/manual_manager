package com.bit.management.manual_management.Analysis;

import com.bit.management.manual_management.entity.Fileserver;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPSClient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Sender {
  private ServerSocket ss = null;

  public void sender(Fileserver fileserver, String filePath) {
    DataOutputStream dos = null;
    DataInputStream dis = null;
    Socket socket = null;
    int port = fileserver.getPort();
    try {
      File file = new File(filePath);
      ss = new ServerSocket(port);
      socket = ss.accept();
      dos = new DataOutputStream(socket.getOutputStream());
      dis = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)));

      int buffferSize = 1024;
      byte[] bufArray = new byte[buffferSize];
      dos.writeUTF(file.getName());
      dos.flush();
      dos.writeLong((long) file.length());
      dos.flush();
      while (true) {
        int read = 0;
        if (dis != null) {
          read = dis.read(bufArray);
        }

        if (read == -1) {
          break;
        }
        dos.write(bufArray, 0, read);
      }
      dos.flush();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      // 关闭所有连接
      try {
        if (dos != null)
          dos.close();
      } catch (IOException e) {
      }
      try {
        if (dis != null)
          dis.close();
      } catch (IOException e) {
      }
      try {
        if (socket != null)
          socket.close();
      } catch (IOException e) {
      }
      try {
        if (ss != null)
          ss.close();
      } catch (IOException e) {
      }
    }

  }
  public static void main(String[] args) throws IOException {
    FTPSClient f = new FTPSClient();
    f.connect("10.55.223.210",21);
    f.login("anonymous","\n");
    System.out.println( f.getReplyCode() );
  }
}

