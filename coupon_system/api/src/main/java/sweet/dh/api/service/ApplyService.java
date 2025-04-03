package sweet.dh.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sweet.dh.api.domain.Coupon;
import sweet.dh.api.repository.CouponRepository;

@Service
@RequiredArgsConstructor
public class ApplyService {
    private final CouponRepository couponRepository;

    public void apply(Long userId) {
        long count = couponRepository.count();

        if (count > 100) {
            return;
        }
        couponRepository.save(new Coupon(userId));
    }
}
