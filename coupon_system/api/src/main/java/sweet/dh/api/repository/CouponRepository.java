package sweet.dh.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sweet.dh.api.domain.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
