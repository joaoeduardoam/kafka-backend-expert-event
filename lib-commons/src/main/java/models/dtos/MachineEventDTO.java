package models.dtos;

import lombok.*;
import models.requests.CreateMachineRequest;

import java.io.Serial;
import java.io.Serializable;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MachineEventDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String machineName;
    private Long machineId;
    private String machineStatus;
    private String machineType;

    public MachineEventDTO(CreateMachineRequest request) {
        this.machineName = request.machineName();
        this.machineId = request.machineId();
        this.machineStatus = request.machineStatus();
        this.machineType = request.machineType();
    }
}
