package lk.ijse.gdse.finalproject.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SalaryDto {
    private String salaryId;
    private double amount;
    private Date payDay;
    private Date holidays;
    private Date isReceived;
    private String adminId;
    private String stafId;
}
