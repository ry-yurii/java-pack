package com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineManager;

import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackagingMachine;
import java.util.ArrayList;


public class MachineManager {
    private ArrayList<PackagingMachine> machines = new ArrayList<>();
    private static MachineManager instance = null;

    private MachineManager() {
    }

    public static MachineManager getInstance() {
        if (instance == null) {
            instance = new MachineManager();
        }
        return instance;
    }

    public String getMachineNames() { //TO CHECK NOT SURE
        ArrayList<String> machinenames = new ArrayList<>();
        for (PackagingMachine machine : machines) {
            machinenames.add(machine.getMachineName());
        }
        return machinenames.toString();
    }

    public void addMachine(PackagingMachine machine) {
        machines.add(machine);
    }

    public void removeMachineByName(String machineName) {
        machines.removeIf(machine -> machine.getMachineName().equals(machineName));
    }

    public void startAllMachines() {
        for (PackagingMachine machine : machines) {
            machine.startMachine();
        }
        System.out.println("All machines started successfully");
    }

    public void stopAllMachines() {
        for (PackagingMachine machine : machines) {
            machine.stopMachine();
        }
        System.out.println("All machines stopped successfully!");
    }

    public void printMachineCount() {
        System.out.println("Total machine count = " + PackagingMachine.getTotalMachineCount());
        System.out.println("Size of ArrayList = " + machines.size());
    }

    public void loadAllRecipes() {
        for (PackagingMachine machine : machines) {
            machine.loadRecipe();
        }
        System.out.println("All Recipes loaded successfully");
    }

    public void saveAllRecipes() {
        for (PackagingMachine machine : machines) {
            machine.saveRecipe();
        }
        System.out.println("All Recipes saved successfully");
    }
}