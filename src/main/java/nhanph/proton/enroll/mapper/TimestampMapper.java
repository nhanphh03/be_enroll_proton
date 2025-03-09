package nhanph.proton.enroll.mapper;

import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * {@code @Package:} nhanph.proton.enroll.mapper
 * {@code @author:} nhanph
 * {@code @date:} 3/8/2025 2025
 * {@code @Copyright:} @nhanph
 */

@Component
public class TimestampMapper {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Named("stringToTimestamp")
    public Timestamp stringToTimestamp(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        return Timestamp.valueOf(LocalDateTime.parse(value, FORMATTER));
    }

    @Named("timestampToString")
    public String timestampToString(Timestamp timestamp) {
        if (timestamp == null) {
            return null;
        }
        return FORMATTER.format(timestamp.toLocalDateTime());
    }
}