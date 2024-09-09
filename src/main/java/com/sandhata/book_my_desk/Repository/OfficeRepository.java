package com.sandhata.book_my_desk.Repository;

import com.sandhata.book_my_desk.Entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<Office,Long> {
}
