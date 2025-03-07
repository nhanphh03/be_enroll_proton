package nhanph.proton.enroll.config;

import nhanph.proton.enroll.mapper.CameraMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Package: nhanph.proton.enroll.config
 * @author: nhanph
 * @date: 3/7/2025 2025
 * @Copyright: @nhanph
 */
@Configuration
public class MapperConfig {
    @Bean
    public CameraMapper cameraMapper() {
        return Mappers.getMapper(CameraMapper.class);
    }
}
