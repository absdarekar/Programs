import socket;
socket_client=socket.socket();
socket_client.connect(('localhost',9999));
print(socket_client.recv(1024).decode());
