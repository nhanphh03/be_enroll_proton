package nhanph.proton.enroll.controller;

import lombok.RequiredArgsConstructor;
import nhanph.proton.enroll.dto.capturedimage.CapturedImageRequest;
import nhanph.proton.enroll.dto.capturedimage.CapturedImageResponse;
import nhanph.proton.enroll.service.AuthService;
import nhanph.proton.enroll.service.CapturedImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/capturedImg")
@RequiredArgsConstructor
public class CapturedImageController {

    private final CapturedImageService capturedImageService;
    private final AuthService authService;

    @PostMapping("/create")
    public ResponseEntity<Long> insertCapturedImage(@RequestBody CapturedImageRequest capturedImageRequest){
        return  ResponseEntity.ok(capturedImageService.insertCapturedImage(capturedImageRequest));
    }


    @GetMapping("/get-all")
    public ResponseEntity<List<CapturedImageResponse>> listCapturedImages(
            @RequestHeader String authorization,
            @RequestParam(value = "limit", required = false, defaultValue = "500") Integer limit) {
        if (!authService.isValidToken(authorization)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(List.of());
        }
        return ResponseEntity.ok(capturedImageService.listCapturedImages(limit));
    }

}