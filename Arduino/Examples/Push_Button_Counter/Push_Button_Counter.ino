int counter=0;
int button=7,led1=8,led2=9,led3=10,led4=11;

void setup()
{
  pinMode(button,INPUT);
  pinMode(led1,OUTPUT);
  pinMode(led2,OUTPUT);
  pinMode(led3,OUTPUT);
  pinMode(led4,OUTPUT);
}
void loop()
{
  if(digitalRead(button))
    counter+=1;
  if(counter==1)
  {
    digitalWrite(led1,1);
    digitalWrite(led2,0);
    digitalWrite(led3,0);
    digitalWrite(led4,0);
  }
  if(counter==2)
  {
    digitalWrite(led1,1);
    digitalWrite(led2,1);
    digitalWrite(led3,0);
    digitalWrite(led4,0);
  }
  if(counter==3)
  {
    digitalWrite(led1,1);
    digitalWrite(led2,1);
    digitalWrite(led3,1);
    digitalWrite(led4,0);
  }
  if(counter==4)
  {
    digitalWrite(led1,1);
    digitalWrite(led2,1);
    digitalWrite(led3,1);
    digitalWrite(led4,1);
    counter=0;
  }
}
