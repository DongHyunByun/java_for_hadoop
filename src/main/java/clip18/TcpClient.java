package clip18;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalTime;

public class TcpClient {
    public static void main(String[] args) {

        try {
            String serverIp = "localhost";
            System.out.println("[" + LocalTime.now()+"]"+"서버에 연결합니다");
            System.out.println("[" + LocalTime.now()+"]"+"서버 ip : "+serverIp);
            Socket socket = new Socket(serverIp, 8888);

            // 데이터 보내기(outputStream)
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello\n".getBytes(StandardCharsets.UTF_8)); //줄바꿈(\n)을 넣어야 write가 완료된다.
            outputStream.flush();

            // 데이터 받기(inputStream)
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            System.out.println("message from server : " + dataInputStream.readUTF());
            dataInputStream.close();
            socket.close();
            System.out.println("연결종료");

        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
