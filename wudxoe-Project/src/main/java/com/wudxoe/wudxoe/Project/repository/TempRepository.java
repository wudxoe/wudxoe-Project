package com.wudxoe.wudxoe.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wudxoe.wudxoe.Project.entity.Temp;

// JpaRepository를 상속받아 Temp 엔티티에 대한 CRUD 작업을 처리하는 리포지토리 인터페이스
public interface TempRepository extends JpaRepository<Temp, Long> {
}