class Document():
    def __init__(self,id,name,details):
        self.id=id
        self.name=name
        self.details=details.split(',')
class Archive():
    def __init__(self,id,documents):
        self.id=id
        self.documents=documents
    def findDate(self):
        list=[]
        for document in documents:
            for detail in document.details:
                if('/' in detail):
                    date=detail.strip()
                    list.append((document.id,date))
        return list
    def countDocumentType(self,type):
        count=0
        for document in documents:
            if(document.name.endswith(type)):
                count+=1
        return count
if __name__=="__main__":
    number=int(input())
    documents=[]
    for i in range(number):
        id=input()
        name=input()
        details=input()
        documents.append(Document(id,name,details))
    archive=Archive(12,documents)
    type=input()
    list=archive.findDate()
    count=archive.countDocumentType(type)
    for i in list:
        print(i[0]+" "+i[1])
    print("Document count = "+str(count))
