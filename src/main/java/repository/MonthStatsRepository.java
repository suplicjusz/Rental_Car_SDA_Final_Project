package repository;

import model.MonthStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthStatsRepository extends JpaRepository<MonthStats, Long> {
}
