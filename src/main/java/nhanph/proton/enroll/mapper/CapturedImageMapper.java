package nhanph.proton.enroll.mapper;

import nhanph.proton.enroll.dto.capturedimage.CapturedImageRequest;
import nhanph.proton.enroll.entity.CapturedImage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * {@code @Package:} nhanph.proton.enroll.mapper
 * {@code @author:} nhanph
 * {@code @date:} 3/8/2025 2025
 * {@code @Copyright:} @nhanph
 */

@Mapper(componentModel = "spring", uses = TimestampMapper.class)
public interface CapturedImageMapper {

    @Mapping(source = "capturedTime", target = "capturedTime", qualifiedByName = "stringToTimestamp")
    CapturedImage toCapturedImage(CapturedImageRequest capturedImageRequest);

}
