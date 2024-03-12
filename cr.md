Questions

1.Décrivez ce que vous observez en base de données lorsque l'on déclare une classe comme ClassTestJPA ?
    
    On observe que les propriétés de cette classe seront mappées aux colonnes de la table correspondante dans la bd.

2.Quels sont les effets des propriétés ajoutées dans les @Column dans la classe ClassTestJPATwo ?

    -@Column(unique): cette propriété signifie que la colonne correspondante dans la bd doit avoir des valeurs unique pour chaque enregistrement.
    -@Column(precision) = 1: cette propriété signifie que la colonne peut stocker des nombres avec une seule décimale.
    -@Column(): ici, elle est utilisée sans paramètre ce qui signifie que la colonne aura les paramètres par défaut définis par le JPA utilisé.

3.À votre avis, dans quels cas est-il nécessaire de mettre les annotations @Column ?

    -Pour la personnalistaion des propriétés de la colonne comme dans ClassTestJPATwo
    -Quand le nom du champ dans la classe est différent du nom de la colonne dans la bd
    -