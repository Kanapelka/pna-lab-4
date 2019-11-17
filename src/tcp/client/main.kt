package tcp.client

import tcp.shared.SocketFactory

fun main() {
    val client = CustomClient(SocketFactory.spawnClientSocket("localhost", 3000));
    client.run();
}
