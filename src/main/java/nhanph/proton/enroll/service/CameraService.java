package nhanph.proton.enroll.service;

import nhanph.proton.enroll.dto.CameraResponse;
import nhanph.proton.enroll.entity.Camera;

import java.util.List;

/**
 * @Package: nhanph.proton.enroll.service.impl
 * {@code @author:} nhanph
 * {@code @date:} 3/7/2025 2025
 * {@code @Copyright:} @nhanph
 */
public interface CameraService {
    List<CameraResponse> getCameraList();
}
