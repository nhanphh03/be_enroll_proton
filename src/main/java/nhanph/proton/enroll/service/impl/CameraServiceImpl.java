package nhanph.proton.enroll.service.impl;

import lombok.RequiredArgsConstructor;
import nhanph.proton.enroll.dto.CameraResponse;
import nhanph.proton.enroll.entity.Camera;
import nhanph.proton.enroll.mapper.CameraMapper;
import nhanph.proton.enroll.repository.CameraRepository;
import nhanph.proton.enroll.service.CameraService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Package: nhanph.proton.enroll.service.impl
 * {@code @author:} nhanph
 * {@code @date:} 3/7/2025 2025
 * {@code @Copyright:} @nhanph
 */
@Service
@RequiredArgsConstructor
public class CameraServiceImpl implements CameraService {

    private final CameraRepository cameraRepository;
    private final CameraMapper cameraMapper;

    @Override
    public List<CameraResponse> getCameraList() {
        List<Camera> cameraList = cameraRepository.findAll();
        return cameraList.stream()
                .map(cameraMapper::toCameraResponse)
                .collect(Collectors.toList());
    }
}
