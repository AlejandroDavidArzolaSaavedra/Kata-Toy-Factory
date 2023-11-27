<h1 align="center">🚀 Toy Factory Application</h1>

This Java application simulates a toy factory, practicing the implementation of design patterns such as Singleton, Factory Method, and Abstract Factory. The project includes classes for different types of toys, factories for toy production, and regional branches that extend the functionality of the main toy business.

# 👥 Development Team (Ctrl + Click to view profiles)

[![GitHub](https://img.shields.io/badge/GitHub-Alejandro%20David%20Arzola%20Saavedra-blue?style=flat-square&logo=github)](https://github.com/AlejandroDavidArzolaSaavedra)

### 📂 Project Structure

The project is organized into several packages:

- **toys:** Contains the main classes related to the toy business logic.
- **toyproducts:** Defines interfaces for the toys and their components.
- **toyproducts.models:** Implements concrete classes for different types of toys.
- **toyproducts.components:** Defines interfaces for various components used in toys.
- **toyproducts.components.asian/american:** Implements concrete classes for components specific to Asian and American regions.
- **factories:** Provides the base classes for toy factories.
- **factories.regionalfactories:** Implements regional toy factories extending the base factory classes.
- **componentfactories:** Introduces component factories for creating different toy components.
- **componentfactories.regionalcomponentFactories:** Implements regional component factories for creating components specific to Asian and American regions.
- **business:** Contains the main `ToyBusiness` class responsible for toy production and a `SerialNumberGenerator` class for generating unique serial numbers.
- **branches:** Introduces regional branches (`AsianToyBusiness` and `AmericanToyBusiness`) that extend the main `ToyBusiness` class for creating region-specific toys.

### 🎨 Design Patterns Implemented

#### Singleton Pattern

The `SerialNumberGenerator` class demonstrates the Singleton pattern, ensuring that there is only one instance responsible for generating unique serial numbers.

#### Factory Method Pattern

The `ToyBusiness` class uses the Factory Method pattern to create different types of toys based on a given type string. It provides methods to create car and helicopter toys, each with a unique serial number.

#### Abstract Factory Pattern

The `AsianComponentFactory` and `AmericanComponentFactory` classes represent Abstract Factories. They produce different types of components for toys (wheels, engines, rotor blades, propellers) with components specific to their respective regions (Asian and American).

### 🌐 Regional Branches

The `AsianToyBusiness` and `AmericanToyBusiness` classes, located in the `branches` package, extend the `ToyBusiness` class to create toys specific to the Asian and American regions. They override the `createToy` method to implement region-specific toy creation logic.

### 🚀 Usage

The `Main` class in the `kata6` package serves as the entry point to the application. It demonstrates the creation of a `ToyBusiness` instance and the production of toys using different factories and regional branches. Users can interact with the application by entering toy types (car, helicopter, submarine) in the console.

### 🛠️ How to Run

1. Compile all Java files.
2. Run the `Main` class.
3. Enter the desired toy types (car, helicopter, submarine) to see the production process.

### 🚀 Extending the Application

To extend the application:

1. Create new toy classes in the `toyproducts.models` package.
2. Implement new factories in the `factories.regionalfactories` package for the new toy types.
3. If necessary, create new components in the `toyproducts.components.asian/american` packages and their corresponding factories.
4. Implement regional branches in the `branches` package for each region, extending the `ToyBusiness` class and overriding the `createToy` method.

### 📝 Note

This application is a learning exercise intended for educational purposes to understand design patterns and their implementation in Java.

## Contributions 🤝

Contributions are welcome. If you want to improve this program, follow these steps:

- Fork this repository.
- Create a branch for your new feature: `git checkout -b new-feature`
- Make necessary changes and commit: `git commit -am 'Add new feature'`
- Push your changes to your forked repository: `git push origin new-feature`
- Open a pull request in this repository.
