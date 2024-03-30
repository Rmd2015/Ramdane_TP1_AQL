
Dans le cadre du Tp 1, voici les observations et les recommandations pour chaque exercice :

Exercise 1:
Le problème était dans l'incrémentation de j et i : "j++; i--;".
La correction est "i++; j--;".

Exercise 2:
La méthode précédente présente un problème avec la boucle : for (int i = 0; i <= s1.length(); i++), ce qui provoque une "ArrayIndexOutOfBoundsException".
La nouvelle boucle est corrigée comme suit : for (int i = 0; i < s1.length(); i++).

Exercise 3:
La méthode actuelle est incorrecte : la condition "while (low < high)" sera modifiée en "while (low <= high)" afin de prendre en compte le cas où low est égal à high.

Exercise 4:
Il est probablement préférable de lever une exception également lorsque delta < 0.

Exercise 5:
L'erreur dans la méthode toRoman est due à une boucle mal définie. La boucle for utilise i <= symbols.length comme condition de sortie, mais cela provoque une erreur car cela dépasse la longueur des tableaux symbols et values.
Cela entraîne une ArrayIndexOutOfBoundsException.
La correction consiste à utiliser < à la place de <= dans la condition de la boucle for pour s'assurer que i reste dans les limites des tableaux.

Exercise 6:
L'erreur dans la méthode fizzBuzz est que la première condition vérifie si n est inférieur ou égal à 1, et si c'est le cas, elle lève une exception avec le message "n must be positive". 
Cependant, cela semble contradictoire, car n doit être positif, mais la condition inclut également les valeurs égales à 1, ce qui est un cas valide mais ne nécessite pas de lancer une exception.
La condition devrait plutôt vérifier si n est inférieur ou égal à 0, car n doit être strictement positif.
