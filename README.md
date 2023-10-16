# Beantwortung der Fragen

## 1.)

- Ich habe eine zusätzliche Klasse GermanTranslatorFactory erstellt, die im Package factory liegt und eine statische Methode create hat, die eine Instanz von GermanTranslator zurückgibt.
- Dies entspricht dem Factory Pattern
- Der Source Code des Translator Interface musste nicht angepasst werden, es kann jedoch sein dass der Source Code bei einer allgemeineren Lösung angepasst werden muss.

## 2.)

 /

## 3.)

- Der Vorteil einer separaten Test-Klasse liegt in der Übersichtlichkeit
- Äquivalenzklassen bei einem Blackbox Test dienen dazu, die Eingabewerte zu gruppieren, die zu ähnlichen Ergebnissen führen. Um so
weniger Äquivalenzklassen es gibt, desto weniger Testfälle müssen erstellt werden.
- Ich wüsste nicht, warum das nicht der Fall sein sollte. Möglichkeiten könnten sein, dass Client auf anderen Zuständen basiert, die nicht
bekannt sind.
