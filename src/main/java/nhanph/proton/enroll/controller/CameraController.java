package nhanph.proton.enroll.controller;

import lombok.RequiredArgsConstructor;
import nhanph.proton.enroll.dto.CameraResponse;
import nhanph.proton.enroll.service.CameraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * {@code @Package:} nhanph.proton.enroll.service.impl
 * {@code @author:} nhanph
 * {@code @date:} 3/7/2025 2025
 * {@code @Copyright:} @nhanph
 */

@RestController
@RequestMapping({"/api/camera"})
@RequiredArgsConstructor
public class CameraController {

    private final CameraService cameraService;

    @GetMapping({"/getAll"})
    public ResponseEntity<List<CameraResponse>> getCameraList() {
        return ResponseEntity.ok(this.cameraService.getCameraList());
    }
}
