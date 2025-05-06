# Blackjack konsoles spēle

Šī ir vienkārša konsoles spēle "Blackjack" jeb "21", kas izstrādāta Java valodā. Spēlētājs var reģistrēties, saņemt spēles čipus, veikt likmes un sacensties pret dīleri.

## 📥 Instalācija un palaišana

1. Klonē vai lejupielādē projektu.
2. Pārliecinies, ka tev ir instalēta **Java 17** vai jaunāka.

## 🧑‍💼 Reģistrācija

* Kad programma sākas, ievadi savu **lietotājvārdu**.
* Ja šis ir pirmais pieslēgums, tev tiks piešķirti **10 000 čipi**.
* Ja spēlētājs atgriežas vēlāk, viņa iepriekšējais čipu daudzums tiek ielādēts.
* Visi dati tiek saglabāti `players.csv` failā.

## 🎮 Spēles noteikumi

* Spēlētājam un dīlerim tiek izdalītas 2 kārtis.
* Tava mērķa ir sasniegt summu pēc iespējas tuvāk **21**, nepārsniedzot to.
* Karte ar **A** vērtēta kā 11 vai 1 (atkarībā no izdevīgākā rezultāta).
* Figūru kārtīm (J, Q, K) vērtība ir **10**.
* Cipariem pēc nominala

### 💰 Komandas:

* `more` — paņem vēl vienu kārti.
* `stand` — pārtrauc kāršu ņemšanu, un dīleris turpina spēli.
* `quit` — pārtrauc spēli.

### 🧑‍⚖️ Likmes:

* Pirms katras partijas tu vari veikt **likmi**.
* Uzvaras gadījumā tu saņem likmi atpakaļ + peļņu.
* Zaudējuma gadījumā likme tiek atskaitīta no taviem čipiem (ka arī iziet no spēlēs).
* Ja rezultāts ir neizšķirts, čipi nemainās.

Laimigu spēlē!