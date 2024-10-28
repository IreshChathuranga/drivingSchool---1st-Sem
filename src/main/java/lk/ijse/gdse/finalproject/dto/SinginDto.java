package lk.ijse.gdse.finalproject.dto;

import lombok.*;

import java.sql.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SinginDto {
    private String userName;
    private String userId;
    private int contactNumber;
    private String userAddress;
}
