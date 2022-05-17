package repository;

import model.MonthStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthStatsRepository extends JpaRepository<MonthStats, Long> {
}
