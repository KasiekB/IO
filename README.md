+IO Chat
2
+=======
3
+Dokumentacja wymagań projektu z Inżynierii Oprogramowania 2014/2015
4
+Informatyka Stosowana, WIMiIP
5
+
6
+
7
+**Autorzy:**
8
+- Maciej Grzywaczewski
9
+- Wojciech Guziak
10
+
11
+Wymagania funkcjonalne:
12
+===================== 
13
+Do poprawnego działania aplikacji konieczne jest użycie *dwóch* sub-aplikacji.
14
+- Klienckiej dostarczonej do klienta(ów) końcowego(ych)
15
+- Serwerowej zainstalowanej na serwerze zarządzanym przez administratora
16
+
17
+Aplikacja **kliencka**
18
+-------------------------
19
+
20
+| ID    	           | Wymaganie									| Priorytet |
21
+| :-------------: | :----------------------------------------	| :-------: |
22
+| 1 		| WysyÅ‚anie/ odbieranie wiadomoÅ›ci 			|  1    	|
23
+| 2    		| Logowanie   								|  2   		|
24
+| 3     	| Rejestracja użytkownika  					|  2  		|
25
+| 4     	| Dodawanie/ usuwanie kontaktu    			|  2  		|
26
+| 5     	| Rozpoczynanie rozmowy z danym kontaktem   |  2  		|
27
+| 6     	| Obsługa wysyłania emotikonek    			|  2  		|
28
+| 7     	| Eksport wiadomości do xml    				|  3  		|
29
+| 8     	| Grupowanie kontaktów    					|  3  		|
30
+| 9     	| Rozmowy konferencyjne    					|  3 		|
31
+
32
+Aplikacja **serwerowa**
33
+----------------------------
34
+
35
+| ID    	| Wymaganie													| Priorytet |
36
+| :-------:	| :--------------------------------------------------------	| :-------: |
37
+| 1 		| Odbieranie wiadomości od autora i wysyłanie do adresata 	|  1    	|
38
+| 2    		| Zapisywanie zarejestrowanych użytkowników					|  2   		|
39
+| 3     	| Obsługa autoryzacji										|  2  		|
40
+
41
+Wymagania niefunkcjonalne:
42
+===================== 
43
+| ID    	| Wymaganie																		| Priorytet |
44
+| :-------:	| :----------------------------------------------------------------------------	| :-------: |
45
+| 1   		| Interfejs użytkownika w odcieniach czerwieni (amarant przechodzący w burgunt)	|  1   		|
46
+| 2 		| Emotikonki podobne do emotikonek z facebook.com		 						|  3    	|
47
+| 3     	| Wielojęzyczność (polski, angielski)											|  3  		|
48
+
49
+Definicje:
50
+========
51
+- **Kontakt:** użytkownik aplikacji reprezentowany przez obiekt zapisny w pliku xml posiadający atrybuty: id, nick, email, hasło, rok urodzenia
52
+
53
+- **Wiadomość:** wiadomość tekstowa reprezentowana przez obiekt zapisany w pliku xml posiadający atrybuty: id, treść, odbiorca, nadawca, czas
54
+
55
+Use Case
56
+=======
