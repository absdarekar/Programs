int ml1=8,ml2=7,mr1=10,mr2=11;
void setup()
{
  pinMode(mr1,1);
  pinMode(mr2,1);
  pinMode(ml1,1);
  pinMode(ml2,1);
}

void loop()
{
  digitalWrite(mr1,0);
  digitalWrite(mr2,0);
  digitalWrite(ml1,0);
  digitalWrite(ml2,0);
}
