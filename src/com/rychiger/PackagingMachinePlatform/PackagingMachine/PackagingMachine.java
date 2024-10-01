package com.rychiger.PackagingMachinePlatform.PackagingMachine;
//Create an abstract class PackagingMachine that defines general properties and methods for different machines.
public abstract class PackagingMachine  {
    //This class should have properties such as machineName (String), machineNumber (int), and status (String, e.g., "IDLE", "RUNNING", "ERROR").
    private String machineName;
    private int machineNumber;
    private MachineEnumStatus machineEnumStatus;
    public static int totalMachineCount = 0;

    public PackagingMachine(String machineName, int machineNumber, MachineEnumStatus machineEnumStatus) {
        this.machineName = machineName;
        this.machineNumber = machineNumber;
        this.machineEnumStatus = machineEnumStatus;
    }
    public PackagingMachine() {
        machineName = "Packaging machine";
        machineNumber = 0;
        machineEnumStatus = MachineEnumStatus.IDLE;
    }
    // Define an abstract method startMachine() that must be implemented by the concrete machine classes.
    public MachineEnumStatus startMachine(){
        machineEnumStatus = MachineEnumStatus.RUNNING;
        return machineEnumStatus;
    }
}