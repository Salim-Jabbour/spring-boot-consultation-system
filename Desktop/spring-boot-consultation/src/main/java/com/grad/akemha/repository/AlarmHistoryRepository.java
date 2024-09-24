package com.grad.akemha.repository;

import com.grad.akemha.entity.AlarmHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmHistoryRepository extends JpaRepository<AlarmHistory,Long> {
}
