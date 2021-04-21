class Movie():
    def __init__(self,id,name,price):
        self.id=id
        self.name=name
        self.price=price
        self.category="Default"
    def assignCategory(self,price):
        if(price>0 and price<150):
            self.category="General"
        elif(price>=150 and price<250):
            self.category="Silver"
        elif(price>=250 and price<350):
            self.category="Gold"
        elif(price>=350):
            self.category="Platinum"
class Ticket():
    def __init__(self,customerName,name,viewers,cost):
        self.customerName=customerName
        self.name=name
        self.viewers=viewers
        self.cost=cost
def getCategoryWiseCount(movies):
    categoryCount={}
    countGeneralMovies=0
    countSilverMovies=0
    countGoldMovies=0
    countPlatinumMovies=0
    countOfMovies=0
    for i in movies:
        if(i.category.lower()=="general"):
            countGeneralMovies+=1
        elif(i.category.lower()=="silver"):
            countSilverMovies+=1
        elif(i.category.lower()=="gold"):
            countGoldMovies+=1
        elif(i.category.lower()=="platinum"):
            countPlatinumMovies+=1
    categoryCount["general"]=countGeneralMovies
    categoryCount["silver"]=countSilverMovies
    categoryCount["gold"]=countGoldMovies
    categoryCount["platinum"]=countPlatinumMovies
    return categoryCount
def bookTicket(movies,customerNames,name,viewers):
    flag=False
    for i in movies:
        if(i.name.lower()==name.lower()):
            cost=i.price*viewers
            flag=True
    if(flag):
        return Ticket(customerName,name,viewers,cost)
    else:
        return None
if __name__=="__main__":
    numberMovies=int(input())
    movies=[]
    for i in range(numberMovies):
        id=int(input())
        name=input()
        price=int(input())
        movie=Movie(id,name,price)
        movie.assignCategory(price)
        movies.append(movie)
    customerName=input()
    name=input()
    viewers=int(input())
    categoryWiseCount=getCategoryWiseCount(movies)
    print("Category wise ticket count.")
    for key, value in categoryWiseCount.items():
        if(value):
            print(key.title()+":"+str(value))
    ticket=bookTicket(movies,customerName,name,viewers)
    if(ticket):
        print(ticket.customerName+" "+str(ticket.cost))
    else:
        print("Movie not Available")
