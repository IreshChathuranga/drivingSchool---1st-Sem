package lk.ijse.gdse.finalproject.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LessonsDto {
    private String lessonName;
    private int timePeriod;
    private String studentId;
    private String instructorId;
}
