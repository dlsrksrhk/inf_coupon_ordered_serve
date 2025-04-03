package sweet.dh.api.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sweet.dh.api.repository.CouponRepository;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplyServiceTest {

    @Autowired
    private ApplyService applyService;
    @Autowired
    private CouponRepository couponRepository;

    @Test
    void 쿠폰_응모_테스트() {
        applyService.apply(1L);
        long count = couponRepository.count();
        assertThat(count).isEqualTo(1L);
    }
}