package nhanph.proton.enroll.mapper;

import nhanph.proton.enroll.dto.CameraResponse;
import nhanph.proton.enroll.entity.Camera;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: nhanph.proton.enroll.mapper
 * {@code @author:} nhanph
 * {@code @date:} 3/7/2025 2025
 * {@code @Copyright:} @nhanph
 */

@Mapper(componentModel = "spring")
public interface CameraMapper {

    CameraMapper INSTANCE = Mappers.getMapper(CameraMapper.class);
    @Mapping(source = "cameraName", target = "name")
    @Mapping(source = "link", target = "rtspURL")
    @Mapping(source = "cameraDescription", target = "description")
    @Mapping(source = "cameraGroup", target = "camera_group")
    @Mapping(source = "faceSource", target = "faceSource")
    CameraResponse toCameraResponse(Camera camera);

    List<CameraResponse> toCameraResponses(List<Camera> cameras);

}
