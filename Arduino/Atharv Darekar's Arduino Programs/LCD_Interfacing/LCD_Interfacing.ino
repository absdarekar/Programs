#include<LiquidCrystal.h>
LiquidCrystal lcd(12,11,5,4,3,2);
void setup()
{
  lcd.begin(16,2);
  lcd.print("TEST");
  analogWrite(9,150);
}
void loop()
{
  lcd.noDisplay();
  delay(500);
  lcd.display();
  delay(500);
}
