package tcp.client

import tcp.shared.StreamFactory
import java.net.Socket

class CustomClient(socket: Socket) {
    val socket = socket;

    fun run() {
        val inputStream = StreamFactory.ExtractInputStreamFromSocket(socket);
        val outputStream = StreamFactory.ExtractOutputStreamFromSocket(socket);
        outputStream.flush();

        var request = "";
        while (request != "/exit") {
            print("Enter string: ");
            request = readLine().toString();
            outputStream.writeObject(request);
            println(inputStream.readObject().toString());
        }
    }
}
