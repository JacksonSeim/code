unsigned long LedTimer;
unsigned long LedTimer3;

void setup() {
  pinMode(13, OUTPUT);
  LedTimer = millis();
  pinMode(12, OUTPUT);
  LedTimer3 = millis();
}

void loop() {
  if (millis() - LedTimer >= 10) {
    if (digitalRead (13) == HIGH) {
      digitalWrite (13, LOW);
    }
    else {
      digitalWrite (13, HIGH);
    }
    LedTimer += 10;
  }
  if (millis() - LedTimer3 >= 5) {
    if (digitalRead (12) == HIGH) {
      digitalWrite (12, LOW);
    }
    else {
      digitalWrite (12, HIGH);
    }
    LedTimer3 += 5;
  }
}
