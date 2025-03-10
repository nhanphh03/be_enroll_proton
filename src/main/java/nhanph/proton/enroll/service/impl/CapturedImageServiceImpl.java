package nhanph.proton.enroll.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nhanph.proton.enroll.dto.capturedimage.CapturedImageRequest;
import nhanph.proton.enroll.dto.capturedimage.CapturedImageResponse;
import nhanph.proton.enroll.entity.CapturedImage;
import nhanph.proton.enroll.exception.DataFetchingException;
import nhanph.proton.enroll.mapper.CapturedImageMapper;
import nhanph.proton.enroll.repository.CapturedImageRepository;
import nhanph.proton.enroll.service.CapturedImageService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

import static nhanph.proton.enroll.constants.Constants.URL_IMAGE;

@Service
@RequiredArgsConstructor
@Slf4j
public class CapturedImageServiceImpl implements CapturedImageService {


    private final CapturedImageRepository cIRepository;
    private final CapturedImageMapper capturedImageMapper;

    @Override
    public Long insertCapturedImage(CapturedImageRequest capturedImageRequest) {
        CapturedImage capturedImage = capturedImageMapper.toCapturedImage(capturedImageRequest);
        capturedImage.setDetectStatus(1);
        capturedImage.setCapturedTime(new Timestamp(System.currentTimeMillis()));
        return cIRepository.save(capturedImage).getId();
    }

    @Override
    public List<CapturedImageResponse> listCapturedImages(Integer limit) {
        try {
            Pageable pageable = PageRequest.of(0, limit);
            return cIRepository.findByPeopleId(pageable);
        } catch (Exception e) {
            log.error("Failed to fetch captured images: {}", e.getMessage());
            throw new DataFetchingException("Failed to fetch captured images", e);
        }
    }
}
