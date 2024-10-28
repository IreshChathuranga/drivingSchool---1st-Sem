package lk.ijse.gdse.finalproject.dto.tm;

import lombok.*;

import java.sql.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookingTM {
    private String bookId;
    private Date bookDate;
    private int bookTime;
    private String rescheduleReason;
}
