package com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.Enums.MachineEnumStatus;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackagingMachine;

// Create two concrete classes that inherit from PackagingMachine:
public class CartoningMachine extends PackagingMachine {

    public CartoningMachine(String machineName, int machineNumber){
        super(machineName, machineNumber);
    }
    @Override
    public void startMachine() {
        setMachineEnumStatus(MachineEnumStatus.RUNNING);
        System.out.println(this.getClass().getSimpleName() + " named " + super.getMachineName() + " is running now");
    }

    @Override
    public void stopMachine() {
        setMachineEnumStatus(MachineEnumStatus.STOPPED);
        System.out.println(this.getClass().getSimpleName() + " named " + super.getMachineName() + " is stopped now");
    }

    @Override
    public void loadRecipe(){
        System.out.println(this.getClass().getSimpleName() + " named " + super.getMachineName() + " Recipe loaded successfully");
    }

    @Override
    public void saveRecipe(){
        System.out.println(this.getClass().getSimpleName() + " named " + super.getMachineName() + " Recipe saved successfully");
    }
}
