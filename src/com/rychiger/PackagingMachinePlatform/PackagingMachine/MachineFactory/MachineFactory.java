package com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory;

import com.rychiger.PackagingMachinePlatform.PackagingMachine.Enums.MachineEnumType;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.CartoningMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.FillerMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackagingMachine;

public class MachineFactory {
    public PackagingMachine getMachine(MachineEnumType machineType, String machineName, int machineNumber) throws Exception {
        switch (machineType){
            case fillerMachine:
                return new FillerMachine(machineName, machineNumber);
            case cartoningMachine:
                return new CartoningMachine(machineName, machineNumber);
            default: throw new Exception();
        }
    }
}