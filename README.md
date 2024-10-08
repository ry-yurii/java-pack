# Packaging Machine Platform Task

**Context**: You are working on a software architecture for packaging machines. These machines can handle various types of packages and work with recipes that configure the machines. Your task is to design a simplified but extendable platform that manages these machines and their recipes.

In this exercise, you will use the OOP concepts you have learned to create a structure for this platform.

[UML Class diagram](https://miro.com/app/board/uXjVLXC5MCo=/?share_link_id=374161635551)

* * *

**Requirements**

1.  **Abstract Class** `**PackagingMachine**`:

    *   Create an abstract class `PackagingMachine` that defines general properties and methods for different machines.
    *   This class should have properties such as `machineName` (String), `machineNumber` (int), and `status` (String, e.g., "IDLE", "RUNNING", "ERROR").
    *   Define an abstract method `startMachine()` that must be implemented by the concrete machine classes.
2.  **Specific Machine Classes**:

    *   Create two concrete classes that inherit from `PackagingMachine`:
        *   `FillerMachine`: This machine fills Coffee Capsules.

        *   `CartoningMachine`: This machine packages products into cartons.
    *   Each of these classes must implement the abstract method `startMachine()` and include specific logic for starting the machine.
3.  **Interface** `**RecipeManagement**`:

    *   Create an interface `RecipeManagement` that declares the following methods:
        *   `loadRecipe()`: Loads a new recipe.
        *   `saveRecipe()`: Saves the current recipe.
        *   Both methods should have no parameters or return values (details can be added in a later exercise).
4.  **Singleton** `**MachineManager**`:

    *   Implement a Singleton for `MachineManager`, which is responsible for managing all packaging machines.
    *   The `MachineManager` should contain a list of packaging machines and provide methods for adding and removing machines.
    *   The `MachineManager` should have a method `startAllMachines()` that starts each machine in the list.
5.  **Static Elements and Access Modifiers**:

    *   Add a static variable `totalMachineCount` to the `PackagingMachine` class, which is automatically incremented whenever a new machine is created.
    *   The `machineNumber` property should be read-only (provide a `get` method, but no public `set` method).
    *   The `startMachine()` method should be public, while a helper method `checkStatus()` should remain private.
6.  **Test Class**:

    *   Create a class to test the behavior of your system:
        *   Instantiate the `MachineManager` and add various machines to it.
        *   Load and save a recipe using the `RecipeManagement` interface.
        *   Start all machines via the `MachineManager`.
        *   Output the total number of created machines using the static variable.

**Additional Requirement:**

*   For debugging purposes use console print statements (i.e. startMachine(){ Console.WriteLine($"Machine starting..."))



 

**Optional Requirement:**

*   If you have time, add a `stopMachine()` method to the `PackagingMachine` class, which works similarly to `startMachine()`, but stops the machine.

* * *

**Notes:**

*   Use constructors in the `ShrinkMachine` and `CartoningMachine` classes to set their specific properties.
*   Implement the Singleton pattern for `MachineManager` so that only one instance exists.
*   Use access modifiers (`private`, `public`) carefully to control access to specific variables and methods.
*   Make sure the static elements in the `PackagingMachine` class are correctly implemented to track the total number of machines.

**Goal:**

With this task, you will apply the basics of OOP by designing a system that integrates abstract classes, interfaces, inheritance, the Singleton pattern, constructors, and static elements. This is a simplified version of a platform for managing packaging machines that can be expanded with additional features.