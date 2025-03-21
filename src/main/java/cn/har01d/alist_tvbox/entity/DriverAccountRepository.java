package cn.har01d.alist_tvbox.entity;

import cn.har01d.alist_tvbox.domain.DriverType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DriverAccountRepository extends JpaRepository<DriverAccount, Integer> {
    boolean existsByNameAndType(String name, DriverType type);

    DriverAccount findByNameAndType(String name, DriverType type);

    long countByType(DriverType type);

    Optional<DriverAccount> findByTypeAndMasterTrue(DriverType type);
}
