package nhanph.proton.enroll.dto.capturedimage;

import static nhanph.proton.enroll.constants.Constants.URL_IMAGE;

public record CapturedImageResponse(Long id, String imagePath) {
    public CapturedImageResponse(Long id, String imagePath) {
        this.id = id;
        this.imagePath = URL_IMAGE + imagePath;
    }
}
