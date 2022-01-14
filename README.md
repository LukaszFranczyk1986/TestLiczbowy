# TestLiczbowy
Zadanie jednej z rozmów kwalifikacyjnych. Należy stworzyć aplikację, której głównym celem będzie wykrywanie wartości “odstającej” od pozostałych. Oryginalnie zadanie dotyczyło Kotlina. Jednak przygotowałem rozwiązanie w JAVA.  Szczegóły zadania w pliku readme.

Opis algorytmu
Dostajesz tablicę (która będzie miała długość co najmniej 3, ale może być bardzo duża)
zawierającą liczby całkowite. Tablica jest albo w całości złożona z nieparzystych liczb
całkowitych, albo całkowicie składa się z parzystych liczb całkowitych, z wyjątkiem
pojedynczej liczby całkowitej N. Napisz metodę, która przyjmuje tablicę jako argument i
zwraca tę „wartość odstającą" N.
Przykład:
[2, 4, 0, 100, 4, 11, 2602, 36]
Powinno zwrócić: 11 (jedyna nieparzysta)
[160, 3, 1719, 19, 11, 13, -21]
Powinno zwrócić: 160 (jedyna parzysta)
Należy zwrócić szczególną uwagę na jakość rozwiązania (dobre praktyki, SOLID)
Opis aplikacji
Należy stworzyć aplikację która będzie posiadać 1xActivity oraz 2xFragment. Na pierwszym
fragmencie będzie znajdował się 1xinput i 1xbutton. W input będzie się wpisywało liczby po
przecinku np. 2,4,0,100,4,11,2602,36 button będzie miał opis “Wyszukaj”. Po kliknięciu
wyszukaj aplikacja uruchomi drugi fragment, na którym będzie wyświetlała się liczba 11,
ponieważ 11 jest jedyną liczbą nieparzystą w zbiorze.
Wymagania do aplikacji
1. Aplikacja powinna implementować Navigation Component
2. Powinna być napisana zgodnie z wzorcem architektonicznym MVVM
