package models.requests;

public record CreateMachineRequest (
        String machineName,
        Long machineId,
        String machineStatus,
        String machineType
){
}
