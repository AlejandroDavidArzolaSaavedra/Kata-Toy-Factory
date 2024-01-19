<h1 align="center">🚀 Toy Factory Application</h1>
<p align="center">
  <img src="https://github.com/AlejandroDavidArzolaSaavedra/Kata-Toy-Factory/assets/90756437/b69eac1e-3f38-4c34-a3d1-d22d74ecb16f">
</p>
This Java application simulates a toy factory, practicing the implementation of design patterns such as Singleton, Factory Method, and Abstract Factory. The project includes classes for different types of toys, factories for toy production, and regional branches that extend the functionality of the main toy business.

# 👥 Development Team (Ctrl + Click to view profiles)

[![GitHub](https://img.shields.io/badge/GitHub-Alejandro%20David%20Arzola%20Saavedra-blue?style=flat-square&logo=github)](https://github.com/AlejandroDavidArzolaSaavedra)

### 🎨 Design Patterns Implemented

#### Singleton Pattern

The `SerialNumberGenerator` class demonstrates the Singleton pattern, ensuring that there is only one instance responsible for generating unique serial numbers.

#### Factory Method Pattern

The `ToyBusiness` class uses the Factory Method pattern to create different types of toys based on a given type string. It provides methods to create car and helicopter toys, each with a unique serial number.

#### Abstract Factory Pattern

The `AsianComponentFactory` and `AmericanComponentFactory` classes represent Abstract Factories. They produce different types of components for toys (wheels, engines, rotor blades, propellers) with components specific to their respective regions (Asian and American).

### 🚀 Usage

The `Main` class in the `kata6` package serves as the entry point to the application. It demonstrates the creation of a `ToyBusiness` instance and the production of toys using different factories and regional branches. Users can interact with the application by entering toy types (car, helicopter, submarine) in the console.

### 🛠️ How to Run

1. Compile all Java files.
2. Run the `Main` class.
3. Enter the desired toy types (car, helicopter, submarine) to see the production process.

## Contributions 🤝

Contributions are welcome. If you want to improve this program, follow these steps:

<img align="left" width="150" height="150" src="https://github.com/AlejandroDavidArzolaSaavedra/Kata-Age-Calculator/assets/90756437/81dd2f61-6de4-499f-81e8-47c1cc6ae5ae"></a>
- Fork this repository.
- Create a branch for your new feature: `git checkout -b new-feature`
- Make necessary changes and commit: `git commit -am 'Add new feature'`
- Push your changes to your forked repository: `git push origin new-feature`
- Open a pull request in this repository.
