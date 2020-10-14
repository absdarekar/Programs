import json;
directories=json.dumps({"1":
                            {"localPath":
                                        "path1",
                            "remotePath":
                                        "path1"},
                        "2":
                            {"localPath":
                                        "path2",
                            "remotePath":
                                        "path2"},
                        "3":
                            {"localPath":
                                        "path3",
                            "remotePath":
                                        "path3"}});
directories_json=json.loads(directories);
paths=[];
print("Load the JSON string to an array ");
for i in range(len(directories_json)):
    paths.append(directories_json[str(i+1)]);
print(paths);
print("Add new paths after the last array element "+str(paths[len(paths)-1]));
paths.append({"localPath":"path4","remotePath":"path4"});
print("Update directories ");
directories_json={};
for i in range(len(paths)):
    directories_json[str(i+1)]=paths[i];
print(directories_json);
print("Remove \"path2\" from the array ");
paths.remove({"localPath":"path2","remotePath":"path2"});
print(paths);
print("Update directories ");
directories_json={};
for i in range(len(paths)):
    directories_json[str(i+1)]=paths[i];
print(directories_json);
