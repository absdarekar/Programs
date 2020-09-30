import socket;
socket_server=socket.socket();
socket_server.bind(('localhost',9999));
socket_server.listen(1);
print("Waiting for connection");
while True:
    socket_client, address_client=socket_server.accept();
    print("Connected with",address_client);
    socket_client.send(bytes("Handshake Successful","utf-8"));
    socket_client.close();
