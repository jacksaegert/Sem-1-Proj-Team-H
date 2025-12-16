## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

Project Name:
Pokémon Life Simulator

1. Author Information
Program Lead: Jack Saegert
QA tester: Max Gershwin
Project Lead (who did not do any work basically): Aiden Morriss
Technical Writer(who created the project description and class diagram): Ruby Aguilera
Co-author, and main writer of this readme as max(the one writing this) is dealing with a bit of migraine at the time: CHATGPT and Co-Pilot, special thanks to these two for saving the readme file.

2. Project Description

This project is a Java Pokémon simulation that allows you to pick a pokemon that uses object-oriented programming concepts from AP Computer Science A. The program is built around an abstract "Pokemon" class that stores shared variables like health, energy, mood, and XP, along with common actions such as training, feeding, sleeping, and battling. Different Pokémon classes ("Charizard", "Bellsprout", "Ninetails", and "Ditto") extend the `Pokemon` class and override methods to add unique behaviors and attributes. This project uses object-oriented programming principles to make creating different Pokémon more efficient. 


3. Features

Multiple Pokémon types with distinct behaviors and mechanics

Turn-based gameplay loop with user input

Random events affecting stats dynamically

Subclass-specific abilities: Ditto transformation, Charizard ignite, Bellsprout sun and hydration

Inheritance for shared behavior across Pokémon

Polymorphism for runtime-specific Pokémon actions

Encapsulated stats with controlled modification methods

Menu-driven interface for gameplay options

4. How the Code Works
Main Classes

PokemonGame.java: Contains the main method, manages the game loop, starter selection, and random events.

Pokemon.java: Abstract base class containing shared stats, methods for actions (sleep, feed, play, train, battle), and menu handling.

Charizard.java, Bellsprout.java, Ninetails.java, Ditto.java: Subclasses of Pokemon overriding specific behaviors and adding unique mechanics.

Class Interaction

PokemonGame instantiates a single active Pokémon and interacts with it using polymorphism.

User choices are passed to the current Pokémon object via the options() method.

Random events call Pokémon methods affecting their stats, with subclasses modifying behavior.

Data Storage

Pokémon stats are stored as instance variables in each object.

Random events are generated using Random.

User input is handled via Scanner.

Interface and Design

An interface could be added to define shared actions such as Battleable to enforce consistency across Pokémon.

Interfaces improve flexibility for adding new Pokémon with unique abilities.


5. UML diagram
![Pokemon AP CSA Final Project drawio](https://github.com/user-attachments/assets/54489688-4f5b-457f-add9-07c922472233)


6. How to Run the Program
Step 1: Compile the Files

Ensure all .java files are in the same directory:

javac *.java
Step 2: Run the Program
java PokemonGame
Step 3: Sample Inputs

Starter selection: 1 for Charizard, 2 for Bellsprout, 3 for Ninetails, 4 for Ditto

Action selection: Enter the number corresponding to the menu options

The game continues until the Pokémon's health, energy, or mood reaches zero.

7. Repository Structure
PokemonLifeSimulator/
├── PokemonGame.java
├── Pokemon.java
├── Charizard.java
├── Bellsprout.java
├── Ninetails.java
├── Ditto.java
└── README.md
