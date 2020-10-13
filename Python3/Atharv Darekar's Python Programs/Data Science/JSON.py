import json;
directories=json.dumps({"1":"path1","2":"path2","3":"path3"});
directories_json=json.loads(directories);
path=[];
print("Load the JSON string to an array ");
for i in range(len(directories_json)):
    path.append(directories_json[str(i+1)]);
print(path);
print("Add a new path in the end of the array "+path[len(path)-1]);
path.append("path4");
print("Update directories ");
directories_json={};
for i in range(len(path)):
    directories_json[str(i+1)]=path[i];
print(directories_json);
print("Remove \"path2\" from the array ");
path.remove("path2");
print(path);
print("Update directories ");
directories_json={};
for i in range(len(path)):
    directories_json[str(i+1)]=path[i];
print(directories_json);
