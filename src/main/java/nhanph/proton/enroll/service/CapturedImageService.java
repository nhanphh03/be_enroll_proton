package nhanph.proton.enroll.service;

import nhanph.proton.enroll.dto.capturedimage.CapturedImageRequest;
import nhanph.proton.enroll.dto.capturedimage.CapturedImageResponse;

import java.util.List;

public interface CapturedImageService {

    Long insertCapturedImage(CapturedImageRequest capturedImageRequest);
    List<CapturedImageResponse> listCapturedImages(Integer limit);

}
