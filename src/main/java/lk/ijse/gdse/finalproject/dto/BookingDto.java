package lk.ijse.gdse.finalproject.dto;

import lombok.*;

import java.sql.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookingDto {
    private String bookId;
    private Date bookDate;
    private int bookTime;
    private String rescheduleReason;

}
