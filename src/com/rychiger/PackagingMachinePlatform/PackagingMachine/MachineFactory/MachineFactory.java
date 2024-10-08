package com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory;

import com.rychiger.PackagingMachinePlatform.PackagingMachine.Enums.MachineEnumType;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.CartoningMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.FillerMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.SealingMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackagingMachine;

public class MachineFactory {
    public static PackagingMachine getMachine(MachineEnumType machineType, String machineName, int machineNumber) throws Exception {
        PackagingMachine machine = null;
        switch (machineType) {
            case fillerMachine:
                machine = new FillerMachine(machineName, machineNumber);
                break;
            case cartoningMachine:
                machine = new CartoningMachine(machineName, machineNumber);
                break;
            case sealingMachine:
                machine = new SealingMachine(machineName, machineNumber);
                break;
            default:
                throw new Exception();
        }
        return machine;
    }
}