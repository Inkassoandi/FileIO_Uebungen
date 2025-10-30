
# 💡 Tutorials
[File erstellen und Text einlesen (mit Scanner)](https://www.youtube.com/watch?v=xQ_Kiv0j2_A&t=127s)
> Den Scanner verwenden wir jetzt nicht mehr aber für das Verständnis vielleicht ganz hilfreich.

[File zeilenweise lesen und beschreiben (mit Buffared-Reader/Writer)](https://www.youtube.com/watch?v=J7v6BpXvdWI)
> Der Buffared-Reader/Writer ist das was wir aktuell verwenden. 
> Der Stream-Reader/Writer ist momentan noch unwichtig.

---

# 🧩 File-IO Übung 01 – Personen verarbeiten

## 📄 Übungsdatei: `personen.txt`

Beispielinhalt:
```
Anna 25 Wien
Lukas 31 Graz
Miriam 19 Klagenfurt
Jonas 42 Salzburg
Petra 28 Innsbruck
```

Jede Zeile enthält:
1. **Vorname** (String)  
2. **Alter** (int)  
3. **Wohnort** (String)

---

## 🧮 Aufgabe 1 – Durchschnittsalter berechnen

**Ziel:**  
Berechne das **Durchschnittsalter** aller Personen aus der Datei.

**Schritte:**
1. Datei mit `BufferedReader` einlesen.  
2. Zeilen mit `.split(" ")` trennen.  
3. Das Alter (`teile[1]`) mit `Integer.parseInt()` umwandeln.  
4. Summe und Durchschnitt berechnen.  
5. Ergebnis ausgeben, z. B.  
   ```
   Durchschnittsalter: 29.0 Jahre
   ```

---

## 🧠 Aufgabe 2 – Personen aus bestimmter Stadt finden

**Ziel:**  
Alle Personen finden, die in einer bestimmten Stadt wohnen (z. B. „Graz“).

**Schritte:**
1. Datei zeilenweise lesen und mit `.split(" ")` trennen.  
2. Prüfen, ob `teile[2].equalsIgnoreCase("Graz")` ist.  
3. Passende Personen ausgeben, z. B.  
   ```
   Personen aus Graz:
   Lukas (31 Jahre)
   ```

---

## 💡 Verwendete Konzepte

- Datei lesen mit `BufferedReader`  
- String zerlegen mit `.split(" ")`  
- Leerzeichen entfernen mit `.strip()`  
- Text in Zahl umwandeln mit `Integer.parseInt()`  
- Bedingungen mit `if`  
- Fehlerbehandlung mit `try` / `catch`
