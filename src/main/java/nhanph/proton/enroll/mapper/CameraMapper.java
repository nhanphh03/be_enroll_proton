package nhanph.proton.enroll.mapper;

import nhanph.proton.enroll.dto.CameraResponse;
import nhanph.proton.enroll.entity.Camera;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * {@code @Package:} nhanph.proton.enroll.mapper
 * {@code @author:} nhanph
 * {@code @date:} 3/7/2025 2025
 * {@code @Copyright:} @nhanph
 */

@Mapper(componentModel = "spring")
public interface CameraMapper {

    @Mapping(source = "cameraName", target = "name")
    @Mapping(source = "link", target = "rtspURL")
    @Mapping(source = "cameraDescription", target = "description")
    CameraResponse toCameraResponse(Camera camera);

}
