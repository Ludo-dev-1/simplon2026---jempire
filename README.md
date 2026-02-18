# Empire - Jeu de Gestion de Ressources

Bienvenue dans **Empire** ! Un jeu de gestion stratégique où vous devez construire et développer votre empire en gérant efficacement vos ressources.

## Description

Empire est un jeu de gestion de ressources textuel en Java. L'objectif est de **construire un château** en accumulant suffisamment de ressources tout en gérant vos habitants et en évitant la famine.

## 🎮 Objectif du Jeu

**Construire un château** en réunissant les conditions suivantes :
- 100 bois minimum
- 100 pierre minimum  
- 200 or minimum
- 40 habitants minimum

## 🚀 Ressources Disponibles

| Ressource | Description | Valeur Initiale |
| **Bois** | Ressource de base obtenue en explorant | 0 |
| **Pierre** | Obtenue en travaillant à la mine | 0 |
| **Or** | Monnaie principale du jeu | 50 |
| **Nourriture** | Essentielle pour nourrir les habitants | 100 |
| **Habitants** | Population de votre empire | 1 |

## Actions du Jeu

### 1 Explorer la Forêt
- **Récompense** : +5 bois, +3 nourriture par habitant
- **Coût** : Aucun
- *Permet de collecter du bois pour construire une mine*

### 2️ Créer une Mine
- **Condition** : 10 bois minimum
- **Coût** : -10 bois
- **Effet** : Débloque la capacité de travailler à la mine
- *Action nécessaire pour accéder aux pierres et à plus d'or*

### 3️ Travailler dans la Mine
- **Condition** : La mine doit être créée ET minimum 5 nourriture
- **Gains** : +5 pierre, +2 or
- **Coût** : -5 nourriture
- *Activité principale pour obtenir pierre et or*

### 4️ Recruter un Soldat
- **Condition** : 30 or minimum
- **Coût** : -30 or
- **Effet** : +1 habitant
- *Augmente la population et les gains en nourriture lors de l'exploration*

### 5️ Faire du Commerce
- **Condition** : 5 pierre minimum
- **Gains** : +10 or
- **Coût** : -5 pierre
- *Permet de convertir la pierre en or*

### 6️ Construire un Château
- **Conditions** : 100 bois, 100 pierre, 200 or, 40 habitants
- **Coût** : -100 bois, -100 pierre, -200 or, -40 habitants
- **Résultat** : 🎉 **VOUS AVEZ GAGNÉ !**

### 7️ Quitter le Jeu
- Quitter l'application

### Gestion de la Nourriture
```
Chaque tour :
  - Chaque habitant consomme 1 nourriture
  - Si nourriture < habitants → Les habitants supplémentaires meurent
  - Si habitants = 0 → GAME OVER
```

### Condition d'Échec
Le jeu se termine si vous atteignez 0 habitants (famine).

### Compteur de Tours
Un compteur affiche le nombre de tours écoulés. Si vous gagnez, il vous rappelle en combien de tours vous avez achevé l'objectif.

## Comment Jouer

### Installation
1. Clonez ou téléchargez le projet
2. Une fois dans le répertoire, compilez :
   ```bash
   javac src/*.java -d build
   ```

### Lancer le Jeu
```bash
java -cp build Main
```

### Stratégie Recommandée
1. **Début** : Explorez la forêt plusieurs fois pour accumuler du bois
2. **Étape 1** : Créez une mine dès que vous avez 10 bois
3. **Étape 2** : Travaillez à la mine pour obtenir pierre et or (assurez-vous d'avoir assez de nourriture)
4. **Étape 3** : Recrutez graduellement des soldats pour augmenter votre population et vos gains en nourriture
5. **Étape 4** : Une fois capable, faites du commerce pour convertir votre pierre en or
6. **Étape 5** : Accumulez toutes les ressources nécessaires et construisez le château !

## Exemple de Progression

```
Tour 1 : Explorez la forêt (5 bois, +3 nourriture)
Tour 2 : Explorez la forêt (10 bois, +3 nourriture)
Tour 3 : Créez une mine (0 bois)
Tour 4-10 : Travaillez à la mine (pierre et or accumulés)
...
Tour N : Construisez le château → VICTOIRE !
```

## Architecture du Projet

src/
├── Main.java        → Boucle principale du jeu et interface utilisateur
└── Ressources.java  → Gestion des mécaniques du jeu et des ressources

## Remarques

- Le jeu utilise une interface en ligne de commande
- Tous les messages sont en français
- Les choix se font en entrant le numéro correspondant
- Chaque action rafraîchit l'affichage des ressources actuelles

## Auteur

Projet réalisé pour **Simplon 2026**