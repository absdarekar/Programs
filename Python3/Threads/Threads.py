import os;
import time;
import threading;
class MainTask():
    def setup(self):
        message="Execute task:";
        task="Main Task";
        iter=2;
        # SubTask1.subTask();
        # SubTask2.subTask();
        execute=lambda:print(str(os.getpid())+" From Execute "+threading.current_thread().name);
        thread1=threading.Thread(target=execute,name="ExecuteThread");
        thread2=threading.Thread(target=SubTask1.subTask,name="SubThread-2");
        thread3=threading.Thread(target=SubTask2.subTask,name="SubThread-3");
        thread1.start();
        thread2.start();
        thread3.start();
        Task.task(message,task,iter);
        print("From MainTask "+threading.current_thread().name);
class SubTask1():
    def subTask():
        message="Execute task:";
        task="Sub Task 1";
        iter=3;
        Task.task(message,task,iter);
        print("From SubTask1 "+threading.current_thread().name);
class SubTask2():
    def subTask():
        message="Execute task:";
        task="Sub Task 2";
        iter=3;
        Task.task(message,task,iter);
        print("From SubTask2 "+threading.current_thread().name);
class Task():
    def task(message,task,iter):
        for i in range(iter):
            print(message+" "+task+" From Task "+threading.current_thread().name);
            time.sleep(1);
if __name__=="__main__":
    obj_MainTask=MainTask();
    obj_MainTask.setup();
