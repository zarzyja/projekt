Program rozpoczyna się od zadeklarowania tablicy SLOWa, która zawiera listę słów, z których będzie losowane hasło do gry. Następnie zdefiniowana jest stała MAX_PROBY, która określa maksymalną liczbę prób, jakie gracz ma na odgadnięcie hasła.

W metodzie main programu najpierw losowane jest hasło za pomocą metody losujHaslo(). Następnie inicjowane są zmienne proby (liczba pozostałych prób) oraz dostepneLitery (łańcuch znaków, który zawiera dostępne litery alfabetu). Początkowo łańcuch dostepneLitery zawiera znaki "-" dla każdej litery hasła.

Główna pętla while trwa dopóki gracz ma pozostałe próby i w łańcuchu dostepneLitery znajdują się znaki "-". W pętli wyświetlane są informacje o liczbie pozostałych prób, dostępnych literach oraz pobierana od gracza litera.

Sprawdzane jest, czy podana przez gracza litera znajduje się w haśle. Jeśli tak, to litera jest dodawana do łańcucha dostepneLitery, a gracz otrzymuje komunikat o sukcesie. W przeciwnym razie liczba prób jest zmniejszana, a gracz otrzymuje komunikat o błędzie.

Po zakończeniu pętli sprawdzane jest, czy gracz odgadł hasło. Jeśli tak, to program wyświetla komunikat o gratulacjach i wyświetla odgadnięte hasło. W przeciwnym razie program wyświetla komunikat o przegranej i wyświetla hasło.

Metoda losujHaslo() losuje losowy indeks z tablicy SLOWa i zwraca słowo znajdujące się pod tym indeksem.

Funkcjonalności programu

Program implementuje podstawowe funkcjonalności gry w wisielca, w tym:

Losowanie hasła z listy słów
Wyświetlanie dostępnych liter
Pobieranie od gracza litery
Sprawdzanie poprawności podanej litery
