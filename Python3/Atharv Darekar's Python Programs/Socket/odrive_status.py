# run this code as root

import os;
import json;
import socket;
HOST='127.0.0.1'; # localhost
PROTOCOL_SERVER_PORT_KEY='protocol';
_RESPONSE_DATA_MAX_CHUNK_SIZE=1024*1024;
data=True;
buffer='';
# defines path to .oreg file which contains the port number of agent

AGENT_PORT_REGISTRY_FILE_PATH=os.path.join(os.path.expanduser('~'),'.odrive-agent','.oreg');

# reads the .oreg file to retrieve port number

with open(AGENT_PORT_REGISTRY_FILE_PATH, 'r') as f:
    data = json.loads(f.read());
    port=data["current"][PROTOCOL_SERVER_PORT_KEY];

# AF_INET, SOCK_STREAM
# A pair (host, port) is used for the AF_INET address family,
# where host is a string representing either a hostname in
# Internet domain notation like 'daring.cwi.nl' or an IPv4
# address like '100.50.200.5', and port is an integer.

socket=socket.socket(socket.AF_INET, socket.SOCK_STREAM);
try:
    socket.connect((HOST, port));
    print("Successfully connected to odriveagent");
except Exception as e:
    print("Failed to connect odriveagent");
socket.sendall((json.dumps({'command':'status','parameters':{}})+'\n').encode('utf-8'));
while data:
    data=socket.recv(_RESPONSE_DATA_MAX_CHUNK_SIZE);
    buffer+= data.decode('utf-8');
    while buffer.find('\n') != -1:
        response, buffer= buffer.split('\n', 1);
        jsonResponse = json.loads(response);
message=jsonResponse['message'];
print("Email: "+message['authorizedEmail']);
print("Account Type: "+message['authorizedAccountSourceType']);

# Successfully connected to odriveagent
# Email: octocad@protonmail.com
# Account Type: Google
