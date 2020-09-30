import os;
import json;
HOST='127.0.0.1';
PROTOCOL_SERVER_PORT_KEY = 'protocol';
AGENT_PORT_REGISTRY_FILE_PATH=os.path.join(os.path.expanduser('~'),'.odrive-agent','.oreg');
DESKTOP_PORT_REGISTRY_FILE_PATH=os.path.join(os.path.expanduser('~'),'.odrive','.oreg');
with open(AGENT_PORT_REGISTRY_FILE_PATH, 'r') as f:
    data = json.loads(f.read());
    value=data["current"][PROTOCOL_SERVER_PORT_KEY];
