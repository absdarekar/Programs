int ml1=8,ml2=7,mr1=10,mr2=11;
int sl1=2,sl=3,sc=4,sr=5,sr1=6;
int i1=0,i2=0,i3=0,i4=0,i5=0;
void setup()
{
  pinMode(mr1,1);
  pinMode(mr2,1);
  pinMode(ml1,1);
  pinMode(ml2,1);
  pinMode(sr1,0);
  pinMode(sr,0);
  pinMode(sc,0);
  pinMode(sl,0);
  pinMode(sl1,0);
}

void loop()
{
  i1=digitalRead(sl1);
  i2=digitalRead(sl);
  i3=digitalRead(sc);
  i4=digitalRead(sr);
  i5=digitalRead(sr1);

  if((i1==0&&i2==0&&i3==0&&i4==0&&i5==0))
    {
      digitalWrite(mr1,0);
      digitalWrite(mr2,0);
      digitalWrite(ml1,0);
      digitalWrite(ml2,0);
    }
  if((i1==0&&i2==0&&i3==1&&i4==0&&i5==0)||(i1==0&&i2==1&&i3==1&&i4==1&&i5==0)||(i1==0&&i2==1&&i3==0&&i4==1&&i5==0))
    {
      digitalWrite(mr1,1);
      digitalWrite(mr2,0);
      digitalWrite(ml1,1);
      digitalWrite(ml2,0);
    }
  if((i1==0&&i2==1&&i3==1&&i4==0&&i5==0)||(i1==1&&i2==1&&i3==1&&i4==0&&i5==0)||(i1==1&&i2==0&&i3==0&&i4==0&&i5==0)||(i1==1&&i2==1&&i3==0&&i4==0&&i5==0)||(i1==1&&i2==0&&i3==1&&i4==0&&i5==0))
    {
      digitalWrite(mr1,1);
      digitalWrite(mr2,0);
      digitalWrite(ml1,0);
      digitalWrite(ml2,1);
    }
   if((i1==0&&i2==0&&i3==1&&i4==1&&i5==0)||(i1==0&&i2==0&&i3==1&&i4==1&&i5==1)||(i1==0&&i2==0&&i3==0&&i4==1&&i5==1)||(i1==0&&i2==1&&i3==0&&i4==0&&i5==1)||(i1==0&&i2==0&&i3==1&&i4==0&&i5==1))
    {
      digitalWrite(mr1,0);
      digitalWrite(mr2,1);
      digitalWrite(ml1,1);
      digitalWrite(ml2,0);
    } 
}
