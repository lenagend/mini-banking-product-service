package repository;

import entity.BankProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankProductRepository extends JpaRepository<BankProduct, Long> {
}
