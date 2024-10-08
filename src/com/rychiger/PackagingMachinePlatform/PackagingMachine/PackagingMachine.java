package com.rychiger.PackagingMachinePlatform.PackagingMachine;

import com.rychiger.PackagingMachinePlatform.PackagingMachine.RecipeManagement.RecipeManagement;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.Enums.MachineEnumStatus;

public abstract class PackagingMachine implements RecipeManagement {

    private String machineName;
    private int machineNumber;
    private MachineEnumStatus machineEnumStatus;
    private static int totalMachineCount;

    public PackagingMachine(String machineName, int machineNumber) {
        this.machineName = machineName;
        this.machineNumber = machineNumber;
        machineEnumStatus = MachineEnumStatus.IDLE;
        totalMachineCount++;
    }

    public PackagingMachine() {
        this("Packaging machine", 0);
    }

    public void setMachineEnumStatus(MachineEnumStatus machineEnumStatus) {
        this.machineEnumStatus = machineEnumStatus;
    }

    private MachineEnumStatus checkStatus(){
        return machineEnumStatus;
    }

    public static int getTotalMachineCount(){
        return totalMachineCount;
    }

    public String getMachineName(){
        return machineName;
    }

    public int getMachineNumber(){
        return machineNumber;
    }

    public abstract void startMachine();
    public abstract void stopMachine();
    public abstract void loadRecipe();
    public abstract void saveRecipe();

}