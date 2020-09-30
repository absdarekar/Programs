int i=0,d=5;

void setup()
{
  pinMode(9,1);
}

void loop()
{
  while(i<255)
  {
    analogWrite(9,i);
    i++;
    delay(d);
  }
  digitalWrite(9,1);
  delay(1000);
  while(i>0)
  {
    analogWrite(9,i);
    i--;
    delay(d);
  }
}
