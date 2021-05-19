int buttonRead=0,led=8,button=7,delayTime=250;
void setup()
{
  Serial.begin(9600);
  pinMode(led,OUTPUT);
  pinMode(button,INPUT);
}
void loop()
{
  buttonRead=digitalRead(button);
  Serial.println(buttonRead);
  delay(delayTime);
}
